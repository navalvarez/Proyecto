ALTER TABLE taller1.Matricula DROP CONSTRAINT Matricula;
ALTER TABLE taller1.DesignaEspecialidad DROP CONSTRAINT DesignaEspecialidad;
ALTER TABLE taller1.Designa DROP CONSTRAINT Designa;
ALTER TABLE taller1.Designa DROP CONSTRAINT Designa2;
ALTER TABLE taller1.Asigna DROP CONSTRAINT Asigna;
ALTER TABLE taller1.Asigna DROP CONSTRAINT Asigna2;
ALTER TABLE taller1.Notasest DROP CONSTRAINT estudiante_nota;
ALTER TABLE taller1.Paralelo DROP CONSTRAINT curso_paralelo;
ALTER TABLE taller1.Curso DROP CONSTRAINT FKCurso193454;
ALTER TABLE taller1.Ciclo DROP CONSTRAINT FKCiclo76428;
ALTER TABLE taller1.Materia DROP CONSTRAINT FKMateria696937;
ALTER TABLE taller1.Matricula DROP CONSTRAINT Matricula2;
ALTER TABLE taller1.Notasest DROP CONSTRAINT rParaleloNotasest;
ALTER TABLE taller1.DesignaEspecialidad DROP CONSTRAINT FKDesignaEsp276231;
ALTER TABLE taller1.DesignaEspecialidad DROP CONSTRAINT DesignaEspecialidad2;
ALTER TABLE taller1.Materia_Paralelo DROP CONSTRAINT Notasest;
ALTER TABLE taller1.Materia_Paralelo DROP CONSTRAINT Notasest2;
DROP VIEW IF EXISTS taller1.Vmatricula;
DROP VIEW IF EXISTS taller1.v_matricula;
DROP VIEW IF EXISTS taller1.Vlistaroles;
DROP TABLE IF EXISTS taller1.ProfesorCurso CASCADE;
DROP TABLE IF EXISTS taller1.Estudiante CASCADE;
DROP TABLE IF EXISTS taller1.Director CASCADE;
DROP TABLE IF EXISTS taller1.Matricula CASCADE;
DROP TABLE IF EXISTS taller1.Designa CASCADE;
DROP TABLE IF EXISTS taller1.ProfesorEspecialidad CASCADE;
DROP TABLE IF EXISTS taller1.Aula CASCADE;
DROP TABLE IF EXISTS taller1.Asigna CASCADE;
DROP TABLE IF EXISTS taller1.Paralelo CASCADE;
DROP TABLE IF EXISTS taller1.Materia CASCADE;
DROP TABLE IF EXISTS taller1.DesignaEspecialidad CASCADE;
DROP TABLE IF EXISTS taller1.Curso CASCADE;
DROP TABLE IF EXISTS taller1.Notasest CASCADE;
DROP TABLE IF EXISTS taller1.Ciclo CASCADE;
DROP TABLE IF EXISTS taller1.Materia_Paralelo CASCADE;
CREATE TABLE taller1.ProfesorCurso (Ci int4 NOT NULL, ciclo int4, Nombre varchar(255), Ap varchar(255), Am varchar(255), Correo varchar(255), Telefono varchar(255), Usuario varchar(255), Contrasena varchar(255), Direccion varchar(255), Imagen varchar(255), Estado bool NOT NULL, Unidad varchar(255), Gestion int4 NOT NULL, PRIMARY KEY (Ci));
CREATE TABLE taller1.Estudiante (Rude int4 NOT NULL UNIQUE, Ci int4 NOT NULL, Nombre varchar(255), Ap varchar(255), Am varchar(255), Correo varchar(255), Telefono varchar(255), Usuario varchar(255), Contrasena varchar(255), Direccion varchar(255), Imagen varchar(255), Estado bool NOT NULL, PRIMARY KEY (Ci));
CREATE TABLE taller1.Director (Ci int4 NOT NULL, Unidad varchar(255), Nombre varchar(255), Ap varchar(255), Am varchar(255), Correo varchar(255), Telefono varchar(255), Usuario varchar(255), Contrasena varchar(255), Direccion varchar(255), Imagen varchar(255), Estado bool NOT NULL, PRIMARY KEY (Ci));
CREATE TABLE taller1.Matricula (EstudianteRude int4, Estudianteci int4 NOT NULL, Idparalelo varchar(255) NOT NULL, Fecha date NOT NULL, Estado bool NOT NULL, PRIMARY KEY (Estudianteci, Idparalelo, Fecha));
CREATE TABLE taller1.Designa (ParaleloID varchar(255) NOT NULL, ProfesorCursoCi int4 NOT NULL, Fechadesignacion date, Nrodocumeto varchar(255), Tipodesignacion varchar(255), Estado bool NOT NULL, PRIMARY KEY (ParaleloID, ProfesorCursoCi));
CREATE TABLE taller1.ProfesorEspecialidad (Ci int4 NOT NULL, Especialidad varchar(255), Nombre varchar(255), Ap varchar(255), Am varchar(255), Correo varchar(255), Telefono varchar(255), Usuario varchar(255), Contrasena varchar(255), Direccion varchar(255), Imagen varchar(255), Estado bool NOT NULL, Unidad varchar(255), Gestion int4 NOT NULL, PRIMARY KEY (Ci));
CREATE TABLE taller1.Aula (Idaula varchar(255) NOT NULL, Nombre varchar(255), Estado bool NOT NULL, PRIMARY KEY (Idaula));
CREATE TABLE taller1.Asigna (AulaID varchar(255) NOT NULL, ParaleloID varchar(255) NOT NULL, Horaentrada varchar(255), Horasalida varchar(255), Anno varchar(255), Estado bool NOT NULL, Fecha date, PRIMARY KEY (AulaID, ParaleloID));
CREATE TABLE taller1.Paralelo (idparalelo varchar(255) NOT NULL, CursoID int4 NOT NULL, Nombre varchar(255), Estado bool NOT NULL, PRIMARY KEY (idparalelo));
CREATE TABLE taller1.Materia (Sigla varchar(255) NOT NULL, CursoID int4 NOT NULL, Nombre varchar(255), Progama varchar(255), Nrohora int4 NOT NULL, Estado bool NOT NULL, PRIMARY KEY (Sigla));
CREATE TABLE taller1.DesignaEspecialidad (MateriaID varchar(255) NOT NULL, ProfesorCursoCi int4 NOT NULL, Fechadesignacion date, Nredocumento varchar(255), Estado bool NOT NULL, Gestion int4 NOT NULL, ProfesorEspecialidadCi int4 NOT NULL, PRIMARY KEY (MateriaID, ProfesorCursoCi));
CREATE TABLE taller1.Curso (idcurso int4 NOT NULL, CicloID int4 NOT NULL, Nombre varchar(255), Anno varchar(255), Estado bool NOT NULL, PRIMARY KEY (idcurso));
CREATE TABLE taller1.Notasest (ParaleloID varchar(255) NOT NULL, EstudianteRude int4 NOT NULL, Estudianteci int4 NOT NULL, Bimestre1 int4 NOT NULL, Bimestre2 int4 NOT NULL, Bimestre3 int4 NOT NULL, Estado bool NOT NULL, MateriaSigla varchar(255) NOT NULL, PRIMARY KEY (ParaleloID, EstudianteRude, Estudianteci, MateriaSigla));
CREATE TABLE taller1.Ciclo (idciclo int4 NOT NULL, DirectorID int4 NOT NULL, Nombre varchar(255), Turno varchar(255), Estado bool NOT NULL, PRIMARY KEY (idciclo));
CREATE TABLE taller1.Materia_Paralelo (MateriaSigla varchar(255) NOT NULL, Paraleloidparalelo varchar(255) NOT NULL, PRIMARY KEY (MateriaSigla, Paraleloidparalelo));
CREATE VIEW taller1.vvistaroles AS
select 
row_number() OVER () AS id,
usuario,
contrasena ,
nombre,
ap ,
am ,
estado,
rol::text 
from
(
select null,usuario,
contrasena ,
nombre,
ap ,
am ,
estado,
'D'::text as rol
from
taller1.profesorcurso
UNION
select
null,usuario,
contrasena ,
nombre,
ap ,
am ,
estado,
'PE'::text as rol
from
taller1.profesorespecialidad

UNION
select
null,usuario,
contrasena ,
nombre,
ap ,
am ,
estado,
'D'::text as rol
from
taller1.director
UNION
select
null,usuario,
contrasena ,
nombre,
ap ,
am ,
estado,
'E'::text as rol
from
taller1.estudiante
) as rol;
create view v_matricula as  SELECT row_number() OVER () AS id,
    matricula.idparalelo,
    matricula.fecha
   FROM taller1.matricula
  WHERE (matricula.fecha = ( SELECT max(matricula_1.fecha) AS max
           FROM taller1.matricula matricula_1));
create view vmatricula as  SELECT row_number() OVER () AS id,
    matricula.idparalelo,
    matricula.estudianteci,
    matricula.fecha
   FROM taller1.matricula
  WHERE (matricula.fecha = ( SELECT max(matricula_1.fecha) AS max
           FROM taller1.matricula matricula_1));
ALTER TABLE taller1.Matricula ADD CONSTRAINT Matricula FOREIGN KEY (Estudianteci) REFERENCES taller1.Estudiante (Ci);
ALTER TABLE taller1.DesignaEspecialidad ADD CONSTRAINT DesignaEspecialidad FOREIGN KEY (MateriaID) REFERENCES taller1.Materia (Sigla);
ALTER TABLE taller1.Designa ADD CONSTRAINT Designa FOREIGN KEY (ParaleloID) REFERENCES taller1.Paralelo (idparalelo);
ALTER TABLE taller1.Designa ADD CONSTRAINT Designa2 FOREIGN KEY (ProfesorCursoCi) REFERENCES taller1.ProfesorCurso (Ci);
ALTER TABLE taller1.Asigna ADD CONSTRAINT Asigna FOREIGN KEY (AulaID) REFERENCES taller1.Aula (Idaula);
ALTER TABLE taller1.Asigna ADD CONSTRAINT Asigna2 FOREIGN KEY (ParaleloID) REFERENCES taller1.Paralelo (idparalelo);
ALTER TABLE taller1.Notasest ADD CONSTRAINT estudiante_nota FOREIGN KEY (Estudianteci) REFERENCES taller1.Estudiante (Ci);
ALTER TABLE taller1.Paralelo ADD CONSTRAINT curso_paralelo FOREIGN KEY (CursoID) REFERENCES taller1.Curso (idcurso);
ALTER TABLE taller1.Curso ADD CONSTRAINT FKCurso193454 FOREIGN KEY (CicloID) REFERENCES taller1.Ciclo (idciclo);
ALTER TABLE taller1.Ciclo ADD CONSTRAINT FKCiclo76428 FOREIGN KEY (DirectorID) REFERENCES taller1.Director (Ci);
ALTER TABLE taller1.Materia ADD CONSTRAINT FKMateria696937 FOREIGN KEY (CursoID) REFERENCES taller1.Curso (idcurso);
ALTER TABLE taller1.Matricula ADD CONSTRAINT Matricula2 FOREIGN KEY (Idparalelo) REFERENCES taller1.Paralelo (idparalelo);
ALTER TABLE taller1.Notasest ADD CONSTRAINT rParaleloNotasest FOREIGN KEY (MateriaSigla) REFERENCES taller1.Materia (Sigla);
ALTER TABLE taller1.DesignaEspecialidad ADD CONSTRAINT FKDesignaEsp276231 FOREIGN KEY (ProfesorCursoCi) REFERENCES taller1.ProfesorEspecialidad (Ci);
ALTER TABLE taller1.DesignaEspecialidad ADD CONSTRAINT DesignaEspecialidad2 FOREIGN KEY (ProfesorEspecialidadCi) REFERENCES taller1.ProfesorEspecialidad (Ci);
ALTER TABLE taller1.Materia_Paralelo ADD CONSTRAINT Notasest FOREIGN KEY (MateriaSigla) REFERENCES taller1.Materia (Sigla);
ALTER TABLE taller1.Materia_Paralelo ADD CONSTRAINT Notasest2 FOREIGN KEY (Paraleloidparalelo) REFERENCES taller1.Paralelo (idparalelo);
