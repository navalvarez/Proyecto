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

public class TipoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idtipo;
	public final StringExpression nombre;
	public final BooleanExpression activo;
	public final CollectionExpression banco;
	
	public TipoDetachedCriteria() {
		super(proyecto.Tipo.class, proyecto.TipoCriteria.class);
		idtipo = new IntegerExpression("idtipo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		banco = new CollectionExpression("ORM_Banco", this.getDetachedCriteria());
	}
	
	public TipoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.TipoCriteria.class);
		idtipo = new IntegerExpression("idtipo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		banco = new CollectionExpression("ORM_Banco", this.getDetachedCriteria());
	}
	
	public BancoDetachedCriteria createBancoCriteria() {
		return new BancoDetachedCriteria(createCriteria("ORM_Banco"));
	}
	
	public Tipo uniqueTipo(PersistentSession session) {
		return (Tipo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tipo[] listTipo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tipo[]) list.toArray(new Tipo[list.size()]);
	}
}

