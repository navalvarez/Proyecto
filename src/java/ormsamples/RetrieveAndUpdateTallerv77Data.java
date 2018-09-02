/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateTallerv77Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = model.pojo.Tallerv77PersistentManager.instance().getSession().beginTransaction();
		try {
			model.pojo.Estudiante lmodelpojoEstudiante = model.pojo.EstudianteDAO.loadEstudianteByQuery(null, null);
			// Update the properties of the persistent object
			model.pojo.EstudianteDAO.save(lmodelpojoEstudiante);
			model.pojo.Director lmodelpojoDirector = model.pojo.DirectorDAO.loadDirectorByQuery(null, null);
			// Update the properties of the persistent object
			model.pojo.DirectorDAO.save(lmodelpojoDirector);
			model.pojo.Matricula lmodelpojoMatricula = model.pojo.MatriculaDAO.loadMatriculaByQuery(null, null);
			// Update the properties of the persistent object
			model.pojo.MatriculaDAO.save(lmodelpojoMatricula);
			model.pojo.ProfesorCurso lmodelpojoProfesorCurso = model.pojo.ProfesorCursoDAO.loadProfesorCursoByQuery(null, null);
			// Update the properties of the persistent object
			model.pojo.ProfesorCursoDAO.save(lmodelpojoProfesorCurso);
			model.pojo.Designa lmodelpojoDesigna = model.pojo.DesignaDAO.loadDesignaByQuery(null, null);
			// Update the properties of the persistent object
			model.pojo.DesignaDAO.save(lmodelpojoDesigna);
			model.pojo.ProfesorEspecialidad lmodelpojoProfesorEspecialidad = model.pojo.ProfesorEspecialidadDAO.loadProfesorEspecialidadByQuery(null, null);
			// Update the properties of the persistent object
			model.pojo.ProfesorEspecialidadDAO.save(lmodelpojoProfesorEspecialidad);
			model.pojo.Aula lmodelpojoAula = model.pojo.AulaDAO.loadAulaByQuery(null, null);
			// Update the properties of the persistent object
			model.pojo.AulaDAO.save(lmodelpojoAula);
			model.pojo.Asigna lmodelpojoAsigna = model.pojo.AsignaDAO.loadAsignaByQuery(null, null);
			// Update the properties of the persistent object
			model.pojo.AsignaDAO.save(lmodelpojoAsigna);
			model.pojo.Paralelo lmodelpojoParalelo = model.pojo.ParaleloDAO.loadParaleloByQuery(null, null);
			// Update the properties of the persistent object
			model.pojo.ParaleloDAO.save(lmodelpojoParalelo);
			model.pojo.Materia lmodelpojoMateria = model.pojo.MateriaDAO.loadMateriaByQuery(null, null);
			// Update the properties of the persistent object
			model.pojo.MateriaDAO.save(lmodelpojoMateria);
			model.pojo.DesignaEspecialidad lmodelpojoDesignaEspecialidad = model.pojo.DesignaEspecialidadDAO.loadDesignaEspecialidadByQuery(null, null);
			// Update the properties of the persistent object
			model.pojo.DesignaEspecialidadDAO.save(lmodelpojoDesignaEspecialidad);
			model.pojo.Curso lmodelpojoCurso = model.pojo.CursoDAO.loadCursoByQuery(null, null);
			// Update the properties of the persistent object
			model.pojo.CursoDAO.save(lmodelpojoCurso);
			model.pojo.Notasest lmodelpojoNotasest = model.pojo.NotasestDAO.loadNotasestByQuery(null, null);
			// Update the properties of the persistent object
			model.pojo.NotasestDAO.save(lmodelpojoNotasest);
			model.pojo.Ciclo lmodelpojoCiclo = model.pojo.CicloDAO.loadCicloByQuery(null, null);
			// Update the properties of the persistent object
			model.pojo.CicloDAO.save(lmodelpojoCiclo);
			model.pojo.Vlistaroles lmodelpojoVlistaroles = model.pojo.VlistarolesDAO.loadVlistarolesByQuery(null, null);
			model.pojo.Vmatricula lmodelpojoVmatricula = model.pojo.VmatriculaDAO.loadVmatriculaByQuery(null, null);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveVlistarolesByID() {
		System.out.println("Retrieving Vlistaroles by ID...");
		// Please uncomment the follow line and fill in parameter(s)
		//System.out.println(model.pojo.VlistarolesDAO.loadByID());
	}
	
	public void retrieveVlistarolesByusuario() {
		System.out.println("Retrieving Vlistaroles by usuario...");
		// Please uncomment the follow line and fill in parameter(s)
		//System.out.println(model.pojo.VlistarolesDAO.loadByusuario());
	}
	
	public void retrieveVlistarolesBycontrasena() {
		System.out.println("Retrieving Vlistaroles by contrasena...");
		// Please uncomment the follow line and fill in parameter(s)
		//System.out.println(model.pojo.VlistarolesDAO.loadBycontrasena());
	}
	
	public void retrieveVlistarolesBynombre() {
		System.out.println("Retrieving Vlistaroles by nombre...");
		// Please uncomment the follow line and fill in parameter(s)
		//System.out.println(model.pojo.VlistarolesDAO.loadBynombre());
	}
	
	public void retrieveVlistarolesByap() {
		System.out.println("Retrieving Vlistaroles by ap...");
		// Please uncomment the follow line and fill in parameter(s)
		//System.out.println(model.pojo.VlistarolesDAO.loadByap());
	}
	
	public void retrieveVlistarolesByam() {
		System.out.println("Retrieving Vlistaroles by am...");
		// Please uncomment the follow line and fill in parameter(s)
		//System.out.println(model.pojo.VlistarolesDAO.loadByam());
	}
	
	public void retrieveVlistarolesByestado() {
		System.out.println("Retrieving Vlistaroles by estado...");
		// Please uncomment the follow line and fill in parameter(s)
		//System.out.println(model.pojo.VlistarolesDAO.loadByestado());
	}
	
	public void retrieveVlistarolesByrol() {
		System.out.println("Retrieving Vlistaroles by rol...");
		// Please uncomment the follow line and fill in parameter(s)
		//System.out.println(model.pojo.VlistarolesDAO.loadByrol());
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateTallerv77Data retrieveAndUpdateTallerv77Data = new RetrieveAndUpdateTallerv77Data();
			try {
				retrieveAndUpdateTallerv77Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateTallerv77Data.retrieveVlistarolesByID();
				//retrieveAndUpdateTallerv77Data.retrieveVlistarolesByusuario();
				//retrieveAndUpdateTallerv77Data.retrieveVlistarolesBycontrasena();
				//retrieveAndUpdateTallerv77Data.retrieveVlistarolesBynombre();
				//retrieveAndUpdateTallerv77Data.retrieveVlistarolesByap();
				//retrieveAndUpdateTallerv77Data.retrieveVlistarolesByam();
				//retrieveAndUpdateTallerv77Data.retrieveVlistarolesByestado();
				//retrieveAndUpdateTallerv77Data.retrieveVlistarolesByrol();
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
