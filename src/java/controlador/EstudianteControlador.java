/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.LinkedHashMap;
import java.util.Map;
import modelo.Estudiante;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("estudiante.htm")
public class EstudianteControlador {
@RequestMapping(method=RequestMethod.GET)
    public ModelAndView listaEstudiantes(){
         ModelAndView mav = new ModelAndView();
         System.out.println("Esta es una prueba GET");
         Estudiante es = new Estudiante();
         
         es.setNombre("Carlos");
         es.setApellidos("Coira");
         es.setSexo("H");
         
         
         /*p.setCi("introdusca ci");
         p.setNombre("introdusca nombre");
         p.setAp("introdusca apellido paterno");
         p.setAm("introdusca apellido materno");
         p.setEdad("Introdusca la edad");*/
         mav.addObject("estudiante",es);
        return mav;
    }

  
   @ModelAttribute("diasemana")
        public Map<String,String> listadodiasemana()
        {
            Map <String,String> listado = new LinkedHashMap<>();
            listado.put("1","Lunes");
            listado.put("2","Martes");
            listado.put("3","Miercoles");
            listado.put("4","Jueves");
            listado.put("5","Viernes");
            listado.put("6","Sabado");
            return listado;
        }
/**
	 * 
	 * @param es
	 */
	@RequestMapping(method=RequestMethod.POST)
    public ModelAndView leerPersona(@ModelAttribute("estudiante") Estudiante es){
        ModelAndView mav=new ModelAndView();
        System.out.println("Nombre:"+es.getNombre());
        System.out.println("Apellidos:"+es.getApellidos());
        System.out.println("Correo:"+es.getEmail());
        System.out.println("Sexo:"+es.getSexo());
        System.out.println("Dia Semana:"+es.getDiasemana());
        System.out.println("Nivel de Estudio:"+es.getNivel());
        System.out.println("Tema definidos:");
        for (int i = 0; i < es.getTema().length; i++) {
            System.out.println(es.getTema()[i].toString());
    }
        System.out.println("Opinion:"+es.getOpinion());
        System.out.println("Esta es una prueba POST");
        return mav;    
     }
             
}
