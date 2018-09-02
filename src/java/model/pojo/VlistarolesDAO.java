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

public class VlistarolesDAO {
	public static Vlistaroles[] listByID(long ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listByID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listByID(long ID) throws PersistentException {
		return listByID(ID, null);
	}
	
	public static Vlistaroles[] listByID(PersistentSession session, long ID, LockMode lockMode) throws PersistentException {
		try {
			Query query = session.createQuery("From model.pojo.Vlistaroles As Vlistaroles Where Vlistaroles.ID = ?");
			query.setParameter(0, new Long(ID));
			if (lockMode != null) {
				query.setLockMode("Vlistaroles", lockMode);
			}
			List list = query.list();
			return (Vlistaroles[]) list.toArray(new Vlistaroles[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listByID(PersistentSession session, long ID) throws PersistentException {
		return listByID(session, ID, null);
	}
	
	public static Vlistaroles loadByID(long ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadByID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles loadByID(long ID) throws PersistentException {
		return loadByID(ID, null);
	}
	
	public static Vlistaroles loadByID(PersistentSession session, long ID, LockMode lockMode) throws PersistentException {
		Vlistaroles[] vlistaroleses = listByID(session, ID, lockMode);
		if (vlistaroleses != null && vlistaroleses.length > 0)
			return vlistaroleses[0];
		else
			return null;
	}
	
	public static Vlistaroles loadByID(PersistentSession session, long ID) throws PersistentException {
		return loadByID(session, ID, null);
	}
	
	public static Vlistaroles[] listByusuario(String usuario, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listByusuario(session, usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listByusuario(String usuario) throws PersistentException {
		return listByusuario(usuario, null);
	}
	
	public static Vlistaroles[] listByusuario(PersistentSession session, String usuario, LockMode lockMode) throws PersistentException {
		try {
			Query query = session.createQuery("From model.pojo.Vlistaroles As Vlistaroles Where Vlistaroles.usuario = ?");
			query.setParameter(0, usuario);
			if (lockMode != null) {
				query.setLockMode("Vlistaroles", lockMode);
			}
			List list = query.list();
			return (Vlistaroles[]) list.toArray(new Vlistaroles[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listByusuario(PersistentSession session, String usuario) throws PersistentException {
		return listByusuario(session, usuario, null);
	}
	
	public static Vlistaroles loadByusuario(String usuario, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadByusuario(session, usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles loadByusuario(String usuario) throws PersistentException {
		return loadByusuario(usuario, null);
	}
	
	public static Vlistaroles loadByusuario(PersistentSession session, String usuario, LockMode lockMode) throws PersistentException {
		Vlistaroles[] vlistaroleses = listByusuario(session, usuario, lockMode);
		if (vlistaroleses != null && vlistaroleses.length > 0)
			return vlistaroleses[0];
		else
			return null;
	}
	
	public static Vlistaroles loadByusuario(PersistentSession session, String usuario) throws PersistentException {
		return loadByusuario(session, usuario, null);
	}
	
	public static Vlistaroles[] listBycontrasena(String contrasena, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listBycontrasena(session, contrasena, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listBycontrasena(String contrasena) throws PersistentException {
		return listBycontrasena(contrasena, null);
	}
	
	public static Vlistaroles[] listBycontrasena(PersistentSession session, String contrasena, LockMode lockMode) throws PersistentException {
		try {
			Query query = session.createQuery("From model.pojo.Vlistaroles As Vlistaroles Where Vlistaroles.contrasena = ?");
			query.setParameter(0, contrasena);
			if (lockMode != null) {
				query.setLockMode("Vlistaroles", lockMode);
			}
			List list = query.list();
			return (Vlistaroles[]) list.toArray(new Vlistaroles[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listBycontrasena(PersistentSession session, String contrasena) throws PersistentException {
		return listBycontrasena(session, contrasena, null);
	}
	
	public static Vlistaroles loadBycontrasena(String contrasena, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadBycontrasena(session, contrasena, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles loadBycontrasena(String contrasena) throws PersistentException {
		return loadBycontrasena(contrasena, null);
	}
	
	public static Vlistaroles loadBycontrasena(PersistentSession session, String contrasena, LockMode lockMode) throws PersistentException {
		Vlistaroles[] vlistaroleses = listBycontrasena(session, contrasena, lockMode);
		if (vlistaroleses != null && vlistaroleses.length > 0)
			return vlistaroleses[0];
		else
			return null;
	}
	
	public static Vlistaroles loadBycontrasena(PersistentSession session, String contrasena) throws PersistentException {
		return loadBycontrasena(session, contrasena, null);
	}
	
	public static Vlistaroles[] listBynombre(String nombre, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listBynombre(session, nombre, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listBynombre(String nombre) throws PersistentException {
		return listBynombre(nombre, null);
	}
	
	public static Vlistaroles[] listBynombre(PersistentSession session, String nombre, LockMode lockMode) throws PersistentException {
		try {
			Query query = session.createQuery("From model.pojo.Vlistaroles As Vlistaroles Where Vlistaroles.nombre = ?");
			query.setParameter(0, nombre);
			if (lockMode != null) {
				query.setLockMode("Vlistaroles", lockMode);
			}
			List list = query.list();
			return (Vlistaroles[]) list.toArray(new Vlistaroles[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listBynombre(PersistentSession session, String nombre) throws PersistentException {
		return listBynombre(session, nombre, null);
	}
	
	public static Vlistaroles loadBynombre(String nombre, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadBynombre(session, nombre, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles loadBynombre(String nombre) throws PersistentException {
		return loadBynombre(nombre, null);
	}
	
	public static Vlistaroles loadBynombre(PersistentSession session, String nombre, LockMode lockMode) throws PersistentException {
		Vlistaroles[] vlistaroleses = listBynombre(session, nombre, lockMode);
		if (vlistaroleses != null && vlistaroleses.length > 0)
			return vlistaroleses[0];
		else
			return null;
	}
	
	public static Vlistaroles loadBynombre(PersistentSession session, String nombre) throws PersistentException {
		return loadBynombre(session, nombre, null);
	}
	
	public static Vlistaroles[] listByap(String ap, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listByap(session, ap, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listByap(String ap) throws PersistentException {
		return listByap(ap, null);
	}
	
	public static Vlistaroles[] listByap(PersistentSession session, String ap, LockMode lockMode) throws PersistentException {
		try {
			Query query = session.createQuery("From model.pojo.Vlistaroles As Vlistaroles Where Vlistaroles.ap = ?");
			query.setParameter(0, ap);
			if (lockMode != null) {
				query.setLockMode("Vlistaroles", lockMode);
			}
			List list = query.list();
			return (Vlistaroles[]) list.toArray(new Vlistaroles[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listByap(PersistentSession session, String ap) throws PersistentException {
		return listByap(session, ap, null);
	}
	
	public static Vlistaroles loadByap(String ap, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadByap(session, ap, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles loadByap(String ap) throws PersistentException {
		return loadByap(ap, null);
	}
	
	public static Vlistaroles loadByap(PersistentSession session, String ap, LockMode lockMode) throws PersistentException {
		Vlistaroles[] vlistaroleses = listByap(session, ap, lockMode);
		if (vlistaroleses != null && vlistaroleses.length > 0)
			return vlistaroleses[0];
		else
			return null;
	}
	
	public static Vlistaroles loadByap(PersistentSession session, String ap) throws PersistentException {
		return loadByap(session, ap, null);
	}
	
	public static Vlistaroles[] listByam(String am, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listByam(session, am, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listByam(String am) throws PersistentException {
		return listByam(am, null);
	}
	
	public static Vlistaroles[] listByam(PersistentSession session, String am, LockMode lockMode) throws PersistentException {
		try {
			Query query = session.createQuery("From model.pojo.Vlistaroles As Vlistaroles Where Vlistaroles.am = ?");
			query.setParameter(0, am);
			if (lockMode != null) {
				query.setLockMode("Vlistaroles", lockMode);
			}
			List list = query.list();
			return (Vlistaroles[]) list.toArray(new Vlistaroles[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listByam(PersistentSession session, String am) throws PersistentException {
		return listByam(session, am, null);
	}
	
	public static Vlistaroles loadByam(String am, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadByam(session, am, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles loadByam(String am) throws PersistentException {
		return loadByam(am, null);
	}
	
	public static Vlistaroles loadByam(PersistentSession session, String am, LockMode lockMode) throws PersistentException {
		Vlistaroles[] vlistaroleses = listByam(session, am, lockMode);
		if (vlistaroleses != null && vlistaroleses.length > 0)
			return vlistaroleses[0];
		else
			return null;
	}
	
	public static Vlistaroles loadByam(PersistentSession session, String am) throws PersistentException {
		return loadByam(session, am, null);
	}
	
	public static Vlistaroles[] listByestado(Boolean estado, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listByestado(session, estado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listByestado(Boolean estado) throws PersistentException {
		return listByestado(estado, null);
	}
	
	public static Vlistaroles[] listByestado(PersistentSession session, Boolean estado, LockMode lockMode) throws PersistentException {
		try {
			Query query = session.createQuery("From model.pojo.Vlistaroles As Vlistaroles Where Vlistaroles.estado = ?");
			query.setParameter(0, estado);
			if (lockMode != null) {
				query.setLockMode("Vlistaroles", lockMode);
			}
			List list = query.list();
			return (Vlistaroles[]) list.toArray(new Vlistaroles[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listByestado(PersistentSession session, Boolean estado) throws PersistentException {
		return listByestado(session, estado, null);
	}
	
	public static Vlistaroles loadByestado(Boolean estado, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadByestado(session, estado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles loadByestado(Boolean estado) throws PersistentException {
		return loadByestado(estado, null);
	}
	
	public static Vlistaroles loadByestado(PersistentSession session, Boolean estado, LockMode lockMode) throws PersistentException {
		Vlistaroles[] vlistaroleses = listByestado(session, estado, lockMode);
		if (vlistaroleses != null && vlistaroleses.length > 0)
			return vlistaroleses[0];
		else
			return null;
	}
	
	public static Vlistaroles loadByestado(PersistentSession session, Boolean estado) throws PersistentException {
		return loadByestado(session, estado, null);
	}
	
	public static Vlistaroles[] listByrol(String rol, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listByrol(session, rol, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listByrol(String rol) throws PersistentException {
		return listByrol(rol, null);
	}
	
	public static Vlistaroles[] listByrol(PersistentSession session, String rol, LockMode lockMode) throws PersistentException {
		try {
			Query query = session.createQuery("From model.pojo.Vlistaroles As Vlistaroles Where Vlistaroles.rol = ?");
			query.setParameter(0, rol);
			if (lockMode != null) {
				query.setLockMode("Vlistaroles", lockMode);
			}
			List list = query.list();
			return (Vlistaroles[]) list.toArray(new Vlistaroles[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listByrol(PersistentSession session, String rol) throws PersistentException {
		return listByrol(session, rol, null);
	}
	
	public static Vlistaroles loadByrol(String rol, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadByrol(session, rol, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles loadByrol(String rol) throws PersistentException {
		return loadByrol(rol, null);
	}
	
	public static Vlistaroles loadByrol(PersistentSession session, String rol, LockMode lockMode) throws PersistentException {
		Vlistaroles[] vlistaroleses = listByrol(session, rol, lockMode);
		if (vlistaroleses != null && vlistaroleses.length > 0)
			return vlistaroleses[0];
		else
			return null;
	}
	
	public static Vlistaroles loadByrol(PersistentSession session, String rol) throws PersistentException {
		return loadByrol(session, rol, null);
	}
	
	public static Vlistaroles loadVlistarolesByORMID(long ID) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadVlistarolesByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles getVlistarolesByORMID(long ID) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getVlistarolesByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles loadVlistarolesByORMID(long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadVlistarolesByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles getVlistarolesByORMID(long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return getVlistarolesByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles loadVlistarolesByORMID(PersistentSession session, long ID) throws PersistentException {
		try {
			return (Vlistaroles) session.load(model.pojo.Vlistaroles.class, new Long(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles getVlistarolesByORMID(PersistentSession session, long ID) throws PersistentException {
		try {
			return (Vlistaroles) session.get(model.pojo.Vlistaroles.class, new Long(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles loadVlistarolesByORMID(PersistentSession session, long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Vlistaroles) session.load(model.pojo.Vlistaroles.class, new Long(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles getVlistarolesByORMID(PersistentSession session, long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Vlistaroles) session.get(model.pojo.Vlistaroles.class, new Long(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVlistaroles(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryVlistaroles(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVlistaroles(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return queryVlistaroles(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listVlistarolesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listVlistarolesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listVlistarolesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return listVlistarolesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVlistaroles(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Vlistaroles as Vlistaroles");
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
	
	public static List queryVlistaroles(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Vlistaroles as Vlistaroles");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Vlistaroles", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listVlistarolesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVlistaroles(session, condition, orderBy);
			return (Vlistaroles[]) list.toArray(new Vlistaroles[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles[] listVlistarolesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVlistaroles(session, condition, orderBy, lockMode);
			return (Vlistaroles[]) list.toArray(new Vlistaroles[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles loadVlistarolesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadVlistarolesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles loadVlistarolesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return loadVlistarolesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vlistaroles loadVlistarolesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Vlistaroles[] vlistaroleses = listVlistarolesByQuery(session, condition, orderBy);
		if (vlistaroleses != null && vlistaroleses.length > 0)
			return vlistaroleses[0];
		else
			return null;
	}
	
	public static Vlistaroles loadVlistarolesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Vlistaroles[] vlistaroleses = listVlistarolesByQuery(session, condition, orderBy, lockMode);
		if (vlistaroleses != null && vlistaroleses.length > 0)
			return vlistaroleses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVlistarolesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateVlistarolesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVlistarolesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Tallerv77PersistentManager.instance().getSession();
			return iterateVlistarolesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVlistarolesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Vlistaroles as Vlistaroles");
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
	
	public static java.util.Iterator iterateVlistarolesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.pojo.Vlistaroles as Vlistaroles");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Vlistaroles", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(model.pojo.Vlistaroles vlistaroles) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().refresh(vlistaroles);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.pojo.Vlistaroles vlistaroles) throws PersistentException {
		try {
			Tallerv77PersistentManager.instance().getSession().evict(vlistaroles);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
