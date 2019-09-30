
package controlador.estudiante;

import controlador.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.orm.PersistentException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import proyecto.Usuarios;
@RequestMapping("designacionmateria.htm")
@SessionAttributes({"miusuario"})
public class DesignacionMateriaControlador {
        @RequestMapping(method=RequestMethod.GET)
	public ModelAndView DesignacionMateria(@ModelAttribute("miusuario") Usuarios usuario,
                Model model) {
            ModelAndView designacion = new ModelAndView();
            
            model.addAttribute("usuario",usuario);
            designacion.setViewName("designacionmateria");
            
            return designacion ;

	}
}
