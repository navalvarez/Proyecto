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

public class ProfesorEspecialidadDAO {
	public static ProfesorEspecialidad loadProfesorEspecialidadByORMID(int ci) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadProfesorEspecialidadByORMID(session, ci);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorEspecialidad getProfesorEspecialidadByORMID(int ci) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getProfesorEspecialidadByORMID(session, ci);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorEspecialidad loadProfesorEspecialidadByORMID(int ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadProfesorEspecialidadByORMID(session, ci, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorEspecialidad getProfesorEspecialidadByORMID(int ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getProfesorEspecialidadByORMID(session, ci, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorEspecialidad loadProfesorEspecialidadByORMID(PersistentSession session, int ci) throws PersistentException {
		try {
			return (ProfesorEspecialidad) session.load(model.pojo.ProfesorEspecialidad.class, new Integer(ci));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorEspecialidad getProfesorEspecialidadByORMID(PersistentSession session, int ci) throws PersistentException {
		try {
			return (ProfesorEspecialidad) session.get(model.pojo.ProfesorEspecialidad.class, new Integer(ci));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorEspecialidad loadProfesorEspecialidadByORMID(PersistentSession session, int ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ProfesorEspecialidad) session.load(model.pojo.ProfesorEspecialidad.class, new Integer(ci), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorEspecialidad getProfesorEspecialidadByORMID(PersistentSession session, int ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ProfesorEspecialidad) session.get(model.pojo.ProfesorEspecialidad.class, new Integer(ci), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProfesorEspecialidad(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryProfesorEspecialidad(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProfesorEspecialidad(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryProfesorEspecialidad(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorEspecialidad[] listProfesorEspecialidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listProfesorEspecialidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorEspecialidad[] listProfesorEspecialidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listProfesorEspecialidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProfesorEspecialidad(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.ProfesorEspecialidad as ProfesorEspecialidad");
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
	
	public static List queryProfesorEspecialidad(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.ProfesorEspecialidad as ProfesorEspecialidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ProfesorEspecialidad", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorEspecialidad[] listProfesorEspecialidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProfesorEspecialidad(session, condition, orderBy);
			return (ProfesorEspecialidad[]) list.toArray(new ProfesorEspecialidad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorEspecialidad[] listProfesorEspecialidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProfesorEspecialidad(session, condition, orderBy, lockMode);
			return (ProfesorEspecialidad[]) list.toArray(new ProfesorEspecialidad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorEspecialidad loadProfesorEspecialidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadProfesorEspecialidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorEspecialidad loadProfesorEspecialidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadProfesorEspecialidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorEspecialidad loadProfesorEspecialidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ProfesorEspecialidad[] profesorEspecialidads = listProfesorEspecialidadByQuery(session, condition, orderBy);
		if (profesorEspecialidads != null && profesorEspecialidads.length > 0)
			return profesorEspecialidads[0];
		else
			return null;
	}
	
	public static ProfesorEspecialidad loadProfesorEspecialidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ProfesorEspecialidad[] profesorEspecialidads = listProfesorEspecialidadByQuery(session, condition, orderBy, lockMode);
		if (profesorEspecialidads != null && profesorEspecialidads.length > 0)
			return profesorEspecialidads[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProfesorEspecialidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateProfesorEspecialidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProfesorEspecialidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateProfesorEspecialidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProfesorEspecialidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.ProfesorEspecialidad as ProfesorEspecialidad");
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
	
	public static java.util.Iterator iterateProfesorEspecialidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.ProfesorEspecialidad as ProfesorEspecialidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ProfesorEspecialidad", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProfesorEspecialidad createProfesorEspecialidad() {
		return new model.pojo.ProfesorEspecialidad();
	}
	
	public static boolean save(model.pojo.ProfesorEspecialidad profesorEspecialidad) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().saveObject(profesorEspecialidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.pojo.ProfesorEspecialidad profesorEspecialidad) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().deleteObject(profesorEspecialidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.ProfesorEspecialidad profesorEspecialidad)throws PersistentException {
		try {
			model.pojo.DesignaEspecialidad[] lDesignaEspecialidadss = (model.pojo.DesignaEspecialidad[])profesorEspecialidad.getDesignaEspecialidads().toArray(new model.pojo.DesignaEspecialidad[profesorEspecialidad.getDesignaEspecialidads().size()]);
			for(int i = 0; i < lDesignaEspecialidadss.length; i++) {
				lDesignaEspecialidadss[i].setProfesorEspecialidad(null);
			}
			return delete(profesorEspecialidad);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.ProfesorEspecialidad profesorEspecialidad, org.orm.PersistentSession session)throws PersistentException {
		try {
			model.pojo.DesignaEspecialidad[] lDesignaEspecialidadss = (model.pojo.DesignaEspecialidad[])profesorEspecialidad.getDesignaEspecialidads().toArray(new model.pojo.DesignaEspecialidad[profesorEspecialidad.getDesignaEspecialidads().size()]);
			for(int i = 0; i < lDesignaEspecialidadss.length; i++) {
				lDesignaEspecialidadss[i].setProfesorEspecialidad(null);
			}
			try {
				session.delete(profesorEspecialidad);
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
	
	public static boolean refresh(model.pojo.ProfesorEspecialidad profesorEspecialidad) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().refresh(profesorEspecialidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.pojo.ProfesorEspecialidad profesorEspecialidad) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().evict(profesorEspecialidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
