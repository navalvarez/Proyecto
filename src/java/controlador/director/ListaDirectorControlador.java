/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.director;
import controlador.director.*;
import java.util.logging.Level;
import model.pojo.Director;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.orm.PersistentException;
public class ListaDirectorControlador {
    @RequestMapping("listaDirectores.htm")
    public ModelAndView listaDirectores() {
        ModelAndView mav = new ModelAndView();
       //java.util.List modelpojoestudiantes = null;
       model.pojo.Director[] modelpojodirectores; 
        try {
              modelpojodirectores = model.pojo.DirectorDAO.listDirectorByQuery("estado=TRUE","am asc");
              //modelpojoestudiantes = model.pojo.extend.listaEstudiante.listarEstudianteDAO();
            // pasar los datos a la vista
            
              mav.addObject("datos",modelpojodirectores);
       mav.setViewName("listaDirectores");
       
        } catch (PersistentException ex) {
            Logger.getLogger(ListaDirectorControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mav;    
    }
            
}
