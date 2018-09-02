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
public class Designa implements Serializable {
	public Designa() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Designa))
			return false;
		Designa designa = (Designa)aObj;
		if (getParalelo() == null) {
			if (designa.getParalelo() != null)
				return false;
		}
		else if (!getParalelo().equals(designa.getParalelo()))
			return false;
		if (getProfesorCurso() == null) {
			if (designa.getProfesorCurso() != null)
				return false;
		}
		else if (!getProfesorCurso().equals(designa.getProfesorCurso()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getParalelo() != null) {
			hashcode = hashcode + (getParalelo().getORMID() == null ? 0 : getParalelo().getORMID().hashCode());
		}
		if (getProfesorCurso() != null) {
			hashcode = hashcode + (int) getProfesorCurso().getORMID();
		}
		return hashcode;
	}
	
	private model.pojo.Paralelo paralelo;
	
	private String paraleloId;
	
	private void setParaleloId(String value) {
		this.paraleloId = value;
	}
	
	public String getParaleloId() {
		return paraleloId;
	}
	
	private model.pojo.ProfesorCurso profesorCurso;
	
	private int profesorCursoId;
	
	private void setProfesorCursoId(int value) {
		this.profesorCursoId = value;
	}
	
	public int getProfesorCursoId() {
		return profesorCursoId;
	}
	
	private java.util.Date fechadesignacion;
	
	private String nrodocumeto;
	
	private String tipodesignacion;
	
	private boolean estado = true;
	
	public void setFechadesignacion(java.util.Date value) {
		this.fechadesignacion = value;
	}
	
	public java.util.Date getFechadesignacion() {
		return fechadesignacion;
	}
	
	public void setNrodocumeto(String value) {
		this.nrodocumeto = value;
	}
	
	public String getNrodocumeto() {
		return nrodocumeto;
	}
	
	public void setTipodesignacion(String value) {
		this.tipodesignacion = value;
	}
	
	public String getTipodesignacion() {
		return tipodesignacion;
	}
	
	public void setEstado(boolean value) {
		this.estado = value;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setProfesorCurso(model.pojo.ProfesorCurso value) {
		this.profesorCurso = value;
	}
	
	public model.pojo.ProfesorCurso getProfesorCurso() {
		return profesorCurso;
	}
	
	public void setParalelo(model.pojo.Paralelo value) {
		this.paralelo = value;
	}
	
	public model.pojo.Paralelo getParalelo() {
		return paralelo;
	}
	
	public String toString() {
		return String.valueOf(((getParalelo() == null) ? "" : String.valueOf(getParalelo().getORMID())) + " " + ((getProfesorCurso() == null) ? "" : String.valueOf(getProfesorCurso().getORMID())));
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
