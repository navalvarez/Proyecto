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

public class V_usuariorolCriteria extends AbstractORMCriteria {
	public final LongExpression id;
	public final IntegerExpression idusu;
	public final StringExpression unombre;
	public final StringExpression apellido1;
	public final StringExpression apellido2;
	public final StringExpression nombre;
	public final StringExpression login;
	public final StringExpression password;
	public final BooleanExpression activo;
	
	public V_usuariorolCriteria(Criteria criteria) {
		super(criteria);
		id = new LongExpression("id", this);
		idusu = new IntegerExpression("idusu", this);
		unombre = new StringExpression("unombre", this);
		apellido1 = new StringExpression("apellido1", this);
		apellido2 = new StringExpression("apellido2", this);
		nombre = new StringExpression("nombre", this);
		login = new StringExpression("login", this);
		password = new StringExpression("password", this);
		activo = new BooleanExpression("activo", this);
	}
	
	public V_usuariorolCriteria(PersistentSession session) {
		this(session.createCriteria(V_usuariorol.class));
	}
	
	public V_usuariorolCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public V_usuariorol uniqueV_usuariorol() {
		return (V_usuariorol) super.uniqueResult();
	}
	
	public V_usuariorol[] listV_usuariorol() {
		java.util.List list = super.list();
		return (V_usuariorol[]) list.toArray(new V_usuariorol[list.size()]);
	}
}

