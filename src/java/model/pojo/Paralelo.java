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
public class Paralelo implements Serializable {
	public Paralelo() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Paralelo))
			return false;
		Paralelo paralelo = (Paralelo)aObj;
		if ((getIdparalelo() != null && !getIdparalelo().equals(paralelo.getIdparalelo())) || (getIdparalelo() == null && paralelo.getIdparalelo() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getIdparalelo() == null ? 0 : getIdparalelo().hashCode());
		return hashcode;
	}
	
	private String idparalelo;
	
	private model.pojo.Curso cursos;
	
	private String nombre;
	
	private boolean estado = true;
	
	private java.util.Set designas = new java.util.HashSet();
	
	private java.util.Set materia = new java.util.HashSet();
	
	private java.util.Set matriculas = new java.util.HashSet();
	
	private java.util.Set asignas = new java.util.HashSet();
	
	public void setIdparalelo(String value) {
		this.idparalelo = value;
	}
	
	public String getIdparalelo() {
		return idparalelo;
	}
	
	public String getORMID() {
		return getIdparalelo();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEstado(boolean value) {
		this.estado = value;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public model.pojo.ProfesorCurso[] getProfesorCursos() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = designas.iterator();lIter.hasNext();) {
			lValues.add(((model.pojo.Designa)lIter.next()).getProfesorCurso());
		}
		return (model.pojo.ProfesorCurso[])lValues.toArray(new model.pojo.ProfesorCurso[lValues.size()]);
	}
	
	public void removeProfesorCurso(model.pojo.ProfesorCurso aProfesorCurso) {
		model.pojo.Designa[] lDesignas = (model.pojo.Designa[])designas.toArray(new model.pojo.Designa[designas.size()]);
		for(int i = 0; i < lDesignas.length; i++) {
			if(lDesignas[i].getProfesorCurso().equals(aProfesorCurso)) {
				designas.remove(lDesignas[i]);
			}
		}
	}
	
	public void addProfesorCurso(model.pojo.Designa aDesigna, model.pojo.ProfesorCurso aProfesorCurso) {
		aDesigna.setProfesorCurso(aProfesorCurso);
		designas.add(aDesigna);
	}
	
	public model.pojo.Designa getDesignaByProfesorCurso(model.pojo.ProfesorCurso aProfesorCurso) {
		model.pojo.Designa[] lDesignas = (model.pojo.Designa[])designas.toArray(new model.pojo.Designa[designas.size()]);
		for(int i = 0; i < lDesignas.length; i++) {
			if(lDesignas[i].getProfesorCurso().equals(aProfesorCurso)) {
				return lDesignas[i];
			}
		}
		return null;
	}
	
	public void setDesignas(java.util.Set value) {
		this.designas = value;
	}
	
	public java.util.Set getDesignas() {
		return designas;
	}
	
	
	public void setMateria(java.util.Set value) {
		this.materia = value;
	}
	
	public java.util.Set getMateria() {
		return materia;
	}
	
	
	public model.pojo.Estudiante[] getEstudiantes() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = matriculas.iterator();lIter.hasNext();) {
			lValues.add(((model.pojo.Matricula)lIter.next()).getEstudiante());
		}
		return (model.pojo.Estudiante[])lValues.toArray(new model.pojo.Estudiante[lValues.size()]);
	}
	
	public void removeEstudiante(model.pojo.Estudiante aEstudiante) {
		model.pojo.Matricula[] lMatriculas = (model.pojo.Matricula[])matriculas.toArray(new model.pojo.Matricula[matriculas.size()]);
		for(int i = 0; i < lMatriculas.length; i++) {
			if(lMatriculas[i].getEstudiante().equals(aEstudiante)) {
				matriculas.remove(lMatriculas[i]);
			}
		}
	}
	
	public void addEstudiante(model.pojo.Matricula aMatricula, model.pojo.Estudiante aEstudiante) {
		aMatricula.setEstudiante(aEstudiante);
		matriculas.add(aMatricula);
	}
	
	public model.pojo.Matricula getMatriculaByEstudiante(model.pojo.Estudiante aEstudiante) {
		model.pojo.Matricula[] lMatriculas = (model.pojo.Matricula[])matriculas.toArray(new model.pojo.Matricula[matriculas.size()]);
		for(int i = 0; i < lMatriculas.length; i++) {
			if(lMatriculas[i].getEstudiante().equals(aEstudiante)) {
				return lMatriculas[i];
			}
		}
		return null;
	}
	
	public void setMatriculas(java.util.Set value) {
		this.matriculas = value;
	}
	
	public java.util.Set getMatriculas() {
		return matriculas;
	}
	
	
	public model.pojo.Aula[] getAulas() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = asignas.iterator();lIter.hasNext();) {
			lValues.add(((model.pojo.Asigna)lIter.next()).getAula());
		}
		return (model.pojo.Aula[])lValues.toArray(new model.pojo.Aula[lValues.size()]);
	}
	
	public void removeAula(model.pojo.Aula aAula) {
		model.pojo.Asigna[] lAsignas = (model.pojo.Asigna[])asignas.toArray(new model.pojo.Asigna[asignas.size()]);
		for(int i = 0; i < lAsignas.length; i++) {
			if(lAsignas[i].getAula().equals(aAula)) {
				asignas.remove(lAsignas[i]);
			}
		}
	}
	
	public void addAula(model.pojo.Asigna aAsigna, model.pojo.Aula aAula) {
		aAsigna.setAula(aAula);
		asignas.add(aAsigna);
	}
	
	public model.pojo.Asigna getAsignaByAula(model.pojo.Aula aAula) {
		model.pojo.Asigna[] lAsignas = (model.pojo.Asigna[])asignas.toArray(new model.pojo.Asigna[asignas.size()]);
		for(int i = 0; i < lAsignas.length; i++) {
			if(lAsignas[i].getAula().equals(aAula)) {
				return lAsignas[i];
			}
		}
		return null;
	}
	
	public void setAsignas(java.util.Set value) {
		this.asignas = value;
	}
	
	public java.util.Set getAsignas() {
		return asignas;
	}
	
	
	public void setCursos(model.pojo.Curso value) {
		this.cursos = value;
	}
	
	public model.pojo.Curso getCursos() {
		return cursos;
	}
	
	public String toString() {
		return String.valueOf(getIdparalelo());
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
