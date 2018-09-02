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
public class Curso implements Serializable {
	public Curso() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Curso))
			return false;
		Curso curso = (Curso)aObj;
		if (getIdcurso() != curso.getIdcurso())
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getIdcurso();
		return hashcode;
	}
	
	private int idcurso;
	
	private model.pojo.Ciclo ciclos;
	
	private String nombre;
	
	private String anno;
	
	private boolean estado = true;
	
	private java.util.Set paralelo = new java.util.HashSet();
	
	private java.util.Set materias = new java.util.HashSet();
	
	public void setIdcurso(int value) {
		this.idcurso = value;
	}
	
	public int getIdcurso() {
		return idcurso;
	}
	
	public int getORMID() {
		return getIdcurso();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setAnno(String value) {
		this.anno = value;
	}
	
	public String getAnno() {
		return anno;
	}
	
	public void setEstado(boolean value) {
		this.estado = value;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setParalelo(java.util.Set value) {
		this.paralelo = value;
	}
	
	public java.util.Set getParalelo() {
		return paralelo;
	}
	
	
	public void setCiclos(model.pojo.Ciclo value) {
		this.ciclos = value;
	}
	
	public model.pojo.Ciclo getCiclos() {
		return ciclos;
	}
	
	public void setMaterias(java.util.Set value) {
		this.materias = value;
	}
	
	public java.util.Set getMaterias() {
		return materias;
	}
	
	
	public String toString() {
		return String.valueOf(getIdcurso());
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
