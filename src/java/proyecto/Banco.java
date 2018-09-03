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
/**
 * Banco de preguntas o enunciados para las evaluaciones
 */
public class Banco implements Serializable {
	public Banco() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_BANCO_OPCIONES) {
			return ORM_opciones;
		}
		else if (key == ORMConstants.KEY_BANCO_PREGUNTAS) {
			return ORM_preguntas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_BANCO_IDDICTA) {
			this.iddicta = (proyecto.Dicta) owner;
		}
		
		else if (key == ORMConstants.KEY_BANCO_IDTIPO) {
			this.idtipo = (proyecto.Tipo) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idbanco;
	
	private String enunciado;
	
	private String imagen;
	
	private short tema;
	
	private Short subtema;
	
	private char dificultad;
	
	private boolean activo;
	
	private proyecto.Dicta iddicta;
	
	private proyecto.Tipo idtipo;
	
	private java.util.Set ORM_opciones = new java.util.HashSet();
	
	private java.util.Set ORM_preguntas = new java.util.HashSet();
	
	/**
	 * Identificador de cada pregunta del banco de preguntas
	 */
	private void setIdbanco(int value) {
		this.idbanco = value;
	}
	
	/**
	 * Identificador de cada pregunta del banco de preguntas
	 */
	public int getIdbanco() {
		return idbanco;
	}
	
	public int getORMID() {
		return getIdbanco();
	}
	
	/**
	 * Texto del pregunta o enunciado
	 */
	public void setEnunciado(String value) {
		this.enunciado = value;
	}
	
	/**
	 * Texto del pregunta o enunciado
	 */
	public String getEnunciado() {
		return enunciado;
	}
	
	/**
	 * ruta y nombre de la imagen que acompaña al enunciado
	 */
	public void setImagen(String value) {
		this.imagen = value;
	}
	
	/**
	 * ruta y nombre de la imagen que acompaña al enunciado
	 */
	public String getImagen() {
		return imagen;
	}
	
	/**
	 * Tema de la materia al que corresponde el enunciado
	 */
	public void setTema(short value) {
		this.tema = value;
	}
	
	/**
	 * Tema de la materia al que corresponde el enunciado
	 */
	public short getTema() {
		return tema;
	}
	
	/**
	 * Subtítulo del tema
	 */
	public void setSubtema(short value) {
		setSubtema(new Short(value));
	}
	
	/**
	 * Subtítulo del tema
	 */
	public void setSubtema(Short value) {
		this.subtema = value;
	}
	
	/**
	 * Subtítulo del tema
	 */
	public Short getSubtema() {
		return subtema;
	}
	
	/**
	 * Grado de dificultad de la pregunta: 1 a 5
	 */
	public void setDificultad(char value) {
		this.dificultad = value;
	}
	
	/**
	 * Grado de dificultad de la pregunta: 1 a 5
	 */
	public char getDificultad() {
		return dificultad;
	}
	
	/**
	 * True, vigente. False, dado de baja
	 */
	public void setActivo(boolean value) {
		this.activo = value;
	}
	
	/**
	 * True, vigente. False, dado de baja
	 */
	public boolean getActivo() {
		return activo;
	}
	
	public void setIddicta(proyecto.Dicta value) {
		if (iddicta != null) {
			iddicta.banco.remove(this);
		}
		if (value != null) {
			value.banco.add(this);
		}
	}
	
	public proyecto.Dicta getIddicta() {
		return iddicta;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Iddicta(proyecto.Dicta value) {
		this.iddicta = value;
	}
	
	private proyecto.Dicta getORM_Iddicta() {
		return iddicta;
	}
	
	public void setIdtipo(proyecto.Tipo value) {
		if (idtipo != null) {
			idtipo.banco.remove(this);
		}
		if (value != null) {
			value.banco.add(this);
		}
	}
	
	public proyecto.Tipo getIdtipo() {
		return idtipo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Idtipo(proyecto.Tipo value) {
		this.idtipo = value;
	}
	
	private proyecto.Tipo getORM_Idtipo() {
		return idtipo;
	}
	
	private void setORM_Opciones(java.util.Set value) {
		this.ORM_opciones = value;
	}
	
	private java.util.Set getORM_Opciones() {
		return ORM_opciones;
	}
	
	public final proyecto.OpcionesSetCollection opciones = new proyecto.OpcionesSetCollection(this, _ormAdapter, ORMConstants.KEY_BANCO_OPCIONES, ORMConstants.KEY_OPCIONES_IDBANCO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Preguntas(java.util.Set value) {
		this.ORM_preguntas = value;
	}
	
	private java.util.Set getORM_Preguntas() {
		return ORM_preguntas;
	}
	
	public final proyecto.PreguntasSetCollection preguntas = new proyecto.PreguntasSetCollection(this, _ormAdapter, ORMConstants.KEY_BANCO_PREGUNTAS, ORMConstants.KEY_PREGUNTAS_IDBANCO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdbanco());
	}
	
}
