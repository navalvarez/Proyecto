/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateTallerv77Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = model.pojo.Tallerv77PersistentManager.instance().getSession().beginTransaction();
		try {
			model.pojo.Estudiante lmodelpojoEstudiante = model.pojo.EstudianteDAO.createEstudiante();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : matriculas, notasests, rude
			model.pojo.EstudianteDAO.save(lmodelpojoEstudiante);
			model.pojo.Director lmodelpojoDirector = model.pojo.DirectorDAO.createDirector();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ciclo
			model.pojo.DirectorDAO.save(lmodelpojoDirector);
			model.pojo.Matricula lmodelpojoMatricula = model.pojo.MatriculaDAO.createMatricula();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estado
			model.pojo.MatriculaDAO.save(lmodelpojoMatricula);
			model.pojo.ProfesorCurso lmodelpojoProfesorCurso = model.pojo.ProfesorCursoDAO.createProfesorCurso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : designas, gestion
			model.pojo.ProfesorCursoDAO.save(lmodelpojoProfesorCurso);
			model.pojo.Designa lmodelpojoDesigna = model.pojo.DesignaDAO.createDesigna();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estado
			model.pojo.DesignaDAO.save(lmodelpojoDesigna);
			model.pojo.ProfesorEspecialidad lmodelpojoProfesorEspecialidad = model.pojo.ProfesorEspecialidadDAO.createProfesorEspecialidad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : designaEspecialidads, gestion
			model.pojo.ProfesorEspecialidadDAO.save(lmodelpojoProfesorEspecialidad);
			model.pojo.Aula lmodelpojoAula = model.pojo.AulaDAO.createAula();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : asignas, estado, idaula
			model.pojo.AulaDAO.save(lmodelpojoAula);
			model.pojo.Asigna lmodelpojoAsigna = model.pojo.AsignaDAO.createAsigna();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estado
			model.pojo.AsignaDAO.save(lmodelpojoAsigna);
			model.pojo.Paralelo lmodelpojoParalelo = model.pojo.ParaleloDAO.createParalelo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : asignas, matriculas, materia, designas, estado, cursos, idparalelo
			model.pojo.ParaleloDAO.save(lmodelpojoParalelo);
			model.pojo.Materia lmodelpojoMateria = model.pojo.MateriaDAO.createMateria();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : notasests, paralelos, designaEspecialidads, estado, nrohora, curso, sigla
			model.pojo.MateriaDAO.save(lmodelpojoMateria);
			model.pojo.DesignaEspecialidad lmodelpojoDesignaEspecialidad = model.pojo.DesignaEspecialidadDAO.createDesignaEspecialidad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : profesorEspecialidad, gestion, estado
			model.pojo.DesignaEspecialidadDAO.save(lmodelpojoDesignaEspecialidad);
			model.pojo.Curso lmodelpojoCurso = model.pojo.CursoDAO.createCurso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : materias, paralelo, estado, ciclos, idcurso
			model.pojo.CursoDAO.save(lmodelpojoCurso);
			model.pojo.Notasest lmodelpojoNotasest = model.pojo.NotasestDAO.createNotasest();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estado, bimestre3, bimestre2, bimestre1
			model.pojo.NotasestDAO.save(lmodelpojoNotasest);
			model.pojo.Ciclo lmodelpojoCiclo = model.pojo.CicloDAO.createCiclo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : curso, estado, director, idciclo
			model.pojo.CicloDAO.save(lmodelpojoCiclo);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateTallerv77Data createTallerv77Data = new CreateTallerv77Data();
			try {
				createTallerv77Data.createTestData();
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
