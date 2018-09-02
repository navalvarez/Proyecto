
package controlador;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import modelo.Persona;

public class PersonaValidar implements Validator {
    // IMPLEMENTACION DE LOS METODOS
     private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
   + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
     
     private Pattern pattern;
     private Matcher matcher;
    @Override
    public boolean supports(Class<?> type) 
    {
        return Persona.class.isAssignableFrom(type);
       // return TuClase.class.isAssignableFrom(type);
    }
     private void validarEdad(int edad, Errors errors) {
        if  (!(edad>0 & edad<141)) {
            errors.rejectValue("edad","error.persona.edad","Edad no valida");
        }
    }

    @Override
    public void validate(Object o, Errors errors) {
         Persona p=(Persona)o;
        // validar la persona
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre","required.nombre", "El campo Nombre es Obligatorio.");
        this.validarEdad(p.getEdad(),errors);
          if (!(p.getCorreo() != null && p.getCorreo().isEmpty()))
        {
            this.pattern = Pattern.compile(EMAIL_PATTERN);
            this.matcher = pattern.matcher(p.getCorreo());
             if (!matcher.matches()) {
                errors.rejectValue("correo", "correo.incorrect",
                  "El correo "+p.getCorreo()+" no es válido");
               }
        }
       
        
    }
    
}
