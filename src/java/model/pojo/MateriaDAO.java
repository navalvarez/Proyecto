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

public class MateriaDAO {
	public static Materia loadMateriaByORMID(String sigla) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadMateriaByORMID(session, sigla);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materia getMateriaByORMID(String sigla) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getMateriaByORMID(session, sigla);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materia loadMateriaByORMID(String sigla, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadMateriaByORMID(session, sigla, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materia getMateriaByORMID(String sigla, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getMateriaByORMID(session, sigla, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materia loadMateriaByORMID(PersistentSession session, String sigla) throws PersistentException {
		try {
			return (Materia) session.load(model.pojo.Materia.class, sigla);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materia getMateriaByORMID(PersistentSession session, String sigla) throws PersistentException {
		try {
			return (Materia) session.get(model.pojo.Materia.class, sigla);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materia loadMateriaByORMID(PersistentSession session, String sigla, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Materia) session.load(model.pojo.Materia.class, sigla, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materia getMateriaByORMID(PersistentSession session, String sigla, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Materia) session.get(model.pojo.Materia.class, sigla, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMateria(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryMateria(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMateria(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryMateria(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materia[] listMateriaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listMateriaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materia[] listMateriaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listMateriaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMateria(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Materia as Materia");
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
	
	public static List queryMateria(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Materia as Materia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Materia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materia[] listMateriaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMateria(session, condition, orderBy);
			return (Materia[]) list.toArray(new Materia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materia[] listMateriaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMateria(session, condition, orderBy, lockMode);
			return (Materia[]) list.toArray(new Materia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materia loadMateriaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadMateriaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materia loadMateriaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadMateriaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materia loadMateriaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Materia[] materias = listMateriaByQuery(session, condition, orderBy);
		if (materias != null && materias.length > 0)
			return materias[0];
		else
			return null;
	}
	
	public static Materia loadMateriaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Materia[] materias = listMateriaByQuery(session, condition, orderBy, lockMode);
		if (materias != null && materias.length > 0)
			return materias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMateriaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateMateriaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMateriaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateMateriaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMateriaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Materia as Materia");
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
	
	public static java.util.Iterator iterateMateriaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Materia as Materia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Materia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Materia createMateria() {
		return new model.pojo.Materia();
	}
	
	public static boolean save(model.pojo.Materia materia) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().saveObject(materia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.pojo.Materia materia) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().deleteObject(materia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Materia materia)throws PersistentException {
		try {
			if (materia.getCurso() != null) {
				materia.getCurso().getMaterias().remove(materia);
			}
			
			model.pojo.DesignaEspecialidad[] lDesignaEspecialidadss = (model.pojo.DesignaEspecialidad[])materia.getDesignaEspecialidads().toArray(new model.pojo.DesignaEspecialidad[materia.getDesignaEspecialidads().size()]);
			for(int i = 0; i < lDesignaEspecialidadss.length; i++) {
				lDesignaEspecialidadss[i].setMateria(null);
			}
			model.pojo.Paralelo[] lParaleloss = (model.pojo.Paralelo[])materia.getParalelos().toArray(new model.pojo.Paralelo[materia.getParalelos().size()]);
			for(int i = 0; i < lParaleloss.length; i++) {
				lParaleloss[i].getMateria().remove(materia);
			}
			model.pojo.Notasest[] lNotasestss = (model.pojo.Notasest[])materia.getNotasests().toArray(new model.pojo.Notasest[materia.getNotasests().size()]);
			for(int i = 0; i < lNotasestss.length; i++) {
				lNotasestss[i].setMateria(null);
			}
			return delete(materia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.pojo.Materia materia, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (materia.getCurso() != null) {
				materia.getCurso().getMaterias().remove(materia);
			}
			
			model.pojo.DesignaEspecialidad[] lDesignaEspecialidadss = (model.pojo.DesignaEspecialidad[])materia.getDesignaEspecialidads().toArray(new model.pojo.DesignaEspecialidad[materia.getDesignaEspecialidads().size()]);
			for(int i = 0; i < lDesignaEspecialidadss.length; i++) {
				lDesignaEspecialidadss[i].setMateria(null);
			}
			model.pojo.Paralelo[] lParaleloss = (model.pojo.Paralelo[])materia.getParalelos().toArray(new model.pojo.Paralelo[materia.getParalelos().size()]);
			for(int i = 0; i < lParaleloss.length; i++) {
				lParaleloss[i].getMateria().remove(materia);
			}
			model.pojo.Notasest[] lNotasestss = (model.pojo.Notasest[])materia.getNotasests().toArray(new model.pojo.Notasest[materia.getNotasests().size()]);
			for(int i = 0; i < lNotasestss.length; i++) {
				lNotasestss[i].setMateria(null);
			}
			try {
				session.delete(materia);
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
	
	public static boolean refresh(model.pojo.Materia materia) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().refresh(materia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.pojo.Materia materia) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().evict(materia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
