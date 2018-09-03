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

public class ExamenesCriteria extends AbstractORMCriteria {
	public final IntegerExpression idexamen;
	public final StringExpression nombre;
	public final DateExpression fecha;
	public final TimeExpression hora_ini;
	public final TimeExpression hora_fin;
	public final ShortExpression penalizacion;
	public final BooleanExpression activo;
	public final AssociationExpression iddicta;
	public final CollectionExpression evaluaciones;
	public final CollectionExpression preguntas;
	
	public ExamenesCriteria(Criteria criteria) {
		super(criteria);
		idexamen = new IntegerExpression("idexamen", this);
		nombre = new StringExpression("nombre", this);
		fecha = new DateExpression("fecha", this);
		hora_ini = new TimeExpression("hora_ini", this);
		hora_fin = new TimeExpression("hora_fin", this);
		penalizacion = new ShortExpression("penalizacion", this);
		activo = new BooleanExpression("activo", this);
		iddicta = new AssociationExpression("iddicta", this);
		evaluaciones = new CollectionExpression("ORM_Evaluaciones", this);
		preguntas = new CollectionExpression("ORM_Preguntas", this);
	}
	
	public ExamenesCriteria(PersistentSession session) {
		this(session.createCriteria(Examenes.class));
	}
	
	public ExamenesCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public DictaCriteria createIddictaCriteria() {
		return new DictaCriteria(createCriteria("iddicta"));
	}
	
	public EvaluacionesCriteria createEvaluacionesCriteria() {
		return new EvaluacionesCriteria(createCriteria("ORM_Evaluaciones"));
	}
	
	public PreguntasCriteria createPreguntasCriteria() {
		return new PreguntasCriteria(createCriteria("ORM_Preguntas"));
	}
	
	public Examenes uniqueExamenes() {
		return (Examenes) super.uniqueResult();
	}
	
	public Examenes[] listExamenes() {
		java.util.List list = super.list();
		return (Examenes[]) list.toArray(new Examenes[list.size()]);
	}
}

