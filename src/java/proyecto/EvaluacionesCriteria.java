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

public class EvaluacionesCriteria extends AbstractORMCriteria {
	public final IntegerExpression idprogId;
	public final AssociationExpression idprog;
	public final IntegerExpression idexamenId;
	public final AssociationExpression idexamen;
	public final ShortExpression nota;
	public final CollectionExpression idopcion;
	
	public EvaluacionesCriteria(Criteria criteria) {
		super(criteria);
		idprogId = new IntegerExpression("ORM_Idprog.idprog", this);
		idprog = new AssociationExpression("ORM_Idprog", this);
		idexamenId = new IntegerExpression("ORM_Idexamen.idexamen", this);
		idexamen = new AssociationExpression("ORM_Idexamen", this);
		nota = new ShortExpression("nota", this);
		idopcion = new CollectionExpression("ORM_Idopcion", this);
	}
	
	public EvaluacionesCriteria(PersistentSession session) {
		this(session.createCriteria(Evaluaciones.class));
	}
	
	public EvaluacionesCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public ProgramacionCriteria createIdprogCriteria() {
		return new ProgramacionCriteria(createCriteria("ORM_Idprog"));
	}
	
	public ExamenesCriteria createIdexamenCriteria() {
		return new ExamenesCriteria(createCriteria("ORM_Idexamen"));
	}
	
	public OpcionesCriteria createIdopcionCriteria() {
		return new OpcionesCriteria(createCriteria("ORM_Idopcion"));
	}
	
	public Evaluaciones uniqueEvaluaciones() {
		return (Evaluaciones) super.uniqueResult();
	}
	
	public Evaluaciones[] listEvaluaciones() {
		java.util.List list = super.list();
		return (Evaluaciones[]) list.toArray(new Evaluaciones[list.size()]);
	}
}

