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

public class RolesDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idrol;
	public final StringExpression nombre;
	public final BooleanExpression activo;
	public final CollectionExpression idusu;
	public final CollectionExpression idmenu;
	
	public RolesDetachedCriteria() {
		super(proyecto.Roles.class, proyecto.RolesCriteria.class);
		idrol = new IntegerExpression("idrol", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		idusu = new CollectionExpression("ORM_Idusu", this.getDetachedCriteria());
		idmenu = new CollectionExpression("ORM_Idmenu", this.getDetachedCriteria());
	}
	
	public RolesDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.RolesCriteria.class);
		idrol = new IntegerExpression("idrol", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		idusu = new CollectionExpression("ORM_Idusu", this.getDetachedCriteria());
		idmenu = new CollectionExpression("ORM_Idmenu", this.getDetachedCriteria());
	}
	
	public UsuariosDetachedCriteria createIdusuCriteria() {
		return new UsuariosDetachedCriteria(createCriteria("ORM_Idusu"));
	}
	
	public MenusDetachedCriteria createIdmenuCriteria() {
		return new MenusDetachedCriteria(createCriteria("ORM_Idmenu"));
	}
	
	public Roles uniqueRoles(PersistentSession session) {
		return (Roles) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Roles[] listRoles(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Roles[]) list.toArray(new Roles[list.size()]);
	}
}

