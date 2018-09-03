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

public class RolesCriteria extends AbstractORMCriteria {
	public final IntegerExpression idrol;
	public final StringExpression nombre;
	public final BooleanExpression activo;
	public final CollectionExpression idusu;
	public final CollectionExpression idmenu;
	
	public RolesCriteria(Criteria criteria) {
		super(criteria);
		idrol = new IntegerExpression("idrol", this);
		nombre = new StringExpression("nombre", this);
		activo = new BooleanExpression("activo", this);
		idusu = new CollectionExpression("ORM_Idusu", this);
		idmenu = new CollectionExpression("ORM_Idmenu", this);
	}
	
	public RolesCriteria(PersistentSession session) {
		this(session.createCriteria(Roles.class));
	}
	
	public RolesCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public UsuariosCriteria createIdusuCriteria() {
		return new UsuariosCriteria(createCriteria("ORM_Idusu"));
	}
	
	public MenusCriteria createIdmenuCriteria() {
		return new MenusCriteria(createCriteria("ORM_Idmenu"));
	}
	
	public Roles uniqueRoles() {
		return (Roles) super.uniqueResult();
	}
	
	public Roles[] listRoles() {
		java.util.List list = super.list();
		return (Roles[]) list.toArray(new Roles[list.size()]);
	}
}

