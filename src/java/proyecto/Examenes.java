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
 * Evaluaciones preparadas por un docente
 */
public class Examenes implements Serializable {
	public Examenes() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_EXAMENES_EVALUACIONES) {
			return ORM_evaluaciones;
		}
		else if (key == ORMConstants.KEY_EXAMENES_PREGUNTAS) {
			return ORM_preguntas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EXAMENES_IDDICTA) {
			this.iddicta = (proyecto.Dicta) owner;
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
	
	private int idexamen;
	
	private String nombre;
	
	private java.util.Date fecha;
	
	private java.sql.Time hora_ini;
	
	private java.sql.Time hora_fin;
	
	private short penalizacion;
	
	private boolean activo;
	
	private proyecto.Dicta iddicta;
	
	private java.util.Set ORM_evaluaciones = new java.util.HashSet();
	
	private java.util.Set ORM_preguntas = new java.util.HashSet();
	
	/**
	 * Identificador del examen
	 */
	private void setIdexamen(int value) {
		this.idexamen = value;
	}
	
	/**
	 * Identificador del examen
	 */
	public int getIdexamen() {
		return idexamen;
	}
	
	public int getORMID() {
		return getIdexamen();
	}
	
	/**
	 * Nombre del examen
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * Nombre del examen
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Fecha del examen
	 */
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	/**
	 * Fecha del examen
	 */
	public java.util.Date getFecha() {
		return fecha;
	}
	
	/**
	 * Hora de inicio del examen
	 */
	public void setHora_ini(java.sql.Time value) {
		this.hora_ini = value;
	}
	
	/**
	 * Hora de inicio del examen
	 */
	public java.sql.Time getHora_ini() {
		return hora_ini;
	}
	
	/**
	 * Hora de finalización del examen
	 */
	public void setHora_fin(java.sql.Time value) {
		this.hora_fin = value;
	}
	
	/**
	 * Hora de finalización del examen
	 */
	public java.sql.Time getHora_fin() {
		return hora_fin;
	}
	
	/**
	 * porcentaje de penalización a las respuestas incorrectas
	 */
	public void setPenalizacion(short value) {
		this.penalizacion = value;
	}
	
	/**
	 * porcentaje de penalización a las respuestas incorrectas
	 */
	public short getPenalizacion() {
		return penalizacion;
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
	
	public void setIddicta(proyecto.Dicta value) {
		if (iddicta != null) {
			iddicta.examenes.remove(this);
		}
		if (value != null) {
			value.examenes.add(this);
		}
	}
	
	public proyecto.Dicta getIddicta() {
		return iddicta;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Iddicta(proyecto.Dicta value) {
		this.iddicta = value;
	}
	
	private proyecto.Dicta getORM_Iddicta() {
		return iddicta;
	}
	
	private void setORM_Evaluaciones(java.util.Set value) {
		this.ORM_evaluaciones = value;
	}
	
	private java.util.Set getORM_Evaluaciones() {
		return ORM_evaluaciones;
	}
	
	public final proyecto.EvaluacionesSetCollection evaluaciones = new proyecto.EvaluacionesSetCollection(this, _ormAdapter, ORMConstants.KEY_EXAMENES_EVALUACIONES, ORMConstants.KEY_EVALUACIONES_IDEXAMEN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Preguntas(java.util.Set value) {
		this.ORM_preguntas = value;
	}
	
	private java.util.Set getORM_Preguntas() {
		return ORM_preguntas;
	}
	
	public final proyecto.PreguntasSetCollection preguntas = new proyecto.PreguntasSetCollection(this, _ormAdapter, ORMConstants.KEY_EXAMENES_PREGUNTAS, ORMConstants.KEY_PREGUNTAS_IDEXAMEN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdexamen());
	}
	
}
