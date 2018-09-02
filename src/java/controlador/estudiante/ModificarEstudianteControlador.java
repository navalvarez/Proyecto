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
@RequestMapping("modificarEstudiante.htm")
public class ModificarEstudianteControlador {
    /**
	 * 
	 * @param ci
	 */
	@RequestMapping(method=RequestMethod.GET) 
    public ModelAndView modificarEstudiante(@RequestParam("ci") int ci)
    {
        Estudiante es = null;
        
             
        System.out.println("ci:"+ci);
        try {
            //int ci =Integer.parseInt( request.getParameter("ci"));
            es = getEstudianteByORMID(ci);
            
        } catch (PersistentException ex) {
            Logger.getLogger(ModificarEstudianteControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
       ModelAndView mav=new ModelAndView();
       mav.setViewName("modificarEstudiante");
        //mav.addObject("estudiante",new estudiante(es.getCi(),es.getRude(),es.getNombre(),es.getAp(),es.getAm(),
        //        es.getCorreo(),es.getTelefono(),es.getUsuario(),es.getContrasena(),es.getSuspendido(),es.getDireccion(),es.getImagen()));           
        mav.addObject("estudiante",es);
        return mav;
       
    
}
    @ModelAttribute("estado")
        public Map<String,String> listadosuspendido()
        {
            Map <String,String> listado = new LinkedHashMap<>();
            listado.put("true","No suspendido");
            listado.put("false","Suspendido");
            
            
            return listado;
        }
}