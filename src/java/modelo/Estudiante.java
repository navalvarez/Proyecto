/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
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
        return nombre;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getDiasemana() {
        return diasemana;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

/*private String nivelestudio;
private String interesesmusica;
private String interesesdeportes;
private String interesescine;
private String intereseslibros;
private String interesesciencia;*/

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void setTema(String[] tema) {
        this.tema = tema;
    }
    public String[] getTema() {
        return tema;
    }


}
