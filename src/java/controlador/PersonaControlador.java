/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import javax.servlet.http.HttpServletRequest;
import modelo.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("persona2.htm")
public class PersonaControlador {
    private PersonaValidar personaValidar; 

 PersonaControlador(){
     this.personaValidar = new PersonaValidar();
 }
    
@RequestMapping(method=RequestMethod.GET)
    public ModelAndView listaEstudiantes(){
         
         ModelAndView mav = new ModelAndView();
         System.out.println("Esta es una prueba GET");
         Persona p = new Persona();
         /* p.setCi("introdusca ci");
         p.setNombre("introdusca nombre");
         p.setAp("introdusca apellido paterno");
         p.setAm("introdusca apellido materno");
         p.setEdad("Introdusca la edad");*/
         mav.addObject("persona",p);
        return mav;
    }
/**
	 * 
	 * @param p
	 * @param result
	 * @param status
	 */
	@RequestMapping(method=RequestMethod.POST)
    public ModelAndView leerPersona(@ModelAttribute("persona") Persona p
    , BindingResult result
    , SessionStatus status){
        this.personaValidar.validate(p, result);
        if (result.hasErrors()) { // verdadero
         ModelAndView mav = new ModelAndView();
         mav.addObject("persona",new Persona());
         mav.setViewName("persona2");
         System.out.println("Ingreso aqui");
         return mav;
     } else {  // no hay errores
        ModelAndView mav=new ModelAndView();
        System.out.println("Ci:"+p.getCi());
        System.out.println("Nombre:"+p.getNombre());
        System.out.println("Ap:"+p.getAp());
        System.out.println("Am:"+p.getAp());
        System.out.println("Edad:"+p.getEdad());
        System.out.println("Esta es una prueba POST");
        return mav;    
        }
     }
             
}
