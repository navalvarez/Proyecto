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

public class ExamenesDAO {
	public static Examenes loadExamenesByORMID(int idexamen) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadExamenesByORMID(session, idexamen);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Examenes getExamenesByORMID(int idexamen) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getExamenesByORMID(session, idexamen);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Examenes loadExamenesByORMID(int idexamen, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadExamenesByORMID(session, idexamen, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Examenes getExamenesByORMID(int idexamen, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getExamenesByORMID(session, idexamen, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Examenes loadExamenesByORMID(PersistentSession session, int idexamen) throws PersistentException {
		try {
			return (Examenes) session.load(proyecto.Examenes.class, new Integer(idexamen));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Examenes getExamenesByORMID(PersistentSession session, int idexamen) throws PersistentException {
		try {
			return (Examenes) session.get(proyecto.Examenes.class, new Integer(idexamen));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Examenes loadExamenesByORMID(PersistentSession session, int idexamen, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Examenes) session.load(proyecto.Examenes.class, new Integer(idexamen), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Examenes getExamenesByORMID(PersistentSession session, int idexamen, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Examenes) session.get(proyecto.Examenes.class, new Integer(idexamen), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryExamenes(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryExamenes(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryExamenes(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryExamenes(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Examenes[] listExamenesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listExamenesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Examenes[] listExamenesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listExamenesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryExamenes(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Examenes as Examenes");
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
	
	public static List queryExamenes(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Examenes as Examenes");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Examenes", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Examenes[] listExamenesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryExamenes(session, condition, orderBy);
			return (Examenes[]) list.toArray(new Examenes[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Examenes[] listExamenesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryExamenes(session, condition, orderBy, lockMode);
			return (Examenes[]) list.toArray(new Examenes[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Examenes loadExamenesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadExamenesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Examenes loadExamenesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadExamenesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Examenes loadExamenesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Examenes[] exameneses = listExamenesByQuery(session, condition, orderBy);
		if (exameneses != null && exameneses.length > 0)
			return exameneses[0];
		else
			return null;
	}
	
	public static Examenes loadExamenesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Examenes[] exameneses = listExamenesByQuery(session, condition, orderBy, lockMode);
		if (exameneses != null && exameneses.length > 0)
			return exameneses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateExamenesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateExamenesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateExamenesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateExamenesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateExamenesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Examenes as Examenes");
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
	
	public static java.util.Iterator iterateExamenesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Examenes as Examenes");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Examenes", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Examenes createExamenes() {
		return new proyecto.Examenes();
	}
	
	public static boolean save(proyecto.Examenes examenes) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().saveObject(examenes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(proyecto.Examenes examenes) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().deleteObject(examenes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Examenes examenes)throws PersistentException {
		try {
			if (examenes.getIddicta() != null) {
				examenes.getIddicta().examenes.remove(examenes);
			}
			
			proyecto.Evaluaciones[] lEvaluacioness = examenes.evaluaciones.toArray();
			for(int i = 0; i < lEvaluacioness.length; i++) {
				lEvaluacioness[i].setIdexamen(null);
			}
			proyecto.Preguntas[] lPreguntass = examenes.preguntas.toArray();
			for(int i = 0; i < lPreguntass.length; i++) {
				lPreguntass[i].setIdexamen(null);
			}
			return delete(examenes);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Examenes examenes, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (examenes.getIddicta() != null) {
				examenes.getIddicta().examenes.remove(examenes);
			}
			
			proyecto.Evaluaciones[] lEvaluacioness = examenes.evaluaciones.toArray();
			for(int i = 0; i < lEvaluacioness.length; i++) {
				lEvaluacioness[i].setIdexamen(null);
			}
			proyecto.Preguntas[] lPreguntass = examenes.preguntas.toArray();
			for(int i = 0; i < lPreguntass.length; i++) {
				lPreguntass[i].setIdexamen(null);
			}
			try {
				session.delete(examenes);
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
	
	public static boolean refresh(proyecto.Examenes examenes) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().refresh(examenes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(proyecto.Examenes examenes) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().evict(examenes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
