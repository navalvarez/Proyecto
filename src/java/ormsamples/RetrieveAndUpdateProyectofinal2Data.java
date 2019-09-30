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
			// Update the properties of the persistent object
			proyecto.V_usuariorolDAO.save(lproyectoV_usuariorol);
			proyecto.Examen lproyectoExamen = proyecto.ExamenDAO.loadExamenByQuery(null, null);
			// Update the properties of the persistent object
			proyecto.ExamenDAO.save(lproyectoExamen);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectofinal2Data retrieveAndUpdateProyectofinal2Data = new RetrieveAndUpdateProyectofinal2Data();
			try {
				retrieveAndUpdateProyectofinal2Data.retrieveAndUpdateTestData();
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
