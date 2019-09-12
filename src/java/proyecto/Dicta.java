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

import java.io.Serializable;
/**
 * Asignación de materias a docentes
 */
public class Dicta implements Serializable {
	public Dicta() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Dicta))
			return false;
		Dicta dicta = (Dicta)aObj;
		if (getIddicta() != dicta.getIddicta())
			return false;
		if (getIdusu() == null) {
			if (dicta.getIdusu() != null)
				return false;
		}
		else if (!getIdusu().equals(dicta.getIdusu()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getIddicta();
		if (getIdusu() != null) {
			hashcode = hashcode + (getIdusu().getORMID() == null ? 0 : getIdusu().getORMID().hashCode());
		}
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_DICTA_BANCO) {
			return ORM_banco;
		}
		else if (key == ORMConstants.KEY_DICTA_EXAMENES) {
			return ORM_examenes;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_DICTA_IDUSU) {
			this.idusu = (proyecto.Docentes) owner;
		}
		
		else if (key == ORMConstants.KEY_DICTA_IDCARR) {
			this.idcarr = (proyecto.Materias) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int iddicta;
	
	private proyecto.Docentes idusu;
	
	private proyecto.Usuarios idusuId;
	
	private int idusuIdId;
	
	private void setIdusuIdId(int value) {
		this.idusuIdId = value;
	}
	
	public int getIdusuIdId() {
		return idusuIdId;
	}
	
	private void setIdusuId(proyecto.Usuarios value) {
		this.idusuId = value;
	}
	
	public proyecto.Usuarios getIdusuId() {
		return idusuId;
	}
	
	private proyecto.Materias idcarr;
	
	private String gestion;
	
	private java.util.Set ORM_banco = new java.util.HashSet();
	
	private java.util.Set ORM_examenes = new java.util.HashSet();
	
	/**
	 * Identificador de la asignación de materias
	 */
	public void setIddicta(int value) {
		this.iddicta = value;
	}
	
	/**
	 * Identificador de la asignación de materias
	 */
	public int getIddicta() {
		return iddicta;
	}
	
	/**
	 * Año que se dicta la materia
	 */
	public void setGestion(String value) {
		this.gestion = value;
	}
	
	/**
	 * Año que se dicta la materia
	 */
	public String getGestion() {
		return gestion;
	}
	
	public void setIdusu(proyecto.Docentes value) {
		if (idusu != null) {
			idusu.dicta.remove(this);
		}
		if (value != null) {
			value.dicta.add(this);
		}
	}
	
	public proyecto.Docentes getIdusu() {
		return idusu;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Idusu(proyecto.Docentes value) {
		this.idusu = value;
	}
	
	private proyecto.Docentes getORM_Idusu() {
		return idusu;
	}
	
	public void setIdcarr(proyecto.Materias value) {
		if (idcarr != null) {
			idcarr.dicta.remove(this);
		}
		if (value != null) {
			value.dicta.add(this);
		}
	}
	
	public proyecto.Materias getIdcarr() {
		return idcarr;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Idcarr(proyecto.Materias value) {
		this.idcarr = value;
	}
	
	private proyecto.Materias getORM_Idcarr() {
		return idcarr;
	}
	
	private void setORM_Banco(java.util.Set value) {
		this.ORM_banco = value;
	}
	
	private java.util.Set getORM_Banco() {
		return ORM_banco;
	}
	
	public final proyecto.BancoSetCollection banco = new proyecto.BancoSetCollection(this, _ormAdapter, ORMConstants.KEY_DICTA_BANCO, ORMConstants.KEY_BANCO_IDDICTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Examenes(java.util.Set value) {
		this.ORM_examenes = value;
	}
	
	private java.util.Set getORM_Examenes() {
		return ORM_examenes;
	}
	
	public final proyecto.ExamenesSetCollection examenes = new proyecto.ExamenesSetCollection(this, _ormAdapter, ORMConstants.KEY_DICTA_EXAMENES, ORMConstants.KEY_EXAMENES_IDDICTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIddicta() + " " + ((getIdusu() == null) ? "" : String.valueOf(getIdusu().getORMID())));
	}
	
}
