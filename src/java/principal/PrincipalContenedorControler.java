/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import ingreso.*;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import proyecto.V_usuariorol;
import proyecto.Usuarios;
import proyecto.UsuariosDAO;
import proyecto.Roles;
import proyecto.RolesDAO;
import proyecto.Menus;
import proyecto.MenusDAO;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


@SessionAttributes(value={"miusuario","seleccionadorol","rolseleccionado","mismenus"})
@Controller
@RequestMapping(value = "/")
public class PrincipalContenedorControler  {
    
    @RequestMapping(value="/principalcontenedor")
    public String principalControler() 
            
    {   
        
        System.out.println("ingreso principal contenedor");
        return "principalcontenedor";
    }
        
}
