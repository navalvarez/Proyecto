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

public class OpcionesCriteria extends AbstractORMCriteria {
	public final IntegerExpression idopcion;
	public final IntegerExpression idbancoId;
	public final AssociationExpression idbanco;
	public final StringExpression opcion;
	public final BooleanExpression correcta;
	public final CollectionExpression idprog;
	
	public OpcionesCriteria(Criteria criteria) {
		super(criteria);
		idopcion = new IntegerExpression("idopcion", this);
		idbancoId = new IntegerExpression("idbanco.idbanco", this);
		idbanco = new AssociationExpression("idbanco", this);
		opcion = new StringExpression("opcion", this);
		correcta = new BooleanExpression("correcta", this);
		idprog = new CollectionExpression("ORM_Idprog", this);
	}
	
	public OpcionesCriteria(PersistentSession session) {
		this(session.createCriteria(Opciones.class));
	}
	
	public OpcionesCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public BancoCriteria createIdbancoCriteria() {
		return new BancoCriteria(createCriteria("idbanco"));
	}
	
	public EvaluacionesCriteria createIdprogCriteria() {
		return new EvaluacionesCriteria(createCriteria("ORM_Idprog"));
	}
	
	public Opciones uniqueOpciones() {
		return (Opciones) super.uniqueResult();
	}
	
	public Opciones[] listOpciones() {
		java.util.List list = super.list();
		return (Opciones[]) list.toArray(new Opciones[list.size()]);
	}
}

