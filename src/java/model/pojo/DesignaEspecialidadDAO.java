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

public class DesignaEspecialidadDAO {
	public static List queryDesignaEspecialidad(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryDesignaEspecialidad(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDesignaEspecialidad(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryDesignaEspecialidad(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DesignaEspecialidad[] listDesignaEspecialidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listDesignaEspecialidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DesignaEspecialidad[] listDesignaEspecialidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listDesignaEspecialidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDesignaEspecialidad(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.DesignaEspecialidad as DesignaEspecialidad");
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
	
	public static List queryDesignaEspecialidad(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.DesignaEspecialidad as DesignaEspecialidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DesignaEspecialidad", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DesignaEspecialidad[] listDesignaEspecialidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDesignaEspecialidad(session, condition, orderBy);
			return (DesignaEspecialidad[]) list.toArray(new DesignaEspecialidad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DesignaEspecialidad[] listDesignaEspecialidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDesignaEspecialidad(session, condition, orderBy, lockMode);
			return (DesignaEspecialidad[]) list.toArray(new DesignaEspecialidad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DesignaEspecialidad loadDesignaEspecialidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadDesignaEspecialidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DesignaEspecialidad loadDesignaEspecialidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadDesignaEspecialidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DesignaEspecialidad loadDesignaEspecialidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		DesignaEspecialidad[] designaEspecialidads = listDesignaEspecialidadByQuery(session, condition, orderBy);
		if (designaEspecialidads != null && designaEspecialidads.length > 0)
			return designaEspecialidads[0];
		else
			return null;
	}
	
	public static DesignaEspecialidad loadDesignaEspecialidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		DesignaEspecialidad[] designaEspecialidads = listDesignaEspecialidadByQuery(session, condition, orderBy, lockMode);
		if (designaEspecialidads != null && designaEspecialidads.length > 0)
			return designaEspecialidads[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDesignaEspecialidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateDesignaEspecialidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDesignaEspecialidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateDesignaEspecialidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDesignaEspecialidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.DesignaEspecialidad as DesignaEspecialidad");
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
	
	public static java.util.Iterator iterateDesignaEspecialidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.DesignaEspecialidad as DesignaEspecialidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DesignaEspecialidad", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static DesignaEspecialidad createDesignaEspecialidad() {
		return new model.pojo.DesignaEspecialidad();
	}
	
	public static boolean save(model.pojo.DesignaEspecialidad designaEspecialidad) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().saveObject(designaEspecialidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.pojo.DesignaEspecialidad designaEspecialidad) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().deleteObject(designaEspecialidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.DesignaEspecialidad designaEspecialidad)throws PersistentException {
		try {
			if (designaEspecialidad.getMateria() != null) {
				designaEspecialidad.getMateria().getDesignaEspecialidads().remove(designaEspecialidad);
			}
			
			if (designaEspecialidad.getProfesorEspecialidad() != null) {
				designaEspecialidad.getProfesorEspecialidad().getDesignaEspecialidads().remove(designaEspecialidad);
			}
			
			return delete(designaEspecialidad);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.DesignaEspecialidad designaEspecialidad, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (designaEspecialidad.getMateria() != null) {
				designaEspecialidad.getMateria().getDesignaEspecialidads().remove(designaEspecialidad);
			}
			
			if (designaEspecialidad.getProfesorEspecialidad() != null) {
				designaEspecialidad.getProfesorEspecialidad().getDesignaEspecialidads().remove(designaEspecialidad);
			}
			
			try {
				session.delete(designaEspecialidad);
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
	
	public static boolean refresh(model.pojo.DesignaEspecialidad designaEspecialidad) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().refresh(designaEspecialidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.pojo.DesignaEspecialidad designaEspecialidad) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().evict(designaEspecialidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
