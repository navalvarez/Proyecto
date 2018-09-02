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
public class ProfesorEspecialidad extends model.pojo.Persona implements Serializable {
	public ProfesorEspecialidad() {
	}
	
	private String especialidad;
	
	private String unidad;
	
	private int gestion;
	
	private java.util.Set designaEspecialidads = new java.util.HashSet();
	
	public void setEspecialidad(String value) {
		this.especialidad = value;
	}
	
	public String getEspecialidad() {
		return especialidad;
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
	
	public model.pojo.Materia[] getMaterias() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = designaEspecialidads.iterator();lIter.hasNext();) {
			lValues.add(((model.pojo.DesignaEspecialidad)lIter.next()).getMateria());
		}
		return (model.pojo.Materia[])lValues.toArray(new model.pojo.Materia[lValues.size()]);
	}
	
	public void removeMateria(model.pojo.Materia aMateria) {
		model.pojo.DesignaEspecialidad[] lDesignaEspecialidads = (model.pojo.DesignaEspecialidad[])designaEspecialidads.toArray(new model.pojo.DesignaEspecialidad[designaEspecialidads.size()]);
		for(int i = 0; i < lDesignaEspecialidads.length; i++) {
			if(lDesignaEspecialidads[i].getMateria().equals(aMateria)) {
				designaEspecialidads.remove(lDesignaEspecialidads[i]);
			}
		}
	}
	
	public void addMateria(model.pojo.DesignaEspecialidad aDesignaEspecialidad, model.pojo.Materia aMateria) {
		aDesignaEspecialidad.setMateria(aMateria);
		designaEspecialidads.add(aDesignaEspecialidad);
	}
	
	public model.pojo.DesignaEspecialidad getDesignaEspecialidadByMateria(model.pojo.Materia aMateria) {
		model.pojo.DesignaEspecialidad[] lDesignaEspecialidads = (model.pojo.DesignaEspecialidad[])designaEspecialidads.toArray(new model.pojo.DesignaEspecialidad[designaEspecialidads.size()]);
		for(int i = 0; i < lDesignaEspecialidads.length; i++) {
			if(lDesignaEspecialidads[i].getMateria().equals(aMateria)) {
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
	
	
	public String toString() {
		return super.toString();
	}
	
}
