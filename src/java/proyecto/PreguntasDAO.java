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

public class PreguntasDAO {
	public static Preguntas loadPreguntasByORMID(proyecto.Examenes idexamen, proyecto.Banco idbanco) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadPreguntasByORMID(session, idexamen, idbanco);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Preguntas getPreguntasByORMID(proyecto.Examenes idexamen, proyecto.Banco idbanco) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getPreguntasByORMID(session, idexamen, idbanco);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Preguntas loadPreguntasByORMID(proyecto.Examenes idexamen, proyecto.Banco idbanco, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadPreguntasByORMID(session, idexamen, idbanco, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Preguntas getPreguntasByORMID(proyecto.Examenes idexamen, proyecto.Banco idbanco, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getPreguntasByORMID(session, idexamen, idbanco, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Preguntas loadPreguntasByORMID(PersistentSession session, proyecto.Examenes idexamen, proyecto.Banco idbanco) throws PersistentException {
		try {
			Preguntas preguntas = new proyecto.Preguntas();
			preguntas.setORM_Idexamen(idexamen);
			preguntas.setORM_Idbanco(idbanco);
			
			return (Preguntas) session.load(proyecto.Preguntas.class, preguntas);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Preguntas getPreguntasByORMID(PersistentSession session, proyecto.Examenes idexamen, proyecto.Banco idbanco) throws PersistentException {
		try {
			Preguntas preguntas = new proyecto.Preguntas();
			preguntas.setORM_Idexamen(idexamen);
			preguntas.setORM_Idbanco(idbanco);
			
			return (Preguntas) session.get(proyecto.Preguntas.class, preguntas);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Preguntas loadPreguntasByORMID(PersistentSession session, proyecto.Examenes idexamen, proyecto.Banco idbanco, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Preguntas preguntas = new proyecto.Preguntas();
			preguntas.setORM_Idexamen(idexamen);
			preguntas.setORM_Idbanco(idbanco);
			
			return (Preguntas) session.load(proyecto.Preguntas.class, preguntas, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Preguntas getPreguntasByORMID(PersistentSession session, proyecto.Examenes idexamen, proyecto.Banco idbanco, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Preguntas preguntas = new proyecto.Preguntas();
			preguntas.setORM_Idexamen(idexamen);
			preguntas.setORM_Idbanco(idbanco);
			
			return (Preguntas) session.get(proyecto.Preguntas.class, preguntas, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPreguntas(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryPreguntas(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPreguntas(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryPreguntas(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Preguntas[] listPreguntasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listPreguntasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Preguntas[] listPreguntasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listPreguntasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPreguntas(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Preguntas as Preguntas");
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
	
	public static List queryPreguntas(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Preguntas as Preguntas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Preguntas", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Preguntas[] listPreguntasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPreguntas(session, condition, orderBy);
			return (Preguntas[]) list.toArray(new Preguntas[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Preguntas[] listPreguntasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPreguntas(session, condition, orderBy, lockMode);
			return (Preguntas[]) list.toArray(new Preguntas[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Preguntas loadPreguntasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadPreguntasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Preguntas loadPreguntasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadPreguntasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Preguntas loadPreguntasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Preguntas[] preguntases = listPreguntasByQuery(session, condition, orderBy);
		if (preguntases != null && preguntases.length > 0)
			return preguntases[0];
		else
			return null;
	}
	
	public static Preguntas loadPreguntasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Preguntas[] preguntases = listPreguntasByQuery(session, condition, orderBy, lockMode);
		if (preguntases != null && preguntases.length > 0)
			return preguntases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePreguntasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iteratePreguntasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePreguntasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iteratePreguntasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePreguntasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Preguntas as Preguntas");
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
	
	public static java.util.Iterator iteratePreguntasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Preguntas as Preguntas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Preguntas", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Preguntas createPreguntas() {
		return new proyecto.Preguntas();
	}
	
	public static boolean save(proyecto.Preguntas preguntas) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().saveObject(preguntas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(proyecto.Preguntas preguntas) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().deleteObject(preguntas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Preguntas preguntas)throws PersistentException {
		try {
			proyecto.Examenes idexamen = preguntas.getIdexamen();
			if (preguntas.getIdexamen() != null) {
				preguntas.getIdexamen().preguntas.remove(preguntas);
			}
			preguntas.setORM_Idexamen(idexamen);
			
			proyecto.Banco idbanco = preguntas.getIdbanco();
			if (preguntas.getIdbanco() != null) {
				preguntas.getIdbanco().preguntas.remove(preguntas);
			}
			preguntas.setORM_Idbanco(idbanco);
			
			return delete(preguntas);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Preguntas preguntas, org.orm.PersistentSession session)throws PersistentException {
		try {
			proyecto.Examenes idexamen = preguntas.getIdexamen();
			if (preguntas.getIdexamen() != null) {
				preguntas.getIdexamen().preguntas.remove(preguntas);
			}
			preguntas.setORM_Idexamen(idexamen);
			
			proyecto.Banco idbanco = preguntas.getIdbanco();
			if (preguntas.getIdbanco() != null) {
				preguntas.getIdbanco().preguntas.remove(preguntas);
			}
			preguntas.setORM_Idbanco(idbanco);
			
			try {
				session.delete(preguntas);
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
	
	public static boolean refresh(proyecto.Preguntas preguntas) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().refresh(preguntas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(proyecto.Preguntas preguntas) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().evict(preguntas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
