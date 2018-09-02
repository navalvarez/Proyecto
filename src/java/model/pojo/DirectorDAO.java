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

public class DirectorDAO {
	public static Director loadDirectorByORMID(int ci) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadDirectorByORMID(session, ci);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Director getDirectorByORMID(int ci) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getDirectorByORMID(session, ci);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Director loadDirectorByORMID(int ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadDirectorByORMID(session, ci, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Director getDirectorByORMID(int ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getDirectorByORMID(session, ci, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Director loadDirectorByORMID(PersistentSession session, int ci) throws PersistentException {
		try {
			return (Director) session.load(model.pojo.Director.class, new Integer(ci));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Director getDirectorByORMID(PersistentSession session, int ci) throws PersistentException {
		try {
			return (Director) session.get(model.pojo.Director.class, new Integer(ci));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Director loadDirectorByORMID(PersistentSession session, int ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Director) session.load(model.pojo.Director.class, new Integer(ci), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Director getDirectorByORMID(PersistentSession session, int ci, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Director) session.get(model.pojo.Director.class, new Integer(ci), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDirector(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryDirector(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDirector(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryDirector(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Director[] listDirectorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listDirectorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Director[] listDirectorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listDirectorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDirector(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Director as Director");
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
	
	public static List queryDirector(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Director as Director");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Director", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Director[] listDirectorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDirector(session, condition, orderBy);
			return (Director[]) list.toArray(new Director[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Director[] listDirectorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDirector(session, condition, orderBy, lockMode);
			return (Director[]) list.toArray(new Director[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Director loadDirectorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadDirectorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Director loadDirectorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadDirectorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Director loadDirectorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Director[] directors = listDirectorByQuery(session, condition, orderBy);
		if (directors != null && directors.length > 0)
			return directors[0];
		else
			return null;
	}
	
	public static Director loadDirectorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Director[] directors = listDirectorByQuery(session, condition, orderBy, lockMode);
		if (directors != null && directors.length > 0)
			return directors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDirectorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateDirectorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDirectorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateDirectorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDirectorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Director as Director");
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
	
	public static java.util.Iterator iterateDirectorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Director as Director");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Director", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Director createDirector() {
		return new model.pojo.Director();
	}
	
	public static boolean save(model.pojo.Director director) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().saveObject(director);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.pojo.Director director) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().deleteObject(director);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Director director)throws PersistentException {
		try {
			if (director.getCiclo() != null) {
				director.getCiclo().setDirector(null);
			}
			
			return delete(director);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Director director, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (director.getCiclo() != null) {
				director.getCiclo().setDirector(null);
			}
			
			try {
				session.delete(director);
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
	
	public static boolean refresh(model.pojo.Director director) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().refresh(director);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.pojo.Director director) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().evict(director);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
