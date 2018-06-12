/*
 * siacad.sql
 *
 * Copyright (c) 2018, SiAcad
 * All rights reserved.
 */
 
/**
 * Author:  Daniel Escamilla Cortés
 * Created: May 8, 2018
 */


CREATE DATABASE SiAcad;

USE SiAcad;

CREATE TABLE Rol (
    idRol int NOT NULL auto_increment,
    nombre varchar(20),
    PRIMARY KEY (idRol)
);

CREATE TABLE UsuarioAcademico (
    idUsuarioAcademico int NOT NULL auto_increment,
    nombre varchar(50),
    apellidos varchar(100),
    correo varchar(40),
    telefono varchar(10),
    username varchar(30),
    contrasena varchar(20),
    idRol int NOT NULL,
    PRIMARY KEY (idUsuarioAcademico),
    FOREIGN KEY (idRol) REFERENCES Rol(idRol)
);

CREATE TABLE Tipo (
    idTipo int NOT NULL auto_increment,
    nombre varchar(30),
    PRIMARY KEY (idTipo)
);

CREATE TABLE Maestro (
    idUsuarioAcademico int NOT NULL,
    noPersonal varchar(20),
    idTipo int NOT NULL,
    PRIMARY KEY (idUsuarioAcademico),
    FOREIGN KEY (idUsuarioAcademico) REFERENCES UsuarioAcademico(idUsuarioAcademico),
    FOREIGN KEY (idTipo) REFERENCES Tipo(idTipo)
);

CREATE TABLE Academia (
    idAcademia int NOT NULL auto_increment,
    nombre varchar(60),
    idCoordinador int NOT NULL,
    PRIMARY KEY (idAcademia, idCoordinador),
    FOREIGN KEY (idCoordinador) REFERENCES Maestro(idUsuarioAcademico)
);

CREATE TABLE ExperienciaEducativa (
    idExperienciaEducativa int NOT NULL auto_increment,
    nombre varchar(70),
    idAcademia int NOT NULL,
    PRIMARY KEY (idExperienciaEducativa),
    FOREIGN KEY (idAcademia) REFERENCES Academia(idAcademia)
);

CREATE TABLE Curso (
    idCurso int NOT NULL auto_increment,
    NRC varchar(15),
    programaEducativo varchar(50),
    bloque int,
    seccion int,
    idExperienciaEducativa int NOT NULL,
    PRIMARY KEY (idCurso),
    FOREIGN KEY (idExperienciaEducativa) REFERENCES ExperienciaEducativa(idExperienciaEducativa)
);


CREATE TABLE PeriodoC (
    idPeriodo int NOT NULL auto_increment,
    idCurso int NOT NULL,
    idMaestro int NOT NULL,
    fechaInicio Date,
    fechaFin Date,
    PRIMARY KEY (idPeriodo,idCurso,idMaestro),
    FOREIGN KEY (idCurso) REFERENCES Curso(idCurso),
    FOREIGN KEY (idMaestro) REFERENCES Maestro(idUsuarioAcademico)
);

CREATE TABLE PlanDeTrabajo (
    idPlanDeTrabajo int NOT NULL auto_increment,
    formato varchar(50),
    fechaAprobacion Date,
    objetivoGeneral varchar(200),
    programaEducativo varchar(500),
    PRIMARY KEY (idPlanDeTrabajo)
);

CREATE TABLE PeriodoA (
    idPeriodo int NOT NULL auto_increment,
    idAcademia int NOT NULL,
    idPlanDeTrabajo int NOT NULL,
    fechaInicio Date,
    fechaFin Date,
    PRIMARY KEY (idPeriodo,idAcademia,idPlanDeTrabajo),
    FOREIGN KEY (idAcademia) REFERENCES Academia(idAcademia),
    FOREIGN KEY (idPlanDeTrabajo) REFERENCES PlanDeTrabajo(idPlanDeTrabajo)
);

CREATE TABLE ObjetivoParticular (
    idObjetivoParticular int NOT NULL auto_increment,
    objetivo varchar(200),
    metas varchar(500),
    idPlanDeTrabajo int,
    PRIMARY KEY (idObjetivoParticular),
    FOREIGN KEY (idPlanDeTrabajo) REFERENCES PlanDeTrabajo(idPlanDeTrabajo)
);

CREATE TABLE Actividad (
    idActividad int NOT NULL auto_increment,
    accion varchar(200),    
    fecha varchar(150),
    formaDeOperar varchar(500),
    idObjetivoParticular int,
    PRIMARY KEY (idActividad),
    FOREIGN KEY (idObjetivoParticular) REFERENCES ObjetivoParticular(idObjetivoParticular)
);

CREATE TABLE EEPlanTrabajo (
    idEEPlanTrabajo int NOT NULL auto_increment,
    nombre varchar(70),
    herramientas varchar(300),
    idPlanDeTrabajo int NOT NULL,
    PRIMARY KEY (idEEPlanTrabajo),
    FOREIGN KEY (idPlanDeTrabajo) REFERENCES PlanDeTrabajo(idPlanDeTrabajo)
);

CREATE TABLE Tema (
    idTema int NOT NULL auto_increment,
    primerParcial varchar(500),
    segundoParcial varchar(500),
    resto varchar(500),
    idEEPlanTrabajo int NOT NULL,
    PRIMARY KEY (idTema),
    FOREIGN KEY (idEEPlanTrabajo) REFERENCES EEPlanTrabajo(idEEPlanTrabajo)
);

CREATE TABLE Participante_PlanTrabajo (
    idMaestro int NOT NULL,
    idPlanDeTrabajo int NOT NULL,
    PRIMARY KEY (idMaestro,idPlanDeTrabajo),
    FOREIGN KEY (idMaestro) REFERENCES Maestro(idUsuarioAcademico),
    FOREIGN KEY (idPlanDeTrabajo) REFERENCES PlanDeTrabajo(idPlanDeTrabajo)
);

CREATE TABLE PlanDeCurso (
    idPlanDeCurso int NOT NULL auto_increment,
    formato varchar(50),
    objetivoGeneral varchar(1000),
    fecha Date,
    idCurso int,
    PRIMARY KEY (idPlanDeCurso),
    FOREIGN KEY (idCurso) REFERENCES Curso(idCurso)
);

CREATE TABLE Bibliografia (
    idBibliografia int NOT NULL auto_increment,
    titulo varchar(150),
    autor varchar(200),
    editorial varchar(100),
    anio int,
    idPlanDeCurso int NOT NULL,
    PRIMARY KEY (idBibliografia),
    FOREIGN KEY (idPlanDeCurso) REFERENCES PlanDeCurso (idPlanDeCurso)
);

CREATE TABLE Evaluacion (
    idEvaluacion int NOT NULL auto_increment,
    porcentaje int,
    instrumento varchar(150),
    idEEPlanTrabajo int,
    PRIMARY KEY (idEvaluacion),
    FOREIGN KEY (idEEPlanTrabajo) REFERENCES EEPlanTrabajo(idEEPlanTrabajo)
);

CREATE TABLE Evaluacion_PlanCurso (
    idEvaluacionP int NOT NULL auto_increment,
    unidad varchar(200),
    criterioDeEvaluacion varchar(150),
    porcentaje int,
    fechas varchar(150),
    idPlanDeCurso int,
    PRIMARY KEY (idEvaluacionP),
    FOREIGN KEY (idPlanDeCurso) REFERENCES PlanDeCurso(idPlanDeCurso)
);

CREATE TABLE Planeacion (
    idPlaneacion int NOT NULL auto_increment,
    fechas varchar(100),
    temas varchar(1000),
    unidad int,
    tecnicasDidacticas varchar(800),
    idPlanDeCurso int,
    PRIMARY KEY (idPlaneacion),
    FOREIGN KEY (idPlanDeCurso) REFERENCES PlanDeCurso(idPlanDeCurso)    
);

CREATE TABLE Reunion (
    idReunion int NOT NULL auto_increment,
    idAcademia int NOT NULL,
    nombre varchar(100),
    fechaInicio date,
    fechaFin date,
    informacionAdicional varchar(300),
    lugar varchar(150),
    PRIMARY KEY (idReunion, idAcademia),
    FOREIGN KEY (idAcademia) REFERENCES Academia(idAcademia)
);

CREATE TABLE MinutaDeAcademia (
    idMinutaDeAcademia int NOT NULL auto_increment,
    idReunion int NOT NULL,
    fecha date,
    hora varchar(10),
    objetivo varchar(300),
    temas varchar(1500),
    conclusiones varchar(500),   
    PRIMARY KEY (idMinutaDeAcademia),
    FOREIGN KEY (idReunion) REFERENCES Reunion(idReunion)
);

CREATE TABLE Participante_Minuta (
    idMaestro int NOT NULL,
    idMinutaDeAcademia int NOT NULL,
    PRIMARY KEY (idMaestro,idMinutaDeAcademia),
    FOREIGN KEY (idMaestro) REFERENCES Maestro(idUsuarioAcademico),
    FOREIGN KEY (idMinutaDeAcademia) REFERENCES MinutaDeAcademia(idMinutaDeAcademia)
);

CREATE TABLE PeriodoE (
    idPeriodo int NOT NULL auto_increment,
    idAcademia int NOT NULL,
    idReunion int NOT NULL,
    fechaInicio Date,
    fechaFin Date,
    PRIMARY KEY (idPeriodo, idAcademia, idReunion),
    FOREIGN KEY (idAcademia) REFERENCES Academia(idAcademia),
    FOREIGN KEY (idReunion) REFERENCES Reunion(idReunion)
);
