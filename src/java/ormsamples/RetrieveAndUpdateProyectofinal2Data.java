/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectofinal2Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = proyecto.Proyectofinal2PersistentManager.instance().getSession().beginTransaction();
		try {
			proyecto.Banco lproyectoBanco = proyecto.BancoDAO.loadBancoByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.BancoDAO.save(lproyectoBanco);
			proyecto.Carreras lproyectoCarreras = proyecto.CarrerasDAO.loadCarrerasByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.CarrerasDAO.save(lproyectoCarreras);
			proyecto.Datos lproyectoDatos = proyecto.DatosDAO.loadDatosByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.DatosDAO.save(lproyectoDatos);
			proyecto.Dicta lproyectoDicta = proyecto.DictaDAO.loadDictaByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.DictaDAO.save(lproyectoDicta);
			proyecto.Docentes lproyectoDocentes = proyecto.DocentesDAO.loadDocentesByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.DocentesDAO.save(lproyectoDocentes);
			proyecto.Evaluaciones lproyectoEvaluaciones = proyecto.EvaluacionesDAO.loadEvaluacionesByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.EvaluacionesDAO.save(lproyectoEvaluaciones);
			proyecto.Examenes lproyectoExamenes = proyecto.ExamenesDAO.loadExamenesByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.ExamenesDAO.save(lproyectoExamenes);
			proyecto.Materias lproyectoMaterias = proyecto.MateriasDAO.loadMateriasByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.MateriasDAO.save(lproyectoMaterias);
			proyecto.Menus lproyectoMenus = proyecto.MenusDAO.loadMenusByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.MenusDAO.save(lproyectoMenus);
			proyecto.Opciones lproyectoOpciones = proyecto.OpcionesDAO.loadOpcionesByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.OpcionesDAO.save(lproyectoOpciones);
			proyecto.Preguntas lproyectoPreguntas = proyecto.PreguntasDAO.loadPreguntasByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.PreguntasDAO.save(lproyectoPreguntas);
			proyecto.Procesos lproyectoProcesos = proyecto.ProcesosDAO.loadProcesosByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.ProcesosDAO.save(lproyectoProcesos);
			proyecto.Programacion lproyectoProgramacion = proyecto.ProgramacionDAO.loadProgramacionByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.ProgramacionDAO.save(lproyectoProgramacion);
			proyecto.Roles lproyectoRoles = proyecto.RolesDAO.loadRolesByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.RolesDAO.save(lproyectoRoles);
			proyecto.Tipo lproyectoTipo = proyecto.TipoDAO.loadTipoByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.TipoDAO.save(lproyectoTipo);
			proyecto.Universitarios lproyectoUniversitarios = proyecto.UniversitariosDAO.loadUniversitariosByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.UniversitariosDAO.save(lproyectoUniversitarios);
			proyecto.Usuarios lproyectoUsuarios = proyecto.UsuariosDAO.loadUsuariosByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.UsuariosDAO.save(lproyectoUsuarios);
			proyecto.V_usuariorol lproyectoV_usuariorol = proyecto.V_usuariorolDAO.loadV_usuariorolByQuery(null, null);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Banco by BancoCriteria");
		proyecto.BancoCriteria lproyectoBancoCriteria = new proyecto.BancoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoBancoCriteria.idbanco.eq();
		System.out.println(lproyectoBancoCriteria.uniqueBanco());
		
		System.out.println("Retrieving Carreras by CarrerasCriteria");
		proyecto.CarrerasCriteria lproyectoCarrerasCriteria = new proyecto.CarrerasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoCarrerasCriteria.idcarr.eq();
		System.out.println(lproyectoCarrerasCriteria.uniqueCarreras());
		
		System.out.println("Retrieving Datos by DatosCriteria");
		proyecto.DatosCriteria lproyectoDatosCriteria = new proyecto.DatosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoDatosCriteria.idusu.eq();
		//lproyectoDatosCriteria.login.eq();
		System.out.println(lproyectoDatosCriteria.uniqueDatos());
		
		System.out.println("Retrieving Dicta by DictaCriteria");
		proyecto.DictaCriteria lproyectoDictaCriteria = new proyecto.DictaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoDictaCriteria.iddicta.eq();
		//lproyectoDictaCriteria.idusu.eq();
		System.out.println(lproyectoDictaCriteria.uniqueDicta());
		
		System.out.println("Retrieving Docentes by DocentesCriteria");
		proyecto.DocentesCriteria lproyectoDocentesCriteria = new proyecto.DocentesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoDocentesCriteria.idusu.eq();
		System.out.println(lproyectoDocentesCriteria.uniqueDocentes());
		
		System.out.println("Retrieving Evaluaciones by EvaluacionesCriteria");
		proyecto.EvaluacionesCriteria lproyectoEvaluacionesCriteria = new proyecto.EvaluacionesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoEvaluacionesCriteria.idprog.eq();
		//lproyectoEvaluacionesCriteria.idexamen.eq();
		System.out.println(lproyectoEvaluacionesCriteria.uniqueEvaluaciones());
		
		System.out.println("Retrieving Examenes by ExamenesCriteria");
		proyecto.ExamenesCriteria lproyectoExamenesCriteria = new proyecto.ExamenesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoExamenesCriteria.idexamen.eq();
		System.out.println(lproyectoExamenesCriteria.uniqueExamenes());
		
		System.out.println("Retrieving Materias by MateriasCriteria");
		proyecto.MateriasCriteria lproyectoMateriasCriteria = new proyecto.MateriasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoMateriasCriteria.idcarr.eq();
		//lproyectoMateriasCriteria.sigla.eq();
		System.out.println(lproyectoMateriasCriteria.uniqueMaterias());
		
		System.out.println("Retrieving Menus by MenusCriteria");
		proyecto.MenusCriteria lproyectoMenusCriteria = new proyecto.MenusCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoMenusCriteria.idmenu.eq();
		System.out.println(lproyectoMenusCriteria.uniqueMenus());
		
		System.out.println("Retrieving Opciones by OpcionesCriteria");
		proyecto.OpcionesCriteria lproyectoOpcionesCriteria = new proyecto.OpcionesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoOpcionesCriteria.idopcion.eq();
		System.out.println(lproyectoOpcionesCriteria.uniqueOpciones());
		
		System.out.println("Retrieving Preguntas by PreguntasCriteria");
		proyecto.PreguntasCriteria lproyectoPreguntasCriteria = new proyecto.PreguntasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoPreguntasCriteria.idexamen.eq();
		//lproyectoPreguntasCriteria.idbanco.eq();
		System.out.println(lproyectoPreguntasCriteria.uniquePreguntas());
		
		System.out.println("Retrieving Procesos by ProcesosCriteria");
		proyecto.ProcesosCriteria lproyectoProcesosCriteria = new proyecto.ProcesosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoProcesosCriteria.idpro.eq();
		System.out.println(lproyectoProcesosCriteria.uniqueProcesos());
		
		System.out.println("Retrieving Programacion by ProgramacionCriteria");
		proyecto.ProgramacionCriteria lproyectoProgramacionCriteria = new proyecto.ProgramacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoProgramacionCriteria.idprog.eq();
		System.out.println(lproyectoProgramacionCriteria.uniqueProgramacion());
		
		System.out.println("Retrieving Roles by RolesCriteria");
		proyecto.RolesCriteria lproyectoRolesCriteria = new proyecto.RolesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoRolesCriteria.idrol.eq();
		System.out.println(lproyectoRolesCriteria.uniqueRoles());
		
		System.out.println("Retrieving Tipo by TipoCriteria");
		proyecto.TipoCriteria lproyectoTipoCriteria = new proyecto.TipoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoTipoCriteria.idtipo.eq();
		System.out.println(lproyectoTipoCriteria.uniqueTipo());
		
		System.out.println("Retrieving Universitarios by UniversitariosCriteria");
		proyecto.UniversitariosCriteria lproyectoUniversitariosCriteria = new proyecto.UniversitariosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoUniversitariosCriteria.idusu.eq();
		System.out.println(lproyectoUniversitariosCriteria.uniqueUniversitarios());
		
		System.out.println("Retrieving Usuarios by UsuariosCriteria");
		proyecto.UsuariosCriteria lproyectoUsuariosCriteria = new proyecto.UsuariosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoUsuariosCriteria.idusu.eq();
		System.out.println(lproyectoUsuariosCriteria.uniqueUsuarios());
		
		System.out.println("Retrieving V_usuariorol by V_usuariorolCriteria");
		proyecto.V_usuariorolCriteria lproyectoV_usuariorolCriteria = new proyecto.V_usuariorolCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lproyectoV_usuariorolCriteria.id.eq();
		System.out.println(lproyectoV_usuariorolCriteria.uniqueV_usuariorol());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectofinal2Data retrieveAndUpdateProyectofinal2Data = new RetrieveAndUpdateProyectofinal2Data();
			try {
				retrieveAndUpdateProyectofinal2Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectofinal2Data.retrieveByCriteria();
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
