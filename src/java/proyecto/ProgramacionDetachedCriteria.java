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

public class ProgramacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idprog;
	public final IntegerExpression idusuId;
	public final AssociationExpression idusu;
	public final AssociationExpression idcarr;
	public final StringExpression gestion;
	public final CollectionExpression evaluaciones;
	
	public ProgramacionDetachedCriteria() {
		super(proyecto.Programacion.class, proyecto.ProgramacionCriteria.class);
		idprog = new IntegerExpression("idprog", this.getDetachedCriteria());
		idusuId = new IntegerExpression("idusu.", this.getDetachedCriteria());
		idusu = new AssociationExpression("idusu", this.getDetachedCriteria());
		idcarr = new AssociationExpression("idcarr", this.getDetachedCriteria());
		gestion = new StringExpression("gestion", this.getDetachedCriteria());
		evaluaciones = new CollectionExpression("ORM_Evaluaciones", this.getDetachedCriteria());
	}
	
	public ProgramacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.ProgramacionCriteria.class);
		idprog = new IntegerExpression("idprog", this.getDetachedCriteria());
		idusuId = new IntegerExpression("idusu.", this.getDetachedCriteria());
		idusu = new AssociationExpression("idusu", this.getDetachedCriteria());
		idcarr = new AssociationExpression("idcarr", this.getDetachedCriteria());
		gestion = new StringExpression("gestion", this.getDetachedCriteria());
		evaluaciones = new CollectionExpression("ORM_Evaluaciones", this.getDetachedCriteria());
	}
	
	public UniversitariosDetachedCriteria createIdusuCriteria() {
		return new UniversitariosDetachedCriteria(createCriteria("idusu"));
	}
	
	public MateriasDetachedCriteria createIdcarrCriteria() {
		return new MateriasDetachedCriteria(createCriteria("idcarr"));
	}
	
	public EvaluacionesDetachedCriteria createEvaluacionesCriteria() {
		return new EvaluacionesDetachedCriteria(createCriteria("ORM_Evaluaciones"));
	}
	
	public Programacion uniqueProgramacion(PersistentSession session) {
		return (Programacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Programacion[] listProgramacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Programacion[]) list.toArray(new Programacion[list.size()]);
	}
}

