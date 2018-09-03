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

public class OpcionesDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idopcion;
	public final IntegerExpression idbancoId;
	public final AssociationExpression idbanco;
	public final StringExpression opcion;
	public final BooleanExpression correcta;
	public final CollectionExpression idprog;
	
	public OpcionesDetachedCriteria() {
		super(proyecto.Opciones.class, proyecto.OpcionesCriteria.class);
		idopcion = new IntegerExpression("idopcion", this.getDetachedCriteria());
		idbancoId = new IntegerExpression("idbanco.idbanco", this.getDetachedCriteria());
		idbanco = new AssociationExpression("idbanco", this.getDetachedCriteria());
		opcion = new StringExpression("opcion", this.getDetachedCriteria());
		correcta = new BooleanExpression("correcta", this.getDetachedCriteria());
		idprog = new CollectionExpression("ORM_Idprog", this.getDetachedCriteria());
	}
	
	public OpcionesDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.OpcionesCriteria.class);
		idopcion = new IntegerExpression("idopcion", this.getDetachedCriteria());
		idbancoId = new IntegerExpression("idbanco.idbanco", this.getDetachedCriteria());
		idbanco = new AssociationExpression("idbanco", this.getDetachedCriteria());
		opcion = new StringExpression("opcion", this.getDetachedCriteria());
		correcta = new BooleanExpression("correcta", this.getDetachedCriteria());
		idprog = new CollectionExpression("ORM_Idprog", this.getDetachedCriteria());
	}
	
	public BancoDetachedCriteria createIdbancoCriteria() {
		return new BancoDetachedCriteria(createCriteria("idbanco"));
	}
	
	public EvaluacionesDetachedCriteria createIdprogCriteria() {
		return new EvaluacionesDetachedCriteria(createCriteria("ORM_Idprog"));
	}
	
	public Opciones uniqueOpciones(PersistentSession session) {
		return (Opciones) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Opciones[] listOpciones(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Opciones[]) list.toArray(new Opciones[list.size()]);
	}
}

