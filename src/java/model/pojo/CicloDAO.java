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

public class CicloDAO {
	public static Ciclo loadCicloByORMID(int idciclo) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadCicloByORMID(session, idciclo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciclo getCicloByORMID(int idciclo) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getCicloByORMID(session, idciclo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciclo loadCicloByORMID(int idciclo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadCicloByORMID(session, idciclo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciclo getCicloByORMID(int idciclo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getCicloByORMID(session, idciclo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciclo loadCicloByORMID(PersistentSession session, int idciclo) throws PersistentException {
		try {
			return (Ciclo) session.load(model.pojo.Ciclo.class, new Integer(idciclo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciclo getCicloByORMID(PersistentSession session, int idciclo) throws PersistentException {
		try {
			return (Ciclo) session.get(model.pojo.Ciclo.class, new Integer(idciclo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciclo loadCicloByORMID(PersistentSession session, int idciclo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Ciclo) session.load(model.pojo.Ciclo.class, new Integer(idciclo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciclo getCicloByORMID(PersistentSession session, int idciclo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Ciclo) session.get(model.pojo.Ciclo.class, new Integer(idciclo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCiclo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryCiclo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCiclo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryCiclo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciclo[] listCicloByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listCicloByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciclo[] listCicloByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listCicloByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCiclo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Ciclo as Ciclo");
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
	
	public static List queryCiclo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Ciclo as Ciclo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ciclo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciclo[] listCicloByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCiclo(session, condition, orderBy);
			return (Ciclo[]) list.toArray(new Ciclo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciclo[] listCicloByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCiclo(session, condition, orderBy, lockMode);
			return (Ciclo[]) list.toArray(new Ciclo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciclo loadCicloByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadCicloByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciclo loadCicloByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadCicloByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciclo loadCicloByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Ciclo[] ciclos = listCicloByQuery(session, condition, orderBy);
		if (ciclos != null && ciclos.length > 0)
			return ciclos[0];
		else
			return null;
	}
	
	public static Ciclo loadCicloByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Ciclo[] ciclos = listCicloByQuery(session, condition, orderBy, lockMode);
		if (ciclos != null && ciclos.length > 0)
			return ciclos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCicloByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateCicloByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCicloByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateCicloByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCicloByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Ciclo as Ciclo");
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
	
	public static java.util.Iterator iterateCicloByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Ciclo as Ciclo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ciclo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciclo createCiclo() {
		return new model.pojo.Ciclo();
	}
	
	public static boolean save(model.pojo.Ciclo ciclo) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().saveObject(ciclo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.pojo.Ciclo ciclo) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().deleteObject(ciclo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Ciclo ciclo)throws PersistentException {
		try {
			if (ciclo.getDirector() != null) {
				ciclo.getDirector().setCiclo(null);
			}
			
			model.pojo.Curso[] lCursos = (model.pojo.Curso[])ciclo.getCurso().toArray(new model.pojo.Curso[ciclo.getCurso().size()]);
			for(int i = 0; i < lCursos.length; i++) {
				lCursos[i].setCiclos(null);
			}
			return delete(ciclo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Ciclo ciclo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (ciclo.getDirector() != null) {
				ciclo.getDirector().setCiclo(null);
			}
			
			model.pojo.Curso[] lCursos = (model.pojo.Curso[])ciclo.getCurso().toArray(new model.pojo.Curso[ciclo.getCurso().size()]);
			for(int i = 0; i < lCursos.length; i++) {
				lCursos[i].setCiclos(null);
			}
			try {
				session.delete(ciclo);
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
	
	public static boolean refresh(model.pojo.Ciclo ciclo) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().refresh(ciclo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.pojo.Ciclo ciclo) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().evict(ciclo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
