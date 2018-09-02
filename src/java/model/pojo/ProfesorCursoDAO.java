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

public class ProfesorCursoDAO {
	public static ProfesorCurso loadProfesorCursoByORMID(int ci) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadProfesorCursoByORMID(session, ci);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorCurso getProfesorCursoByORMID(int ci) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getProfesorCursoByORMID(session, ci);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorCurso loadProfesorCursoByORMID(int ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadProfesorCursoByORMID(session, ci, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorCurso getProfesorCursoByORMID(int ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getProfesorCursoByORMID(session, ci, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorCurso loadProfesorCursoByORMID(PersistentSession session, int ci) throws PersistentException {
		try {
			return (ProfesorCurso) session.load(model.pojo.ProfesorCurso.class, new Integer(ci));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorCurso getProfesorCursoByORMID(PersistentSession session, int ci) throws PersistentException {
		try {
			return (ProfesorCurso) session.get(model.pojo.ProfesorCurso.class, new Integer(ci));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorCurso loadProfesorCursoByORMID(PersistentSession session, int ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ProfesorCurso) session.load(model.pojo.ProfesorCurso.class, new Integer(ci), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorCurso getProfesorCursoByORMID(PersistentSession session, int ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ProfesorCurso) session.get(model.pojo.ProfesorCurso.class, new Integer(ci), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProfesorCurso(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryProfesorCurso(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProfesorCurso(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryProfesorCurso(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorCurso[] listProfesorCursoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listProfesorCursoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorCurso[] listProfesorCursoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listProfesorCursoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProfesorCurso(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.ProfesorCurso as ProfesorCurso");
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
	
	public static List queryProfesorCurso(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.ProfesorCurso as ProfesorCurso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ProfesorCurso", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorCurso[] listProfesorCursoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProfesorCurso(session, condition, orderBy);
			return (ProfesorCurso[]) list.toArray(new ProfesorCurso[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorCurso[] listProfesorCursoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProfesorCurso(session, condition, orderBy, lockMode);
			return (ProfesorCurso[]) list.toArray(new ProfesorCurso[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorCurso loadProfesorCursoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadProfesorCursoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorCurso loadProfesorCursoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadProfesorCursoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorCurso loadProfesorCursoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ProfesorCurso[] profesorCursos = listProfesorCursoByQuery(session, condition, orderBy);
		if (profesorCursos != null && profesorCursos.length > 0)
			return profesorCursos[0];
		else
			return null;
	}
	
	public static ProfesorCurso loadProfesorCursoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ProfesorCurso[] profesorCursos = listProfesorCursoByQuery(session, condition, orderBy, lockMode);
		if (profesorCursos != null && profesorCursos.length > 0)
			return profesorCursos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProfesorCursoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateProfesorCursoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProfesorCursoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateProfesorCursoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProfesorCursoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.ProfesorCurso as ProfesorCurso");
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
	
	public static java.util.Iterator iterateProfesorCursoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.ProfesorCurso as ProfesorCurso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ProfesorCurso", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorCurso createProfesorCurso() {
		return new model.pojo.ProfesorCurso();
	}
	
	public static boolean save(model.pojo.ProfesorCurso profesorCurso) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().saveObject(profesorCurso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.pojo.ProfesorCurso profesorCurso) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().deleteObject(profesorCurso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.ProfesorCurso profesorCurso)throws PersistentException {
		try {
			model.pojo.Designa[] lDesignass = (model.pojo.Designa[])profesorCurso.getDesignas().toArray(new model.pojo.Designa[profesorCurso.getDesignas().size()]);
			for(int i = 0; i < lDesignass.length; i++) {
				lDesignass[i].setProfesorCurso(null);
			}
			return delete(profesorCurso);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.ProfesorCurso profesorCurso, org.orm.PersistentSession session)throws PersistentException {
		try {
			model.pojo.Designa[] lDesignass = (model.pojo.Designa[])profesorCurso.getDesignas().toArray(new model.pojo.Designa[profesorCurso.getDesignas().size()]);
			for(int i = 0; i < lDesignass.length; i++) {
				lDesignass[i].setProfesorCurso(null);
			}
			try {
				session.delete(profesorCurso);
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
	
	public static boolean refresh(model.pojo.ProfesorCurso profesorCurso) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().refresh(profesorCurso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.pojo.ProfesorCurso profesorCurso) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().evict(profesorCurso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
