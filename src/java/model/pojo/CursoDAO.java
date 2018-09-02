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

public class CursoDAO {
	public static Curso loadCursoByORMID(int idcurso) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadCursoByORMID(session, idcurso);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso getCursoByORMID(int idcurso) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getCursoByORMID(session, idcurso);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso loadCursoByORMID(int idcurso, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadCursoByORMID(session, idcurso, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso getCursoByORMID(int idcurso, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getCursoByORMID(session, idcurso, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso loadCursoByORMID(PersistentSession session, int idcurso) throws PersistentException {
		try {
			return (Curso) session.load(model.pojo.Curso.class, new Integer(idcurso));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso getCursoByORMID(PersistentSession session, int idcurso) throws PersistentException {
		try {
			return (Curso) session.get(model.pojo.Curso.class, new Integer(idcurso));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso loadCursoByORMID(PersistentSession session, int idcurso, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Curso) session.load(model.pojo.Curso.class, new Integer(idcurso), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso getCursoByORMID(PersistentSession session, int idcurso, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Curso) session.get(model.pojo.Curso.class, new Integer(idcurso), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurso(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryCurso(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurso(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryCurso(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso[] listCursoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listCursoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso[] listCursoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listCursoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCurso(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Curso as Curso");
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
	
	public static List queryCurso(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Curso as Curso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Curso", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso[] listCursoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCurso(session, condition, orderBy);
			return (Curso[]) list.toArray(new Curso[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso[] listCursoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCurso(session, condition, orderBy, lockMode);
			return (Curso[]) list.toArray(new Curso[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso loadCursoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadCursoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso loadCursoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadCursoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso loadCursoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Curso[] cursos = listCursoByQuery(session, condition, orderBy);
		if (cursos != null && cursos.length > 0)
			return cursos[0];
		else
			return null;
	}
	
	public static Curso loadCursoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Curso[] cursos = listCursoByQuery(session, condition, orderBy, lockMode);
		if (cursos != null && cursos.length > 0)
			return cursos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCursoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateCursoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCursoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateCursoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCursoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Curso as Curso");
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
	
	public static java.util.Iterator iterateCursoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Curso as Curso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Curso", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Curso createCurso() {
		return new model.pojo.Curso();
	}
	
	public static boolean save(model.pojo.Curso curso) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().saveObject(curso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.pojo.Curso curso) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().deleteObject(curso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Curso curso)throws PersistentException {
		try {
			if (curso.getCiclos() != null) {
				curso.getCiclos().getCurso().remove(curso);
			}
			
			model.pojo.Paralelo[] lParalelos = (model.pojo.Paralelo[])curso.getParalelo().toArray(new model.pojo.Paralelo[curso.getParalelo().size()]);
			for(int i = 0; i < lParalelos.length; i++) {
				lParalelos[i].setCursos(null);
			}
			model.pojo.Materia[] lMateriass = (model.pojo.Materia[])curso.getMaterias().toArray(new model.pojo.Materia[curso.getMaterias().size()]);
			for(int i = 0; i < lMateriass.length; i++) {
				lMateriass[i].setCurso(null);
			}
			return delete(curso);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Curso curso, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (curso.getCiclos() != null) {
				curso.getCiclos().getCurso().remove(curso);
			}
			
			model.pojo.Paralelo[] lParalelos = (model.pojo.Paralelo[])curso.getParalelo().toArray(new model.pojo.Paralelo[curso.getParalelo().size()]);
			for(int i = 0; i < lParalelos.length; i++) {
				lParalelos[i].setCursos(null);
			}
			model.pojo.Materia[] lMateriass = (model.pojo.Materia[])curso.getMaterias().toArray(new model.pojo.Materia[curso.getMaterias().size()]);
			for(int i = 0; i < lMateriass.length; i++) {
				lMateriass[i].setCurso(null);
			}
			try {
				session.delete(curso);
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
	
	public static boolean refresh(model.pojo.Curso curso) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().refresh(curso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.pojo.Curso curso) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().evict(curso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
