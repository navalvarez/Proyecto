/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import ingreso.*;
import java.util.Iterator;
import java.util.List;
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
@Controller
@RequestMapping("principalcontenedor.htm")
public class PrincipalContenedorControler {
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView principalControler() 
            
    {   
        ModelAndView mav =new ModelAndView();
        mav.setViewName("principalcontenedor");
        return mav;
    }
    
}