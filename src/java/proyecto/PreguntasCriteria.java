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

public class PreguntasCriteria extends AbstractORMCriteria {
	public final IntegerExpression idexamenId;
	public final AssociationExpression idexamen;
	public final IntegerExpression idbancoId;
	public final AssociationExpression idbanco;
	public final ShortExpression ponderacion;
	
	public PreguntasCriteria(Criteria criteria) {
		super(criteria);
		idexamenId = new IntegerExpression("ORM_Idexamen.idexamen", this);
		idexamen = new AssociationExpression("ORM_Idexamen", this);
		idbancoId = new IntegerExpression("ORM_Idbanco.idbanco", this);
		idbanco = new AssociationExpression("ORM_Idbanco", this);
		ponderacion = new ShortExpression("ponderacion", this);
	}
	
	public PreguntasCriteria(PersistentSession session) {
		this(session.createCriteria(Preguntas.class));
	}
	
	public PreguntasCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public ExamenesCriteria createIdexamenCriteria() {
		return new ExamenesCriteria(createCriteria("ORM_Idexamen"));
	}
	
	public BancoCriteria createIdbancoCriteria() {
		return new BancoCriteria(createCriteria("ORM_Idbanco"));
	}
	
	public Preguntas uniquePreguntas() {
		return (Preguntas) super.uniqueResult();
	}
	
	public Preguntas[] listPreguntas() {
		java.util.List list = super.list();
		return (Preguntas[]) list.toArray(new Preguntas[list.size()]);
	}
}

