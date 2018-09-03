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

public class DatosDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idusuId;
	public final AssociationExpression idusu;
	public final StringExpression login;
	public final StringExpression password;
	public final BooleanExpression activo;
	
	public DatosDetachedCriteria() {
		super(proyecto.Datos.class, proyecto.DatosCriteria.class);
		idusuId = new IntegerExpression("ORM_Idusu.idusu", this.getDetachedCriteria());
		idusu = new AssociationExpression("ORM_Idusu", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
	}
	
	public DatosDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, proyecto.DatosCriteria.class);
		idusuId = new IntegerExpression("ORM_Idusu.idusu", this.getDetachedCriteria());
		idusu = new AssociationExpression("ORM_Idusu", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		activo = new BooleanExpression("activo", this.getDetachedCriteria());
	}
	
	public UsuariosDetachedCriteria createIdusuCriteria() {
		return new UsuariosDetachedCriteria(createCriteria("ORM_Idusu"));
	}
	
	public Datos uniqueDatos(PersistentSession session) {
		return (Datos) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Datos[] listDatos(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Datos[]) list.toArray(new Datos[list.size()]);
	}
}

