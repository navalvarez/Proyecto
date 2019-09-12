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
 * Contiene las diferentes opciones de respuesta para cada pregunta del banco de preguntas
 */
public class Opciones implements Serializable {
	public Opciones() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_OPCIONES_IDPROG) {
			return ORM_idprog;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_OPCIONES_IDBANCO) {
			this.idbanco = (proyecto.Banco) owner;
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
	
	private int idopcion;
	
	private proyecto.Banco idbanco;
	
	private String opcion;
	
	private boolean correcta;
	
	private java.util.Set ORM_idprog = new java.util.HashSet();
	
	/**
	 * Identifcador de las opciones
	 */
	private void setIdopcion(int value) {
		this.idopcion = value;
	}
	
	/**
	 * Identifcador de las opciones
	 */
	public int getIdopcion() {
		return idopcion;
	}
	
	public int getORMID() {
		return getIdopcion();
	}
	
	/**
	 * Una opción de respuesta a la pregunta
	 */
	public void setOpcion(String value) {
		this.opcion = value;
	}
	
	/**
	 * Una opción de respuesta a la pregunta
	 */
	public String getOpcion() {
		return opcion;
	}
	
	/**
	 * True, respuesta correcta. False, respueta incorrecta
	 */
	public void setCorrecta(boolean value) {
		this.correcta = value;
	}
	
	/**
	 * True, respuesta correcta. False, respueta incorrecta
	 */
	public boolean getCorrecta() {
		return correcta;
	}
	
	private void setORM_Idprog(java.util.Set value) {
		this.ORM_idprog = value;
	}
	
	private java.util.Set getORM_Idprog() {
		return ORM_idprog;
	}
	
	public final proyecto.EvaluacionesSetCollection idprog = new proyecto.EvaluacionesSetCollection(this, _ormAdapter, ORMConstants.KEY_OPCIONES_IDPROG, ORMConstants.KEY_EVALUACIONES_IDOPCION, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setIdbanco(proyecto.Banco value) {
		if (idbanco != null) {
			idbanco.opciones.remove(this);
		}
		if (value != null) {
			value.opciones.add(this);
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
		return String.valueOf(getIdopcion());
	}
	
}
