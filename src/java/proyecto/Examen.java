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
package proyecto;

import java.io.Serializable;
public class Examen implements Serializable {
	public Examen() {
	}
	
	private Integer idusu;
	
	private String nombre;
	
	private String apellido1;
	
	private String apellido2;
	
	private Short nota;
	
	private void setIdusu(int value) {
		setIdusu(new Integer(value));
	}
	
	private void setIdusu(Integer value) {
		this.idusu = value;
	}
	
	public Integer getIdusu() {
		return idusu;
	}
	
	public Integer getORMID() {
		return getIdusu();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido1(String value) {
		this.apellido1 = value;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public void setApellido2(String value) {
		this.apellido2 = value;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public void setNota(short value) {
		setNota(new Short(value));
	}
	
	public void setNota(Short value) {
		this.nota = value;
	}
	
	public Short getNota() {
		return nota;
	}
	
	public String toString() {
		return String.valueOf(getIdusu());
	}
	
}
