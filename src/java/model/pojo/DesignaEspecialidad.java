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
public class DesignaEspecialidad implements Serializable {
	public DesignaEspecialidad() {
	}
	
	private model.pojo.Materia materia;
	
	private String materiaId;
	
	private void setMateriaId(String value) {
		this.materiaId = value;
	}
	
	public String getMateriaId() {
		return materiaId;
	}
	
	private java.util.Date fechadesignacion;
	
	private String nredocumento;
	
	private boolean estado = true;
	
	private int gestion;
	
	private model.pojo.ProfesorEspecialidad profesorEspecialidad;
	
	public void setFechadesignacion(java.util.Date value) {
		this.fechadesignacion = value;
	}
	
	public java.util.Date getFechadesignacion() {
		return fechadesignacion;
	}
	
	public void setNredocumento(String value) {
		this.nredocumento = value;
	}
	
	public String getNredocumento() {
		return nredocumento;
	}
	
	public void setEstado(boolean value) {
		this.estado = value;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setGestion(int value) {
		this.gestion = value;
	}
	
	public int getGestion() {
		return gestion;
	}
	
	public void setProfesorEspecialidad(model.pojo.ProfesorEspecialidad value) {
		this.profesorEspecialidad = value;
	}
	
	public model.pojo.ProfesorEspecialidad getProfesorEspecialidad() {
		return profesorEspecialidad;
	}
	
	public void setMateria(model.pojo.Materia value) {
		this.materia = value;
	}
	
	public model.pojo.Materia getMateria() {
		return materia;
	}
	
	public model.pojo.Materia getORMID() {
		return getMateria();
	}
	
	public String toString() {
		return String.valueOf(((getMateria() == null) ? "" : String.valueOf(getMateria().getORMID())));
	}
	
}
