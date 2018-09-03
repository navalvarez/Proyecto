/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateProyectofinal2Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = proyecto.Proyectofinal2PersistentManager.instance().getSession().beginTransaction();
		try {
			proyecto.Banco lproyectoBanco = proyecto.BancoDAO.createBanco();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : preguntas, activo, dificultad, tema, enunciado
			proyecto.BancoDAO.save(lproyectoBanco);
			proyecto.Carreras lproyectoCarreras = proyecto.CarrerasDAO.createCarreras();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : materias, activo, nombre
			proyecto.CarrerasDAO.save(lproyectoCarreras);
			proyecto.Datos lproyectoDatos = proyecto.DatosDAO.createDatos();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : activo, password, login
			proyecto.DatosDAO.save(lproyectoDatos);
			proyecto.Dicta lproyectoDicta = proyecto.DictaDAO.createDicta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : iddicta
			proyecto.DictaDAO.save(lproyectoDicta);
			proyecto.Docentes lproyectoDocentes = proyecto.DocentesDAO.createDocentes();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : dicta, auxiliar
			proyecto.DocentesDAO.save(lproyectoDocentes);
			proyecto.Evaluaciones lproyectoEvaluaciones = proyecto.EvaluacionesDAO.createEvaluaciones();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idopcion
			proyecto.EvaluacionesDAO.save(lproyectoEvaluaciones);
			proyecto.Examenes lproyectoExamenes = proyecto.ExamenesDAO.createExamenes();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : preguntas, evaluaciones, activo, penalizacion, nombre
			proyecto.ExamenesDAO.save(lproyectoExamenes);
			proyecto.Materias lproyectoMaterias = proyecto.MateriasDAO.createMaterias();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : activo, paralelo, periodo, plan, cargahoraria, nombre, sigla
			proyecto.MateriasDAO.save(lproyectoMaterias);
			proyecto.Menus lproyectoMenus = proyecto.MenusDAO.createMenus();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idpro, idrol, activo, nombre
			proyecto.MenusDAO.save(lproyectoMenus);
			proyecto.Opciones lproyectoOpciones = proyecto.OpcionesDAO.createOpciones();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idprog, correcta, opcion
			proyecto.OpcionesDAO.save(lproyectoOpciones);
			proyecto.Preguntas lproyectoPreguntas = proyecto.PreguntasDAO.createPreguntas();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ponderacion
			proyecto.PreguntasDAO.save(lproyectoPreguntas);
			proyecto.Procesos lproyectoProcesos = proyecto.ProcesosDAO.createProcesos();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idmenu, enlace, nombre
			proyecto.ProcesosDAO.save(lproyectoProcesos);
			proyecto.Programacion lproyectoProgramacion = proyecto.ProgramacionDAO.createProgramacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : evaluaciones
			proyecto.ProgramacionDAO.save(lproyectoProgramacion);
			proyecto.Roles lproyectoRoles = proyecto.RolesDAO.createRoles();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idmenu, idusu, activo, nombre
			proyecto.RolesDAO.save(lproyectoRoles);
			proyecto.Tipo lproyectoTipo = proyecto.TipoDAO.createTipo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : activo, nombre
			proyecto.TipoDAO.save(lproyectoTipo);
			proyecto.Universitarios lproyectoUniversitarios = proyecto.UniversitariosDAO.createUniversitarios();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ru
			proyecto.UniversitariosDAO.save(lproyectoUniversitarios);
			proyecto.Usuarios lproyectoUsuarios = proyecto.UsuariosDAO.createUsuarios();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : universitarios, docentes, datos, idrol, activo, foto, cedula, f_nac, sexo, apellido1, nombre
			proyecto.UsuariosDAO.save(lproyectoUsuarios);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectofinal2Data createProyectofinal2Data = new CreateProyectofinal2Data();
			try {
				createProyectofinal2Data.createTestData();
			}
			finally {
				proyecto.Proyectofinal2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
