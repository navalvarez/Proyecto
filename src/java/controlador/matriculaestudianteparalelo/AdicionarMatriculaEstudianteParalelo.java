/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.matriculaestudianteparalelo;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import model.pojo.Matricula;
import model.pojo.MatriculaDAO;
import model.pojo.EstudianteDAO;
import model.pojo.Estudiante;
import model.pojo.Paralelo;
import org.orm.PersistentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author richards
 */
@Controller
@RequestMapping("adicionarestudiantematriculaparalelo.htm")
public class AdicionarMatriculaEstudianteParalelo {
 // insertar un estudiante 
    // mostrar el formulario vacio
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView adicionarmatricularestudianteparalelo(@RequestParam("ci") int ci) throws ParseException
    {   //try {
        // requesparam("ci") Valor del CI seleccionado
        ModelAndView mav = new ModelAndView("adicionarestudiantematriculaparalelo");
        Matricula m = new Matricula();
        Estudiante est = new Estudiante();
        Paralelo p = new Paralelo();
        model.pojo.Vmatricula vmatricula= null;
        // para elegir la ultima matriculacion del alumno 
        
        model.pojo.Vmatricula[] modelpojomatriculaseleccionada  = null;
        try {
            // calculamos el estudiante
            est = model.pojo.EstudianteDAO.getEstudianteByORMID(ci);
            System.out.println("valor del ci:"+ci);
            modelpojomatriculaseleccionada = model.pojo.VmatriculaDAO.listVmatriculaByQuery("estudianteci="+ci,"estudianteci");
            try {
            if (modelpojomatriculaseleccionada!=null) 
            vmatricula = (model.pojo.Vmatricula)modelpojomatriculaseleccionada[0];
            }
            catch (java.lang.ArrayIndexOutOfBoundsException a){
                System.out.println("error");
            } 
            if (vmatricula!=null ) {
                System.out.println("valor del paralelo"+vmatricula.getIdparalelo());
                // calculas el paralelo
                p = model.pojo.ParaleloDAO.getParaleloByORMID(vmatricula.getIdparalelo());
                System.out.println("valor del paralelo2:"+p.getIdparalelo());  
                m = model.pojo.MatriculaDAO.getMatriculaByORMID(est, p,vmatricula.getFecha());
                System.out.println(m.getEstudiante().getCi()+ "--- "+ m.getParalelo().getIdparalelo()+ "--- "+m.getFecha());
        
            } else {
                
                m.setEstudiante(est);
                
                //m.getEstudiante().setCi(ci);
                //m = model.pojo.MatriculaDAO.getMatriculaByORMID(est, p,null);
                 //System.out.println(m.getEstudiante().getCi()+ "--- ");
            }
            
        } catch (PersistentException ex) {
            Logger.getLogger(AdicionarMatriculaEstudianteParalelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        ///m.setEstudiante(est);
        ///m.setParalelo(p);
        
        mav.addObject("matricula", m);
        return mav;
    }
 
 @RequestMapping(method=RequestMethod.POST)
 public ModelAndView guardarEstudianteMatriculaParalelo(HttpServletRequest request,@ModelAttribute("matricula") Matricula matricula){
     
     String estudianteid = request.getParameter("estudianteId").toString();
     String paleleloid = request.getParameter("paraleloId").toString();
     String fecha = request.getParameter("fecha").toString();
     Matricula ma =  new Matricula();
     Estudiante est = null;
     Paralelo pa = null;
     
     
        try {
            est = model.pojo.EstudianteDAO.getEstudianteByORMID(Integer.parseInt(estudianteid));
            pa = model.pojo.ParaleloDAO.getParaleloByORMID(paleleloid);
        } catch (PersistentException ex) {
            Logger.getLogger(AdicionarMatriculaEstudianteParalelo.class.getName()).log(Level.SEVERE, null, ex);
        }
     ma.setEstudiante(est);
     ma.setParalelo(pa);
    
    DateFormat formatter;
    Date date = null;
    formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = formatter.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(AdicionarMatriculaEstudianteParalelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    ma.setFecha(date);
        try {
            model.pojo.MatriculaDAO.save(ma);
        } catch (PersistentException ex) {
            Logger.getLogger(AdicionarMatriculaEstudianteParalelo.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
     
     System.out.println("estudianteid:"+request.getParameter("estudianteId").toString());
     System.out.println("paraleloid:"+request.getParameter("paraleloId").toString());
     System.out.println("fecha:"+request.getParameter("fecha").toString());
     
     
     
     
     return new ModelAndView("listarestudiantematriculaparalelo");
 }
    
 @ModelAttribute("paraleloId")
 
        public Map<String,String> listadoparalelos() {
            model.pojo.Paralelo[] modelpojoparalelos;
            modelpojoparalelos = null;
            
        try {
            modelpojoparalelos = model.pojo.ParaleloDAO.listParaleloByQuery(null,null);
        } catch (PersistentException ex) {
            Logger.getLogger(AdicionarMatriculaEstudianteParalelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
            Map <String,String> listadoP = new LinkedHashMap<>();
         for (int i=0;i<modelpojoparalelos.length;i++) {
            Paralelo par = (Paralelo)modelpojoparalelos[i];
           
            listadoP.put(par.getIdparalelo(),par.getNombre());
         }    
            return listadoP;
        }
 
 
}


