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
public class Aula implements Serializable {
	public Aula() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Aula))
			return false;
		Aula aula = (Aula)aObj;
		if ((getIdaula() != null && !getIdaula().equals(aula.getIdaula())) || (getIdaula() == null && aula.getIdaula() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getIdaula() == null ? 0 : getIdaula().hashCode());
		return hashcode;
	}
	
	private String idaula;
	
	private String nombre;
	
	private boolean estado = true;
	
	private java.util.Set asignas = new java.util.HashSet();
	
	public void setIdaula(String value) {
		this.idaula = value;
	}
	
	public String getIdaula() {
		return idaula;
	}
	
	public String getORMID() {
		return getIdaula();
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
	
	public model.pojo.Paralelo[] getParalelos() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = asignas.iterator();lIter.hasNext();) {
			lValues.add(((model.pojo.Asigna)lIter.next()).getParalelo());
		}
		return (model.pojo.Paralelo[])lValues.toArray(new model.pojo.Paralelo[lValues.size()]);
	}
	
	public void removeParalelo(model.pojo.Paralelo aParalelo) {
		model.pojo.Asigna[] lAsignas = (model.pojo.Asigna[])asignas.toArray(new model.pojo.Asigna[asignas.size()]);
		for(int i = 0; i < lAsignas.length; i++) {
			if(lAsignas[i].getParalelo().equals(aParalelo)) {
				asignas.remove(lAsignas[i]);
			}
		}
	}
	
	public void addParalelo(model.pojo.Asigna aAsigna, model.pojo.Paralelo aParalelo) {
		aAsigna.setParalelo(aParalelo);
		asignas.add(aAsigna);
	}
	
	public model.pojo.Asigna getAsignaByParalelo(model.pojo.Paralelo aParalelo) {
		model.pojo.Asigna[] lAsignas = (model.pojo.Asigna[])asignas.toArray(new model.pojo.Asigna[asignas.size()]);
		for(int i = 0; i < lAsignas.length; i++) {
			if(lAsignas[i].getParalelo().equals(aParalelo)) {
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
	
	
	public String toString() {
		return String.valueOf(getIdaula());
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
