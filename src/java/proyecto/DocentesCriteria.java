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

public class DocentesCriteria extends AbstractORMCriteria {
	public final IntegerExpression idusuId;
	public final AssociationExpression idusu;
	public final BooleanExpression auxiliar;
	public final CollectionExpression dicta;
	
	public DocentesCriteria(Criteria criteria) {
		super(criteria);
		idusuId = new IntegerExpression("idusu.idusu", this);
		idusu = new AssociationExpression("idusu", this);
		auxiliar = new BooleanExpression("auxiliar", this);
		dicta = new CollectionExpression("ORM_Dicta", this);
	}
	
	public DocentesCriteria(PersistentSession session) {
		this(session.createCriteria(Docentes.class));
	}
	
	public DocentesCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public UsuariosCriteria createIdusuCriteria() {
		return new UsuariosCriteria(createCriteria("idusu"));
	}
	
	public DictaCriteria createDictaCriteria() {
		return new DictaCriteria(createCriteria("ORM_Dicta"));
	}
	
	public Docentes uniqueDocentes() {
		return (Docentes) super.uniqueResult();
	}
	
	public Docentes[] listDocentes() {
		java.util.List list = super.list();
		return (Docentes[]) list.toArray(new Docentes[list.size()]);
	}
}

