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
public class Director extends model.pojo.Persona implements Serializable {
	public Director() {
	}
	
	private String unidad;
	
	private model.pojo.Ciclo ciclo;
	
	public void setUnidad(String value) {
		this.unidad = value;
	}
	
	public String getUnidad() {
		return unidad;
	}
	
	public void setCiclo(model.pojo.Ciclo value) {
		this.ciclo = value;
	}
	
	public model.pojo.Ciclo getCiclo() {
		return ciclo;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
