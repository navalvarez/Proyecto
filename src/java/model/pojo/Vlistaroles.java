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
public class Vlistaroles implements Serializable {
	public Vlistaroles() {
	}
	
	private long ID;
	
	private String usuario;
	
	private String contrasena;
	
	private String nombre;
	
	private String ap;
	
	private String am;
	
	private Boolean estado;
	
	private String rol;
	
	private void setID(long value) {
		this.ID = value;
	}
	
	public long getID() {
		return ID;
	}
	
	public long getORMID() {
		return getID();
	}
	
	private void setUsuario(String value) {
		this.usuario = value;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	private void setContrasena(String value) {
		this.contrasena = value;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	private void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setAp(String value) {
		this.ap = value;
	}
	
	public String getAp() {
		return ap;
	}
	
	private void setAm(String value) {
		this.am = value;
	}
	
	public String getAm() {
		return am;
	}
	
	private void setEstado(boolean value) {
		setEstado(new Boolean(value));
	}
	
	private void setEstado(Boolean value) {
		this.estado = value;
	}
	
	public Boolean getEstado() {
		return estado;
	}
	
	private void setRol(String value) {
		this.rol = value;
	}
	
	public String getRol() {
		return rol;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
