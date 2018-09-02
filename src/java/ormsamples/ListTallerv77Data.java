/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListTallerv77Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Estudiante...");
		model.pojo.Estudiante[] modelpojoEstudiantes = model.pojo.EstudianteDAO.listEstudianteByQuery(null, null);
		int length = Math.min(modelpojoEstudiantes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelpojoEstudiantes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Director...");
		model.pojo.Director[] modelpojoDirectors = model.pojo.DirectorDAO.listDirectorByQuery(null, null);
		length = Math.min(modelpojoDirectors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelpojoDirectors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Matricula...");
		model.pojo.Matricula[] modelpojoMatriculas = model.pojo.MatriculaDAO.listMatriculaByQuery(null, null);
		length = Math.min(modelpojoMatriculas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelpojoMatriculas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ProfesorCurso...");
		model.pojo.ProfesorCurso[] modelpojoProfesorCursos = model.pojo.ProfesorCursoDAO.listProfesorCursoByQuery(null, null);
		length = Math.min(modelpojoProfesorCursos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelpojoProfesorCursos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Designa...");
		model.pojo.Designa[] modelpojoDesignas = model.pojo.DesignaDAO.listDesignaByQuery(null, null);
		length = Math.min(modelpojoDesignas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelpojoDesignas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ProfesorEspecialidad...");
		model.pojo.ProfesorEspecialidad[] modelpojoProfesorEspecialidads = model.pojo.ProfesorEspecialidadDAO.listProfesorEspecialidadByQuery(null, null);
		length = Math.min(modelpojoProfesorEspecialidads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelpojoProfesorEspecialidads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Aula...");
		model.pojo.Aula[] modelpojoAulas = model.pojo.AulaDAO.listAulaByQuery(null, null);
		length = Math.min(modelpojoAulas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelpojoAulas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Asigna...");
		model.pojo.Asigna[] modelpojoAsignas = model.pojo.AsignaDAO.listAsignaByQuery(null, null);
		length = Math.min(modelpojoAsignas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelpojoAsignas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Paralelo...");
		model.pojo.Paralelo[] modelpojoParalelos = model.pojo.ParaleloDAO.listParaleloByQuery(null, null);
		length = Math.min(modelpojoParalelos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelpojoParalelos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Materia...");
		model.pojo.Materia[] modelpojoMaterias = model.pojo.MateriaDAO.listMateriaByQuery(null, null);
		length = Math.min(modelpojoMaterias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelpojoMaterias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing DesignaEspecialidad...");
		model.pojo.DesignaEspecialidad[] modelpojoDesignaEspecialidads = model.pojo.DesignaEspecialidadDAO.listDesignaEspecialidadByQuery(null, null);
		length = Math.min(modelpojoDesignaEspecialidads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelpojoDesignaEspecialidads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Curso...");
		model.pojo.Curso[] modelpojoCursos = model.pojo.CursoDAO.listCursoByQuery(null, null);
		length = Math.min(modelpojoCursos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelpojoCursos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Notasest...");
		model.pojo.Notasest[] modelpojoNotasests = model.pojo.NotasestDAO.listNotasestByQuery(null, null);
		length = Math.min(modelpojoNotasests.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelpojoNotasests[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Ciclo...");
		model.pojo.Ciclo[] modelpojoCiclos = model.pojo.CicloDAO.listCicloByQuery(null, null);
		length = Math.min(modelpojoCiclos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelpojoCiclos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Vlistaroles...");
		model.pojo.Vlistaroles[] modelpojoVlistaroleses = model.pojo.VlistarolesDAO.listVlistarolesByQuery(null, null);
		length = Math.min(modelpojoVlistaroleses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelpojoVlistaroleses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Vmatricula...");
		model.pojo.Vmatricula[] modelpojoVmatriculas = model.pojo.VmatriculaDAO.listVmatriculaByQuery(null, null);
		length = Math.min(modelpojoVmatriculas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelpojoVmatriculas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listVlistarolesByID() {
		System.out.println("Listing Vlistaroles by ID...");
		// Please uncomment the follow lines and fill in parameters 
		//model.pojo.Vlistaroles[] vlistaroless = model.pojo.VlistarolesDAO.listByID();
		//int length = vlistaroless == null ? 0 : Math.min(vlistaroless.length, ROW_COUNT);
		//for (int i = 0; i < length; i++) {
			//System.out.println(vlistaroless[i]);
		//}
		//System.out.println(length + " record(s) retrieved.");
	}
	
	public void listVlistarolesByusuario() {
		System.out.println("Listing Vlistaroles by usuario...");
		// Please uncomment the follow lines and fill in parameters 
		//model.pojo.Vlistaroles[] vlistaroless = model.pojo.VlistarolesDAO.listByusuario();
		//int length = vlistaroless == null ? 0 : Math.min(vlistaroless.length, ROW_COUNT);
		//for (int i = 0; i < length; i++) {
			//System.out.println(vlistaroless[i]);
		//}
		//System.out.println(length + " record(s) retrieved.");
	}
	
	public void listVlistarolesBycontrasena() {
		System.out.println("Listing Vlistaroles by contrasena...");
		// Please uncomment the follow lines and fill in parameters 
		//model.pojo.Vlistaroles[] vlistaroless = model.pojo.VlistarolesDAO.listBycontrasena();
		//int length = vlistaroless == null ? 0 : Math.min(vlistaroless.length, ROW_COUNT);
		//for (int i = 0; i < length; i++) {
			//System.out.println(vlistaroless[i]);
		//}
		//System.out.println(length + " record(s) retrieved.");
	}
	
	public void listVlistarolesBynombre() {
		System.out.println("Listing Vlistaroles by nombre...");
		// Please uncomment the follow lines and fill in parameters 
		//model.pojo.Vlistaroles[] vlistaroless = model.pojo.VlistarolesDAO.listBynombre();
		//int length = vlistaroless == null ? 0 : Math.min(vlistaroless.length, ROW_COUNT);
		//for (int i = 0; i < length; i++) {
			//System.out.println(vlistaroless[i]);
		//}
		//System.out.println(length + " record(s) retrieved.");
	}
	
	public void listVlistarolesByap() {
		System.out.println("Listing Vlistaroles by ap...");
		// Please uncomment the follow lines and fill in parameters 
		//model.pojo.Vlistaroles[] vlistaroless = model.pojo.VlistarolesDAO.listByap();
		//int length = vlistaroless == null ? 0 : Math.min(vlistaroless.length, ROW_COUNT);
		//for (int i = 0; i < length; i++) {
			//System.out.println(vlistaroless[i]);
		//}
		//System.out.println(length + " record(s) retrieved.");
	}
	
	public void listVlistarolesByam() {
		System.out.println("Listing Vlistaroles by am...");
		// Please uncomment the follow lines and fill in parameters 
		//model.pojo.Vlistaroles[] vlistaroless = model.pojo.VlistarolesDAO.listByam();
		//int length = vlistaroless == null ? 0 : Math.min(vlistaroless.length, ROW_COUNT);
		//for (int i = 0; i < length; i++) {
			//System.out.println(vlistaroless[i]);
		//}
		//System.out.println(length + " record(s) retrieved.");
	}
	
	public void listVlistarolesByestado() {
		System.out.println("Listing Vlistaroles by estado...");
		// Please uncomment the follow lines and fill in parameters 
		//model.pojo.Vlistaroles[] vlistaroless = model.pojo.VlistarolesDAO.listByestado();
		//int length = vlistaroless == null ? 0 : Math.min(vlistaroless.length, ROW_COUNT);
		//for (int i = 0; i < length; i++) {
			//System.out.println(vlistaroless[i]);
		//}
		//System.out.println(length + " record(s) retrieved.");
	}
	
	public void listVlistarolesByrol() {
		System.out.println("Listing Vlistaroles by rol...");
		// Please uncomment the follow lines and fill in parameters 
		//model.pojo.Vlistaroles[] vlistaroless = model.pojo.VlistarolesDAO.listByrol();
		//int length = vlistaroless == null ? 0 : Math.min(vlistaroless.length, ROW_COUNT);
		//for (int i = 0; i < length; i++) {
			//System.out.println(vlistaroless[i]);
		//}
		//System.out.println(length + " record(s) retrieved.");
	}
	
	public static void main(String[] args) {
		try {
			ListTallerv77Data listTallerv77Data = new ListTallerv77Data();
			try {
				listTallerv77Data.listTestData();
				//listTallerv77Data.listVlistarolesByID();
				//listTallerv77Data.listVlistarolesByusuario();
				//listTallerv77Data.listVlistarolesBycontrasena();
				//listTallerv77Data.listVlistarolesBynombre();
				//listTallerv77Data.listVlistarolesByap();
				//listTallerv77Data.listVlistarolesByam();
				//listTallerv77Data.listVlistarolesByestado();
				//listTallerv77Data.listVlistarolesByrol();
			}
			finally {
				model.pojo.Tallerv77PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
