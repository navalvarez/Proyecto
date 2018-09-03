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

public class UniversitariosDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idusuId;
	public final AssociationExpression idusu;
	public final IntegerExpression ru;
	public final CollectionExpression programacion;
	
	public UniversitariosDetachedCriteria() {
		super(proyecto.Universitarios.class, proyecto.UniversitariosCriteria.class);
		idusuId = new IntegerExpression("idusu.idusu", this.getDetachedCriteria());
		idusu = new AssociationExpression("idusu", this.getDetachedCriteria());
		ru = new IntegerExpression("ru", this.getDetachedCriteria());
		programacion = new CollectionExpression("ORM_Programacion", this.getDetachedCriteria());
	}
	
	public UniversitariosDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.UniversitariosCriteria.class);
		idusuId = new IntegerExpression("idusu.idusu", this.getDetachedCriteria());
		idusu = new AssociationExpression("idusu", this.getDetachedCriteria());
		ru = new IntegerExpression("ru", this.getDetachedCriteria());
		programacion = new CollectionExpression("ORM_Programacion", this.getDetachedCriteria());
	}
	
	public UsuariosDetachedCriteria createIdusuCriteria() {
		return new UsuariosDetachedCriteria(createCriteria("idusu"));
	}
	
	public ProgramacionDetachedCriteria createProgramacionCriteria() {
		return new ProgramacionDetachedCriteria(createCriteria("ORM_Programacion"));
	}
	
	public Universitarios uniqueUniversitarios(PersistentSession session) {
		return (Universitarios) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Universitarios[] listUniversitarios(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Universitarios[]) list.toArray(new Universitarios[list.size()]);
	}
}

