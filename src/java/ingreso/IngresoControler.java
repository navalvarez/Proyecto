/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingreso;

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
@RequestMapping("usuario.htm")
public class IngresoControler {
    private IngresoValidar ingresovalidar;
    public IngresoControler(){
        this.ingresovalidar = new IngresoValidar();
    }
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView usuarioGet() 
            
    {   
        ModelAndView mav =new ModelAndView();
        mav.setViewName("usuario");
        V_usuariorol p = new V_usuariorol();
        
        
        mav.addObject("V_usuariorol",p);
        
        System.out.println("se cargo el formulario");
        return mav;
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView usuarioPost(
            @ModelAttribute("V_usuariorol") V_usuariorol rol,
            BindingResult result,
            SessionStatus status
    ) throws PersistentException {
        System.out.print(rol);
        this.ingresovalidar.validate(rol, result);
        //System.out.print(rol.getLogin()+"---");
        //System.out.print(rol.getPassword()+"--");
       
        List lista = null;
        String condicion = "login = \'"+ rol.getLogin() + "\' AND password=\'"+rol.getPassword()+"\'";
            //lista = model.pojo.VlistarolesDAO.queryVlistaroles(condicion," nombre DESC");
            lista = proyecto.V_usuariorolDAO.queryV_usuariorol(condicion," unombre DESC");
            V_usuariorol roldevolver = null;
             ModelAndView mav = new ModelAndView();
                     
            try {
                roldevolver = (V_usuariorol)lista.get(0);
             
                
            }
            catch (IndexOutOfBoundsException ex){
              
                
        }
        mav.setViewName("usuario");
        String direccion = null;
        if (!result.hasErrors()) {
          Usuarios u =  (Usuarios)UsuariosDAO.getUsuariosByORMID(roldevolver.getIdusu());
            Roles roles;
            for (Iterator iterator = u.idrol.getIterator(); iterator.hasNext();) {
            roles = (Roles)iterator.next();
            System.out.print(roles.getIdrol()+" "+roles.getNombre());
                for (Iterator iterator2 = roles.idmenu.getIterator(); iterator2.hasNext();){
                    Menus m;
                    m = (Menus)iterator2.next();
                    System.out.print(m.getIdmenu()+" "+m.getNombre());
                }
            }
            
          
                 
          
          
          
          
          if (roldevolver.getNombre().equals("Administrador")) {
              direccion = "redirect:vistaEstudiante.htm";
          }
            if (roldevolver.getNombre().equals("Director")) { 
             direccion = "redirect:vistaDirector.htm";
          }
         
          if (roldevolver.getNombre().equals("PC")) {
             direccion = "redirect:vistaProfesorCurso.htm";
          }
            
          if (roldevolver.getNombre().equals("PE")) {
          direccion = "redirect:vistaProfesorEspecialidad.htm";
          }
        } else {
           direccion = "redirect:usuario.htm";
        }
      
        
        return new ModelAndView(direccion);
    }
            
     
    
}
       
