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
package proyecto;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class EvaluacionesDAO {
	public static Evaluaciones loadEvaluacionesByORMID(proyecto.Programacion idprog, proyecto.Examenes idexamen) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadEvaluacionesByORMID(session, idprog, idexamen);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluaciones getEvaluacionesByORMID(proyecto.Programacion idprog, proyecto.Examenes idexamen) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getEvaluacionesByORMID(session, idprog, idexamen);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluaciones loadEvaluacionesByORMID(proyecto.Programacion idprog, proyecto.Examenes idexamen, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadEvaluacionesByORMID(session, idprog, idexamen, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluaciones getEvaluacionesByORMID(proyecto.Programacion idprog, proyecto.Examenes idexamen, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getEvaluacionesByORMID(session, idprog, idexamen, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluaciones loadEvaluacionesByORMID(PersistentSession session, proyecto.Programacion idprog, proyecto.Examenes idexamen) throws PersistentException {
		try {
			Evaluaciones evaluaciones = new proyecto.Evaluaciones();
			evaluaciones.setORM_Idprog(idprog);
			evaluaciones.setORM_Idexamen(idexamen);
			
			return (Evaluaciones) session.load(proyecto.Evaluaciones.class, evaluaciones);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluaciones getEvaluacionesByORMID(PersistentSession session, proyecto.Programacion idprog, proyecto.Examenes idexamen) throws PersistentException {
		try {
			Evaluaciones evaluaciones = new proyecto.Evaluaciones();
			evaluaciones.setORM_Idprog(idprog);
			evaluaciones.setORM_Idexamen(idexamen);
			
			return (Evaluaciones) session.get(proyecto.Evaluaciones.class, evaluaciones);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluaciones loadEvaluacionesByORMID(PersistentSession session, proyecto.Programacion idprog, proyecto.Examenes idexamen, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Evaluaciones evaluaciones = new proyecto.Evaluaciones();
			evaluaciones.setORM_Idprog(idprog);
			evaluaciones.setORM_Idexamen(idexamen);
			
			return (Evaluaciones) session.load(proyecto.Evaluaciones.class, evaluaciones, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluaciones getEvaluacionesByORMID(PersistentSession session, proyecto.Programacion idprog, proyecto.Examenes idexamen, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Evaluaciones evaluaciones = new proyecto.Evaluaciones();
			evaluaciones.setORM_Idprog(idprog);
			evaluaciones.setORM_Idexamen(idexamen);
			
			return (Evaluaciones) session.get(proyecto.Evaluaciones.class, evaluaciones, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvaluaciones(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryEvaluaciones(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvaluaciones(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryEvaluaciones(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluaciones[] listEvaluacionesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listEvaluacionesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluaciones[] listEvaluacionesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listEvaluacionesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvaluaciones(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Evaluaciones as Evaluaciones");
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
	
	public static List queryEvaluaciones(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Evaluaciones as Evaluaciones");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Evaluaciones", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluaciones[] listEvaluacionesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEvaluaciones(session, condition, orderBy);
			return (Evaluaciones[]) list.toArray(new Evaluaciones[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluaciones[] listEvaluacionesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEvaluaciones(session, condition, orderBy, lockMode);
			return (Evaluaciones[]) list.toArray(new Evaluaciones[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluaciones loadEvaluacionesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadEvaluacionesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluaciones loadEvaluacionesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadEvaluacionesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluaciones loadEvaluacionesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Evaluaciones[] evaluacioneses = listEvaluacionesByQuery(session, condition, orderBy);
		if (evaluacioneses != null && evaluacioneses.length > 0)
			return evaluacioneses[0];
		else
			return null;
	}
	
	public static Evaluaciones loadEvaluacionesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Evaluaciones[] evaluacioneses = listEvaluacionesByQuery(session, condition, orderBy, lockMode);
		if (evaluacioneses != null && evaluacioneses.length > 0)
			return evaluacioneses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEvaluacionesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateEvaluacionesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEvaluacionesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateEvaluacionesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEvaluacionesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Evaluaciones as Evaluaciones");
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
	
	public static java.util.Iterator iterateEvaluacionesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Evaluaciones as Evaluaciones");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Evaluaciones", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evaluaciones createEvaluaciones() {
		return new proyecto.Evaluaciones();
	}
	
	public static boolean save(proyecto.Evaluaciones evaluaciones) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().saveObject(evaluaciones);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(proyecto.Evaluaciones evaluaciones) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().deleteObject(evaluaciones);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Evaluaciones evaluaciones)throws PersistentException {
		try {
			proyecto.Programacion idprog = evaluaciones.getIdprog();
			if (evaluaciones.getIdprog() != null) {
				evaluaciones.getIdprog().evaluaciones.remove(evaluaciones);
			}
			evaluaciones.setORM_Idprog(idprog);
			
			proyecto.Examenes idexamen = evaluaciones.getIdexamen();
			if (evaluaciones.getIdexamen() != null) {
				evaluaciones.getIdexamen().evaluaciones.remove(evaluaciones);
			}
			evaluaciones.setORM_Idexamen(idexamen);
			
			proyecto.Opciones[] lIdopcions = evaluaciones.idopcion.toArray();
			for(int i = 0; i < lIdopcions.length; i++) {
				lIdopcions[i].idprog.remove(evaluaciones);
			}
			return delete(evaluaciones);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Evaluaciones evaluaciones, org.orm.PersistentSession session)throws PersistentException {
		try {
			proyecto.Programacion idprog = evaluaciones.getIdprog();
			if (evaluaciones.getIdprog() != null) {
				evaluaciones.getIdprog().evaluaciones.remove(evaluaciones);
			}
			evaluaciones.setORM_Idprog(idprog);
			
			proyecto.Examenes idexamen = evaluaciones.getIdexamen();
			if (evaluaciones.getIdexamen() != null) {
				evaluaciones.getIdexamen().evaluaciones.remove(evaluaciones);
			}
			evaluaciones.setORM_Idexamen(idexamen);
			
			proyecto.Opciones[] lIdopcions = evaluaciones.idopcion.toArray();
			for(int i = 0; i < lIdopcions.length; i++) {
				lIdopcions[i].idprog.remove(evaluaciones);
			}
			try {
				session.delete(evaluaciones);
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
	
	public static boolean refresh(proyecto.Evaluaciones evaluaciones) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().refresh(evaluaciones);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(proyecto.Evaluaciones evaluaciones) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().evict(evaluaciones);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
