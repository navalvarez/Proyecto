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
public class Estudiante extends model.pojo.Persona implements Serializable {
	public Estudiante() {
	}
	
	private int rude;
	
	private java.util.Set notasests = new java.util.HashSet();
	
	private java.util.Set matriculas = new java.util.HashSet();
	
	public void setRude(int value) {
		this.rude = value;
	}
	
	public int getRude() {
		return rude;
	}
	
	public void setNotasests(java.util.Set value) {
		this.notasests = value;
	}
	
	public java.util.Set getNotasests() {
		return notasests;
	}
	
	
	public model.pojo.Paralelo[] getParalelos() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = matriculas.iterator();lIter.hasNext();) {
			lValues.add(((model.pojo.Matricula)lIter.next()).getParalelo());
		}
		return (model.pojo.Paralelo[])lValues.toArray(new model.pojo.Paralelo[lValues.size()]);
	}
	
	public void removeParalelo(model.pojo.Paralelo aParalelo) {
		model.pojo.Matricula[] lMatriculas = (model.pojo.Matricula[])matriculas.toArray(new model.pojo.Matricula[matriculas.size()]);
		for(int i = 0; i < lMatriculas.length; i++) {
			if(lMatriculas[i].getParalelo().equals(aParalelo)) {
				matriculas.remove(lMatriculas[i]);
			}
		}
	}
	
	public void addParalelo(model.pojo.Matricula aMatricula, model.pojo.Paralelo aParalelo) {
		aMatricula.setParalelo(aParalelo);
		matriculas.add(aMatricula);
	}
	
	public model.pojo.Matricula getMatriculaByParalelo(model.pojo.Paralelo aParalelo) {
		model.pojo.Matricula[] lMatriculas = (model.pojo.Matricula[])matriculas.toArray(new model.pojo.Matricula[matriculas.size()]);
		for(int i = 0; i < lMatriculas.length; i++) {
			if(lMatriculas[i].getParalelo().equals(aParalelo)) {
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
	
	
	/**
	 * Contructor que recibe cómo parámetro el rude del estudiante
	 */
	public Estudiante(int rude) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void otrometodo(int a, int b) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
