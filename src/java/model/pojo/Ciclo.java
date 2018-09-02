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
public class Ciclo implements Serializable {
	public Ciclo() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Ciclo))
			return false;
		Ciclo ciclo = (Ciclo)aObj;
		if (getIdciclo() != ciclo.getIdciclo())
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getIdciclo();
		return hashcode;
	}
	
	private int idciclo;
	
	private model.pojo.Director director;
	
	private String nombre;
	
	private String turno;
	
	private boolean estado = true;
	
	private java.util.Set curso = new java.util.HashSet();
	
	public void setIdciclo(int value) {
		this.idciclo = value;
	}
	
	public int getIdciclo() {
		return idciclo;
	}
	
	public int getORMID() {
		return getIdciclo();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setTurno(String value) {
		this.turno = value;
	}
	
	public String getTurno() {
		return turno;
	}
	
	public void setEstado(boolean value) {
		this.estado = value;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setCurso(java.util.Set value) {
		this.curso = value;
	}
	
	public java.util.Set getCurso() {
		return curso;
	}
	
	
	public void setDirector(model.pojo.Director value) {
		this.director = value;
	}
	
	public model.pojo.Director getDirector() {
		return director;
	}
	
	public String toString() {
		return String.valueOf(getIdciclo());
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
