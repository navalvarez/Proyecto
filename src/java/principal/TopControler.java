/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import proyecto.Menus;
import proyecto.Roles;
import proyecto.Usuarios;
import proyecto.UsuariosDAO;

/**
 *
 * @author HAUSE
 */
@Controller
@SessionAttributes({"miusuario","seleccionadorol","rolseleccionado","mismenus"})
@RequestMapping("top.htm")
public class TopControler {
    
    
    @RequestMapping(value="/top.htm",method=RequestMethod.POST)
    
    public ModelAndView topControlerPost(@ModelAttribute("miusuario") Usuarios usuario, Model model,@RequestParam("idusu") int idusu,RedirectAttributes a)            
    {   
        System.out.println("Ingreso Aqui topcontroler");
        System.out.println("Valor de idrol:"+idusu);
        System.out.println("Valor de usuario"+usuario.getIdusu());
        model.addAttribute("fmiusuario",usuario);
        //mav.addObject("rolseleccionado",u);
        a.addAttribute("attr", "attrVal");
        a.addFlashAttribute("flashAttr", "flashAttrVal");
        ModelAndView mav = new ModelAndView("sendRedirect:/principal_2");
        
        //mav.setViewName("top");
        return mav;
    }
    @RequestMapping(value="/top.htm",method=RequestMethod.GET)
    public ModelAndView topControlerGet(@ModelAttribute("miusuario") Usuarios usuario, Model model)            
    {   
        System.out.println("Ingreso Aqui topcontroler");
        model.addAttribute("fmiusuario",usuario);
        //mav.addObject("rolseleccionado",u);
        ModelAndView mav = new ModelAndView();
        
        mav.setViewName("top");
        return mav;
    }
     @ModelAttribute("misusuarios")
        public Map<String,String> lmisroles(@ModelAttribute("miusuario") Usuarios usuario)
        {
            Map <String,String> listado = new LinkedHashMap<>();
            for (Iterator iterator = usuario.idrol.getIterator(); iterator.hasNext();) {
                Roles rol = (Roles)iterator.next();
               listado.put(Integer.toString(rol.getIdrol()),rol.getNombre());             
            }
            return listado;
        }
     
        
}
