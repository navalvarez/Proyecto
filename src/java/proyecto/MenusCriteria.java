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

public class MenusCriteria extends AbstractORMCriteria {
	public final IntegerExpression idmenu;
	public final StringExpression nombre;
	public final BooleanExpression activo;
	public final CollectionExpression idrol;
	public final CollectionExpression idpro;
	
	public MenusCriteria(Criteria criteria) {
		super(criteria);
		idmenu = new IntegerExpression("idmenu", this);
		nombre = new StringExpression("nombre", this);
		activo = new BooleanExpression("activo", this);
		idrol = new CollectionExpression("ORM_Idrol", this);
		idpro = new CollectionExpression("ORM_Idpro", this);
	}
	
	public MenusCriteria(PersistentSession session) {
		this(session.createCriteria(Menus.class));
	}
	
	public MenusCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public RolesCriteria createIdrolCriteria() {
		return new RolesCriteria(createCriteria("ORM_Idrol"));
	}
	
	public ProcesosCriteria createIdproCriteria() {
		return new ProcesosCriteria(createCriteria("ORM_Idpro"));
	}
	
	public Menus uniqueMenus() {
		return (Menus) super.uniqueResult();
	}
	
	public Menus[] listMenus() {
		java.util.List list = super.list();
		return (Menus[]) list.toArray(new Menus[list.size()]);
	}
}

