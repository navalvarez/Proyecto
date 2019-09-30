package modelo;

/**
 * @author richards
 */
public class Estudiante {

	private String nombre;
	private String Apellidos;
	private String email;
	private String contrasena;
	private String sexo;
	private String nivel;
	private String diasemana;
	private String opinion;
	private String[] tema;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.Apellidos;
	}

	public void setApellidos(String Apellidos) {
		this.Apellidos = Apellidos;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNivel() {
		return this.nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getDiasemana() {
		return this.diasemana;
	}

	public String getOpinion() {
		return this.opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public String[] getTema() {
		return this.tema;
	}

	public void setTema(String[] tema) {
		this.tema = tema;
	}

}