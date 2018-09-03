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

public class CarrerasCriteria extends AbstractORMCriteria {
	public final IntegerExpression idcarr;
	public final StringExpression nombre;
	public final StringExpression direccion;
	public final StringExpression telefono;
	public final BooleanExpression activo;
	public final CollectionExpression materias;
	
	public CarrerasCriteria(Criteria criteria) {
		super(criteria);
		idcarr = new IntegerExpression("idcarr", this);
		nombre = new StringExpression("nombre", this);
		direccion = new StringExpression("direccion", this);
		telefono = new StringExpression("telefono", this);
		activo = new BooleanExpression("activo", this);
		materias = new CollectionExpression("ORM_Materias", this);
	}
	
	public CarrerasCriteria(PersistentSession session) {
		this(session.createCriteria(Carreras.class));
	}
	
	public CarrerasCriteria() throws PersistentException {
		this(Proyectofinal2PersistentManager.instance().getSession());
	}
	
	public MateriasCriteria createMateriasCriteria() {
		return new MateriasCriteria(createCriteria("ORM_Materias"));
	}
	
	public Carreras uniqueCarreras() {
		return (Carreras) super.uniqueResult();
	}
	
	public Carreras[] listCarreras() {
		java.util.List list = super.list();
		return (Carreras[]) list.toArray(new Carreras[list.size()]);
	}
}

