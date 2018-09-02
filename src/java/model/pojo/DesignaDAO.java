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

public class DesignaDAO {
	public static Designa loadDesignaByORMID(model.pojo.Paralelo paralelo, model.pojo.ProfesorCurso profesorCurso) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadDesignaByORMID(session, paralelo, profesorCurso);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Designa getDesignaByORMID(model.pojo.Paralelo paralelo, model.pojo.ProfesorCurso profesorCurso) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getDesignaByORMID(session, paralelo, profesorCurso);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Designa loadDesignaByORMID(model.pojo.Paralelo paralelo, model.pojo.ProfesorCurso profesorCurso, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadDesignaByORMID(session, paralelo, profesorCurso, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Designa getDesignaByORMID(model.pojo.Paralelo paralelo, model.pojo.ProfesorCurso profesorCurso, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getDesignaByORMID(session, paralelo, profesorCurso, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Designa loadDesignaByORMID(PersistentSession session, model.pojo.Paralelo paralelo, model.pojo.ProfesorCurso profesorCurso) throws PersistentException {
		try {
			Designa designa = new model.pojo.Designa();
			designa.setParalelo(paralelo);
			designa.setProfesorCurso(profesorCurso);
			
			return (Designa) session.load(model.pojo.Designa.class, designa);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Designa getDesignaByORMID(PersistentSession session, model.pojo.Paralelo paralelo, model.pojo.ProfesorCurso profesorCurso) throws PersistentException {
		try {
			Designa designa = new model.pojo.Designa();
			designa.setParalelo(paralelo);
			designa.setProfesorCurso(profesorCurso);
			
			return (Designa) session.get(model.pojo.Designa.class, designa);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Designa loadDesignaByORMID(PersistentSession session, model.pojo.Paralelo paralelo, model.pojo.ProfesorCurso profesorCurso, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Designa designa = new model.pojo.Designa();
			designa.setParalelo(paralelo);
			designa.setProfesorCurso(profesorCurso);
			
			return (Designa) session.load(model.pojo.Designa.class, designa, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Designa getDesignaByORMID(PersistentSession session, model.pojo.Paralelo paralelo, model.pojo.ProfesorCurso profesorCurso, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Designa designa = new model.pojo.Designa();
			designa.setParalelo(paralelo);
			designa.setProfesorCurso(profesorCurso);
			
			return (Designa) session.get(model.pojo.Designa.class, designa, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDesigna(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryDesigna(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDesigna(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryDesigna(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Designa[] listDesignaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listDesignaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Designa[] listDesignaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listDesignaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDesigna(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Designa as Designa");
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
	
	public static List queryDesigna(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Designa as Designa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Designa", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Designa[] listDesignaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDesigna(session, condition, orderBy);
			return (Designa[]) list.toArray(new Designa[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Designa[] listDesignaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDesigna(session, condition, orderBy, lockMode);
			return (Designa[]) list.toArray(new Designa[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Designa loadDesignaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadDesignaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Designa loadDesignaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadDesignaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Designa loadDesignaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Designa[] designas = listDesignaByQuery(session, condition, orderBy);
		if (designas != null && designas.length > 0)
			return designas[0];
		else
			return null;
	}
	
	public static Designa loadDesignaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Designa[] designas = listDesignaByQuery(session, condition, orderBy, lockMode);
		if (designas != null && designas.length > 0)
			return designas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDesignaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateDesignaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDesignaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateDesignaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDesignaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Designa as Designa");
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
	
	public static java.util.Iterator iterateDesignaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Designa as Designa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Designa", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Designa createDesigna() {
		return new model.pojo.Designa();
	}
	
	public static boolean save(model.pojo.Designa designa) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().saveObject(designa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.pojo.Designa designa) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().deleteObject(designa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Designa designa)throws PersistentException {
		try {
			if (designa.getParalelo() != null) {
				designa.getParalelo().getDesignas().remove(designa);
			}
			
			if (designa.getProfesorCurso() != null) {
				designa.getProfesorCurso().getDesignas().remove(designa);
			}
			
			return delete(designa);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Designa designa, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (designa.getParalelo() != null) {
				designa.getParalelo().getDesignas().remove(designa);
			}
			
			if (designa.getProfesorCurso() != null) {
				designa.getProfesorCurso().getDesignas().remove(designa);
			}
			
			try {
				session.delete(designa);
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
	
	public static boolean refresh(model.pojo.Designa designa) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().refresh(designa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.pojo.Designa designa) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().evict(designa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
