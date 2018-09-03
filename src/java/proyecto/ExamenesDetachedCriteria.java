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

public class ExamenesDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ExamenesDetachedCriteria() {
		super(proyecto.Examenes.class, proyecto.ExamenesCriteria.class);
		idexamen = new IntegerExpression("idexamen", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		hora_ini = new TimeExpression("hora_ini", this.getDetachedCriteria());
		hora_fin = new TimeExpression("hora_fin", this.getDetachedCriteria());
		penalizacion = new ShortExpression("penalizacion", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		iddicta = new AssociationExpression("iddicta", this.getDetachedCriteria());
		evaluaciones = new CollectionExpression("ORM_Evaluaciones", this.getDetachedCriteria());
		preguntas = new CollectionExpression("ORM_Preguntas", this.getDetachedCriteria());
	}
	
	public ExamenesDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.ExamenesCriteria.class);
		idexamen = new IntegerExpression("idexamen", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		hora_ini = new TimeExpression("hora_ini", this.getDetachedCriteria());
		hora_fin = new TimeExpression("hora_fin", this.getDetachedCriteria());
		penalizacion = new ShortExpression("penalizacion", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		iddicta = new AssociationExpression("iddicta", this.getDetachedCriteria());
		evaluaciones = new CollectionExpression("ORM_Evaluaciones", this.getDetachedCriteria());
		preguntas = new CollectionExpression("ORM_Preguntas", this.getDetachedCriteria());
	}
	
	public DictaDetachedCriteria createIddictaCriteria() {
		return new DictaDetachedCriteria(createCriteria("iddicta"));
	}
	
	public EvaluacionesDetachedCriteria createEvaluacionesCriteria() {
		return new EvaluacionesDetachedCriteria(createCriteria("ORM_Evaluaciones"));
	}
	
	public PreguntasDetachedCriteria createPreguntasCriteria() {
		return new PreguntasDetachedCriteria(createCriteria("ORM_Preguntas"));
	}
	
	public Examenes uniqueExamenes(PersistentSession session) {
		return (Examenes) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Examenes[] listExamenes(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Examenes[]) list.toArray(new Examenes[list.size()]);
	}
}

