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

public class CarrerasDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idcarr;
	public final StringExpression nombre;
	public final StringExpression direccion;
	public final StringExpression telefono;
	public final BooleanExpression activo;
	public final CollectionExpression materias;
	
	public CarrerasDetachedCriteria() {
		super(proyecto.Carreras.class, proyecto.CarrerasCriteria.class);
		idcarr = new IntegerExpression("idcarr", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		materias = new CollectionExpression("ORM_Materias", this.getDetachedCriteria());
	}
	
	public CarrerasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.CarrerasCriteria.class);
		idcarr = new IntegerExpression("idcarr", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
		materias = new CollectionExpression("ORM_Materias", this.getDetachedCriteria());
	}
	
	public MateriasDetachedCriteria createMateriasCriteria() {
		return new MateriasDetachedCriteria(createCriteria("ORM_Materias"));
	}
	
	public Carreras uniqueCarreras(PersistentSession session) {
		return (Carreras) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Carreras[] listCarreras(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Carreras[]) list.toArray(new Carreras[list.size()]);
	}
}

