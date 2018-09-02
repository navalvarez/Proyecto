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
public class Vmatricula implements Serializable {
	public Vmatricula() {
	}
	
	private long id;
	
	private String idparalelo;
	
	private Integer estudianteci;
	
	private java.util.Date fecha;
	
	private void setId(long value) {
		this.id = value;
	}
	
	public long getId() {
		return id;
	}
	
	public long getORMID() {
		return getId();
	}
	
	private void setIdparalelo(String value) {
		this.idparalelo = value;
	}
	
	public String getIdparalelo() {
		return idparalelo;
	}
	
	private void setEstudianteci(int value) {
		setEstudianteci(new Integer(value));
	}
	
	private void setEstudianteci(Integer value) {
		this.estudianteci = value;
	}
	
	public Integer getEstudianteci() {
		return estudianteci;
	}
	
	private void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
