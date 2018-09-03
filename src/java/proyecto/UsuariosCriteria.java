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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UsuariosCriteria extends AbstractORMCriteria {
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
	
	public UsuariosCriteria(Criteria criteria) {
		super(criteria);
		idusu = new IntegerExpression("idusu", this);
		nombre = new StringExpression("nombre", this);
		apellido1 = new StringExpression("apellido1", this);
		apellido2 = new StringExpression("apellido2", this);
		sexo = new CharacterExpression("sexo", this);
		f_nac = new DateExpression("f_nac", this);
		cedula = new StringExpression("cedula", this);
		telefono = new StringExpression("telefono", this);
		direccion = new StringExpression("direccion", this);
		foto = new StringExpression("foto", this);
		activo = new BooleanExpression("activo", this);
		idrol = new CollectionExpression("ORM_Idrol", this);
		datos = new CollectionExpression("ORM_Datos", this);
		docentesId = new IntegerExpression("docentes.idusu", this);
		docentes = new AssociationExpression("docentes", this);
		universitariosId = new IntegerExpression("universitarios.idusu", this);
		universitarios = new AssociationExpression("universitarios", this);
	}
	
	public UsuariosCriteria(PersistentSession session) {
		this(session.createCriteria(Usuarios.class));
	}
	
	public UsuariosCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public RolesCriteria createIdrolCriteria() {
		return new RolesCriteria(createCriteria("ORM_Idrol"));
	}
	
	public DatosCriteria createDatosCriteria() {
		return new DatosCriteria(createCriteria("ORM_Datos"));
	}
	
	public DocentesCriteria createDocentesCriteria() {
		return new DocentesCriteria(createCriteria("docentes"));
	}
	
	public UniversitariosCriteria createUniversitariosCriteria() {
		return new UniversitariosCriteria(createCriteria("universitarios"));
	}
	
	public Usuarios uniqueUsuarios() {
		return (Usuarios) super.uniqueResult();
	}
	
	public Usuarios[] listUsuarios() {
		java.util.List list = super.list();
		return (Usuarios[]) list.toArray(new Usuarios[list.size()]);
	}
}

