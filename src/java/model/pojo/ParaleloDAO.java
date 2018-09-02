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

public class ParaleloDAO {
	public static Paralelo loadParaleloByORMID(String idparalelo) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadParaleloByORMID(session, idparalelo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paralelo getParaleloByORMID(String idparalelo) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getParaleloByORMID(session, idparalelo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paralelo loadParaleloByORMID(String idparalelo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadParaleloByORMID(session, idparalelo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paralelo getParaleloByORMID(String idparalelo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getParaleloByORMID(session, idparalelo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paralelo loadParaleloByORMID(PersistentSession session, String idparalelo) throws PersistentException {
		try {
			return (Paralelo) session.load(model.pojo.Paralelo.class, idparalelo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paralelo getParaleloByORMID(PersistentSession session, String idparalelo) throws PersistentException {
		try {
			return (Paralelo) session.get(model.pojo.Paralelo.class, idparalelo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paralelo loadParaleloByORMID(PersistentSession session, String idparalelo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paralelo) session.load(model.pojo.Paralelo.class, idparalelo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paralelo getParaleloByORMID(PersistentSession session, String idparalelo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paralelo) session.get(model.pojo.Paralelo.class, idparalelo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParalelo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryParalelo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParalelo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryParalelo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paralelo[] listParaleloByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listParaleloByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paralelo[] listParaleloByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listParaleloByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParalelo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Paralelo as Paralelo");
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
	
	public static List queryParalelo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Paralelo as Paralelo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paralelo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paralelo[] listParaleloByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryParalelo(session, condition, orderBy);
			return (Paralelo[]) list.toArray(new Paralelo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paralelo[] listParaleloByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryParalelo(session, condition, orderBy, lockMode);
			return (Paralelo[]) list.toArray(new Paralelo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paralelo loadParaleloByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadParaleloByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paralelo loadParaleloByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadParaleloByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paralelo loadParaleloByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Paralelo[] paralelos = listParaleloByQuery(session, condition, orderBy);
		if (paralelos != null && paralelos.length > 0)
			return paralelos[0];
		else
			return null;
	}
	
	public static Paralelo loadParaleloByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Paralelo[] paralelos = listParaleloByQuery(session, condition, orderBy, lockMode);
		if (paralelos != null && paralelos.length > 0)
			return paralelos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateParaleloByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateParaleloByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateParaleloByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateParaleloByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateParaleloByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Paralelo as Paralelo");
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
	
	public static java.util.Iterator iterateParaleloByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Paralelo as Paralelo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paralelo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paralelo createParalelo() {
		return new model.pojo.Paralelo();
	}
	
	public static boolean save(model.pojo.Paralelo paralelo) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().saveObject(paralelo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.pojo.Paralelo paralelo) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().deleteObject(paralelo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Paralelo paralelo)throws PersistentException {
		try {
			if (paralelo.getCursos() != null) {
				paralelo.getCursos().getParalelo().remove(paralelo);
			}
			
			model.pojo.Designa[] lDesignass = (model.pojo.Designa[])paralelo.getDesignas().toArray(new model.pojo.Designa[paralelo.getDesignas().size()]);
			for(int i = 0; i < lDesignass.length; i++) {
				lDesignass[i].setParalelo(null);
			}
			model.pojo.Materia[] lMaterias = (model.pojo.Materia[])paralelo.getMateria().toArray(new model.pojo.Materia[paralelo.getMateria().size()]);
			for(int i = 0; i < lMaterias.length; i++) {
				lMaterias[i].getParalelos().remove(paralelo);
			}
			model.pojo.Matricula[] lMatriculass = (model.pojo.Matricula[])paralelo.getMatriculas().toArray(new model.pojo.Matricula[paralelo.getMatriculas().size()]);
			for(int i = 0; i < lMatriculass.length; i++) {
				lMatriculass[i].setParalelo(null);
			}
			model.pojo.Asigna[] lAsignass = (model.pojo.Asigna[])paralelo.getAsignas().toArray(new model.pojo.Asigna[paralelo.getAsignas().size()]);
			for(int i = 0; i < lAsignass.length; i++) {
				lAsignass[i].setParalelo(null);
			}
			return delete(paralelo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Paralelo paralelo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (paralelo.getCursos() != null) {
				paralelo.getCursos().getParalelo().remove(paralelo);
			}
			
			model.pojo.Designa[] lDesignass = (model.pojo.Designa[])paralelo.getDesignas().toArray(new model.pojo.Designa[paralelo.getDesignas().size()]);
			for(int i = 0; i < lDesignass.length; i++) {
				lDesignass[i].setParalelo(null);
			}
			model.pojo.Materia[] lMaterias = (model.pojo.Materia[])paralelo.getMateria().toArray(new model.pojo.Materia[paralelo.getMateria().size()]);
			for(int i = 0; i < lMaterias.length; i++) {
				lMaterias[i].getParalelos().remove(paralelo);
			}
			model.pojo.Matricula[] lMatriculass = (model.pojo.Matricula[])paralelo.getMatriculas().toArray(new model.pojo.Matricula[paralelo.getMatriculas().size()]);
			for(int i = 0; i < lMatriculass.length; i++) {
				lMatriculass[i].setParalelo(null);
			}
			model.pojo.Asigna[] lAsignass = (model.pojo.Asigna[])paralelo.getAsignas().toArray(new model.pojo.Asigna[paralelo.getAsignas().size()]);
			for(int i = 0; i < lAsignass.length; i++) {
				lAsignass[i].setParalelo(null);
			}
			try {
				session.delete(paralelo);
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
	
	public static boolean refresh(model.pojo.Paralelo paralelo) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().refresh(paralelo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.pojo.Paralelo paralelo) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().evict(paralelo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
