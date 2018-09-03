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

public class BancoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idbanco;
	public final StringExpression enunciado;
	public final StringExpression imagen;
	public final ShortExpression tema;
	public final ShortExpression subtema;
	public final CharacterExpression dificultad;
	public final BooleanExpression activo;
	public final AssociationExpression iddicta;
	public final IntegerExpression idtipoId;
	public final AssociationExpression idtipo;
	public final CollectionExpression opciones;
	public final CollectionExpression preguntas;
	
	public BancoDetachedCriteria() {
		super(proyecto.Banco.class, proyecto.BancoCriteria.class);
		idbanco = new IntegerExpression("idbanco", this.getDetachedCriteria());
		enunciado = new StringExpression("enunciado", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		tema = new ShortExpression("tema", this.getDetachedCriteria());
		subtema = new ShortExpression("subtema", this.getDetachedCriteria());
		dificultad = new CharacterExpression("dificultad", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		iddicta = new AssociationExpression("iddicta", this.getDetachedCriteria());
		idtipoId = new IntegerExpression("idtipo.idtipo", this.getDetachedCriteria());
		idtipo = new AssociationExpression("idtipo", this.getDetachedCriteria());
		opciones = new CollectionExpression("ORM_Opciones", this.getDetachedCriteria());
		preguntas = new CollectionExpression("ORM_Preguntas", this.getDetachedCriteria());
	}
	
	public BancoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.BancoCriteria.class);
		idbanco = new IntegerExpression("idbanco", this.getDetachedCriteria());
		enunciado = new StringExpression("enunciado", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		tema = new ShortExpression("tema", this.getDetachedCriteria());
		subtema = new ShortExpression("subtema", this.getDetachedCriteria());
		dificultad = new CharacterExpression("dificultad", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		iddicta = new AssociationExpression("iddicta", this.getDetachedCriteria());
		idtipoId = new IntegerExpression("idtipo.idtipo", this.getDetachedCriteria());
		idtipo = new AssociationExpression("idtipo", this.getDetachedCriteria());
		opciones = new CollectionExpression("ORM_Opciones", this.getDetachedCriteria());
		preguntas = new CollectionExpression("ORM_Preguntas", this.getDetachedCriteria());
	}
	
	public DictaDetachedCriteria createIddictaCriteria() {
		return new DictaDetachedCriteria(createCriteria("iddicta"));
	}
	
	public TipoDetachedCriteria createIdtipoCriteria() {
		return new TipoDetachedCriteria(createCriteria("idtipo"));
	}
	
	public OpcionesDetachedCriteria createOpcionesCriteria() {
		return new OpcionesDetachedCriteria(createCriteria("ORM_Opciones"));
	}
	
	public PreguntasDetachedCriteria createPreguntasCriteria() {
		return new PreguntasDetachedCriteria(createCriteria("ORM_Preguntas"));
	}
	
	public Banco uniqueBanco(PersistentSession session) {
		return (Banco) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Banco[] listBanco(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Banco[]) list.toArray(new Banco[list.size()]);
	}
}

