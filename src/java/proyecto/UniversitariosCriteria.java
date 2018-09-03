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

public class UniversitariosCriteria extends AbstractORMCriteria {
	public final IntegerExpression idusuId;
	public final AssociationExpression idusu;
	public final IntegerExpression ru;
	public final CollectionExpression programacion;
	
	public UniversitariosCriteria(Criteria criteria) {
		super(criteria);
		idusuId = new IntegerExpression("idusu.idusu", this);
		idusu = new AssociationExpression("idusu", this);
		ru = new IntegerExpression("ru", this);
		programacion = new CollectionExpression("ORM_Programacion", this);
	}
	
	public UniversitariosCriteria(PersistentSession session) {
		this(session.createCriteria(Universitarios.class));
	}
	
	public UniversitariosCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public UsuariosCriteria createIdusuCriteria() {
		return new UsuariosCriteria(createCriteria("idusu"));
	}
	
	public ProgramacionCriteria createProgramacionCriteria() {
		return new ProgramacionCriteria(createCriteria("ORM_Programacion"));
	}
	
	public Universitarios uniqueUniversitarios() {
		return (Universitarios) super.uniqueResult();
	}
	
	public Universitarios[] listUniversitarios() {
		java.util.List list = super.list();
		return (Universitarios[]) list.toArray(new Universitarios[list.size()]);
	}
}

