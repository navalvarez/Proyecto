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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UsuariosDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idusu;
	public final StringExpression nombre;
	public final StringExpression apellido1;
	public final StringExpression apellido2;
	public final CharacterExpression sexo;
	public final DateExpression f_nac;
	public final StringExpression cedula;
	public final StringExpression telefono;
	public final StringExpression direccion;
	public final StringExpression foto;
	public final BooleanExpression activo;
	public final CollectionExpression idrol;
	public final CollectionExpression datos;
	public final IntegerExpression docentesId;
	public final AssociationExpression docentes;
	public final IntegerExpression universitariosId;
	public final AssociationExpression universitarios;
	
	public UsuariosDetachedCriteria() {
		super(proyecto.Usuarios.class, proyecto.UsuariosCriteria.class);
		idusu = new IntegerExpression("idusu", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido1 = new StringExpression("apellido1", this.getDetachedCriteria());
		apellido2 = new StringExpression("apellido2", this.getDetachedCriteria());
		sexo = new CharacterExpression("sexo", this.getDetachedCriteria());
		f_nac = new DateExpression("f_nac", this.getDetachedCriteria());
		cedula = new StringExpression("cedula", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		idrol = new CollectionExpression("ORM_Idrol", this.getDetachedCriteria());
		datos = new CollectionExpression("ORM_Datos", this.getDetachedCriteria());
		docentesId = new IntegerExpression("docentes.idusu", this.getDetachedCriteria());
		docentes = new AssociationExpression("docentes", this.getDetachedCriteria());
		universitariosId = new IntegerExpression("universitarios.idusu", this.getDetachedCriteria());
		universitarios = new AssociationExpression("universitarios", this.getDetachedCriteria());
	}
	
	public UsuariosDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.UsuariosCriteria.class);
		idusu = new IntegerExpression("idusu", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido1 = new StringExpression("apellido1", this.getDetachedCriteria());
		apellido2 = new StringExpression("apellido2", this.getDetachedCriteria());
		sexo = new CharacterExpression("sexo", this.getDetachedCriteria());
		f_nac = new DateExpression("f_nac", this.getDetachedCriteria());
		cedula = new StringExpression("cedula", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		idrol = new CollectionExpression("ORM_Idrol", this.getDetachedCriteria());
		datos = new CollectionExpression("ORM_Datos", this.getDetachedCriteria());
		docentesId = new IntegerExpression("docentes.idusu", this.getDetachedCriteria());
		docentes = new AssociationExpression("docentes", this.getDetachedCriteria());
		universitariosId = new IntegerExpression("universitarios.idusu", this.getDetachedCriteria());
		universitarios = new AssociationExpression("universitarios", this.getDetachedCriteria());
	}
	
	public RolesDetachedCriteria createIdrolCriteria() {
		return new RolesDetachedCriteria(createCriteria("ORM_Idrol"));
	}
	
	public DatosDetachedCriteria createDatosCriteria() {
		return new DatosDetachedCriteria(createCriteria("ORM_Datos"));
	}
	
	public DocentesDetachedCriteria createDocentesCriteria() {
		return new DocentesDetachedCriteria(createCriteria("docentes"));
	}
	
	public UniversitariosDetachedCriteria createUniversitariosCriteria() {
		return new UniversitariosDetachedCriteria(createCriteria("universitarios"));
	}
	
	public Usuarios uniqueUsuarios(PersistentSession session) {
		return (Usuarios) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuarios[] listUsuarios(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuarios[]) list.toArray(new Usuarios[list.size()]);
	}
}

