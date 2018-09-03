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

public class MateriasDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public MateriasDetachedCriteria() {
		super(proyecto.Materias.class, proyecto.MateriasCriteria.class);
		idcarrId = new IntegerExpression("ORM_Idcarr.idcarr", this.getDetachedCriteria());
		idcarr = new AssociationExpression("ORM_Idcarr", this.getDetachedCriteria());
		sigla = new StringExpression("sigla", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		cargahoraria = new ShortExpression("cargahoraria", this.getDetachedCriteria());
		plan = new StringExpression("plan", this.getDetachedCriteria());
		periodo = new CharacterExpression("periodo", this.getDetachedCriteria());
		paralelo = new CharacterExpression("paralelo", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		dicta = new CollectionExpression("ORM_Dicta", this.getDetachedCriteria());
		programacion = new CollectionExpression("ORM_Programacion", this.getDetachedCriteria());
	}
	
	public MateriasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.MateriasCriteria.class);
		idcarrId = new IntegerExpression("ORM_Idcarr.idcarr", this.getDetachedCriteria());
		idcarr = new AssociationExpression("ORM_Idcarr", this.getDetachedCriteria());
		sigla = new StringExpression("sigla", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		cargahoraria = new ShortExpression("cargahoraria", this.getDetachedCriteria());
		plan = new StringExpression("plan", this.getDetachedCriteria());
		periodo = new CharacterExpression("periodo", this.getDetachedCriteria());
		paralelo = new CharacterExpression("paralelo", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		dicta = new CollectionExpression("ORM_Dicta", this.getDetachedCriteria());
		programacion = new CollectionExpression("ORM_Programacion", this.getDetachedCriteria());
	}
	
	public CarrerasDetachedCriteria createIdcarrCriteria() {
		return new CarrerasDetachedCriteria(createCriteria("ORM_Idcarr"));
	}
	
	public DictaDetachedCriteria createDictaCriteria() {
		return new DictaDetachedCriteria(createCriteria("ORM_Dicta"));
	}
	
	public ProgramacionDetachedCriteria createProgramacionCriteria() {
		return new ProgramacionDetachedCriteria(createCriteria("ORM_Programacion"));
	}
	
	public Materias uniqueMaterias(PersistentSession session) {
		return (Materias) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Materias[] listMaterias(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Materias[]) list.toArray(new Materias[list.size()]);
	}
}

