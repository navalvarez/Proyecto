/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.estudiante;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import model.pojo.Estudiante;
import model.pojo.EstudianteDAO;
import static model.pojo.EstudianteDAO.getEstudianteByORMID;
import org.orm.PersistentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author richards
 */
@Controller
@RequestMapping("eliminarEstudiante.htm")
public class EliminarEstudianteControlador {
    /**
	 * 
	 * @param ci
	 */
	@RequestMapping(method=RequestMethod.GET) 
    public ModelAndView eliminarEstudiante(@RequestParam("ci") int ci)
    {
        Estudiante es = null;
        
             
        System.out.println("ci:"+ci);
        try {
            //int ci =Integer.parseInt( request.getParameter("ci"));
            ModelAndView mav=new ModelAndView();
            es = getEstudianteByORMID(ci);
            
            
        } catch (PersistentException ex) {
            Logger.getLogger(ModificarEstudianteControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
       ModelAndView mav=new ModelAndView();
       System.out.println("rude:"+es.getRude());
       System.out.println("nombre:"+es.getNombre());
       System.out.println("ap:"+es.getAp());
       System.out.println("am:"+es.getAm());
       mav.addObject("estudiante",es);
       mav.setViewName("eliminarEstudiante");
        //mav.addObject("estudiante",new estudiante(es.getCi(),es.getRude(),es.getNombre(),es.getAp(),es.getAm(),
        //        es.getCorreo(),es.getTelefono(),es.getUsuario(),es.getContrasena(),es.getSuspendido(),es.getDireccion(),es.getImagen()));           
        
        return mav;
    }
    
    /**
	 * 
	 * @param es
	 */
	@RequestMapping(method=RequestMethod.POST)
     public ModelAndView eliminarEstudiantefinal(@ModelAttribute("datos") Estudiante es)
    {
        
        
             
        System.out.println("ci:"+es.getCi());
        try {
            //int ci =Integer.parseInt( request.getParameter("ci"));
            
            ModelAndView mav=new ModelAndView();
            es = getEstudianteByORMID(es.getCi());
            EstudianteDAO.delete(es);
            // DELETE FROM taller1.estudiante WHERE ci = ?
            
            
        } catch (PersistentException ex) {
            Logger.getLogger(ModificarEstudianteControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
       ModelAndView mav=new ModelAndView();
       mav.setViewName("listaEstudiantes");
        //mav.addObject("estudiante",new estudiante(es.getCi(),es.getRude(),es.getNombre(),es.getAp(),es.getAm(),
        //        es.getCorreo(),es.getTelefono(),es.getUsuario(),es.getContrasena(),es.getSuspendido(),es.getDireccion(),es.getImagen()));           
      
        return mav;
    } 
}