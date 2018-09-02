/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteTallerv77Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = model.pojo.Tallerv77PersistentManager.instance().getSession().beginTransaction();
		try {
			model.pojo.Estudiante lmodelpojoEstudiante = model.pojo.EstudianteDAO.loadEstudianteByQuery(null, null);
			// Delete the persistent object
			model.pojo.EstudianteDAO.delete(lmodelpojoEstudiante);
			model.pojo.Director lmodelpojoDirector = model.pojo.DirectorDAO.loadDirectorByQuery(null, null);
			// Delete the persistent object
			model.pojo.DirectorDAO.delete(lmodelpojoDirector);
			model.pojo.Matricula lmodelpojoMatricula = model.pojo.MatriculaDAO.loadMatriculaByQuery(null, null);
			// Delete the persistent object
			model.pojo.MatriculaDAO.delete(lmodelpojoMatricula);
			model.pojo.ProfesorCurso lmodelpojoProfesorCurso = model.pojo.ProfesorCursoDAO.loadProfesorCursoByQuery(null, null);
			// Delete the persistent object
			model.pojo.ProfesorCursoDAO.delete(lmodelpojoProfesorCurso);
			model.pojo.Designa lmodelpojoDesigna = model.pojo.DesignaDAO.loadDesignaByQuery(null, null);
			// Delete the persistent object
			model.pojo.DesignaDAO.delete(lmodelpojoDesigna);
			model.pojo.ProfesorEspecialidad lmodelpojoProfesorEspecialidad = model.pojo.ProfesorEspecialidadDAO.loadProfesorEspecialidadByQuery(null, null);
			// Delete the persistent object
			model.pojo.ProfesorEspecialidadDAO.delete(lmodelpojoProfesorEspecialidad);
			model.pojo.Aula lmodelpojoAula = model.pojo.AulaDAO.loadAulaByQuery(null, null);
			// Delete the persistent object
			model.pojo.AulaDAO.delete(lmodelpojoAula);
			model.pojo.Asigna lmodelpojoAsigna = model.pojo.AsignaDAO.loadAsignaByQuery(null, null);
			// Delete the persistent object
			model.pojo.AsignaDAO.delete(lmodelpojoAsigna);
			model.pojo.Paralelo lmodelpojoParalelo = model.pojo.ParaleloDAO.loadParaleloByQuery(null, null);
			// Delete the persistent object
			model.pojo.ParaleloDAO.delete(lmodelpojoParalelo);
			model.pojo.Materia lmodelpojoMateria = model.pojo.MateriaDAO.loadMateriaByQuery(null, null);
			// Delete the persistent object
			model.pojo.MateriaDAO.delete(lmodelpojoMateria);
			model.pojo.DesignaEspecialidad lmodelpojoDesignaEspecialidad = model.pojo.DesignaEspecialidadDAO.loadDesignaEspecialidadByQuery(null, null);
			// Delete the persistent object
			model.pojo.DesignaEspecialidadDAO.delete(lmodelpojoDesignaEspecialidad);
			model.pojo.Curso lmodelpojoCurso = model.pojo.CursoDAO.loadCursoByQuery(null, null);
			// Delete the persistent object
			model.pojo.CursoDAO.delete(lmodelpojoCurso);
			model.pojo.Notasest lmodelpojoNotasest = model.pojo.NotasestDAO.loadNotasestByQuery(null, null);
			// Delete the persistent object
			model.pojo.NotasestDAO.delete(lmodelpojoNotasest);
			model.pojo.Ciclo lmodelpojoCiclo = model.pojo.CicloDAO.loadCicloByQuery(null, null);
			// Delete the persistent object
			model.pojo.CicloDAO.delete(lmodelpojoCiclo);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteTallerv77Data deleteTallerv77Data = new DeleteTallerv77Data();
			try {
				deleteTallerv77Data.deleteTestData();
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
