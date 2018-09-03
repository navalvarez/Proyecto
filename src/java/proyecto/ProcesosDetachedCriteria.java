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

public class ProcesosDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idpro;
	public final StringExpression nombre;
	public final StringExpression enlace;
	public final StringExpression descripcion;
	public final CollectionExpression idmenu;
	
	public ProcesosDetachedCriteria() {
		super(proyecto.Procesos.class, proyecto.ProcesosCriteria.class);
		idpro = new IntegerExpression("idpro", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		enlace = new StringExpression("enlace", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		idmenu = new CollectionExpression("ORM_Idmenu", this.getDetachedCriteria());
	}
	
	public ProcesosDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.ProcesosCriteria.class);
		idpro = new IntegerExpression("idpro", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		enlace = new StringExpression("enlace", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		idmenu = new CollectionExpression("ORM_Idmenu", this.getDetachedCriteria());
	}
	
	public MenusDetachedCriteria createIdmenuCriteria() {
		return new MenusDetachedCriteria(createCriteria("ORM_Idmenu"));
	}
	
	public Procesos uniqueProcesos(PersistentSession session) {
		return (Procesos) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Procesos[] listProcesos(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Procesos[]) list.toArray(new Procesos[list.size()]);
	}
}

