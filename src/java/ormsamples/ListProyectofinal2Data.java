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
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Banco by Criteria...");
		proyecto.BancoCriteria lproyectoBancoCriteria = new proyecto.BancoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lproyectoBancoCriteria.idbanco.eq();
		lproyectoBancoCriteria.setMaxResults(ROW_COUNT);
		proyecto.Banco[] proyectoBancos = lproyectoBancoCriteria.listBanco();
		int length =proyectoBancos== null ? 0 : Math.min(proyectoBancos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoBancos[i]);
		}
		System.out.println(length + " Banco record(s) retrieved."); 
		
		System.out.println("Listing Carreras by Criteria...");
		proyecto.CarrerasCriteria lproyectoCarrerasCriteria = new proyecto.CarrerasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lproyectoCarrerasCriteria.idcarr.eq();
		lproyectoCarrerasCriteria.setMaxResults(ROW_COUNT);
		proyecto.Carreras[] proyectoCarrerases = lproyectoCarrerasCriteria.listCarreras();
		length =proyectoCarrerases== null ? 0 : Math.min(proyectoCarrerases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoCarrerases[i]);
		}
		System.out.println(length + " Carreras record(s) retrieved."); 
		
		System.out.println("Listing Datos by Criteria...");
		proyecto.DatosCriteria lproyectoDatosCriteria = new proyecto.DatosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//proyecto.UsuariosCriteria lproyectoDatosCriteria_Usuarios = lproyectoDatosCriteria.createIdusuCriteria();
		//lproyectoDatosCriteria_Usuarios.idusu.eq();
		//lproyectoDatosCriteria.login.eq();
		lproyectoDatosCriteria.setMaxResults(ROW_COUNT);
		proyecto.Datos[] proyectoDatoses = lproyectoDatosCriteria.listDatos();
		length =proyectoDatoses== null ? 0 : Math.min(proyectoDatoses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoDatoses[i]);
		}
		System.out.println(length + " Datos record(s) retrieved."); 
		
		System.out.println("Listing Dicta by Criteria...");
		proyecto.DictaCriteria lproyectoDictaCriteria = new proyecto.DictaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lproyectoDictaCriteria.iddicta.eq();
		//proyecto.DocentesCriteria lproyectoDictaCriteria_Docentes = lproyectoDictaCriteria.createIdusuCriteria();
		//proyecto.UsuariosCriteria lproyectoDictaCriteria_Docentes_Usuarios = lproyectoDictaCriteria_Docentes.createIdusuCriteria();
		//lproyectoDictaCriteria_Docentes_Usuarios.idusu.eq();
		lproyectoDictaCriteria.setMaxResults(ROW_COUNT);
		proyecto.Dicta[] proyectoDictas = lproyectoDictaCriteria.listDicta();
		length =proyectoDictas== null ? 0 : Math.min(proyectoDictas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoDictas[i]);
		}
		System.out.println(length + " Dicta record(s) retrieved."); 
		
		System.out.println("Listing Docentes by Criteria...");
		proyecto.DocentesCriteria lproyectoDocentesCriteria = new proyecto.DocentesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//proyecto.UsuariosCriteria lproyectoDocentesCriteria_Usuarios = lproyectoDocentesCriteria.createIdusuCriteria();
		//lproyectoDocentesCriteria_Usuarios.idusu.eq();
		lproyectoDocentesCriteria.setMaxResults(ROW_COUNT);
		proyecto.Docentes[] proyectoDocenteses = lproyectoDocentesCriteria.listDocentes();
		length =proyectoDocenteses== null ? 0 : Math.min(proyectoDocenteses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoDocenteses[i]);
		}
		System.out.println(length + " Docentes record(s) retrieved."); 
		
		System.out.println("Listing Evaluaciones by Criteria...");
		proyecto.EvaluacionesCriteria lproyectoEvaluacionesCriteria = new proyecto.EvaluacionesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//proyecto.ProgramacionCriteria lproyectoEvaluacionesCriteria_Programacion = lproyectoEvaluacionesCriteria.createIdprogCriteria();
		//lproyectoEvaluacionesCriteria_Programacion.idprog.eq();
		//proyecto.ExamenesCriteria lproyectoEvaluacionesCriteria_Examenes = lproyectoEvaluacionesCriteria.createIdexamenCriteria();
		//lproyectoEvaluacionesCriteria_Examenes.idexamen.eq();
		lproyectoEvaluacionesCriteria.setMaxResults(ROW_COUNT);
		proyecto.Evaluaciones[] proyectoEvaluacioneses = lproyectoEvaluacionesCriteria.listEvaluaciones();
		length =proyectoEvaluacioneses== null ? 0 : Math.min(proyectoEvaluacioneses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoEvaluacioneses[i]);
		}
		System.out.println(length + " Evaluaciones record(s) retrieved."); 
		
		System.out.println("Listing Examenes by Criteria...");
		proyecto.ExamenesCriteria lproyectoExamenesCriteria = new proyecto.ExamenesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lproyectoExamenesCriteria.idexamen.eq();
		lproyectoExamenesCriteria.setMaxResults(ROW_COUNT);
		proyecto.Examenes[] proyectoExameneses = lproyectoExamenesCriteria.listExamenes();
		length =proyectoExameneses== null ? 0 : Math.min(proyectoExameneses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoExameneses[i]);
		}
		System.out.println(length + " Examenes record(s) retrieved."); 
		
		System.out.println("Listing Materias by Criteria...");
		proyecto.MateriasCriteria lproyectoMateriasCriteria = new proyecto.MateriasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//proyecto.CarrerasCriteria lproyectoMateriasCriteria_Carreras = lproyectoMateriasCriteria.createIdcarrCriteria();
		//lproyectoMateriasCriteria_Carreras.idcarr.eq();
		//lproyectoMateriasCriteria.sigla.eq();
		lproyectoMateriasCriteria.setMaxResults(ROW_COUNT);
		proyecto.Materias[] proyectoMateriases = lproyectoMateriasCriteria.listMaterias();
		length =proyectoMateriases== null ? 0 : Math.min(proyectoMateriases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoMateriases[i]);
		}
		System.out.println(length + " Materias record(s) retrieved."); 
		
		System.out.println("Listing Menus by Criteria...");
		proyecto.MenusCriteria lproyectoMenusCriteria = new proyecto.MenusCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lproyectoMenusCriteria.idmenu.eq();
		lproyectoMenusCriteria.setMaxResults(ROW_COUNT);
		proyecto.Menus[] proyectoMenuses = lproyectoMenusCriteria.listMenus();
		length =proyectoMenuses== null ? 0 : Math.min(proyectoMenuses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoMenuses[i]);
		}
		System.out.println(length + " Menus record(s) retrieved."); 
		
		System.out.println("Listing Opciones by Criteria...");
		proyecto.OpcionesCriteria lproyectoOpcionesCriteria = new proyecto.OpcionesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lproyectoOpcionesCriteria.idopcion.eq();
		lproyectoOpcionesCriteria.setMaxResults(ROW_COUNT);
		proyecto.Opciones[] proyectoOpcioneses = lproyectoOpcionesCriteria.listOpciones();
		length =proyectoOpcioneses== null ? 0 : Math.min(proyectoOpcioneses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoOpcioneses[i]);
		}
		System.out.println(length + " Opciones record(s) retrieved."); 
		
		System.out.println("Listing Preguntas by Criteria...");
		proyecto.PreguntasCriteria lproyectoPreguntasCriteria = new proyecto.PreguntasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//proyecto.ExamenesCriteria lproyectoPreguntasCriteria_Examenes = lproyectoPreguntasCriteria.createIdexamenCriteria();
		//lproyectoPreguntasCriteria_Examenes.idexamen.eq();
		//proyecto.BancoCriteria lproyectoPreguntasCriteria_Banco = lproyectoPreguntasCriteria.createIdbancoCriteria();
		//lproyectoPreguntasCriteria_Banco.idbanco.eq();
		lproyectoPreguntasCriteria.setMaxResults(ROW_COUNT);
		proyecto.Preguntas[] proyectoPreguntases = lproyectoPreguntasCriteria.listPreguntas();
		length =proyectoPreguntases== null ? 0 : Math.min(proyectoPreguntases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoPreguntases[i]);
		}
		System.out.println(length + " Preguntas record(s) retrieved."); 
		
		System.out.println("Listing Procesos by Criteria...");
		proyecto.ProcesosCriteria lproyectoProcesosCriteria = new proyecto.ProcesosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lproyectoProcesosCriteria.idpro.eq();
		lproyectoProcesosCriteria.setMaxResults(ROW_COUNT);
		proyecto.Procesos[] proyectoProcesoses = lproyectoProcesosCriteria.listProcesos();
		length =proyectoProcesoses== null ? 0 : Math.min(proyectoProcesoses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoProcesoses[i]);
		}
		System.out.println(length + " Procesos record(s) retrieved."); 
		
		System.out.println("Listing Programacion by Criteria...");
		proyecto.ProgramacionCriteria lproyectoProgramacionCriteria = new proyecto.ProgramacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lproyectoProgramacionCriteria.idprog.eq();
		lproyectoProgramacionCriteria.setMaxResults(ROW_COUNT);
		proyecto.Programacion[] proyectoProgramacions = lproyectoProgramacionCriteria.listProgramacion();
		length =proyectoProgramacions== null ? 0 : Math.min(proyectoProgramacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoProgramacions[i]);
		}
		System.out.println(length + " Programacion record(s) retrieved."); 
		
		System.out.println("Listing Roles by Criteria...");
		proyecto.RolesCriteria lproyectoRolesCriteria = new proyecto.RolesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lproyectoRolesCriteria.idrol.eq();
		lproyectoRolesCriteria.setMaxResults(ROW_COUNT);
		proyecto.Roles[] proyectoRoleses = lproyectoRolesCriteria.listRoles();
		length =proyectoRoleses== null ? 0 : Math.min(proyectoRoleses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoRoleses[i]);
		}
		System.out.println(length + " Roles record(s) retrieved."); 
		
		System.out.println("Listing Tipo by Criteria...");
		proyecto.TipoCriteria lproyectoTipoCriteria = new proyecto.TipoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lproyectoTipoCriteria.idtipo.eq();
		lproyectoTipoCriteria.setMaxResults(ROW_COUNT);
		proyecto.Tipo[] proyectoTipos = lproyectoTipoCriteria.listTipo();
		length =proyectoTipos== null ? 0 : Math.min(proyectoTipos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoTipos[i]);
		}
		System.out.println(length + " Tipo record(s) retrieved."); 
		
		System.out.println("Listing Universitarios by Criteria...");
		proyecto.UniversitariosCriteria lproyectoUniversitariosCriteria = new proyecto.UniversitariosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//proyecto.UsuariosCriteria lproyectoUniversitariosCriteria_Usuarios = lproyectoUniversitariosCriteria.createIdusuCriteria();
		//lproyectoUniversitariosCriteria_Usuarios.idusu.eq();
		lproyectoUniversitariosCriteria.setMaxResults(ROW_COUNT);
		proyecto.Universitarios[] proyectoUniversitarioses = lproyectoUniversitariosCriteria.listUniversitarios();
		length =proyectoUniversitarioses== null ? 0 : Math.min(proyectoUniversitarioses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoUniversitarioses[i]);
		}
		System.out.println(length + " Universitarios record(s) retrieved."); 
		
		System.out.println("Listing Usuarios by Criteria...");
		proyecto.UsuariosCriteria lproyectoUsuariosCriteria = new proyecto.UsuariosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lproyectoUsuariosCriteria.idusu.eq();
		lproyectoUsuariosCriteria.setMaxResults(ROW_COUNT);
		proyecto.Usuarios[] proyectoUsuarioses = lproyectoUsuariosCriteria.listUsuarios();
		length =proyectoUsuarioses== null ? 0 : Math.min(proyectoUsuarioses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoUsuarioses[i]);
		}
		System.out.println(length + " Usuarios record(s) retrieved."); 
		
		System.out.println("Listing V_usuariorol by Criteria...");
		proyecto.V_usuariorolCriteria lproyectoV_usuariorolCriteria = new proyecto.V_usuariorolCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lproyectoV_usuariorolCriteria.id.eq();
		lproyectoV_usuariorolCriteria.setMaxResults(ROW_COUNT);
		proyecto.V_usuariorol[] proyectoV_usuariorols = lproyectoV_usuariorolCriteria.listV_usuariorol();
		length =proyectoV_usuariorols== null ? 0 : Math.min(proyectoV_usuariorols.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proyectoV_usuariorols[i]);
		}
		System.out.println(length + " V_usuariorol record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectofinal2Data listProyectofinal2Data = new ListProyectofinal2Data();
			try {
				listProyectofinal2Data.listTestData();
				//listProyectofinal2Data.listByCriteria();
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
