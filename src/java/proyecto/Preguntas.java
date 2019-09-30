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
 * Contiene las preguntas para un examen específico
 */
public class Preguntas implements Serializable {
	public Preguntas() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Preguntas))
			return false;
		Preguntas preguntas = (Preguntas)aObj;
		if (getIdexamen() == null) {
			if (preguntas.getIdexamen() != null)
				return false;
		}
		else if (!getIdexamen().equals(preguntas.getIdexamen()))
			return false;
		if (getIdbanco() == null) {
			if (preguntas.getIdbanco() != null)
				return false;
		}
		else if (!getIdbanco().equals(preguntas.getIdbanco()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getIdexamen() != null) {
			hashcode = hashcode + (int) getIdexamen().getORMID();
		}
		if (getIdbanco() != null) {
			hashcode = hashcode + (int) getIdbanco().getORMID();
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PREGUNTAS_IDEXAMEN) {
			this.idexamen = (proyecto.Examenes) owner;
		}
		
		else if (key == ORMConstants.KEY_PREGUNTAS_IDBANCO) {
			this.idbanco = (proyecto.Banco) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private proyecto.Examenes idexamen;
	
	private int idexamenId;
	
	private void setIdexamenId(int value) {
		this.idexamenId = value;
	}
	
	public int getIdexamenId() {
		return idexamenId;
	}
	
	private proyecto.Banco idbanco;
	
	private int idbancoId;
	
	private void setIdbancoId(int value) {
		this.idbancoId = value;
	}
	
	public int getIdbancoId() {
		return idbancoId;
	}
	
	private short ponderacion;
	
	/**
	 * Valoración de cada pregunta
	 */
	public void setPonderacion(short value) {
		this.ponderacion = value;
	}
	
	/**
	 * Valoración de cada pregunta
	 */
	public short getPonderacion() {
		return ponderacion;
	}
	
	public void setIdexamen(proyecto.Examenes value) {
		if (idexamen != null) {
			idexamen.preguntas.remove(this);
		}
		if (value != null) {
			value.preguntas.add(this);
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
	
	public void setIdbanco(proyecto.Banco value) {
		if (idbanco != null) {
			idbanco.preguntas.remove(this);
		}
		if (value != null) {
			value.preguntas.add(this);
		}
	}
	
	public proyecto.Banco getIdbanco() {
		return idbanco;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Idbanco(proyecto.Banco value) {
		this.idbanco = value;
	}
	
	private proyecto.Banco getORM_Idbanco() {
		return idbanco;
	}
	
	public String toString() {
		return String.valueOf(((getIdexamen() == null) ? "" : String.valueOf(getIdexamen().getORMID())) + " " + ((getIdbanco() == null) ? "" : String.valueOf(getIdbanco().getORMID())));
	}
	
}
