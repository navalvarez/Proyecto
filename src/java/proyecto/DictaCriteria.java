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

public class DictaCriteria extends AbstractORMCriteria {
	public final IntegerExpression iddicta;
	public final IntegerExpression idusuId;
	public final AssociationExpression idusu;
	public final AssociationExpression idcarr;
	public final StringExpression gestion;
	public final CollectionExpression banco;
	public final CollectionExpression examenes;
	
	public DictaCriteria(Criteria criteria) {
		super(criteria);
		iddicta = new IntegerExpression("iddicta", this);
		idusuId = new IntegerExpression("ORM_Idusu.", this);
		idusu = new AssociationExpression("ORM_Idusu", this);
		idcarr = new AssociationExpression("idcarr", this);
		gestion = new StringExpression("gestion", this);
		banco = new CollectionExpression("ORM_Banco", this);
		examenes = new CollectionExpression("ORM_Examenes", this);
	}
	
	public DictaCriteria(PersistentSession session) {
		this(session.createCriteria(Dicta.class));
	}
	
	public DictaCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public DocentesCriteria createIdusuCriteria() {
		return new DocentesCriteria(createCriteria("ORM_Idusu"));
	}
	
	public MateriasCriteria createIdcarrCriteria() {
		return new MateriasCriteria(createCriteria("idcarr"));
	}
	
	public BancoCriteria createBancoCriteria() {
		return new BancoCriteria(createCriteria("ORM_Banco"));
	}
	
	public ExamenesCriteria createExamenesCriteria() {
		return new ExamenesCriteria(createCriteria("ORM_Examenes"));
	}
	
	public Dicta uniqueDicta() {
		return (Dicta) super.uniqueResult();
	}
	
	public Dicta[] listDicta() {
		java.util.List list = super.list();
		return (Dicta[]) list.toArray(new Dicta[list.size()]);
	}
}

