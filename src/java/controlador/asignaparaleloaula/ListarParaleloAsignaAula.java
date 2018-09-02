/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.asignaparaleloaula;

import controlador.matriculaestudianteparalelo.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import model.pojo.Paralelo;
import org.orm.PersistentException;

/**
 *
 * @author richards
 */
public class ListarParaleloAsignaAula {
@RequestMapping("listarparaleloasignaaula.htm")
public ModelAndView listarParaleloAsignaAula() {
     ModelAndView mov = new ModelAndView();
    try {
       
        Paralelo[] par = model.pojo.ParaleloDAO.listParaleloByQuery(null,"nombre"); 
        
        
        mov.addObject("datos",par);
        mov.setViewName("listarparaleloasignaaula");
        
    } catch (PersistentException ex) {
        Logger.getLogger(ListarParaleloAsignaAula.class.getName()).log(Level.SEVERE, null, ex);
    }
    return mov;
}
}

