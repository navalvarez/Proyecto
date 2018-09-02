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

public class NotasestDAO {
	public static Notasest loadNotasestByORMID(model.pojo.Estudiante estudiante, model.pojo.Materia materia) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadNotasestByORMID(session, estudiante, materia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notasest getNotasestByORMID(model.pojo.Estudiante estudiante, model.pojo.Materia materia) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getNotasestByORMID(session, estudiante, materia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notasest loadNotasestByORMID(model.pojo.Estudiante estudiante, model.pojo.Materia materia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadNotasestByORMID(session, estudiante, materia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notasest getNotasestByORMID(model.pojo.Estudiante estudiante, model.pojo.Materia materia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getNotasestByORMID(session, estudiante, materia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notasest loadNotasestByORMID(PersistentSession session, model.pojo.Estudiante estudiante, model.pojo.Materia materia) throws PersistentException {
		try {
			Notasest notasest = new model.pojo.Notasest();
			notasest.setEstudiante(estudiante);
			notasest.setMateria(materia);
			
			return (Notasest) session.load(model.pojo.Notasest.class, notasest);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notasest getNotasestByORMID(PersistentSession session, model.pojo.Estudiante estudiante, model.pojo.Materia materia) throws PersistentException {
		try {
			Notasest notasest = new model.pojo.Notasest();
			notasest.setEstudiante(estudiante);
			notasest.setMateria(materia);
			
			return (Notasest) session.get(model.pojo.Notasest.class, notasest);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notasest loadNotasestByORMID(PersistentSession session, model.pojo.Estudiante estudiante, model.pojo.Materia materia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Notasest notasest = new model.pojo.Notasest();
			notasest.setEstudiante(estudiante);
			notasest.setMateria(materia);
			
			return (Notasest) session.load(model.pojo.Notasest.class, notasest, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notasest getNotasestByORMID(PersistentSession session, model.pojo.Estudiante estudiante, model.pojo.Materia materia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Notasest notasest = new model.pojo.Notasest();
			notasest.setEstudiante(estudiante);
			notasest.setMateria(materia);
			
			return (Notasest) session.get(model.pojo.Notasest.class, notasest, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotasest(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryNotasest(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotasest(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryNotasest(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notasest[] listNotasestByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listNotasestByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notasest[] listNotasestByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listNotasestByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotasest(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Notasest as Notasest");
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
	
	public static List queryNotasest(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Notasest as Notasest");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Notasest", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notasest[] listNotasestByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryNotasest(session, condition, orderBy);
			return (Notasest[]) list.toArray(new Notasest[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notasest[] listNotasestByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryNotasest(session, condition, orderBy, lockMode);
			return (Notasest[]) list.toArray(new Notasest[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notasest loadNotasestByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadNotasestByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notasest loadNotasestByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadNotasestByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notasest loadNotasestByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Notasest[] notasests = listNotasestByQuery(session, condition, orderBy);
		if (notasests != null && notasests.length > 0)
			return notasests[0];
		else
			return null;
	}
	
	public static Notasest loadNotasestByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Notasest[] notasests = listNotasestByQuery(session, condition, orderBy, lockMode);
		if (notasests != null && notasests.length > 0)
			return notasests[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNotasestByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateNotasestByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotasestByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateNotasestByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotasestByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Notasest as Notasest");
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
	
	public static java.util.Iterator iterateNotasestByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Notasest as Notasest");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Notasest", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notasest createNotasest() {
		return new model.pojo.Notasest();
	}
	
	public static boolean save(model.pojo.Notasest notasest) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().saveObject(notasest);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.pojo.Notasest notasest) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().deleteObject(notasest);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Notasest notasest)throws PersistentException {
		try {
			if (notasest.getEstudiante() != null) {
				notasest.getEstudiante().getNotasests().remove(notasest);
			}
			
			if (notasest.getMateria() != null) {
				notasest.getMateria().getNotasests().remove(notasest);
			}
			
			return delete(notasest);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Notasest notasest, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (notasest.getEstudiante() != null) {
				notasest.getEstudiante().getNotasests().remove(notasest);
			}
			
			if (notasest.getMateria() != null) {
				notasest.getMateria().getNotasests().remove(notasest);
			}
			
			try {
				session.delete(notasest);
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
	
	public static boolean refresh(model.pojo.Notasest notasest) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().refresh(notasest);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.pojo.Notasest notasest) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().evict(notasest);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
