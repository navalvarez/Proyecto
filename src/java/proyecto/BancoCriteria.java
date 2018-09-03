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

public class BancoCriteria extends AbstractORMCriteria {
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
	
	public BancoCriteria(Criteria criteria) {
		super(criteria);
		idbanco = new IntegerExpression("idbanco", this);
		enunciado = new StringExpression("enunciado", this);
		imagen = new StringExpression("imagen", this);
		tema = new ShortExpression("tema", this);
		subtema = new ShortExpression("subtema", this);
		dificultad = new CharacterExpression("dificultad", this);
		activo = new BooleanExpression("activo", this);
		iddicta = new AssociationExpression("iddicta", this);
		idtipoId = new IntegerExpression("idtipo.idtipo", this);
		idtipo = new AssociationExpression("idtipo", this);
		opciones = new CollectionExpression("ORM_Opciones", this);
		preguntas = new CollectionExpression("ORM_Preguntas", this);
	}
	
	public BancoCriteria(PersistentSession session) {
		this(session.createCriteria(Banco.class));
	}
	
	public BancoCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public DictaCriteria createIddictaCriteria() {
		return new DictaCriteria(createCriteria("iddicta"));
	}
	
	public TipoCriteria createIdtipoCriteria() {
		return new TipoCriteria(createCriteria("idtipo"));
	}
	
	public OpcionesCriteria createOpcionesCriteria() {
		return new OpcionesCriteria(createCriteria("ORM_Opciones"));
	}
	
	public PreguntasCriteria createPreguntasCriteria() {
		return new PreguntasCriteria(createCriteria("ORM_Preguntas"));
	}
	
	public Banco uniqueBanco() {
		return (Banco) super.uniqueResult();
	}
	
	public Banco[] listBanco() {
		java.util.List list = super.list();
		return (Banco[]) list.toArray(new Banco[list.size()]);
	}
}

