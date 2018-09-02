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
import model.pojo.Director;
import model.pojo.DirectorDAO;
import org.orm.PersistentException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author richards
 */
@Controller
@RequestMapping("insertarDirector.htm")
public class InsertarDirectorControlador {
 // insertar un estudiante 
    // mostrar el formulario vacio
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView insertarDirector()
    {  ModelAndView mav = new ModelAndView();
       mav.setViewName("insertarDirector");
       mav.addObject("datos", new Director());
       //listadosuspendido();
       return mav;
    }
    /**
	 * guardar lo que llene en el formulario
	 * @param di
	 */
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView insertarDirector(
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
    
     @ModelAttribute("estado")
        public Map<String,String> listadosuspendido()
        {
            Map <String,String> listado = new LinkedHashMap<>();
            listado.put("false","Suspendido");
            listado.put("true","No suspendido");
            return listado;
        }
}
