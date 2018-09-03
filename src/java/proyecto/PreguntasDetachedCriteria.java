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

public class PreguntasDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idexamenId;
	public final AssociationExpression idexamen;
	public final IntegerExpression idbancoId;
	public final AssociationExpression idbanco;
	public final ShortExpression ponderacion;
	
	public PreguntasDetachedCriteria() {
		super(proyecto.Preguntas.class, proyecto.PreguntasCriteria.class);
		idexamenId = new IntegerExpression("ORM_Idexamen.idexamen", this.getDetachedCriteria());
		idexamen = new AssociationExpression("ORM_Idexamen", this.getDetachedCriteria());
		idbancoId = new IntegerExpression("ORM_Idbanco.idbanco", this.getDetachedCriteria());
		idbanco = new AssociationExpression("ORM_Idbanco", this.getDetachedCriteria());
		ponderacion = new ShortExpression("ponderacion", this.getDetachedCriteria());
	}
	
	public PreguntasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.PreguntasCriteria.class);
		idexamenId = new IntegerExpression("ORM_Idexamen.idexamen", this.getDetachedCriteria());
		idexamen = new AssociationExpression("ORM_Idexamen", this.getDetachedCriteria());
		idbancoId = new IntegerExpression("ORM_Idbanco.idbanco", this.getDetachedCriteria());
		idbanco = new AssociationExpression("ORM_Idbanco", this.getDetachedCriteria());
		ponderacion = new ShortExpression("ponderacion", this.getDetachedCriteria());
	}
	
	public ExamenesDetachedCriteria createIdexamenCriteria() {
		return new ExamenesDetachedCriteria(createCriteria("ORM_Idexamen"));
	}
	
	public BancoDetachedCriteria createIdbancoCriteria() {
		return new BancoDetachedCriteria(createCriteria("ORM_Idbanco"));
	}
	
	public Preguntas uniquePreguntas(PersistentSession session) {
		return (Preguntas) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Preguntas[] listPreguntas(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Preguntas[]) list.toArray(new Preguntas[list.size()]);
	}
}

