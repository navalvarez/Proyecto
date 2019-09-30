package modelo;

import java.io.*;

public class Persona implements Serializable {

	private String ci;
	private String nombre;
	private String ap;
	private String am;
	private int edad;
	private String correo;

	public String getCi() {
		return this.ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAp() {
		return this.ap;
	}

	public void setAp(String ap) {
		this.ap = ap;
	}

	public String getAm() {
		return this.am;
	}

	public void setAm(String am) {
		this.am = am;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}