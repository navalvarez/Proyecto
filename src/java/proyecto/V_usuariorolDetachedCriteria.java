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

public class V_usuariorolDetachedCriteria extends AbstractORMDetachedCriteria {
	public final LongExpression id;
	public final IntegerExpression idusu;
	public final StringExpression unombre;
	public final StringExpression apellido1;
	public final StringExpression apellido2;
	public final StringExpression nombre;
	public final StringExpression login;
	public final StringExpression password;
	public final BooleanExpression activo;
	
	public V_usuariorolDetachedCriteria() {
		super(proyecto.V_usuariorol.class, proyecto.V_usuariorolCriteria.class);
		id = new LongExpression("id", this.getDetachedCriteria());
		idusu = new IntegerExpression("idusu", this.getDetachedCriteria());
		unombre = new StringExpression("unombre", this.getDetachedCriteria());
		apellido1 = new StringExpression("apellido1", this.getDetachedCriteria());
		apellido2 = new StringExpression("apellido2", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
	}
	
	public V_usuariorolDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.V_usuariorolCriteria.class);
		id = new LongExpression("id", this.getDetachedCriteria());
		idusu = new IntegerExpression("idusu", this.getDetachedCriteria());
		unombre = new StringExpression("unombre", this.getDetachedCriteria());
		apellido1 = new StringExpression("apellido1", this.getDetachedCriteria());
		apellido2 = new StringExpression("apellido2", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
	}
	
	public V_usuariorol uniqueV_usuariorol(PersistentSession session) {
		return (V_usuariorol) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public V_usuariorol[] listV_usuariorol(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (V_usuariorol[]) list.toArray(new V_usuariorol[list.size()]);
	}
}

