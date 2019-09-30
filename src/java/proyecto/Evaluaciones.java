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
 * Contiene los examenes asignados a cada uniersitario
 */
public class Evaluaciones implements Serializable {
	public Evaluaciones() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Evaluaciones))
			return false;
		Evaluaciones evaluaciones = (Evaluaciones)aObj;
		if (getIdprog() == null) {
			if (evaluaciones.getIdprog() != null)
				return false;
		}
		else if (!getIdprog().equals(evaluaciones.getIdprog()))
			return false;
		if (getIdexamen() == null) {
			if (evaluaciones.getIdexamen() != null)
				return false;
		}
		else if (!getIdexamen().equals(evaluaciones.getIdexamen()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getIdprog() != null) {
			hashcode = hashcode + (int) getIdprog().getORMID();
		}
		if (getIdexamen() != null) {
			hashcode = hashcode + (int) getIdexamen().getORMID();
		}
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_EVALUACIONES_IDOPCION) {
			return ORM_idopcion;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EVALUACIONES_IDPROG) {
			this.idprog = (proyecto.Programacion) owner;
		}
		
		else if (key == ORMConstants.KEY_EVALUACIONES_IDEXAMEN) {
			this.idexamen = (proyecto.Examenes) owner;
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
	
	private proyecto.Programacion idprog;
	
	private int idprogId;
	
	private void setIdprogId(int value) {
		this.idprogId = value;
	}
	
	public int getIdprogId() {
		return idprogId;
	}
	
	private proyecto.Examenes idexamen;
	
	private int idexamenId;
	
	private void setIdexamenId(int value) {
		this.idexamenId = value;
	}
	
	public int getIdexamenId() {
		return idexamenId;
	}
	
	private Short nota;
	
	private java.util.Set ORM_idopcion = new java.util.HashSet();
	
	/**
	 * Nota del examen
	 */
	public void setNota(short value) {
		setNota(new Short(value));
	}
	
	/**
	 * Nota del examen
	 */
	public void setNota(Short value) {
		this.nota = value;
	}
	
	/**
	 * Nota del examen
	 */
	public Short getNota() {
		return nota;
	}
	
	public void setIdprog(proyecto.Programacion value) {
		if (idprog != null) {
			idprog.evaluaciones.remove(this);
		}
		if (value != null) {
			value.evaluaciones.add(this);
		}
	}
	
	public proyecto.Programacion getIdprog() {
		return idprog;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Idprog(proyecto.Programacion value) {
		this.idprog = value;
	}
	
	private proyecto.Programacion getORM_Idprog() {
		return idprog;
	}
	
	public void setIdexamen(proyecto.Examenes value) {
		if (idexamen != null) {
			idexamen.evaluaciones.remove(this);
		}
		if (value != null) {
			value.evaluaciones.add(this);
		}
	}
	
	public proyecto.Examenes getIdexamen() {
		return idexamen;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Idexamen(proyecto.Examenes value) {
		this.idexamen = value;
	}
	
	private proyecto.Examenes getORM_Idexamen() {
		return idexamen;
	}
	
	private void setORM_Idopcion(java.util.Set value) {
		this.ORM_idopcion = value;
	}
	
	private java.util.Set getORM_Idopcion() {
		return ORM_idopcion;
	}
	
	public final proyecto.OpcionesSetCollection idopcion = new proyecto.OpcionesSetCollection(this, _ormAdapter, ORMConstants.KEY_EVALUACIONES_IDOPCION, ORMConstants.KEY_OPCIONES_IDPROG, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(((getIdprog() == null) ? "" : String.valueOf(getIdprog().getORMID())) + " " + ((getIdexamen() == null) ? "" : String.valueOf(getIdexamen().getORMID())));
	}
	
}
