 
/**
 * Author:  Daniela Hernandez Valenzuela
 * Created: 1/Junio/2018
 */

CREATE DATABASE Academias;

USE Academias;

CREATE TABLE Academia (
    idAcademia int NOT NULL auto_increment,
    nombre varchar(60),
    PRIMARY KEY (idAcademia)
);

CREATE TABLE EE (
    idEE int NOT NULL auto_increment,
    nombre varchar(70),
    idAcademia int NOT NULL,
    PRIMARY KEY (idEE),
    FOREIGN KEY (idAcademia) REFERENCES Academia(idAcademia)
);

CREATE TABLE Curso (
    idCurso int NOT NULL auto_increment,
    NRC varchar(15),
    programaEducativo varchar(50),
    bloque int,
    seccion int,
    idEE int NOT NULL,
    PRIMARY KEY (idCurso),
    FOREIGN KEY (idEE) REFERENCES EE(idEE)
);

CREATE TABLE Rol (
    idRol int NOT NULL auto_increment,
    nombre varchar(20),
    PRIMARY KEY (idRol)
);

CREATE TABLE Usuario(
    idUsuario int NOT NULL auto_increment,
    nombre varchar(50),
    apellidos varchar(100),
    correo varchar(40),
    telefono varchar(10),
    username varchar(30),
    contrasena varchar(20),
    idRol int NOT NULL,
    PRIMARY KEY (idUsuario),
    FOREIGN KEY (idRol) REFERENCES Rol(idRol)
);

CREATE TABLE Tipo (
    idTipo int NOT NULL auto_increment,
    nombre varchar(30),
    PRIMARY KEY (idTipo)
);

CREATE TABLE Maestro (
    idUsuario int NOT NULL,
    matricula varchar(20),
    idTipo int NOT NULL,
    PRIMARY KEY (idUsuario),
    FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario),
    FOREIGN KEY (idTipo) REFERENCES Tipo(idTipo)
);

CREATE TABLE PeriodoCursoMaestro (
    idPeriodo int NOT NULL auto_increment,
    idCurso int NOT NULL,
    idMaestro int NOT NULL,
    fechaInicio Date,
    fechaFin Date,
    PRIMARY KEY (idPeriodo,idCurso,idMaestro),
    FOREIGN KEY (idCurso) REFERENCES Curso(idCurso),
    FOREIGN KEY (idMaestro) REFERENCES Maestro(idUsuario)
);

CREATE TABLE PlanTrabajo (
    idPlanTrabajo int NOT NULL auto_increment,
    fechaAprobacion Date,
    objetivoGeneral varchar(200),
    programasEducativos varchar(500),
    PRIMARY KEY (idPlanTrabajo)
);

CREATE TABLE PeriodoAcademiaPlanTrabajo (
    idPeriodo int NOT NULL auto_increment,
    idAcademia int NOT NULL,
    idPlanTrabajo int NOT NULL,
    fechaInicio Date,
    fechaFin Date,
    PRIMARY KEY (idPeriodo,idAcademia,idPlanTrabajo),
    FOREIGN KEY (idAcademia) REFERENCES Academia(idAcademia),
    FOREIGN KEY (idPlanTrabajo) REFERENCES PlanTrabajo(idPlanTrabajo)
);

CREATE TABLE EEPlanTrabajo (
    idEEPlanTrabajo int NOT NULL auto_increment,
    nombre varchar(70),
    herramientas varchar(300),
    idPlanTrabajo int NOT NULL,
    PRIMARY KEY (idEEPlanTrabajo),
    FOREIGN KEY (idPlanTrabajo) REFERENCES PlanTrabajo(idPlanTrabajo)
);

CREATE TABLE Tema (
    idTema int NOT NULL auto_increment,
    primerParcial varchar(500),
    segundoParcial varchar(500),
    restoExamenes varchar(500),
    idEEPlanTrabajo int NOT NULL,
    PRIMARY KEY (idTema),
    FOREIGN KEY (idEEPlanTrabajo) REFERENCES EEPlanTrabajo(idEEPlanTrabajo)
);

CREATE TABLE ObjetivoParticular (
    idObjetivoParticular int NOT NULL auto_increment,
    descripcion varchar(300),
    meta varchar(300),
    idPlanTrabajo int NOT NULL,
    PRIMARY KEY (idObjetivoParticular),
    FOREIGN KEY (idPlanTrabajo) REFERENCES PlanTrabajo(idPlanTrabajo)
);

CREATE TABLE Actividad (
    idActividad int NOT NULL auto_increment,
    descripcion varchar(500),
    fecha varchar(500),
    formaOperar varchar(500),
    idObjetivoParticular int NOT NULL,
    PRIMARY KEY (idActividad),
    FOREIGN KEY (idObjetivoParticular) REFERENCES ObjetivoParticular(idObjetivoParticular)
);

CREATE TABLE Evaluacion (
    idEvaluacion int NOT NULL auto_increment,
    criterio varchar(1000),
    porcentaje varchar(500),
    idPlanTrabajo int,
    PRIMARY KEY (idEvaluacion),
    FOREIGN KEY (idPlanTrabajo) REFERENCES PlanTrabajo(idPlanTrabajo)
);

CREATE TABLE Evaluacion_EEPlanTrabajo (
    idEvaluacion int NOT NULL,
    idEEPlanTrabajo int NOT NULL,
    PRIMARY KEY (idEvaluacion, idEEPlanTrabajo),
    FOREIGN KEY (idEvaluacion) REFERENCES Evaluacion(idEvaluacion),
    FOREIGN KEY (idEEPlanTrabajo) REFERENCES EEPlanTrabajo(idEEPlanTrabajo)
);


CREATE TABLE Asistencia (
    idMaestro int NOT NULL,
    idPlanTrabajo int NOT NULL,
    PRIMARY KEY (idMaestro,idPlanTrabajo),
    FOREIGN KEY (idMaestro) REFERENCES Maestro(idUsuario),
    FOREIGN KEY (idPlanTrabajo) REFERENCES PlanTrabajo(idPlanTrabajo)
);
