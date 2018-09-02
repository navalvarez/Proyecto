/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package model.pojo;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class EstudianteDAO {
	public static Estudiante loadEstudianteByORMID(int ci) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadEstudianteByORMID(session, ci);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante getEstudianteByORMID(int ci) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getEstudianteByORMID(session, ci);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante loadEstudianteByORMID(int ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadEstudianteByORMID(session, ci, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante getEstudianteByORMID(int ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getEstudianteByORMID(session, ci, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante loadEstudianteByORMID(PersistentSession session, int ci) throws PersistentException {
		try {
			return (Estudiante) session.load(model.pojo.Estudiante.class, new Integer(ci));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante getEstudianteByORMID(PersistentSession session, int ci) throws PersistentException {
		try {
			return (Estudiante) session.get(model.pojo.Estudiante.class, new Integer(ci));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante loadEstudianteByORMID(PersistentSession session, int ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estudiante) session.load(model.pojo.Estudiante.class, new Integer(ci), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante getEstudianteByORMID(PersistentSession session, int ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estudiante) session.get(model.pojo.Estudiante.class, new Integer(ci), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstudiante(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryEstudiante(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstudiante(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryEstudiante(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante[] listEstudianteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listEstudianteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante[] listEstudianteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listEstudianteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstudiante(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Estudiante as Estudiante");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstudiante(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Estudiante as Estudiante");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estudiante", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante[] listEstudianteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEstudiante(session, condition, orderBy);
			return (Estudiante[]) list.toArray(new Estudiante[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante[] listEstudianteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEstudiante(session, condition, orderBy, lockMode);
			return (Estudiante[]) list.toArray(new Estudiante[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante loadEstudianteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadEstudianteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante loadEstudianteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadEstudianteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante loadEstudianteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Estudiante[] estudiantes = listEstudianteByQuery(session, condition, orderBy);
		if (estudiantes != null && estudiantes.length > 0)
			return estudiantes[0];
		else
			return null;
	}
	
	public static Estudiante loadEstudianteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Estudiante[] estudiantes = listEstudianteByQuery(session, condition, orderBy, lockMode);
		if (estudiantes != null && estudiantes.length > 0)
			return estudiantes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEstudianteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateEstudianteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstudianteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateEstudianteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstudianteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Estudiante as Estudiante");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstudianteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Estudiante as Estudiante");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estudiante", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estudiante createEstudiante() {
		return new model.pojo.Estudiante();
	}
	
	public static boolean save(model.pojo.Estudiante estudiante) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().saveObject(estudiante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.pojo.Estudiante estudiante) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().deleteObject(estudiante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Estudiante estudiante)throws PersistentException {
		try {
			model.pojo.Notasest[] lNotasestss = (model.pojo.Notasest[])estudiante.getNotasests().toArray(new model.pojo.Notasest[estudiante.getNotasests().size()]);
			for(int i = 0; i < lNotasestss.length; i++) {
				lNotasestss[i].setEstudiante(null);
			}
			model.pojo.Matricula[] lMatriculass = (model.pojo.Matricula[])estudiante.getMatriculas().toArray(new model.pojo.Matricula[estudiante.getMatriculas().size()]);
			for(int i = 0; i < lMatriculass.length; i++) {
				lMatriculass[i].setEstudiante(null);
			}
			return delete(estudiante);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Estudiante estudiante, org.orm.PersistentSession session)throws PersistentException {
		try {
			model.pojo.Notasest[] lNotasestss = (model.pojo.Notasest[])estudiante.getNotasests().toArray(new model.pojo.Notasest[estudiante.getNotasests().size()]);
			for(int i = 0; i < lNotasestss.length; i++) {
				lNotasestss[i].setEstudiante(null);
			}
			model.pojo.Matricula[] lMatriculass = (model.pojo.Matricula[])estudiante.getMatriculas().toArray(new model.pojo.Matricula[estudiante.getMatriculas().size()]);
			for(int i = 0; i < lMatriculass.length; i++) {
				lMatriculass[i].setEstudiante(null);
			}
			try {
				session.delete(estudiante);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(model.pojo.Estudiante estudiante) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().refresh(estudiante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.pojo.Estudiante estudiante) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().evict(estudiante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
