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

public class BancoDAO {
	public static Banco loadBancoByORMID(int idbanco) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadBancoByORMID(session, idbanco);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Banco getBancoByORMID(int idbanco) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getBancoByORMID(session, idbanco);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Banco loadBancoByORMID(int idbanco, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadBancoByORMID(session, idbanco, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Banco getBancoByORMID(int idbanco, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return getBancoByORMID(session, idbanco, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Banco loadBancoByORMID(PersistentSession session, int idbanco) throws PersistentException {
		try {
			return (Banco) session.load(proyecto.Banco.class, new Integer(idbanco));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Banco getBancoByORMID(PersistentSession session, int idbanco) throws PersistentException {
		try {
			return (Banco) session.get(proyecto.Banco.class, new Integer(idbanco));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Banco loadBancoByORMID(PersistentSession session, int idbanco, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Banco) session.load(proyecto.Banco.class, new Integer(idbanco), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Banco getBancoByORMID(PersistentSession session, int idbanco, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Banco) session.get(proyecto.Banco.class, new Integer(idbanco), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBanco(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryBanco(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBanco(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return queryBanco(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Banco[] listBancoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listBancoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Banco[] listBancoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return listBancoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBanco(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Banco as Banco");
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
	
	public static List queryBanco(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Banco as Banco");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Banco", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Banco[] listBancoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBanco(session, condition, orderBy);
			return (Banco[]) list.toArray(new Banco[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Banco[] listBancoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBanco(session, condition, orderBy, lockMode);
			return (Banco[]) list.toArray(new Banco[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Banco loadBancoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadBancoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Banco loadBancoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return loadBancoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Banco loadBancoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Banco[] bancos = listBancoByQuery(session, condition, orderBy);
		if (bancos != null && bancos.length > 0)
			return bancos[0];
		else
			return null;
	}
	
	public static Banco loadBancoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Banco[] bancos = listBancoByQuery(session, condition, orderBy, lockMode);
		if (bancos != null && bancos.length > 0)
			return bancos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBancoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateBancoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBancoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Proyectofinal2PersistentManager.instance().getSession();
			return iterateBancoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBancoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Banco as Banco");
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
	
	public static java.util.Iterator iterateBancoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From proyecto.Banco as Banco");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Banco", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Banco createBanco() {
		return new proyecto.Banco();
	}
	
	public static boolean save(proyecto.Banco banco) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().saveObject(banco);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(proyecto.Banco banco) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().deleteObject(banco);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Banco banco)throws PersistentException {
		try {
			if (banco.getIddicta() != null) {
				banco.getIddicta().banco.remove(banco);
			}
			
			if (banco.getIdtipo() != null) {
				banco.getIdtipo().banco.remove(banco);
			}
			
			proyecto.Opciones[] lOpcioness = banco.opciones.toArray();
			for(int i = 0; i < lOpcioness.length; i++) {
				lOpcioness[i].setIdbanco(null);
			}
			proyecto.Preguntas[] lPreguntass = banco.preguntas.toArray();
			for(int i = 0; i < lPreguntass.length; i++) {
				lPreguntass[i].setIdbanco(null);
			}
			return delete(banco);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(proyecto.Banco banco, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (banco.getIddicta() != null) {
				banco.getIddicta().banco.remove(banco);
			}
			
			if (banco.getIdtipo() != null) {
				banco.getIdtipo().banco.remove(banco);
			}
			
			proyecto.Opciones[] lOpcioness = banco.opciones.toArray();
			for(int i = 0; i < lOpcioness.length; i++) {
				lOpcioness[i].setIdbanco(null);
			}
			proyecto.Preguntas[] lPreguntass = banco.preguntas.toArray();
			for(int i = 0; i < lPreguntass.length; i++) {
				lPreguntass[i].setIdbanco(null);
			}
			try {
				session.delete(banco);
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
	
	public static boolean refresh(proyecto.Banco banco) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().refresh(banco);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(proyecto.Banco banco) throws PersistentException {
		try {
			Proyectofinal2PersistentManager.instance().getSession().evict(banco);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Banco loadBancoByCriteria(BancoCriteria bancoCriteria) {
		Banco[] bancos = listBancoByCriteria(bancoCriteria);
		if(bancos == null || bancos.length == 0) {
			return null;
		}
		return bancos[0];
	}
	
	public static Banco[] listBancoByCriteria(BancoCriteria bancoCriteria) {
		return bancoCriteria.listBanco();
	}
}
