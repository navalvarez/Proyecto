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

public class ProgramacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idprog;
	public final IntegerExpression idusuId;
	public final AssociationExpression idusu;
	public final AssociationExpression idcarr;
	public final StringExpression gestion;
	public final CollectionExpression evaluaciones;
	
	public ProgramacionCriteria(Criteria criteria) {
		super(criteria);
		idprog = new IntegerExpression("idprog", this);
		idusuId = new IntegerExpression("idusu.", this);
		idusu = new AssociationExpression("idusu", this);
		idcarr = new AssociationExpression("idcarr", this);
		gestion = new StringExpression("gestion", this);
		evaluaciones = new CollectionExpression("ORM_Evaluaciones", this);
	}
	
	public ProgramacionCriteria(PersistentSession session) {
		this(session.createCriteria(Programacion.class));
	}
	
	public ProgramacionCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public UniversitariosCriteria createIdusuCriteria() {
		return new UniversitariosCriteria(createCriteria("idusu"));
	}
	
	public MateriasCriteria createIdcarrCriteria() {
		return new MateriasCriteria(createCriteria("idcarr"));
	}
	
	public EvaluacionesCriteria createEvaluacionesCriteria() {
		return new EvaluacionesCriteria(createCriteria("ORM_Evaluaciones"));
	}
	
	public Programacion uniqueProgramacion() {
		return (Programacion) super.uniqueResult();
	}
	
	public Programacion[] listProgramacion() {
		java.util.List list = super.list();
		return (Programacion[]) list.toArray(new Programacion[list.size()]);
	}
}

