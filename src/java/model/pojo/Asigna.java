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
public class Asigna implements Serializable {
	public Asigna() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Asigna))
			return false;
		Asigna asigna = (Asigna)aObj;
		if (getAula() == null) {
			if (asigna.getAula() != null)
				return false;
		}
		else if (!getAula().equals(asigna.getAula()))
			return false;
		if (getParalelo() == null) {
			if (asigna.getParalelo() != null)
				return false;
		}
		else if (!getParalelo().equals(asigna.getParalelo()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getAula() != null) {
			hashcode = hashcode + (getAula().getORMID() == null ? 0 : getAula().getORMID().hashCode());
		}
		if (getParalelo() != null) {
			hashcode = hashcode + (getParalelo().getORMID() == null ? 0 : getParalelo().getORMID().hashCode());
		}
		return hashcode;
	}
	
	private model.pojo.Aula aula;
	
	private String aulaId;
	
	private void setAulaId(String value) {
		this.aulaId = value;
	}
	
	public String getAulaId() {
		return aulaId;
	}
	
	private model.pojo.Paralelo paralelo;
	
	private String paraleloId;
	
	private void setParaleloId(String value) {
		this.paraleloId = value;
	}
	
	public String getParaleloId() {
		return paraleloId;
	}
	
	private String horaentrada;
	
	private String horasalida;
	
	private String anno;
	
	private boolean estado = true;
	
	private java.util.Date fecha;
	
	public void setHoraentrada(String value) {
		this.horaentrada = value;
	}
	
	public String getHoraentrada() {
		return horaentrada;
	}
	
	public void setHorasalida(String value) {
		this.horasalida = value;
	}
	
	public String getHorasalida() {
		return horasalida;
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
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setParalelo(model.pojo.Paralelo value) {
		this.paralelo = value;
	}
	
	public model.pojo.Paralelo getParalelo() {
		return paralelo;
	}
	
	public void setAula(model.pojo.Aula value) {
		this.aula = value;
	}
	
	public model.pojo.Aula getAula() {
		return aula;
	}
	
	public String toString() {
		return String.valueOf(((getAula() == null) ? "" : String.valueOf(getAula().getORMID())) + " " + ((getParalelo() == null) ? "" : String.valueOf(getParalelo().getORMID())));
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
