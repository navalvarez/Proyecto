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

public class DictaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression iddicta;
	public final IntegerExpression idusuId;
	public final AssociationExpression idusu;
	public final AssociationExpression idcarr;
	public final StringExpression gestion;
	public final CollectionExpression banco;
	public final CollectionExpression examenes;
	
	public DictaDetachedCriteria() {
		super(proyecto.Dicta.class, proyecto.DictaCriteria.class);
		iddicta = new IntegerExpression("iddicta", this.getDetachedCriteria());
		idusuId = new IntegerExpression("ORM_Idusu.", this.getDetachedCriteria());
		idusu = new AssociationExpression("ORM_Idusu", this.getDetachedCriteria());
		idcarr = new AssociationExpression("idcarr", this.getDetachedCriteria());
		gestion = new StringExpression("gestion", this.getDetachedCriteria());
		banco = new CollectionExpression("ORM_Banco", this.getDetachedCriteria());
		examenes = new CollectionExpression("ORM_Examenes", this.getDetachedCriteria());
	}
	
	public DictaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.DictaCriteria.class);
		iddicta = new IntegerExpression("iddicta", this.getDetachedCriteria());
		idusuId = new IntegerExpression("ORM_Idusu.", this.getDetachedCriteria());
		idusu = new AssociationExpression("ORM_Idusu", this.getDetachedCriteria());
		idcarr = new AssociationExpression("idcarr", this.getDetachedCriteria());
		gestion = new StringExpression("gestion", this.getDetachedCriteria());
		banco = new CollectionExpression("ORM_Banco", this.getDetachedCriteria());
		examenes = new CollectionExpression("ORM_Examenes", this.getDetachedCriteria());
	}
	
	public DocentesDetachedCriteria createIdusuCriteria() {
		return new DocentesDetachedCriteria(createCriteria("ORM_Idusu"));
	}
	
	public MateriasDetachedCriteria createIdcarrCriteria() {
		return new MateriasDetachedCriteria(createCriteria("idcarr"));
	}
	
	public BancoDetachedCriteria createBancoCriteria() {
		return new BancoDetachedCriteria(createCriteria("ORM_Banco"));
	}
	
	public ExamenesDetachedCriteria createExamenesCriteria() {
		return new ExamenesDetachedCriteria(createCriteria("ORM_Examenes"));
	}
	
	public Dicta uniqueDicta(PersistentSession session) {
		return (Dicta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Dicta[] listDicta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Dicta[]) list.toArray(new Dicta[list.size()]);
	}
}

