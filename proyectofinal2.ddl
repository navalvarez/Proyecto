ALTER TABLE proyecto.banco DROP CONSTRAINT fkbanco423148;
ALTER TABLE proyecto.banco DROP CONSTRAINT fkbanco45027;
ALTER TABLE proyecto.datos DROP CONSTRAINT fkdatos267216;
ALTER TABLE proyecto.dicta DROP CONSTRAINT fkdicta698426;
ALTER TABLE proyecto.dicta DROP CONSTRAINT fkdicta501654;
ALTER TABLE proyecto.docentes DROP CONSTRAINT fkdocentes899557;
ALTER TABLE proyecto.evaluaciones DROP CONSTRAINT fkevaluacion987711;
ALTER TABLE proyecto.evaluaciones DROP CONSTRAINT fkevaluacion700762;
ALTER TABLE proyecto.examenes DROP CONSTRAINT fkexamenes328322;
ALTER TABLE proyecto.materias DROP CONSTRAINT fkmaterias750405;
ALTER TABLE proyecto.mepro DROP CONSTRAINT fkmepro122433;
ALTER TABLE proyecto.mepro DROP CONSTRAINT fkmepro242844;
ALTER TABLE proyecto.opciones DROP CONSTRAINT fkopciones128098;
ALTER TABLE proyecto.preguntas DROP CONSTRAINT fkpreguntas358389;
ALTER TABLE proyecto.preguntas DROP CONSTRAINT fkpreguntas133210;
ALTER TABLE proyecto.programacion DROP CONSTRAINT fkprogramaci263409;
ALTER TABLE proyecto.programacion DROP CONSTRAINT fkprogramaci480900;
ALTER TABLE proyecto.respuestas DROP CONSTRAINT fkrespuestas544463;
ALTER TABLE proyecto.respuestas DROP CONSTRAINT fkrespuestas633362;
ALTER TABLE proyecto.rolme DROP CONSTRAINT fkrolme514925;
ALTER TABLE proyecto.rolme DROP CONSTRAINT fkrolme33944;
ALTER TABLE proyecto.universitarios DROP CONSTRAINT fkuniversita443786;
ALTER TABLE proyecto.usurol DROP CONSTRAINT fkusurol643637;
ALTER TABLE proyecto.usurol DROP CONSTRAINT fkusurol734545;
DROP VIEW IF EXISTS proyecto.examen;
DROP VIEW IF EXISTS proyecto.v_usuariorol;
DROP TABLE IF EXISTS proyecto.banco CASCADE;
DROP TABLE IF EXISTS proyecto.carreras CASCADE;
DROP TABLE IF EXISTS proyecto.datos CASCADE;
DROP TABLE IF EXISTS proyecto.dicta CASCADE;
DROP TABLE IF EXISTS proyecto.docentes CASCADE;
DROP TABLE IF EXISTS proyecto.evaluaciones CASCADE;
DROP TABLE IF EXISTS proyecto.examenes CASCADE;
DROP TABLE IF EXISTS proyecto.materias CASCADE;
DROP TABLE IF EXISTS proyecto.menus CASCADE;
DROP TABLE IF EXISTS proyecto.mepro CASCADE;
DROP TABLE IF EXISTS proyecto.opciones CASCADE;
DROP TABLE IF EXISTS proyecto.preguntas CASCADE;
DROP TABLE IF EXISTS proyecto.procesos CASCADE;
DROP TABLE IF EXISTS proyecto.programacion CASCADE;
DROP TABLE IF EXISTS proyecto.respuestas CASCADE;
DROP TABLE IF EXISTS proyecto.roles CASCADE;
DROP TABLE IF EXISTS proyecto.rolme CASCADE;
DROP TABLE IF EXISTS proyecto.tipo CASCADE;
DROP TABLE IF EXISTS proyecto.universitarios CASCADE;
DROP TABLE IF EXISTS proyecto.usuarios CASCADE;
DROP TABLE IF EXISTS proyecto.usurol CASCADE;
CREATE TABLE proyecto.banco (idbanco serial NOT NULL, enunciado varchar(300) NOT NULL, imagen varchar(60), tema int2 NOT NULL, subtema int2, dificultad char(1) NOT NULL, activo bool NOT NULL, iddicta int4, idtipo int4, dictaidusu int4, CONSTRAINT banco_pkey PRIMARY KEY (idbanco));
COMMENT ON TABLE proyecto.banco IS 'Banco de preguntas o enunciados para las evaluaciones';
COMMENT ON COLUMN proyecto.banco.idbanco IS 'Identificador de cada pregunta del banco de preguntas';
COMMENT ON COLUMN proyecto.banco.enunciado IS 'Texto del pregunta o enunciado';
COMMENT ON COLUMN proyecto.banco.imagen IS 'ruta y nombre de la imagen que acompaña al enunciado';
COMMENT ON COLUMN proyecto.banco.tema IS 'Tema de la materia al que corresponde el enunciado';
COMMENT ON COLUMN proyecto.banco.subtema IS 'Subtítulo del tema';
COMMENT ON COLUMN proyecto.banco.dificultad IS 'Grado de dificultad de la pregunta: 1 a 5';
COMMENT ON COLUMN proyecto.banco.activo IS 'True, vigente. False, dado de baja';
COMMENT ON COLUMN proyecto.banco.iddicta IS 'Referencia a la tabla Dicta';
COMMENT ON COLUMN proyecto.banco.idtipo IS 'Referencia a la tabla Tipo';
COMMENT ON COLUMN proyecto.banco.dictaidusu IS 'Referencia a la tabla dicta';
CREATE TABLE proyecto.carreras (idcarr serial NOT NULL, nombre varchar(40) NOT NULL, direccion varchar(60), telefono varchar(15), activo bool NOT NULL, CONSTRAINT carreras_pkey PRIMARY KEY (idcarr));
COMMENT ON TABLE proyecto.carreras IS 'Contiene las carreras registradas en el sistema';
COMMENT ON COLUMN proyecto.carreras.idcarr IS 'Identificador de la carrera';
COMMENT ON COLUMN proyecto.carreras.nombre IS 'Nombre de la carrera';
COMMENT ON COLUMN proyecto.carreras.direccion IS 'Dirección de la carrera';
COMMENT ON COLUMN proyecto.carreras.telefono IS 'Teléfono principal de la carrera';
COMMENT ON COLUMN proyecto.carreras.activo IS 'True, vigente. False, dado de baja';
CREATE TABLE proyecto.datos (idusu int4 NOT NULL, login varchar(15) NOT NULL, password varchar(100) NOT NULL, activo bool NOT NULL, CONSTRAINT datos_pkey PRIMARY KEY (idusu, login));
COMMENT ON TABLE proyecto.datos IS 'Login y contraseña de cada usuario registrado';
COMMENT ON COLUMN proyecto.datos.idusu IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN proyecto.datos.login IS 'Nombre de acceso al sistema del usuario';
COMMENT ON COLUMN proyecto.datos.password IS 'Clave encriptada del usuario';
COMMENT ON COLUMN proyecto.datos.activo IS 'True, vigente. False, dado de baja';
CREATE TABLE proyecto.dicta (iddicta serial NOT NULL, idusu int4 NOT NULL, idcarr int4, sigla char(6), gestion char(4), CONSTRAINT dicta_pkey PRIMARY KEY (iddicta, idusu));
COMMENT ON TABLE proyecto.dicta IS 'Asignación de materias a docentes';
COMMENT ON COLUMN proyecto.dicta.iddicta IS 'Identificador de la asignación de materias';
COMMENT ON COLUMN proyecto.dicta.idusu IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN proyecto.dicta.idcarr IS 'Referencia a la tabla Materias';
COMMENT ON COLUMN proyecto.dicta.sigla IS 'Referencia a la tabla Materias';
COMMENT ON COLUMN proyecto.dicta.gestion IS 'Año que se dicta la materia';
CREATE TABLE proyecto.docentes (idusu int4 NOT NULL, auxiliar bool NOT NULL, CONSTRAINT docentes_pkey PRIMARY KEY (idusu));
COMMENT ON TABLE proyecto.docentes IS 'Tabla de los docentes';
COMMENT ON COLUMN proyecto.docentes.idusu IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN proyecto.docentes.auxiliar IS 'true, auxiliar de cátedra; false, docente';
CREATE TABLE proyecto.evaluaciones (idprog int4 NOT NULL, idexamen int4 NOT NULL, nota int2, CONSTRAINT evaluaciones_pkey PRIMARY KEY (idprog, idexamen));
COMMENT ON TABLE proyecto.evaluaciones IS 'Contiene los examenes asignados a cada uniersitario';
COMMENT ON COLUMN proyecto.evaluaciones.idprog IS 'Referencia a la tabla Programacion';
COMMENT ON COLUMN proyecto.evaluaciones.idexamen IS 'Referencia a la tabla Examenes';
COMMENT ON COLUMN proyecto.evaluaciones.nota IS 'Nota del examen';
CREATE TABLE proyecto.examenes (idexamen serial NOT NULL, nombre varchar(15) NOT NULL, fecha date, hora_ini time(6), hora_fin time(6), penalizacion int2 NOT NULL, activo bool NOT NULL, iddicta int4, dictaidusu int4, CONSTRAINT examenes_pkey PRIMARY KEY (idexamen));
COMMENT ON TABLE proyecto.examenes IS 'Evaluaciones preparadas por un docente';
COMMENT ON COLUMN proyecto.examenes.idexamen IS 'Identificador del examen';
COMMENT ON COLUMN proyecto.examenes.nombre IS 'Nombre del examen';
COMMENT ON COLUMN proyecto.examenes.fecha IS 'Fecha del examen';
COMMENT ON COLUMN proyecto.examenes.hora_ini IS 'Hora de inicio del examen';
COMMENT ON COLUMN proyecto.examenes.hora_fin IS 'Hora de finalización del examen';
COMMENT ON COLUMN proyecto.examenes.penalizacion IS 'porcentaje de penalización a las respuestas incorrectas';
COMMENT ON COLUMN proyecto.examenes.activo IS 'True, vigente. False, dado de baja';
COMMENT ON COLUMN proyecto.examenes.iddicta IS 'Referencia a la tabla dicta';
CREATE TABLE proyecto.materias (idcarr int4 NOT NULL, sigla char(6) NOT NULL, nombre varchar(40) NOT NULL, cargahoraria int2 NOT NULL, "plan" varchar(4) NOT NULL, periodo char(1) NOT NULL, paralelo char(1) NOT NULL, activo bool NOT NULL, CONSTRAINT materias_pkey PRIMARY KEY (idcarr, sigla));
COMMENT ON TABLE proyecto.materias IS 'Contiene las materias registradas en el sistema';
COMMENT ON COLUMN proyecto.materias.idcarr IS 'Identificador de la materia';
COMMENT ON COLUMN proyecto.materias.sigla IS 'Sigla de la materia';
COMMENT ON COLUMN proyecto.materias.nombre IS 'Nombre de la materia';
COMMENT ON COLUMN proyecto.materias.cargahoraria IS 'Carga horaria (hrs/semana)';
COMMENT ON COLUMN proyecto.materias."plan" IS 'Año del plan de estudios en vigencia';
COMMENT ON COLUMN proyecto.materias.periodo IS '1, Primer semestre; 2, Segundo semestre; A, Anual; N, Nivelación; V, Verano';
COMMENT ON COLUMN proyecto.materias.paralelo IS 'Paralelo de la materia';
COMMENT ON COLUMN proyecto.materias.activo IS 'True, vigente. False, dado de baja';
CREATE TABLE proyecto.menus (idmenu serial NOT NULL, nombre varchar(40) NOT NULL, activo bool NOT NULL, CONSTRAINT menus_pkey PRIMARY KEY (idmenu));
COMMENT ON TABLE proyecto.menus IS 'Contiene los menús definidos en el sistema';
COMMENT ON COLUMN proyecto.menus.idmenu IS 'Identificador del menú';
COMMENT ON COLUMN proyecto.menus.nombre IS 'Nombre del menú';
COMMENT ON COLUMN proyecto.menus.activo IS 'True, vigente. False, dado de baja';
CREATE TABLE proyecto.mepro (idmenu int4 NOT NULL, idpro int4 NOT NULL, CONSTRAINT mepro_pkey PRIMARY KEY (idmenu, idpro));
COMMENT ON TABLE proyecto.mepro IS 'Relaciona las tablas Menus con Procesos';
COMMENT ON COLUMN proyecto.mepro.idmenu IS 'Identificador del menú';
COMMENT ON COLUMN proyecto.mepro.idpro IS 'Referencia a la tabla Procesos';
CREATE TABLE proyecto.opciones (idopcion serial NOT NULL, idbanco int4, opcion varchar(100) NOT NULL, correcta bool NOT NULL, CONSTRAINT opciones_pkey PRIMARY KEY (idopcion));
COMMENT ON TABLE proyecto.opciones IS 'Contiene las diferentes opciones de respuesta para cada pregunta del banco de preguntas';
COMMENT ON COLUMN proyecto.opciones.idopcion IS 'Identifcador de las opciones';
COMMENT ON COLUMN proyecto.opciones.idbanco IS 'Referencia a la tabla Banco';
COMMENT ON COLUMN proyecto.opciones.opcion IS 'Una opción de respuesta a la pregunta';
COMMENT ON COLUMN proyecto.opciones.correcta IS 'True, respuesta correcta. False, respueta incorrecta';
CREATE TABLE proyecto.preguntas (idexamen int4 NOT NULL, idbanco int4 NOT NULL, ponderacion int2 NOT NULL, CONSTRAINT preguntas_pkey PRIMARY KEY (idexamen, idbanco));
COMMENT ON TABLE proyecto.preguntas IS 'Contiene las preguntas para un examen específico';
COMMENT ON COLUMN proyecto.preguntas.idexamen IS 'Referencia a la tabla Examenes';
COMMENT ON COLUMN proyecto.preguntas.idbanco IS 'Referencia a la tabla Banco';
COMMENT ON COLUMN proyecto.preguntas.ponderacion IS 'Valoración de cada pregunta';
CREATE TABLE proyecto.procesos (idpro serial NOT NULL, nombre varchar(40) NOT NULL, enlace varchar(40) NOT NULL, descripcion varchar(60), CONSTRAINT procesos_pkey PRIMARY KEY (idpro));
COMMENT ON TABLE proyecto.procesos IS 'Contiene las URLs relativas de todos los procesos u operaciones implementadas, a los que los usuarios acceden desde el navegador.';
COMMENT ON COLUMN proyecto.procesos.idpro IS 'Identificador del proceso';
COMMENT ON COLUMN proyecto.procesos.nombre IS 'Nombre del proceso';
COMMENT ON COLUMN proyecto.procesos.enlace IS 'URL relativa del proceso';
COMMENT ON COLUMN proyecto.procesos.descripcion IS 'Descripción del proceso u operación';
CREATE TABLE proyecto.programacion (idprog serial NOT NULL, idusu int4, idcarr int4, sigla char(6), gestion char(4), CONSTRAINT programacion_pkey PRIMARY KEY (idprog));
COMMENT ON TABLE proyecto.programacion IS 'Asignación de materias a estudiantes';
COMMENT ON COLUMN proyecto.programacion.idprog IS 'Identificador de la programación';
COMMENT ON COLUMN proyecto.programacion.idusu IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN proyecto.programacion.idcarr IS 'Referencia a la tabla Materias';
COMMENT ON COLUMN proyecto.programacion.sigla IS 'Referencia a la tabla Materias';
COMMENT ON COLUMN proyecto.programacion.gestion IS 'Año que se dicta la materia';
CREATE TABLE proyecto.respuestas (idprog int4 NOT NULL, idexamen int4 NOT NULL, idopcion int4 NOT NULL, CONSTRAINT respuestas_pkey PRIMARY KEY (idprog, idexamen, idopcion));
COMMENT ON TABLE proyecto.respuestas IS 'Contiene las respuestas de los estudiantes, de acuerdo a las diferentes opciones de respuestas';
COMMENT ON COLUMN proyecto.respuestas.idprog IS 'Referencia a la tabla Evaluaciones';
COMMENT ON COLUMN proyecto.respuestas.idexamen IS 'Referencia a la tabla Evaluaciones';
COMMENT ON COLUMN proyecto.respuestas.idopcion IS 'Referencia a la tabla Opciones';
CREATE TABLE proyecto.roles (idrol serial NOT NULL, nombre varchar(40) NOT NULL, activo bool NOT NULL, CONSTRAINT roles_pkey PRIMARY KEY (idrol));
COMMENT ON TABLE proyecto.roles IS 'Contiene los roles definidos en el sistema';
COMMENT ON COLUMN proyecto.roles.idrol IS 'Identificador del rol';
COMMENT ON COLUMN proyecto.roles.nombre IS 'Nombre del rol';
COMMENT ON COLUMN proyecto.roles.activo IS 'True, vigente. False, dado de baja';
CREATE TABLE proyecto.rolme (idrol int4 NOT NULL, idmenu int4 NOT NULL, CONSTRAINT rolme_pkey PRIMARY KEY (idrol, idmenu));
COMMENT ON TABLE proyecto.rolme IS 'Relaciona las tablas Menus con Procesos';
COMMENT ON COLUMN proyecto.rolme.idrol IS 'Referencia a la tabla Roles';
COMMENT ON COLUMN proyecto.rolme.idmenu IS 'Referencia a la tabla Menus';
CREATE TABLE proyecto.tipo (idtipo serial NOT NULL, nombre varchar(40) NOT NULL, activo bool NOT NULL, CONSTRAINT tipo_pkey PRIMARY KEY (idtipo));
COMMENT ON TABLE proyecto.tipo IS 'Especificación del tipo de evaluación';
COMMENT ON COLUMN proyecto.tipo.idtipo IS 'Identificador de tipo de evaluación';
COMMENT ON COLUMN proyecto.tipo.nombre IS 'Nombre del tipo de evaluación: Falso Verdadero, Simple o Multiple';
COMMENT ON COLUMN proyecto.tipo.activo IS 'True, vigente. False, dado de baja';
CREATE TABLE proyecto.universitarios (idusu int4 NOT NULL, ru int4 NOT NULL, CONSTRAINT universitarios_pkey PRIMARY KEY (idusu));
COMMENT ON TABLE proyecto.universitarios IS 'Tabla de los Universitarios';
COMMENT ON COLUMN proyecto.universitarios.idusu IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN proyecto.universitarios.ru IS 'Registro universitario';
CREATE TABLE proyecto.usuarios (idusu serial NOT NULL, nombre varchar(40) NOT NULL, apellido1 varchar(40) NOT NULL, apellido2 varchar(40), sexo char(1) NOT NULL, f_nac date NOT NULL, cedula varchar(15) NOT NULL, telefono varchar(15), direccion varchar(60), foto varchar(60) NOT NULL, activo bool NOT NULL, CONSTRAINT usuarios_pkey PRIMARY KEY (idusu));
COMMENT ON TABLE proyecto.usuarios IS 'Contiene los datos de los usuarios del sistema';
COMMENT ON COLUMN proyecto.usuarios.idusu IS 'Identificador del usuario';
COMMENT ON COLUMN proyecto.usuarios.nombre IS 'Nombre del usuario';
COMMENT ON COLUMN proyecto.usuarios.apellido1 IS 'Primer apellido';
COMMENT ON COLUMN proyecto.usuarios.apellido2 IS 'Segundo apellido';
COMMENT ON COLUMN proyecto.usuarios.sexo IS 'M, masculino; F, femenino';
COMMENT ON COLUMN proyecto.usuarios.f_nac IS 'Fecha de nacimiento';
COMMENT ON COLUMN proyecto.usuarios.cedula IS 'Número de identificación personal';
COMMENT ON COLUMN proyecto.usuarios.telefono IS 'Teléfono principal del usuario';
COMMENT ON COLUMN proyecto.usuarios.direccion IS 'Dirección del usuario';
COMMENT ON COLUMN proyecto.usuarios.foto IS 'Ruta relativa y nombre de archivo de la foto del usuario';
COMMENT ON COLUMN proyecto.usuarios.activo IS 'True, vigente. False, dado de baja';
CREATE TABLE proyecto.usurol (idusu int4 NOT NULL, idrol int4 NOT NULL, CONSTRAINT usurol_pkey PRIMARY KEY (idusu, idrol));
COMMENT ON TABLE proyecto.usurol IS 'Relaciona las tablas Usuarios con Roles';
COMMENT ON COLUMN proyecto.usurol.idusu IS 'Referencia a la tabla Usuarios';
COMMENT ON COLUMN proyecto.usurol.idrol IS 'Referencia a la tabla Roles';
create view v_usuariorol as  SELECT row_number() OVER () AS id,
    u.idusu,
    u.nombre AS unombre,
    u.apellido1,
    u.apellido2,
    r.nombre,
    d.login,
    d.password,
    d.activo
   FROM (proyecto.usuarios u
     JOIN proyecto.datos d ON ((u.idusu = d.idusu))),
    proyecto.usurol ur,
    proyecto.roles r
  WHERE ((u.idusu = ur.idusu) AND (ur.idrol = r.idrol));
create view examen as  SELECT u.idusu,
    u.nombre,
    u.apellido1,
    u.apellido2,
    ev.nota
   FROM proyecto.usuarios u,
    proyecto.datos d,
    proyecto.universitarios un,
    proyecto.programacion p,
    proyecto.evaluaciones ev
  WHERE (((((u.idusu = d.idusu) AND (u.idusu = un.idusu)) AND (un.idusu = p.idusu)) AND (p.idprog = ev.idprog)) AND (ev.nota >= 51));
ALTER TABLE proyecto.banco ADD CONSTRAINT fkbanco423148 FOREIGN KEY (iddicta, dictaidusu) REFERENCES proyecto.dicta (iddicta, idusu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.banco ADD CONSTRAINT fkbanco45027 FOREIGN KEY (idtipo) REFERENCES proyecto.tipo (idtipo) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.datos ADD CONSTRAINT fkdatos267216 FOREIGN KEY (idusu) REFERENCES proyecto.usuarios (idusu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.dicta ADD CONSTRAINT fkdicta698426 FOREIGN KEY (idusu) REFERENCES proyecto.docentes (idusu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.dicta ADD CONSTRAINT fkdicta501654 FOREIGN KEY (idcarr, sigla) REFERENCES proyecto.materias (idcarr, sigla) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.docentes ADD CONSTRAINT fkdocentes899557 FOREIGN KEY (idusu) REFERENCES proyecto.usuarios (idusu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.evaluaciones ADD CONSTRAINT fkevaluacion987711 FOREIGN KEY (idprog) REFERENCES proyecto.programacion (idprog) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.evaluaciones ADD CONSTRAINT fkevaluacion700762 FOREIGN KEY (idexamen) REFERENCES proyecto.examenes (idexamen) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.examenes ADD CONSTRAINT fkexamenes328322 FOREIGN KEY (iddicta, dictaidusu) REFERENCES proyecto.dicta (iddicta, idusu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.materias ADD CONSTRAINT fkmaterias750405 FOREIGN KEY (idcarr) REFERENCES proyecto.carreras (idcarr) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.mepro ADD CONSTRAINT fkmepro122433 FOREIGN KEY (idmenu) REFERENCES proyecto.menus (idmenu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.mepro ADD CONSTRAINT fkmepro242844 FOREIGN KEY (idpro) REFERENCES proyecto.procesos (idpro) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.opciones ADD CONSTRAINT fkopciones128098 FOREIGN KEY (idbanco) REFERENCES proyecto.banco (idbanco) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.preguntas ADD CONSTRAINT fkpreguntas358389 FOREIGN KEY (idexamen) REFERENCES proyecto.examenes (idexamen) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.preguntas ADD CONSTRAINT fkpreguntas133210 FOREIGN KEY (idbanco) REFERENCES proyecto.banco (idbanco) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.programacion ADD CONSTRAINT fkprogramaci263409 FOREIGN KEY (idusu) REFERENCES proyecto.universitarios (idusu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.programacion ADD CONSTRAINT fkprogramaci480900 FOREIGN KEY (idcarr, sigla) REFERENCES proyecto.materias (idcarr, sigla) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.respuestas ADD CONSTRAINT fkrespuestas544463 FOREIGN KEY (idprog, idexamen) REFERENCES proyecto.evaluaciones (idprog, idexamen) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.respuestas ADD CONSTRAINT fkrespuestas633362 FOREIGN KEY (idopcion) REFERENCES proyecto.opciones (idopcion) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.rolme ADD CONSTRAINT fkrolme514925 FOREIGN KEY (idrol) REFERENCES proyecto.roles (idrol) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.rolme ADD CONSTRAINT fkrolme33944 FOREIGN KEY (idmenu) REFERENCES proyecto.menus (idmenu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.universitarios ADD CONSTRAINT fkuniversita443786 FOREIGN KEY (idusu) REFERENCES proyecto.usuarios (idusu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.usurol ADD CONSTRAINT fkusurol643637 FOREIGN KEY (idusu) REFERENCES proyecto.usuarios (idusu) ON UPDATE No action ON DELETE No action;
ALTER TABLE proyecto.usurol ADD CONSTRAINT fkusurol734545 FOREIGN KEY (idrol) REFERENCES proyecto.roles (idrol) ON UPDATE No action ON DELETE No action;
INSERT INTO proyecto.usuarios(idusu, nombre, apellido1, apellido2, sexo, f_nac, cedula, telefono, direccion, foto, activo) VALUES (1, 'Carlos', 'Perez', 'Cota', 'M', '24/09/2000', '4143805', '591673467', null, null, null);
