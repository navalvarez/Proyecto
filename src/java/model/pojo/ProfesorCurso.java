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
public class ProfesorCurso extends model.pojo.Persona implements Serializable {
	public ProfesorCurso() {
	}
	
	private Integer ciclo;
	
	private String unidad;
	
	private int gestion;
	
	private java.util.Set designas = new java.util.HashSet();
	
	public void setCiclo(int value) {
		setCiclo(new Integer(value));
	}
	
	public void setCiclo(Integer value) {
		this.ciclo = value;
	}
	
	public Integer getCiclo() {
		return ciclo;
	}
	
	public void setUnidad(String value) {
		this.unidad = value;
	}
	
	public String getUnidad() {
		return unidad;
	}
	
	public void setGestion(int value) {
		this.gestion = value;
	}
	
	public int getGestion() {
		return gestion;
	}
	
	public model.pojo.Paralelo[] getParalelos() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = designas.iterator();lIter.hasNext();) {
			lValues.add(((model.pojo.Designa)lIter.next()).getParalelo());
		}
		return (model.pojo.Paralelo[])lValues.toArray(new model.pojo.Paralelo[lValues.size()]);
	}
	
	public void removeParalelo(model.pojo.Paralelo aParalelo) {
		model.pojo.Designa[] lDesignas = (model.pojo.Designa[])designas.toArray(new model.pojo.Designa[designas.size()]);
		for(int i = 0; i < lDesignas.length; i++) {
			if(lDesignas[i].getParalelo().equals(aParalelo)) {
				designas.remove(lDesignas[i]);
			}
		}
	}
	
	public void addParalelo(model.pojo.Designa aDesigna, model.pojo.Paralelo aParalelo) {
		aDesigna.setParalelo(aParalelo);
		designas.add(aDesigna);
	}
	
	public model.pojo.Designa getDesignaByParalelo(model.pojo.Paralelo aParalelo) {
		model.pojo.Designa[] lDesignas = (model.pojo.Designa[])designas.toArray(new model.pojo.Designa[designas.size()]);
		for(int i = 0; i < lDesignas.length; i++) {
			if(lDesignas[i].getParalelo().equals(aParalelo)) {
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
	
	
	public String toString() {
		return super.toString();
	}
	
}
