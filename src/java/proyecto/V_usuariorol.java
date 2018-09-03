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
public class V_usuariorol implements Serializable {
	public V_usuariorol() {
	}
	
	private Long id;
	
	private Integer idusu;
	
	private String unombre;
	
	private String apellido1;
	
	private String apellido2;
	
	private String nombre;
	
	private String login;
	
	private String password;
	
	private Boolean activo;
	
	private void setId(long value) {
		setId(new Long(value));
	}
	
	private void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return id;
	}
	
	public Long getORMID() {
		return getId();
	}
	
	private void setIdusu(int value) {
		setIdusu(new Integer(value));
	}
	
	private void setIdusu(Integer value) {
		this.idusu = value;
	}
	
	public Integer getIdusu() {
		return idusu;
	}
	
	private void setUnombre(String value) {
		this.unombre = value;
	}
	
	public String getUnombre() {
		return unombre;
	}
	
	private void setApellido1(String value) {
		this.apellido1 = value;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	private void setApellido2(String value) {
		this.apellido2 = value;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	private void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setLogin(String value) {
		this.login = value;
	}
	
	public String getLogin() {
		return login;
	}
	
	private void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	private void setActivo(boolean value) {
		setActivo(new Boolean(value));
	}
	
	private void setActivo(Boolean value) {
		this.activo = value;
	}
	
	public Boolean getActivo() {
		return activo;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
