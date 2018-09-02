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

public class MatriculaDAO {
	public static Matricula loadMatriculaByORMID(model.pojo.Estudiante estudiante, model.pojo.Paralelo paralelo, java.util.Date fecha) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadMatriculaByORMID(session, estudiante, paralelo, fecha);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matricula getMatriculaByORMID(model.pojo.Estudiante estudiante, model.pojo.Paralelo paralelo, java.util.Date fecha) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getMatriculaByORMID(session, estudiante, paralelo, fecha);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matricula loadMatriculaByORMID(model.pojo.Estudiante estudiante, model.pojo.Paralelo paralelo, java.util.Date fecha, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadMatriculaByORMID(session, estudiante, paralelo, fecha, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matricula getMatriculaByORMID(model.pojo.Estudiante estudiante, model.pojo.Paralelo paralelo, java.util.Date fecha, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getMatriculaByORMID(session, estudiante, paralelo, fecha, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matricula loadMatriculaByORMID(PersistentSession session, model.pojo.Estudiante estudiante, model.pojo.Paralelo paralelo, java.util.Date fecha) throws PersistentException {
		try {
			Matricula matricula = new model.pojo.Matricula();
			matricula.setEstudiante(estudiante);
			matricula.setParalelo(paralelo);
			matricula.setFecha(fecha);
			
			return (Matricula) session.load(model.pojo.Matricula.class, matricula);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matricula getMatriculaByORMID(PersistentSession session, model.pojo.Estudiante estudiante, model.pojo.Paralelo paralelo, java.util.Date fecha) throws PersistentException {
		try {
			Matricula matricula = new model.pojo.Matricula();
			matricula.setEstudiante(estudiante);
			matricula.setParalelo(paralelo);
			matricula.setFecha(fecha);
			
			return (Matricula) session.get(model.pojo.Matricula.class, matricula);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matricula loadMatriculaByORMID(PersistentSession session, model.pojo.Estudiante estudiante, model.pojo.Paralelo paralelo, java.util.Date fecha, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Matricula matricula = new model.pojo.Matricula();
			matricula.setEstudiante(estudiante);
			matricula.setParalelo(paralelo);
			matricula.setFecha(fecha);
			
			return (Matricula) session.load(model.pojo.Matricula.class, matricula, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matricula getMatriculaByORMID(PersistentSession session, model.pojo.Estudiante estudiante, model.pojo.Paralelo paralelo, java.util.Date fecha, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Matricula matricula = new model.pojo.Matricula();
			matricula.setEstudiante(estudiante);
			matricula.setParalelo(paralelo);
			matricula.setFecha(fecha);
			
			return (Matricula) session.get(model.pojo.Matricula.class, matricula, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMatricula(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryMatricula(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMatricula(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryMatricula(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matricula[] listMatriculaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listMatriculaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matricula[] listMatriculaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listMatriculaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMatricula(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Matricula as Matricula");
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
	
	public static List queryMatricula(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Matricula as Matricula");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Matricula", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matricula[] listMatriculaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMatricula(session, condition, orderBy);
			return (Matricula[]) list.toArray(new Matricula[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matricula[] listMatriculaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMatricula(session, condition, orderBy, lockMode);
			return (Matricula[]) list.toArray(new Matricula[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matricula loadMatriculaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadMatriculaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matricula loadMatriculaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadMatriculaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matricula loadMatriculaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Matricula[] matriculas = listMatriculaByQuery(session, condition, orderBy);
		if (matriculas != null && matriculas.length > 0)
			return matriculas[0];
		else
			return null;
	}
	
	public static Matricula loadMatriculaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Matricula[] matriculas = listMatriculaByQuery(session, condition, orderBy, lockMode);
		if (matriculas != null && matriculas.length > 0)
			return matriculas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMatriculaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateMatriculaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMatriculaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateMatriculaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMatriculaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Matricula as Matricula");
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
	
	public static java.util.Iterator iterateMatriculaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Matricula as Matricula");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Matricula", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Matricula createMatricula() {
		return new model.pojo.Matricula();
	}
	
	public static boolean save(model.pojo.Matricula matricula) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().saveObject(matricula);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.pojo.Matricula matricula) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().deleteObject(matricula);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Matricula matricula)throws PersistentException {
		try {
			if (matricula.getEstudiante() != null) {
				matricula.getEstudiante().getMatriculas().remove(matricula);
			}
			
			if (matricula.getParalelo() != null) {
				matricula.getParalelo().getMatriculas().remove(matricula);
			}
			
			return delete(matricula);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Matricula matricula, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (matricula.getEstudiante() != null) {
				matricula.getEstudiante().getMatriculas().remove(matricula);
			}
			
			if (matricula.getParalelo() != null) {
				matricula.getParalelo().getMatriculas().remove(matricula);
			}
			
			try {
				session.delete(matricula);
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
	
	public static boolean refresh(model.pojo.Matricula matricula) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().refresh(matricula);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.pojo.Matricula matricula) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().evict(matricula);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
