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

public class AsignaDAO {
	public static Asigna loadAsignaByORMID(model.pojo.Aula aula, model.pojo.Paralelo paralelo) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadAsignaByORMID(session, aula, paralelo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asigna getAsignaByORMID(model.pojo.Aula aula, model.pojo.Paralelo paralelo) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getAsignaByORMID(session, aula, paralelo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asigna loadAsignaByORMID(model.pojo.Aula aula, model.pojo.Paralelo paralelo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadAsignaByORMID(session, aula, paralelo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asigna getAsignaByORMID(model.pojo.Aula aula, model.pojo.Paralelo paralelo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getAsignaByORMID(session, aula, paralelo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asigna loadAsignaByORMID(PersistentSession session, model.pojo.Aula aula, model.pojo.Paralelo paralelo) throws PersistentException {
		try {
			Asigna asigna = new model.pojo.Asigna();
			asigna.setAula(aula);
			asigna.setParalelo(paralelo);
			
			return (Asigna) session.load(model.pojo.Asigna.class, asigna);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asigna getAsignaByORMID(PersistentSession session, model.pojo.Aula aula, model.pojo.Paralelo paralelo) throws PersistentException {
		try {
			Asigna asigna = new model.pojo.Asigna();
			asigna.setAula(aula);
			asigna.setParalelo(paralelo);
			
			return (Asigna) session.get(model.pojo.Asigna.class, asigna);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asigna loadAsignaByORMID(PersistentSession session, model.pojo.Aula aula, model.pojo.Paralelo paralelo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Asigna asigna = new model.pojo.Asigna();
			asigna.setAula(aula);
			asigna.setParalelo(paralelo);
			
			return (Asigna) session.load(model.pojo.Asigna.class, asigna, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asigna getAsignaByORMID(PersistentSession session, model.pojo.Aula aula, model.pojo.Paralelo paralelo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Asigna asigna = new model.pojo.Asigna();
			asigna.setAula(aula);
			asigna.setParalelo(paralelo);
			
			return (Asigna) session.get(model.pojo.Asigna.class, asigna, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAsigna(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryAsigna(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAsigna(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryAsigna(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asigna[] listAsignaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listAsignaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asigna[] listAsignaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listAsignaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAsigna(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Asigna as Asigna");
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
	
	public static List queryAsigna(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Asigna as Asigna");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Asigna", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asigna[] listAsignaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAsigna(session, condition, orderBy);
			return (Asigna[]) list.toArray(new Asigna[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asigna[] listAsignaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAsigna(session, condition, orderBy, lockMode);
			return (Asigna[]) list.toArray(new Asigna[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asigna loadAsignaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadAsignaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asigna loadAsignaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadAsignaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asigna loadAsignaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Asigna[] asignas = listAsignaByQuery(session, condition, orderBy);
		if (asignas != null && asignas.length > 0)
			return asignas[0];
		else
			return null;
	}
	
	public static Asigna loadAsignaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Asigna[] asignas = listAsignaByQuery(session, condition, orderBy, lockMode);
		if (asignas != null && asignas.length > 0)
			return asignas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAsignaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateAsignaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAsignaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateAsignaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAsignaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Asigna as Asigna");
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
	
	public static java.util.Iterator iterateAsignaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Asigna as Asigna");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Asigna", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Asigna createAsigna() {
		return new model.pojo.Asigna();
	}
	
	public static boolean save(model.pojo.Asigna asigna) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().saveObject(asigna);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.pojo.Asigna asigna) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().deleteObject(asigna);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Asigna asigna)throws PersistentException {
		try {
			if (asigna.getAula() != null) {
				asigna.getAula().getAsignas().remove(asigna);
			}
			
			if (asigna.getParalelo() != null) {
				asigna.getParalelo().getAsignas().remove(asigna);
			}
			
			return delete(asigna);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Asigna asigna, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (asigna.getAula() != null) {
				asigna.getAula().getAsignas().remove(asigna);
			}
			
			if (asigna.getParalelo() != null) {
				asigna.getParalelo().getAsignas().remove(asigna);
			}
			
			try {
				session.delete(asigna);
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
	
	public static boolean refresh(model.pojo.Asigna asigna) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().refresh(asigna);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.pojo.Asigna asigna) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().evict(asigna);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
