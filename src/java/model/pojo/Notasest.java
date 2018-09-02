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
public class Notasest implements Serializable {
	public Notasest() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Notasest))
			return false;
		Notasest notasest = (Notasest)aObj;
		if (getEstudiante() == null) {
			if (notasest.getEstudiante() != null)
				return false;
		}
		else if (!getEstudiante().equals(notasest.getEstudiante()))
			return false;
		if (getMateria() == null) {
			if (notasest.getMateria() != null)
				return false;
		}
		else if (!getMateria().equals(notasest.getMateria()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getEstudiante() != null) {
			hashcode = hashcode + (int) getEstudiante().getORMID();
		}
		if (getMateria() != null) {
			hashcode = hashcode + (getMateria().getORMID() == null ? 0 : getMateria().getORMID().hashCode());
		}
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
	
	private int bimestre1;
	
	private int bimestre2;
	
	private int bimestre3;
	
	private boolean estado = true;
	
	private model.pojo.Materia materia;
	
	private String materiaId;
	
	private void setMateriaId(String value) {
		this.materiaId = value;
	}
	
	public String getMateriaId() {
		return materiaId;
	}
	
	public void setBimestre1(int value) {
		this.bimestre1 = value;
	}
	
	public int getBimestre1() {
		return bimestre1;
	}
	
	public void setBimestre2(int value) {
		this.bimestre2 = value;
	}
	
	public int getBimestre2() {
		return bimestre2;
	}
	
	public void setBimestre3(int value) {
		this.bimestre3 = value;
	}
	
	public int getBimestre3() {
		return bimestre3;
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
	
	public void setMateria(model.pojo.Materia value) {
		this.materia = value;
	}
	
	public model.pojo.Materia getMateria() {
		return materia;
	}
	
	public String toString() {
		return String.valueOf(((getEstudiante() == null) ? "" : String.valueOf(getEstudiante().getORMID())) + " " + ((getMateria() == null) ? "" : String.valueOf(getMateria().getORMID())));
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
