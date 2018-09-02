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
public class Materia implements Serializable {
	public Materia() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Materia))
			return false;
		Materia materia = (Materia)aObj;
		if ((getSigla() != null && !getSigla().equals(materia.getSigla())) || (getSigla() == null && materia.getSigla() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getSigla() == null ? 0 : getSigla().hashCode());
		return hashcode;
	}
	
	private String sigla;
	
	private model.pojo.Curso curso;
	
	private String nombre;
	
	private String progama;
	
	private int nrohora;
	
	private boolean estado = true;
	
	private java.util.Set designaEspecialidads = new java.util.HashSet();
	
	private java.util.Set paralelos = new java.util.HashSet();
	
	private java.util.Set notasests = new java.util.HashSet();
	
	public void setSigla(String value) {
		this.sigla = value;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public String getORMID() {
		return getSigla();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setProgama(String value) {
		this.progama = value;
	}
	
	public String getProgama() {
		return progama;
	}
	
	public void setNrohora(int value) {
		this.nrohora = value;
	}
	
	public int getNrohora() {
		return nrohora;
	}
	
	public void setEstado(boolean value) {
		this.estado = value;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public model.pojo.ProfesorEspecialidad[] getProfesorEspecialidads() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = designaEspecialidads.iterator();lIter.hasNext();) {
			lValues.add(((model.pojo.DesignaEspecialidad)lIter.next()).getProfesorEspecialidad());
		}
		return (model.pojo.ProfesorEspecialidad[])lValues.toArray(new model.pojo.ProfesorEspecialidad[lValues.size()]);
	}
	
	public void removeProfesorEspecialidad(model.pojo.ProfesorEspecialidad aProfesorEspecialidad) {
		model.pojo.DesignaEspecialidad[] lDesignaEspecialidads = (model.pojo.DesignaEspecialidad[])designaEspecialidads.toArray(new model.pojo.DesignaEspecialidad[designaEspecialidads.size()]);
		for(int i = 0; i < lDesignaEspecialidads.length; i++) {
			if(lDesignaEspecialidads[i].getProfesorEspecialidad().equals(aProfesorEspecialidad)) {
				designaEspecialidads.remove(lDesignaEspecialidads[i]);
			}
		}
	}
	
	public void addProfesorEspecialidad(model.pojo.DesignaEspecialidad aDesignaEspecialidad, model.pojo.ProfesorEspecialidad aProfesorEspecialidad) {
		aDesignaEspecialidad.setProfesorEspecialidad(aProfesorEspecialidad);
		designaEspecialidads.add(aDesignaEspecialidad);
	}
	
	public model.pojo.DesignaEspecialidad getDesignaEspecialidadByProfesorEspecialidad(model.pojo.ProfesorEspecialidad aProfesorEspecialidad) {
		model.pojo.DesignaEspecialidad[] lDesignaEspecialidads = (model.pojo.DesignaEspecialidad[])designaEspecialidads.toArray(new model.pojo.DesignaEspecialidad[designaEspecialidads.size()]);
		for(int i = 0; i < lDesignaEspecialidads.length; i++) {
			if(lDesignaEspecialidads[i].getProfesorEspecialidad().equals(aProfesorEspecialidad)) {
				return lDesignaEspecialidads[i];
			}
		}
		return null;
	}
	
	public void setDesignaEspecialidads(java.util.Set value) {
		this.designaEspecialidads = value;
	}
	
	public java.util.Set getDesignaEspecialidads() {
		return designaEspecialidads;
	}
	
	
	public void setCurso(model.pojo.Curso value) {
		this.curso = value;
	}
	
	public model.pojo.Curso getCurso() {
		return curso;
	}
	
	public void setParalelos(java.util.Set value) {
		this.paralelos = value;
	}
	
	public java.util.Set getParalelos() {
		return paralelos;
	}
	
	
	public void setNotasests(java.util.Set value) {
		this.notasests = value;
	}
	
	public java.util.Set getNotasests() {
		return notasests;
	}
	
	
	public String toString() {
		return String.valueOf(getSigla());
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
