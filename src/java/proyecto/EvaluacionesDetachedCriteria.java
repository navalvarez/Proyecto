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

public class EvaluacionesDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idprogId;
	public final AssociationExpression idprog;
	public final IntegerExpression idexamenId;
	public final AssociationExpression idexamen;
	public final ShortExpression nota;
	public final CollectionExpression idopcion;
	
	public EvaluacionesDetachedCriteria() {
		super(proyecto.Evaluaciones.class, proyecto.EvaluacionesCriteria.class);
		idprogId = new IntegerExpression("ORM_Idprog.idprog", this.getDetachedCriteria());
		idprog = new AssociationExpression("ORM_Idprog", this.getDetachedCriteria());
		idexamenId = new IntegerExpression("ORM_Idexamen.idexamen", this.getDetachedCriteria());
		idexamen = new AssociationExpression("ORM_Idexamen", this.getDetachedCriteria());
		nota = new ShortExpression("nota", this.getDetachedCriteria());
		idopcion = new CollectionExpression("ORM_Idopcion", this.getDetachedCriteria());
	}
	
	public EvaluacionesDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.EvaluacionesCriteria.class);
		idprogId = new IntegerExpression("ORM_Idprog.idprog", this.getDetachedCriteria());
		idprog = new AssociationExpression("ORM_Idprog", this.getDetachedCriteria());
		idexamenId = new IntegerExpression("ORM_Idexamen.idexamen", this.getDetachedCriteria());
		idexamen = new AssociationExpression("ORM_Idexamen", this.getDetachedCriteria());
		nota = new ShortExpression("nota", this.getDetachedCriteria());
		idopcion = new CollectionExpression("ORM_Idopcion", this.getDetachedCriteria());
	}
	
	public ProgramacionDetachedCriteria createIdprogCriteria() {
		return new ProgramacionDetachedCriteria(createCriteria("ORM_Idprog"));
	}
	
	public ExamenesDetachedCriteria createIdexamenCriteria() {
		return new ExamenesDetachedCriteria(createCriteria("ORM_Idexamen"));
	}
	
	public OpcionesDetachedCriteria createIdopcionCriteria() {
		return new OpcionesDetachedCriteria(createCriteria("ORM_Idopcion"));
	}
	
	public Evaluaciones uniqueEvaluaciones(PersistentSession session) {
		return (Evaluaciones) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Evaluaciones[] listEvaluaciones(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Evaluaciones[]) list.toArray(new Evaluaciones[list.size()]);
	}
}

