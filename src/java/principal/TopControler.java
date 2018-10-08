/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import proyecto.Roles;
import proyecto.Usuarios;

/**
 *
 * @author HAUSE
 */
@Controller
@SessionAttributes({"miusuario","seleccionadorol","rolseleccionado"})
@RequestMapping("top.htm")
public class TopControler {
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView topControler(@ModelAttribute("miusuario") Usuarios usuario, Model model) 
            
    {   
        //model.addAttribute("fmiusuario",usuario);
        ModelAndView mav =new ModelAndView();
        mav.addObject("fmiusuario",usuario);
        
        mav.setViewName("top");
        return mav;
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView topControler(@RequestParam("idusu") int u) 
            
    {   
        System.out.println("uusario:"+u);
        ModelAndView mav =new ModelAndView();
        mav.addObject("rolseleccionado",u);
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