/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llenardatos;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.pojo.Estudiante;
import model.pojo.EstudianteDAO;
import model.pojo.Paralelo;
import model.pojo.ParaleloDAO;
import model.pojo.Materia;
import model.pojo.MateriaDAO;
import model.pojo.Curso;
import model.pojo.CursoDAO;
import model.pojo.Ciclo;
import model.pojo.CicloDAO;
import model.pojo.Director;
import model.pojo.DirectorDAO;
import static model.pojo.EstudianteDAO.getEstudianteByORMID;
import model.pojo.Matricula;
import model.pojo.MatriculaDAO;
import model.pojo.Notasest;
import model.pojo.NotasestDAO;
import org.orm.PersistentException;
import ormsamples.DeleteTallerv77Data;

/**
 *
 * @author richards
 */
public class Principal {

public static Director[] directorLlenarDatos(){
     Director [] director = new Director[3];
      Director director1 = new Director();
        director1.setCi(111);
        director1.setNombre("Lorenzo");
        director1.setAp("Prieto");
        director1.setAm("Valverde");
        director[0] = director1;
        Director director2 = new Director();
        director2.setCi(112);
        director2.setNombre("Maria");
        director2.setAp("Ruiz");
        director2.setAm("Davalos");
        director[1]= director2;
    try {
        model.pojo.DirectorDAO.save(director1);
        model.pojo.DirectorDAO.save(director2);
        
        
    } catch (PersistentException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    return director;
}
public static Ciclo[] cicloLlenarDatos() {
    // ciclo 
    Ciclo[] ciclo = new Ciclo[3];
    Ciclo ciclo1 = new Ciclo();
    ciclo1.setDirector((Director)directorLlenarDatos()[0]);
    
    ciclo1.setEstado(true);
    ciclo1.setIdciclo(11);
    ciclo1.setNombre("Turno Mañana");
    ciclo1.setTurno("mañana");
    ciclo[0] = ciclo1;
    try {
        model.pojo.CicloDAO.save(ciclo1);
    } catch (PersistentException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return ciclo;
}

public static Curso[] cursoLlenarDatos(){
    // curso
    Curso[] curso = new Curso[2];
    Curso curso1 = new Curso();
    curso1.setIdcurso(111);
    curso1.setCiclos((Ciclo)cicloLlenarDatos()[0]);
    
    curso1.setNombre("1ro A");
    curso1.setAnno("2018");
    curso1.setEstado(true);
    curso[0] = curso1;
    try {
        model.pojo.CursoDAO.save(curso1);
    } catch (PersistentException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return curso;
   
}
 public static Estudiante[] estudianteLlenarDatos() {
     Estudiante[] estudiante = new Estudiante[3];
     try {
      // estudiante 
            Estudiante es = new Estudiante();
            es.setCi(4143);
            es.setRude(3020);
            es.setNombre("Carlos");
            es.setAp("Flores");
            es.setAm("Ramos");
            estudiante[0] = es;
    
        model.pojo.EstudianteDAO.save(es);
  
            Estudiante es1 = new Estudiante();
             es1.setCi(4140);
            es1.setRude(3021);
            es1.setNombre("Maira");
            es1.setAp("Rios");
            es1.setAm("Donoso");
            estudiante [1] = es1;
            model.pojo.EstudianteDAO.save(es1);
          } catch (PersistentException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
    }
     return estudiante;
 }
 public static Materia[] materiaLlenarDatos() {
     Materia[] materia = new Materia[3];
     Materia materia1 = new Materia();
     materia1.setSigla("REL");   
     //System.out.println("curso en materia"+cursoLlenarDatos()[0]);
     materia1.setCurso((Curso)cursoLlenarDatos()[0]);
     materia1.setEstado(true);
     materia1.setNombre("Religion");
     materia1.setNrohora(40);
      materia[0] = materia1;
    try {
        model.pojo.MateriaDAO.save(materia1);
    } catch (PersistentException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
    }
     return materia;
 }
 public static Paralelo[] paraleloLlenarDatos(){
     // paralelo 
        Paralelo[] paralelo = new Paralelo[3];
        Curso curso = (Curso)cursoLlenarDatos()[0];
    try {
        Paralelo paralelo1 = new Paralelo();
        paralelo1.setIdparalelo("11");
        paralelo1.setCursos(curso);
        paralelo1.setNombre("1ra A");
        paralelo1.setEstado(true);
        
        //paralelo[0]= paralelo1;
        
        Paralelo paralelo2 = new Paralelo();
        paralelo2.setIdparalelo("12");
        paralelo2.setCursos(curso);
        paralelo2.setNombre("1ra B");
        paralelo2.setEstado(true);
        
        
        //paralelo[1]= paralelo2;*/
        
        model.pojo.ParaleloDAO.save(paralelo1);
        model.pojo.ParaleloDAO.save(paralelo2);
                
                } catch (PersistentException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
    }
    return paralelo;
 }
    public static void borrardatos(){
      //borrarEstudiante();
      borrarCiclo();
      borrarDirector();
        
    }
    public static void llenardatos(){
        
        //estudianteLlenarDatos();
        //cicloLlenarDatos();
        //cursoLlenarDatos();
        materiaLlenarDatos();
        //borrardatos();
        
        paraleloLlenarDatos();
    }
    public static void llenardatos2(){
        Director director1 = new Director();
        director1.setCi(111);
        director1.setNombre("Lorenzo");
        director1.setAp("Prieto");
        director1.setAm("Valverde");
        
        Director director2 = new Director();
        director2.setCi(112);
        director2.setNombre("Maria");
        director2.setAp("Ruiz");
        director2.setAm("Davalos");
        
        Ciclo ciclo1 = new Ciclo();
        ciclo1.setDirector((Director)director1);             
        ciclo1.setEstado(true);
        ciclo1.setIdciclo(11);
        ciclo1.setNombre("Turno Mañana");
        ciclo1.setTurno("mañana");
        
    
        Curso curso1 = new Curso();
        curso1.setIdcurso(111);
        curso1.setCiclos((Ciclo)ciclo1);
        curso1.setNombre("1ro A");
        curso1.setAnno("2018");
        curso1.setEstado(true);
        
        Curso curso2 = new Curso();
        curso2.setIdcurso(112);
        curso2.setCiclos((Ciclo)ciclo1);
        curso2.setNombre("2do A");
        curso2.setAnno("2018");
        curso2.setEstado(true);
        
        Paralelo paralelo1 = new Paralelo();
        paralelo1.setIdparalelo("11");
        paralelo1.setCursos(curso1);
        paralelo1.setNombre("1ra A");
        paralelo1.setEstado(true);
        
        //paralelo[0]= paralelo1;
        
        Paralelo paralelo2 = new Paralelo();
        paralelo2.setIdparalelo("12");
        paralelo2.setCursos(curso1);
        paralelo2.setNombre("1ra B");
        paralelo2.setEstado(true);
        
        Paralelo paralelo3 = new Paralelo();
        paralelo3.setIdparalelo("13");
        paralelo3.setCursos(curso1);
        paralelo3.setNombre("1ra C");
        paralelo3.setEstado(true);
        
        
        Paralelo paralelo4 = new Paralelo();
        paralelo4.setIdparalelo("14");
        paralelo4.setCursos(curso2);
        paralelo4.setNombre("2do A");
        paralelo4.setEstado(true);
        
        //paralelo[0]= paralelo1;
        
        Paralelo paralelo5 = new Paralelo();
        paralelo5.setIdparalelo("15");
        paralelo5.setCursos(curso2);
        paralelo5.setNombre("2do B");
        paralelo5.setEstado(true);
        
        Estudiante es = new Estudiante();
        es.setCi(4143);
        es.setRude(3020);
        es.setNombre("Carlos");
        es.setAp("Flores");
        es.setAm("Ramos");
        
        Estudiante es1 = new Estudiante();
        es1.setCi(4140);
        es1.setRude(3021);
        es1.setNombre("Maira");
        es1.setAp("Rios");
        es1.setAm("Donoso");
        
    try {
        model.pojo.DirectorDAO.save(director1);
        model.pojo.DirectorDAO.save(director2);
        model.pojo.CicloDAO.save(ciclo1);
        model.pojo.CursoDAO.save(curso1);
        model.pojo.CursoDAO.save(curso2);
        model.pojo.ParaleloDAO.save(paralelo1);
        model.pojo.ParaleloDAO.save(paralelo2);
        model.pojo.ParaleloDAO.save(paralelo3);
        model.pojo.ParaleloDAO.save(paralelo4);
        model.pojo.ParaleloDAO.save(paralelo5);
        model.pojo.EstudianteDAO.save(es);
         model.pojo.EstudianteDAO.save(es1);
        
        
    } catch (PersistentException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
        // aqui
    }
   
     public static void borrarCiclo(){
        Ciclo ci = new Ciclo();
        try {
             ci = model.pojo.CicloDAO.loadCicloByQuery(null,null);
            model.pojo.CicloDAO.delete(ci);
        } catch (PersistentException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void borrarDirector(){
        Director di = new Director();
        try {
             di = model.pojo.DirectorDAO.loadDirectorByQuery(null,null);
            model.pojo.DirectorDAO.delete(di);
        } catch (PersistentException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void borrarEstudiante(){
        Estudiante es = new Estudiante();
        try {
             es = model.pojo.EstudianteDAO.loadEstudianteByQuery(null,null);
            model.pojo.EstudianteDAO.delete(es);
        } catch (PersistentException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public static void borrarMateria(){
        Materia ma = new Materia();
        try {
             ma = model.pojo.MateriaDAO.loadMateriaByQuery(null,null);
            model.pojo.MateriaDAO.delete(ma);
        } catch (PersistentException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public static void borrarNotasEst() throws PersistentException{
        
        Materia ma = model.pojo.MateriaDAO.loadMateriaByQuery(null,null);
        Estudiante es = model.pojo.EstudianteDAO.loadEstudianteByQuery(null,null);
        
        
        try {
             Notasest estma = model.pojo.NotasestDAO.loadNotasestByORMID(es,ma);
            
             model.pojo.NotasestDAO.delete(estma);
        } catch (PersistentException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main (String args[]){
        llenardatos2();
        //borrar();
    }

	public static void borrar() {
		// TODO - implement Principal.borrar
		throw new UnsupportedOperationException();
	}
}
