/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.director;

import controlador.director.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import model.pojo.Director;
import static model.pojo.DirectorDAO.getDirectorByORMID;
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
@RequestMapping("modificarDirector.htm")
public class ModificarDirectorControlador {
    /**
	 * 
	 * @param ci
	 */
	@RequestMapping(method=RequestMethod.GET) 
    public ModelAndView modificarDirector(@RequestParam("ci") int ci)
    {
        Director di = null;
        
             
        System.out.println("ci:"+ci);
        try {
            //int ci =Integer.parseInt( request.getParameter("ci"));
            di = getDirectorByORMID(ci);
            
        } catch (PersistentException ex) {
            Logger.getLogger(ModificarDirectorControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
       ModelAndView mav=new ModelAndView();
       mav.setViewName("modificarDirector");
        //mav.addObject("estudiante",new estudiante(es.getCi(),es.getRude(),es.getNombre(),es.getAp(),es.getAm(),
        //        es.getCorreo(),es.getTelefono(),es.getUsuario(),es.getContrasena(),es.getSuspendido(),es.getDireccion(),es.getImagen()));           
        mav.addObject("director",di);
        return mav;
       
    
}
    @ModelAttribute("estado")
        public Map<String,String> listadosuspendido()
        {
            Map <String,String> listado = new LinkedHashMap<>();
            listado.put("false","Suspendido");
            listado.put("true","No suspendido");
            return listado;
        }
    
         /**
	 * 
	 * @param di
	 */
	@RequestMapping(method=RequestMethod.POST)
    public ModelAndView modificarDirector(
            @ModelAttribute("datos") Director di
    )
    {
        try {
            di.setCi(di.getCi());
            di.setUnidad(di.getUnidad());
            di.setNombre(di.getNombre());
            di.setAp(di.getAp());
            di.setAm(di.getAm());
            di.setCorreo(di.getCorreo());
            di.setTelefono(di.getTelefono());
            di.setUsuario(di.getUsuario());
            di.setContrasena(di.getContrasena());
            di.setEstado(di.getEstado());
            di.setDireccion(di.getDireccion());
            model.pojo.DirectorDAO.save(di);
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarDirectorControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ModelAndView("redirect:listaDirectores.htm");
    }
}