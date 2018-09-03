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

public class TipoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idtipo;
	public final StringExpression nombre;
	public final BooleanExpression activo;
	public final CollectionExpression banco;
	
	public TipoCriteria(Criteria criteria) {
		super(criteria);
		idtipo = new IntegerExpression("idtipo", this);
		nombre = new StringExpression("nombre", this);
		activo = new BooleanExpression("activo", this);
		banco = new CollectionExpression("ORM_Banco", this);
	}
	
	public TipoCriteria(PersistentSession session) {
		this(session.createCriteria(Tipo.class));
	}
	
	public TipoCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public BancoCriteria createBancoCriteria() {
		return new BancoCriteria(createCriteria("ORM_Banco"));
	}
	
	public Tipo uniqueTipo() {
		return (Tipo) super.uniqueResult();
	}
	
	public Tipo[] listTipo() {
		java.util.List list = super.list();
		return (Tipo[]) list.toArray(new Tipo[list.size()]);
	}
}

