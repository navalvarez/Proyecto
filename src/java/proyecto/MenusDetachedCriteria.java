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

public class MenusDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idmenu;
	public final StringExpression nombre;
	public final BooleanExpression activo;
	public final CollectionExpression idrol;
	public final CollectionExpression idpro;
	
	public MenusDetachedCriteria() {
		super(proyecto.Menus.class, proyecto.MenusCriteria.class);
		idmenu = new IntegerExpression("idmenu", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		idrol = new CollectionExpression("ORM_Idrol", this.getDetachedCriteria());
		idpro = new CollectionExpression("ORM_Idpro", this.getDetachedCriteria());
	}
	
	public MenusDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.MenusCriteria.class);
		idmenu = new IntegerExpression("idmenu", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		idrol = new CollectionExpression("ORM_Idrol", this.getDetachedCriteria());
		idpro = new CollectionExpression("ORM_Idpro", this.getDetachedCriteria());
	}
	
	public RolesDetachedCriteria createIdrolCriteria() {
		return new RolesDetachedCriteria(createCriteria("ORM_Idrol"));
	}
	
	public ProcesosDetachedCriteria createIdproCriteria() {
		return new ProcesosDetachedCriteria(createCriteria("ORM_Idpro"));
	}
	
	public Menus uniqueMenus(PersistentSession session) {
		return (Menus) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Menus[] listMenus(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Menus[]) list.toArray(new Menus[list.size()]);
	}
}

