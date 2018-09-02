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
public abstract class Persona implements Serializable {
	public Persona() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Persona))
			return false;
		Persona persona = (Persona)aObj;
		if (getCi() != persona.getCi())
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getCi();
		return hashcode;
	}
	
	private int ci;
	
	private String nombre;
	
	private String ap;
	
	private String am;
	
	private String correo;
	
	private String telefono;
	
	private String usuario;
	
	private String contrasena;
	
	private String direccion;
	
	private String imagen;
	
	private boolean estado = true;
	
	public void setCi(int value) {
		this.ci = value;
	}
	
	public int getCi() {
		return ci;
	}
	
	public int getORMID() {
		return getCi();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setAp(String value) {
		this.ap = value;
	}
	
	public String getAp() {
		return ap;
	}
	
	public void setAm(String value) {
		this.am = value;
	}
	
	public String getAm() {
		return am;
	}
	
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setUsuario(String value) {
		this.usuario = value;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setContrasena(String value) {
		this.contrasena = value;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setImagen(String value) {
		this.imagen = value;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public void setEstado(boolean value) {
		this.estado = value;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public String nombreCompleto(String pnombre, String pap, String pam) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getCi());
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
