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

import java.io.Serializable;
public class Matricula implements Serializable {
	public Matricula() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Matricula))
			return false;
		Matricula matricula = (Matricula)aObj;
		if (getEstudiante() == null) {
			if (matricula.getEstudiante() != null)
				return false;
		}
		else if (!getEstudiante().equals(matricula.getEstudiante()))
			return false;
		if (getParalelo() == null) {
			if (matricula.getParalelo() != null)
				return false;
		}
		else if (!getParalelo().equals(matricula.getParalelo()))
			return false;
		if ((getFecha() != null && !getFecha().equals(matricula.getFecha())) || (getFecha() == null && matricula.getFecha() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getEstudiante() != null) {
			hashcode = hashcode + (int) getEstudiante().getORMID();
		}
		if (getParalelo() != null) {
			hashcode = hashcode + (getParalelo().getORMID() == null ? 0 : getParalelo().getORMID().hashCode());
		}
		hashcode = hashcode + (getFecha() == null ? 0 : getFecha().hashCode());
		return hashcode;
	}
	
	private model.pojo.Estudiante estudiante;
	
	private int estudianteId;
	
	private void setEstudianteId(int value) {
		this.estudianteId = value;
	}
	
	public int getEstudianteId() {
		return estudianteId;
	}
	
	private model.pojo.Paralelo paralelo;
	
	private String paraleloId;
	
	private void setParaleloId(String value) {
		this.paraleloId = value;
	}
	
	public String getParaleloId() {
		return paraleloId;
	}
	
	private java.util.Date fecha;
	
	private boolean estado = true;
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setEstado(boolean value) {
		this.estado = value;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setEstudiante(model.pojo.Estudiante value) {
		this.estudiante = value;
	}
	
	public model.pojo.Estudiante getEstudiante() {
		return estudiante;
	}
	
	public void setParalelo(model.pojo.Paralelo value) {
		this.paralelo = value;
	}
	
	public model.pojo.Paralelo getParalelo() {
		return paralelo;
	}
	
	public String toString() {
		return String.valueOf(((getEstudiante() == null) ? "" : String.valueOf(getEstudiante().getORMID())) + " " + ((getParalelo() == null) ? "" : String.valueOf(getParalelo().getORMID())) + " " + getFecha());
	}
	
	private boolean _saved = false;
	
	public void onSave() {
		_saved=true;
	}
	
	
	public void onLoad() {
		_saved=true;
	}
	
	
	public boolean isSaved() {
		return _saved;
	}
	
	
}
