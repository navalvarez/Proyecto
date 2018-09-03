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

public class DocentesDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idusuId;
	public final AssociationExpression idusu;
	public final BooleanExpression auxiliar;
	public final CollectionExpression dicta;
	
	public DocentesDetachedCriteria() {
		super(proyecto.Docentes.class, proyecto.DocentesCriteria.class);
		idusuId = new IntegerExpression("idusu.idusu", this.getDetachedCriteria());
		idusu = new AssociationExpression("idusu", this.getDetachedCriteria());
		auxiliar = new BooleanExpression("auxiliar", this.getDetachedCriteria());
		dicta = new CollectionExpression("ORM_Dicta", this.getDetachedCriteria());
	}
	
	public DocentesDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.DocentesCriteria.class);
		idusuId = new IntegerExpression("idusu.idusu", this.getDetachedCriteria());
		idusu = new AssociationExpression("idusu", this.getDetachedCriteria());
		auxiliar = new BooleanExpression("auxiliar", this.getDetachedCriteria());
		dicta = new CollectionExpression("ORM_Dicta", this.getDetachedCriteria());
	}
	
	public UsuariosDetachedCriteria createIdusuCriteria() {
		return new UsuariosDetachedCriteria(createCriteria("idusu"));
	}
	
	public DictaDetachedCriteria createDictaCriteria() {
		return new DictaDetachedCriteria(createCriteria("ORM_Dicta"));
	}
	
	public Docentes uniqueDocentes(PersistentSession session) {
		return (Docentes) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Docentes[] listDocentes(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Docentes[]) list.toArray(new Docentes[list.size()]);
	}
}

