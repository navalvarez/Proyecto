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
 * Especificación del tipo de evaluación
 */
public class Tipo implements Serializable {
	public Tipo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TIPO_BANCO) {
			return ORM_banco;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idtipo;
	
	private String nombre;
	
	private boolean activo;
	
	private java.util.Set ORM_banco = new java.util.HashSet();
	
	/**
	 * Identificador de tipo de evaluación
	 */
	private void setIdtipo(int value) {
		this.idtipo = value;
	}
	
	/**
	 * Identificador de tipo de evaluación
	 */
	public int getIdtipo() {
		return idtipo;
	}
	
	public int getORMID() {
		return getIdtipo();
	}
	
	/**
	 * Nombre del tipo de evaluación: Falso Verdadero, Simple o Multiple
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * Nombre del tipo de evaluación: Falso Verdadero, Simple o Multiple
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * True, vigente. False, dado de baja
	 */
	public void setActivo(boolean value) {
		this.activo = value;
	}
	
	/**
	 * True, vigente. False, dado de baja
	 */
	public boolean getActivo() {
		return activo;
	}
	
	private void setORM_Banco(java.util.Set value) {
		this.ORM_banco = value;
	}
	
	private java.util.Set getORM_Banco() {
		return ORM_banco;
	}
	
	public final proyecto.BancoSetCollection banco = new proyecto.BancoSetCollection(this, _ormAdapter, ORMConstants.KEY_TIPO_BANCO, ORMConstants.KEY_BANCO_IDTIPO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdtipo());
	}
	
}
