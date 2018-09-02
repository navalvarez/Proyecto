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
import model.pojo.Estudiante;
import model.pojo.EstudianteDAO;
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
@RequestMapping("insertarEstudiante.htm")
public class InsertarEstudianteControlador {
 // insertar un estudiante 
    // mostrar el formulario vacio
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView insertarEstudiante()
    {  ModelAndView mav = new ModelAndView();
       mav.setViewName("insertarEstudiante");
       mav.addObject("datos", new Estudiante());
       //listadosuspendido();
       return mav;
    }
    /**
	 * guardar lo que llene en el formulario
	 * @param es
	 */
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView insertarEstudiante(
            @ModelAttribute("datos") Estudiante es
    )
    {
        try {
            es.setCi(es.getCi());
            es.setRude(es.getRude());
            es.setNombre(es.getNombre());
            es.setAp(es.getAp());
            es.setAm(es.getAm());
            es.setCorreo(es.getCorreo());
            es.setTelefono(es.getTelefono());
            es.setUsuario(es.getUsuario());
            es.setContrasena(es.getContrasena());
            es.setEstado(es.getEstado());
            es.setDireccion(es.getDireccion());
            model.pojo.EstudianteDAO.save(es);
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarEstudianteControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ModelAndView("redirect:listaEstudiantes.htm");
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
