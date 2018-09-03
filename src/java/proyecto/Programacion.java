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
 * Asignación de materias a estudiantes
 */
public class Programacion implements Serializable {
	public Programacion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PROGRAMACION_EVALUACIONES) {
			return ORM_evaluaciones;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PROGRAMACION_IDUSU) {
			this.idusu = (proyecto.Universitarios) owner;
		}
		
		else if (key == ORMConstants.KEY_PROGRAMACION_IDCARR) {
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
	
	private int idprog;
	
	private proyecto.Universitarios idusu;
	
	private proyecto.Materias idcarr;
	
	private String gestion;
	
	private java.util.Set ORM_evaluaciones = new java.util.HashSet();
	
	/**
	 * Identificador de la programación
	 */
	private void setIdprog(int value) {
		this.idprog = value;
	}
	
	/**
	 * Identificador de la programación
	 */
	public int getIdprog() {
		return idprog;
	}
	
	public int getORMID() {
		return getIdprog();
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
	
	public void setIdusu(proyecto.Universitarios value) {
		if (idusu != null) {
			idusu.programacion.remove(this);
		}
		if (value != null) {
			value.programacion.add(this);
		}
	}
	
	public proyecto.Universitarios getIdusu() {
		return idusu;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Idusu(proyecto.Universitarios value) {
		this.idusu = value;
	}
	
	private proyecto.Universitarios getORM_Idusu() {
		return idusu;
	}
	
	public void setIdcarr(proyecto.Materias value) {
		if (idcarr != null) {
			idcarr.programacion.remove(this);
		}
		if (value != null) {
			value.programacion.add(this);
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
	
	private void setORM_Evaluaciones(java.util.Set value) {
		this.ORM_evaluaciones = value;
	}
	
	private java.util.Set getORM_Evaluaciones() {
		return ORM_evaluaciones;
	}
	
	public final proyecto.EvaluacionesSetCollection evaluaciones = new proyecto.EvaluacionesSetCollection(this, _ormAdapter, ORMConstants.KEY_PROGRAMACION_EVALUACIONES, ORMConstants.KEY_EVALUACIONES_IDPROG, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdprog());
	}
	
}
