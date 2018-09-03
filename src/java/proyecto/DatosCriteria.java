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

public class DatosCriteria extends AbstractORMCriteria {
	public final IntegerExpression idusuId;
	public final AssociationExpression idusu;
	public final StringExpression login;
	public final StringExpression password;
	public final BooleanExpression activo;
	
	public DatosCriteria(Criteria criteria) {
		super(criteria);
		idusuId = new IntegerExpression("ORM_Idusu.idusu", this);
		idusu = new AssociationExpression("ORM_Idusu", this);
		login = new StringExpression("login", this);
		password = new StringExpression("password", this);
		activo = new BooleanExpression("activo", this);
	}
	
	public DatosCriteria(PersistentSession session) {
		this(session.createCriteria(Datos.class));
	}
	
	public DatosCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public UsuariosCriteria createIdusuCriteria() {
		return new UsuariosCriteria(createCriteria("ORM_Idusu"));
	}
	
	public Datos uniqueDatos() {
		return (Datos) super.uniqueResult();
	}
	
	public Datos[] listDatos() {
		java.util.List list = super.list();
		return (Datos[]) list.toArray(new Datos[list.size()]);
	}
}

