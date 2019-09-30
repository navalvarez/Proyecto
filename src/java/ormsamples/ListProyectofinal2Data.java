/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListProyectofinal2Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Banco...");
		proyecto.Banco[] proyectoBancos = proyecto.BancoDAO.listBancoByQuery(null, null);
		int length = Math.min(proyectoBancos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoBancos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Carreras...");
		proyecto.Carreras[] proyectoCarrerases = proyecto.CarrerasDAO.listCarrerasByQuery(null, null);
		length = Math.min(proyectoCarrerases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoCarrerases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Datos...");
		proyecto.Datos[] proyectoDatoses = proyecto.DatosDAO.listDatosByQuery(null, null);
		length = Math.min(proyectoDatoses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoDatoses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Dicta...");
		proyecto.Dicta[] proyectoDictas = proyecto.DictaDAO.listDictaByQuery(null, null);
		length = Math.min(proyectoDictas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoDictas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Docentes...");
		proyecto.Docentes[] proyectoDocenteses = proyecto.DocentesDAO.listDocentesByQuery(null, null);
		length = Math.min(proyectoDocenteses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoDocenteses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Evaluaciones...");
		proyecto.Evaluaciones[] proyectoEvaluacioneses = proyecto.EvaluacionesDAO.listEvaluacionesByQuery(null, null);
		length = Math.min(proyectoEvaluacioneses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoEvaluacioneses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Examenes...");
		proyecto.Examenes[] proyectoExameneses = proyecto.ExamenesDAO.listExamenesByQuery(null, null);
		length = Math.min(proyectoExameneses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoExameneses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Materias...");
		proyecto.Materias[] proyectoMateriases = proyecto.MateriasDAO.listMateriasByQuery(null, null);
		length = Math.min(proyectoMateriases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoMateriases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Menus...");
		proyecto.Menus[] proyectoMenuses = proyecto.MenusDAO.listMenusByQuery(null, null);
		length = Math.min(proyectoMenuses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoMenuses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Opciones...");
		proyecto.Opciones[] proyectoOpcioneses = proyecto.OpcionesDAO.listOpcionesByQuery(null, null);
		length = Math.min(proyectoOpcioneses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoOpcioneses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Preguntas...");
		proyecto.Preguntas[] proyectoPreguntases = proyecto.PreguntasDAO.listPreguntasByQuery(null, null);
		length = Math.min(proyectoPreguntases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoPreguntases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Procesos...");
		proyecto.Procesos[] proyectoProcesoses = proyecto.ProcesosDAO.listProcesosByQuery(null, null);
		length = Math.min(proyectoProcesoses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoProcesoses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Programacion...");
		proyecto.Programacion[] proyectoProgramacions = proyecto.ProgramacionDAO.listProgramacionByQuery(null, null);
		length = Math.min(proyectoProgramacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoProgramacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Roles...");
		proyecto.Roles[] proyectoRoleses = proyecto.RolesDAO.listRolesByQuery(null, null);
		length = Math.min(proyectoRoleses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoRoleses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tipo...");
		proyecto.Tipo[] proyectoTipos = proyecto.TipoDAO.listTipoByQuery(null, null);
		length = Math.min(proyectoTipos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoTipos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Universitarios...");
		proyecto.Universitarios[] proyectoUniversitarioses = proyecto.UniversitariosDAO.listUniversitariosByQuery(null, null);
		length = Math.min(proyectoUniversitarioses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoUniversitarioses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuarios...");
		proyecto.Usuarios[] proyectoUsuarioses = proyecto.UsuariosDAO.listUsuariosByQuery(null, null);
		length = Math.min(proyectoUsuarioses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoUsuarioses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing V_usuariorol...");
		proyecto.V_usuariorol[] proyectoV_usuariorols = proyecto.V_usuariorolDAO.listV_usuariorolByQuery(null, null);
		length = Math.min(proyectoV_usuariorols.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoV_usuariorols[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Examen...");
		proyecto.Examen[] proyectoExamens = proyecto.ExamenDAO.listExamenByQuery(null, null);
		length = Math.min(proyectoExamens.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proyectoExamens[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectofinal2Data listProyectofinal2Data = new ListProyectofinal2Data();
			try {
				listProyectofinal2Data.listTestData();
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
