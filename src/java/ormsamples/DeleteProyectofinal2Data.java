/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectofinal2Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = proyecto.Proyectofinal2PersistentManager.instance().getSession().beginTransaction();
		try {
			proyecto.Banco lproyectoBanco = proyecto.BancoDAO.loadBancoByQuery(null, null);
			// Delete the persistent object
			proyecto.BancoDAO.delete(lproyectoBanco);
			proyecto.Carreras lproyectoCarreras = proyecto.CarrerasDAO.loadCarrerasByQuery(null, null);
			// Delete the persistent object
			proyecto.CarrerasDAO.delete(lproyectoCarreras);
			proyecto.Datos lproyectoDatos = proyecto.DatosDAO.loadDatosByQuery(null, null);
			// Delete the persistent object
			proyecto.DatosDAO.delete(lproyectoDatos);
			proyecto.Dicta lproyectoDicta = proyecto.DictaDAO.loadDictaByQuery(null, null);
			// Delete the persistent object
			proyecto.DictaDAO.delete(lproyectoDicta);
			proyecto.Docentes lproyectoDocentes = proyecto.DocentesDAO.loadDocentesByQuery(null, null);
			// Delete the persistent object
			proyecto.DocentesDAO.delete(lproyectoDocentes);
			proyecto.Evaluaciones lproyectoEvaluaciones = proyecto.EvaluacionesDAO.loadEvaluacionesByQuery(null, null);
			// Delete the persistent object
			proyecto.EvaluacionesDAO.delete(lproyectoEvaluaciones);
			proyecto.Examenes lproyectoExamenes = proyecto.ExamenesDAO.loadExamenesByQuery(null, null);
			// Delete the persistent object
			proyecto.ExamenesDAO.delete(lproyectoExamenes);
			proyecto.Materias lproyectoMaterias = proyecto.MateriasDAO.loadMateriasByQuery(null, null);
			// Delete the persistent object
			proyecto.MateriasDAO.delete(lproyectoMaterias);
			proyecto.Menus lproyectoMenus = proyecto.MenusDAO.loadMenusByQuery(null, null);
			// Delete the persistent object
			proyecto.MenusDAO.delete(lproyectoMenus);
			proyecto.Opciones lproyectoOpciones = proyecto.OpcionesDAO.loadOpcionesByQuery(null, null);
			// Delete the persistent object
			proyecto.OpcionesDAO.delete(lproyectoOpciones);
			proyecto.Preguntas lproyectoPreguntas = proyecto.PreguntasDAO.loadPreguntasByQuery(null, null);
			// Delete the persistent object
			proyecto.PreguntasDAO.delete(lproyectoPreguntas);
			proyecto.Procesos lproyectoProcesos = proyecto.ProcesosDAO.loadProcesosByQuery(null, null);
			// Delete the persistent object
			proyecto.ProcesosDAO.delete(lproyectoProcesos);
			proyecto.Programacion lproyectoProgramacion = proyecto.ProgramacionDAO.loadProgramacionByQuery(null, null);
			// Delete the persistent object
			proyecto.ProgramacionDAO.delete(lproyectoProgramacion);
			proyecto.Roles lproyectoRoles = proyecto.RolesDAO.loadRolesByQuery(null, null);
			// Delete the persistent object
			proyecto.RolesDAO.delete(lproyectoRoles);
			proyecto.Tipo lproyectoTipo = proyecto.TipoDAO.loadTipoByQuery(null, null);
			// Delete the persistent object
			proyecto.TipoDAO.delete(lproyectoTipo);
			proyecto.Universitarios lproyectoUniversitarios = proyecto.UniversitariosDAO.loadUniversitariosByQuery(null, null);
			// Delete the persistent object
			proyecto.UniversitariosDAO.delete(lproyectoUniversitarios);
			proyecto.Usuarios lproyectoUsuarios = proyecto.UsuariosDAO.loadUsuariosByQuery(null, null);
			// Delete the persistent object
			proyecto.UsuariosDAO.delete(lproyectoUsuarios);
			proyecto.V_usuariorol lproyectoV_usuariorol = proyecto.V_usuariorolDAO.loadV_usuariorolByQuery(null, null);
			// Delete the persistent object
			proyecto.V_usuariorolDAO.delete(lproyectoV_usuariorol);
			proyecto.Examen lproyectoExamen = proyecto.ExamenDAO.loadExamenByQuery(null, null);
			// Delete the persistent object
			proyecto.ExamenDAO.delete(lproyectoExamen);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectofinal2Data deleteProyectofinal2Data = new DeleteProyectofinal2Data();
			try {
				deleteProyectofinal2Data.deleteTestData();
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
