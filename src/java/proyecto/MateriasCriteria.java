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

public class MateriasCriteria extends AbstractORMCriteria {
	public final IntegerExpression idcarrId;
	public final AssociationExpression idcarr;
	public final StringExpression sigla;
	public final StringExpression nombre;
	public final ShortExpression cargahoraria;
	public final StringExpression plan;
	public final CharacterExpression periodo;
	public final CharacterExpression paralelo;
	public final BooleanExpression activo;
	public final CollectionExpression dicta;
	public final CollectionExpression programacion;
	
	public MateriasCriteria(Criteria criteria) {
		super(criteria);
		idcarrId = new IntegerExpression("ORM_Idcarr.idcarr", this);
		idcarr = new AssociationExpression("ORM_Idcarr", this);
		sigla = new StringExpression("sigla", this);
		nombre = new StringExpression("nombre", this);
		cargahoraria = new ShortExpression("cargahoraria", this);
		plan = new StringExpression("plan", this);
		periodo = new CharacterExpression("periodo", this);
		paralelo = new CharacterExpression("paralelo", this);
		activo = new BooleanExpression("activo", this);
		dicta = new CollectionExpression("ORM_Dicta", this);
		programacion = new CollectionExpression("ORM_Programacion", this);
	}
	
	public MateriasCriteria(PersistentSession session) {
		this(session.createCriteria(Materias.class));
	}
	
	public MateriasCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public CarrerasCriteria createIdcarrCriteria() {
		return new CarrerasCriteria(createCriteria("ORM_Idcarr"));
	}
	
	public DictaCriteria createDictaCriteria() {
		return new DictaCriteria(createCriteria("ORM_Dicta"));
	}
	
	public ProgramacionCriteria createProgramacionCriteria() {
		return new ProgramacionCriteria(createCriteria("ORM_Programacion"));
	}
	
	public Materias uniqueMaterias() {
		return (Materias) super.uniqueResult();
	}
	
	public Materias[] listMaterias() {
		java.util.List list = super.list();
		return (Materias[]) list.toArray(new Materias[list.size()]);
	}
}

