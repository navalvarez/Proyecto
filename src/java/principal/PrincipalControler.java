/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import ingreso.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import proyecto.Usuarios;
import proyecto.UsuariosDAO;
import proyecto.Roles;
import proyecto.Menus;
import org.orm.PersistentException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@RequestMapping("principal_2")
// Que parametros 
// login password idrol
@SessionAttributes({"mismenus","miusuario","rolseleccionado"})

public class PrincipalControler {
   
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView principalControlerPost(@RequestParam("idusu") int r,@ModelAttribute("miusuario") Usuarios usuario ) 
            
    {   
        
        System.out.println("usuario logeado:"+usuario.getIdusu());
        System.out.println("rol seleccionado:"+r);
        Usuarios usu = null;
        try {
            usu = (Usuarios)UsuariosDAO.getUsuariosByORMID(usuario.getIdusu());
        } catch (PersistentException ex) {
            Logger.getLogger(TopControler.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<Menus> smenus = new ArrayList<Menus>();
        Menus m = null;
        for (Iterator iterator = usu.idrol.getIterator(); iterator.hasNext();){     
            Roles roles = (Roles)iterator.next(); 
             System.out.println ("ingreso rol");
            if (roles.getIdrol()==r){
                // MENU
               for (Iterator iterator2 = roles.idmenu.getIterator(); iterator2.hasNext();){
                    
                    m = (Menus)iterator2.next();
                    System.out.println ("NOMBRE DEL MENU:"+m.getNombre());
                    smenus.add(m); 
               }
            }
        }
        ModelAndView mav =new ModelAndView();

        mav.addObject("mismenus",smenus);       
        mav.setViewName("principal_2");
        return mav;
    }
    
    /**
     *
     * @param r
     * @param usuario
     * @return
     */
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView principalControlerGet(@ModelAttribute("miusuario") Usuarios usuario) 
            
    {   
        
        
        System.out.println("Llego metodo GET");
        ModelAndView mav =new ModelAndView();
        mav.setViewName("principal_2");
        return mav;
    }
    
}