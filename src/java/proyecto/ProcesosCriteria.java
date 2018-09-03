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

public class ProcesosCriteria extends AbstractORMCriteria {
	public final IntegerExpression idpro;
	public final StringExpression nombre;
	public final StringExpression enlace;
	public final StringExpression descripcion;
	public final CollectionExpression idmenu;
	
	public ProcesosCriteria(Criteria criteria) {
		super(criteria);
		idpro = new IntegerExpression("idpro", this);
		nombre = new StringExpression("nombre", this);
		enlace = new StringExpression("enlace", this);
		descripcion = new StringExpression("descripcion", this);
		idmenu = new CollectionExpression("ORM_Idmenu", this);
	}
	
	public ProcesosCriteria(PersistentSession session) {
		this(session.createCriteria(Procesos.class));
	}
	
	public ProcesosCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public MenusCriteria createIdmenuCriteria() {
		return new MenusCriteria(createCriteria("ORM_Idmenu"));
	}
	
	public Procesos uniqueProcesos() {
		return (Procesos) super.uniqueResult();
	}
	
	public Procesos[] listProcesos() {
		java.util.List list = super.list();
		return (Procesos[]) list.toArray(new Procesos[list.size()]);
	}
}

