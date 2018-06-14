-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: siacad
-- ------------------------------------------------------
-- Server version	5.7.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `academia`
--

DROP TABLE IF EXISTS `academia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `academia` (
  `idAcademia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) DEFAULT NULL,
  `idCoordinador` int(11) NOT NULL,
  PRIMARY KEY (`idAcademia`,`idCoordinador`),
  KEY `idCoordinador` (`idCoordinador`),
  CONSTRAINT `academia_ibfk_1` FOREIGN KEY (`idCoordinador`) REFERENCES `maestro` (`idUsuarioAcademico`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `academia`
--

LOCK TABLES `academia` WRITE;
/*!40000 ALTER TABLE `academia` DISABLE KEYS */;
INSERT INTO `academia` VALUES (1,'Comunicacion',1),(2,'Matematicas',2),(3,'Programacion',3);
/*!40000 ALTER TABLE `academia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `actividad`
--

DROP TABLE IF EXISTS `actividad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `actividad` (
  `idActividad` int(11) NOT NULL AUTO_INCREMENT,
  `accion` varchar(200) DEFAULT NULL,
  `fecha` varchar(150) DEFAULT NULL,
  `formaDeOperar` varchar(500) DEFAULT NULL,
  `idObjetivoParticular` int(11) DEFAULT NULL,
  PRIMARY KEY (`idActividad`),
  KEY `idObjetivoParticular` (`idObjetivoParticular`),
  CONSTRAINT `actividad_ibfk_1` FOREIGN KEY (`idObjetivoParticular`) REFERENCES `objetivoparticular` (`idObjetivoParticular`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actividad`
--

LOCK TABLES `actividad` WRITE;
/*!40000 ALTER TABLE `actividad` DISABLE KEYS */;
INSERT INTO `actividad` VALUES (5,'Actividad','Fecha','Forma de operar',14);
/*!40000 ALTER TABLE `actividad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bibliografia`
--

DROP TABLE IF EXISTS `bibliografia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bibliografia` (
  `idBibliografia` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(150) DEFAULT NULL,
  `autor` varchar(200) DEFAULT NULL,
  `editorial` varchar(100) DEFAULT NULL,
  `anio` int(11) DEFAULT NULL,
  `idPlanDeCurso` int(11) NOT NULL,
  PRIMARY KEY (`idBibliografia`),
  KEY `idPlanDeCurso` (`idPlanDeCurso`),
  CONSTRAINT `bibliografia_ibfk_1` FOREIGN KEY (`idPlanDeCurso`) REFERENCES `plandecurso` (`idPlanDeCurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bibliografia`
--

LOCK TABLES `bibliografia` WRITE;
/*!40000 ALTER TABLE `bibliografia` DISABLE KEYS */;
/*!40000 ALTER TABLE `bibliografia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `curso` (
  `idCurso` int(11) NOT NULL AUTO_INCREMENT,
  `NRC` varchar(15) DEFAULT NULL,
  `programaEducativo` varchar(50) DEFAULT NULL,
  `bloque` int(11) DEFAULT NULL,
  `seccion` int(11) DEFAULT NULL,
  `idExperienciaEducativa` int(11) NOT NULL,
  PRIMARY KEY (`idCurso`),
  KEY `idExperienciaEducativa` (`idExperienciaEducativa`),
  CONSTRAINT `curso_ibfk_1` FOREIGN KEY (`idExperienciaEducativa`) REFERENCES `experienciaeducativa` (`idExperienciaEducativa`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES (1,'312645','Ingenieria De Software',2,2,1),(2,'961885','Ingenieria De Software',1,2,6),(3,'318541','Ingenieria De Software',3,2,1),(4,'958132','Ingenieria De Software',2,1,2),(5,'358468','Ingenieria De Software',1,1,3),(6,'815321','Ingenieria De Software',3,2,4),(7,'131523','Ingenieria De Software',5,1,5);
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eeplantrabajo`
--

DROP TABLE IF EXISTS `eeplantrabajo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eeplantrabajo` (
  `idEEPlanTrabajo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(70) DEFAULT NULL,
  `herramientas` varchar(300) DEFAULT NULL,
  `idPlanDeTrabajo` int(11) NOT NULL,
  PRIMARY KEY (`idEEPlanTrabajo`),
  KEY `idPlanDeTrabajo` (`idPlanDeTrabajo`),
  CONSTRAINT `eeplantrabajo_ibfk_1` FOREIGN KEY (`idPlanDeTrabajo`) REFERENCES `plandetrabajo` (`idPlanDeTrabajo`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eeplantrabajo`
--

LOCK TABLES `eeplantrabajo` WRITE;
/*!40000 ALTER TABLE `eeplantrabajo` DISABLE KEYS */;
INSERT INTO `eeplantrabajo` VALUES (25,'Programacion II','herramientas',9),(26,'Principios de Diseño','',9),(27,'Principios de Construccion','',9);
/*!40000 ALTER TABLE `eeplantrabajo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evaluacion`
--

DROP TABLE IF EXISTS `evaluacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluacion` (
  `idEvaluacion` int(11) NOT NULL AUTO_INCREMENT,
  `porcentaje` int(11) DEFAULT NULL,
  `instrumento` varchar(150) DEFAULT NULL,
  `idEEPlanTrabajo` int(11) DEFAULT NULL,
  PRIMARY KEY (`idEvaluacion`),
  KEY `idEEPlanTrabajo` (`idEEPlanTrabajo`),
  CONSTRAINT `evaluacion_ibfk_1` FOREIGN KEY (`idEEPlanTrabajo`) REFERENCES `eeplantrabajo` (`idEEPlanTrabajo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluacion`
--

LOCK TABLES `evaluacion` WRITE;
/*!40000 ALTER TABLE `evaluacion` DISABLE KEYS */;
INSERT INTO `evaluacion` VALUES (6,70,'criterio',25);
/*!40000 ALTER TABLE `evaluacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evaluacion_plancurso`
--

DROP TABLE IF EXISTS `evaluacion_plancurso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluacion_plancurso` (
  `idEvaluacionP` int(11) NOT NULL AUTO_INCREMENT,
  `unidad` varchar(200) DEFAULT NULL,
  `criterioDeEvaluacion` varchar(150) DEFAULT NULL,
  `porcentaje` int(11) DEFAULT NULL,
  `fechas` varchar(150) DEFAULT NULL,
  `idPlanDeCurso` int(11) DEFAULT NULL,
  PRIMARY KEY (`idEvaluacionP`),
  KEY `idPlanDeCurso` (`idPlanDeCurso`),
  CONSTRAINT `evaluacion_plancurso_ibfk_1` FOREIGN KEY (`idPlanDeCurso`) REFERENCES `plandecurso` (`idPlanDeCurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluacion_plancurso`
--

LOCK TABLES `evaluacion_plancurso` WRITE;
/*!40000 ALTER TABLE `evaluacion_plancurso` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluacion_plancurso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experienciaeducativa`
--

DROP TABLE IF EXISTS `experienciaeducativa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `experienciaeducativa` (
  `idExperienciaEducativa` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(70) DEFAULT NULL,
  `idAcademia` int(11) NOT NULL,
  PRIMARY KEY (`idExperienciaEducativa`),
  KEY `idAcademia` (`idAcademia`),
  CONSTRAINT `experienciaeducativa_ibfk_1` FOREIGN KEY (`idAcademia`) REFERENCES `academia` (`idAcademia`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experienciaeducativa`
--

LOCK TABLES `experienciaeducativa` WRITE;
/*!40000 ALTER TABLE `experienciaeducativa` DISABLE KEYS */;
INSERT INTO `experienciaeducativa` VALUES (1,'Programacion II',3),(2,'Principios de Diseño',3),(3,'Principios de Construccion',3),(4,'Paradigmas de Programacion',1),(5,'Matematicas Discretas',2),(6,'Procesos',2),(7,'Ingles',2),(9,'Programacion II',1),(10,'Algebra',1),(11,'Estadistica',2),(12,'Redes',1);
/*!40000 ALTER TABLE `experienciaeducativa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maestro`
--

DROP TABLE IF EXISTS `maestro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `maestro` (
  `idUsuarioAcademico` int(11) NOT NULL,
  `noPersonal` varchar(20) DEFAULT NULL,
  `idTipo` int(11) NOT NULL,
  PRIMARY KEY (`idUsuarioAcademico`),
  KEY `idTipo` (`idTipo`),
  CONSTRAINT `maestro_ibfk_1` FOREIGN KEY (`idUsuarioAcademico`) REFERENCES `usuarioacademico` (`idUsuarioAcademico`),
  CONSTRAINT `maestro_ibfk_2` FOREIGN KEY (`idTipo`) REFERENCES `tipo` (`idTipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maestro`
--

LOCK TABLES `maestro` WRITE;
/*!40000 ALTER TABLE `maestro` DISABLE KEYS */;
INSERT INTO `maestro` VALUES (1,'123456',1),(2,'654321',2),(3,'456123',3);
/*!40000 ALTER TABLE `maestro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `minutadeacademia`
--

DROP TABLE IF EXISTS `minutadeacademia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `minutadeacademia` (
  `idMinutaDeAcademia` int(11) NOT NULL AUTO_INCREMENT,
  `idReunion` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `hora` varchar(10) DEFAULT NULL,
  `objetivo` varchar(300) DEFAULT NULL,
  `temas` varchar(1500) DEFAULT NULL,
  `conclusiones` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`idMinutaDeAcademia`),
  KEY `idReunion` (`idReunion`),
  CONSTRAINT `minutadeacademia_ibfk_1` FOREIGN KEY (`idReunion`) REFERENCES `reunion` (`idReunion`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `minutadeacademia`
--

LOCK TABLES `minutadeacademia` WRITE;
/*!40000 ALTER TABLE `minutadeacademia` DISABLE KEYS */;
INSERT INTO `minutadeacademia` VALUES (1,1,'2018-06-11','hora','Objetivo','Temasssss','Conclucsiones varias');
/*!40000 ALTER TABLE `minutadeacademia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `objetivoparticular`
--

DROP TABLE IF EXISTS `objetivoparticular`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `objetivoparticular` (
  `idObjetivoParticular` int(11) NOT NULL AUTO_INCREMENT,
  `objetivo` varchar(200) DEFAULT NULL,
  `metas` varchar(500) DEFAULT NULL,
  `idPlanDeTrabajo` int(11) DEFAULT NULL,
  PRIMARY KEY (`idObjetivoParticular`),
  KEY `idPlanDeTrabajo` (`idPlanDeTrabajo`),
  CONSTRAINT `objetivoparticular_ibfk_1` FOREIGN KEY (`idPlanDeTrabajo`) REFERENCES `plandetrabajo` (`idPlanDeTrabajo`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `objetivoparticular`
--

LOCK TABLES `objetivoparticular` WRITE;
/*!40000 ALTER TABLE `objetivoparticular` DISABLE KEYS */;
INSERT INTO `objetivoparticular` VALUES (14,'Objetivo particular','Meta',9);
/*!40000 ALTER TABLE `objetivoparticular` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `participante_minuta`
--

DROP TABLE IF EXISTS `participante_minuta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `participante_minuta` (
  `idMaestro` int(11) NOT NULL,
  `idMinutaDeAcademia` int(11) NOT NULL,
  PRIMARY KEY (`idMaestro`,`idMinutaDeAcademia`),
  KEY `idMinutaDeAcademia` (`idMinutaDeAcademia`),
  CONSTRAINT `participante_minuta_ibfk_1` FOREIGN KEY (`idMaestro`) REFERENCES `maestro` (`idUsuarioAcademico`),
  CONSTRAINT `participante_minuta_ibfk_2` FOREIGN KEY (`idMinutaDeAcademia`) REFERENCES `minutadeacademia` (`idMinutaDeAcademia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `participante_minuta`
--

LOCK TABLES `participante_minuta` WRITE;
/*!40000 ALTER TABLE `participante_minuta` DISABLE KEYS */;
INSERT INTO `participante_minuta` VALUES (1,1),(3,1);
/*!40000 ALTER TABLE `participante_minuta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `participante_plantrabajo`
--

DROP TABLE IF EXISTS `participante_plantrabajo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `participante_plantrabajo` (
  `idMaestro` int(11) NOT NULL,
  `idPlanDeTrabajo` int(11) NOT NULL,
  KEY `idPlanDeTrabajo` (`idPlanDeTrabajo`),
  KEY `participante_plantrabajo_ibfk_1_idx` (`idMaestro`),
  CONSTRAINT `participante_plantrabajo_ibfk_1` FOREIGN KEY (`idMaestro`) REFERENCES `maestro` (`idUsuarioAcademico`),
  CONSTRAINT `participante_plantrabajo_ibfk_2` FOREIGN KEY (`idPlanDeTrabajo`) REFERENCES `plandetrabajo` (`idPlanDeTrabajo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `participante_plantrabajo`
--

LOCK TABLES `participante_plantrabajo` WRITE;
/*!40000 ALTER TABLE `participante_plantrabajo` DISABLE KEYS */;
INSERT INTO `participante_plantrabajo` VALUES (3,9);
/*!40000 ALTER TABLE `participante_plantrabajo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `periodoa`
--

DROP TABLE IF EXISTS `periodoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `periodoa` (
  `idPeriodo` int(11) NOT NULL AUTO_INCREMENT,
  `idAcademia` int(11) NOT NULL,
  `idPlanDeTrabajo` int(11) NOT NULL,
  `fechaInicio` date DEFAULT NULL,
  `fechaFin` date DEFAULT NULL,
  PRIMARY KEY (`idPeriodo`,`idAcademia`,`idPlanDeTrabajo`),
  KEY `idAcademia` (`idAcademia`),
  KEY `idPlanDeTrabajo` (`idPlanDeTrabajo`),
  CONSTRAINT `periodoa_ibfk_1` FOREIGN KEY (`idAcademia`) REFERENCES `academia` (`idAcademia`),
  CONSTRAINT `periodoa_ibfk_2` FOREIGN KEY (`idPlanDeTrabajo`) REFERENCES `plandetrabajo` (`idPlanDeTrabajo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `periodoa`
--

LOCK TABLES `periodoa` WRITE;
/*!40000 ALTER TABLE `periodoa` DISABLE KEYS */;
/*!40000 ALTER TABLE `periodoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `periodoc`
--

DROP TABLE IF EXISTS `periodoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `periodoc` (
  `idPeriodo` int(11) NOT NULL AUTO_INCREMENT,
  `idCurso` int(11) NOT NULL,
  `idMaestro` int(11) NOT NULL,
  `fechaInicio` date DEFAULT NULL,
  `fechaFin` date DEFAULT NULL,
  PRIMARY KEY (`idPeriodo`,`idCurso`,`idMaestro`),
  KEY `idCurso` (`idCurso`),
  KEY `idMaestro` (`idMaestro`),
  CONSTRAINT `periodoc_ibfk_1` FOREIGN KEY (`idCurso`) REFERENCES `curso` (`idCurso`),
  CONSTRAINT `periodoc_ibfk_2` FOREIGN KEY (`idMaestro`) REFERENCES `maestro` (`idUsuarioAcademico`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `periodoc`
--

LOCK TABLES `periodoc` WRITE;
/*!40000 ALTER TABLE `periodoc` DISABLE KEYS */;
INSERT INTO `periodoc` VALUES (1,1,1,'2018-06-06','2019-06-06'),(2,2,2,'2018-06-06','2019-06-06'),(3,3,3,'2018-06-06','2019-06-06');
/*!40000 ALTER TABLE `periodoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `periodoe`
--

DROP TABLE IF EXISTS `periodoe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `periodoe` (
  `idPeriodo` int(11) NOT NULL AUTO_INCREMENT,
  `idAcademia` int(11) NOT NULL,
  `idReunion` int(11) NOT NULL,
  `fechaInicio` date DEFAULT NULL,
  `fechaFin` date DEFAULT NULL,
  PRIMARY KEY (`idPeriodo`,`idAcademia`,`idReunion`),
  KEY `idAcademia` (`idAcademia`),
  KEY `idReunion` (`idReunion`),
  CONSTRAINT `periodoe_ibfk_1` FOREIGN KEY (`idAcademia`) REFERENCES `academia` (`idAcademia`),
  CONSTRAINT `periodoe_ibfk_2` FOREIGN KEY (`idReunion`) REFERENCES `reunion` (`idReunion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `periodoe`
--

LOCK TABLES `periodoe` WRITE;
/*!40000 ALTER TABLE `periodoe` DISABLE KEYS */;
/*!40000 ALTER TABLE `periodoe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plandecurso`
--

DROP TABLE IF EXISTS `plandecurso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plandecurso` (
  `idPlanDeCurso` int(11) NOT NULL AUTO_INCREMENT,
  `formato` varchar(50) DEFAULT NULL,
  `objetivoGeneral` varchar(1000) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `idCurso` int(11) DEFAULT NULL,
  PRIMARY KEY (`idPlanDeCurso`),
  KEY `idCurso` (`idCurso`),
  CONSTRAINT `plandecurso_ibfk_1` FOREIGN KEY (`idCurso`) REFERENCES `curso` (`idCurso`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plandecurso`
--

LOCK TABLES `plandecurso` WRITE;
/*!40000 ALTER TABLE `plandecurso` DISABLE KEYS */;
INSERT INTO `plandecurso` VALUES (1,'placeholder','placeholder','2018-01-01',1),(2,'plancurso','El estudiante...',NULL,1);
/*!40000 ALTER TABLE `plandecurso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plandetrabajo`
--

DROP TABLE IF EXISTS `plandetrabajo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plandetrabajo` (
  `idPlanDeTrabajo` int(11) NOT NULL AUTO_INCREMENT,
  `formato` varchar(50) DEFAULT NULL,
  `fechaAprobacion` date DEFAULT NULL,
  `objetivoGeneral` varchar(200) DEFAULT NULL,
  `programaEducativo` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`idPlanDeTrabajo`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plandetrabajo`
--

LOCK TABLES `plandetrabajo` WRITE;
/*!40000 ALTER TABLE `plandetrabajo` DISABLE KEYS */;
INSERT INTO `plandetrabajo` VALUES (9,'plantrabajo','2018-06-13','Planear las cosas con anticipacion','Ingenieria de software');
/*!40000 ALTER TABLE `plandetrabajo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planeacion`
--

DROP TABLE IF EXISTS `planeacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `planeacion` (
  `idPlaneacion` int(11) NOT NULL AUTO_INCREMENT,
  `fechas` varchar(100) DEFAULT NULL,
  `temas` varchar(1000) DEFAULT NULL,
  `unidad` int(11) DEFAULT NULL,
  `tecnicasDidacticas` varchar(800) DEFAULT NULL,
  `idPlanDeCurso` int(11) DEFAULT NULL,
  PRIMARY KEY (`idPlaneacion`),
  KEY `idPlanDeCurso` (`idPlanDeCurso`),
  CONSTRAINT `planeacion_ibfk_1` FOREIGN KEY (`idPlanDeCurso`) REFERENCES `plandecurso` (`idPlanDeCurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planeacion`
--

LOCK TABLES `planeacion` WRITE;
/*!40000 ALTER TABLE `planeacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `planeacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reunion`
--

DROP TABLE IF EXISTS `reunion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reunion` (
  `idReunion` int(11) NOT NULL AUTO_INCREMENT,
  `idAcademia` int(11) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `fechaInicio` date DEFAULT NULL,
  `fechaFin` date DEFAULT NULL,
  `informacionAdicional` varchar(300) DEFAULT NULL,
  `lugar` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`idReunion`,`idAcademia`),
  KEY `idAcademia` (`idAcademia`),
  CONSTRAINT `reunion_ibfk_1` FOREIGN KEY (`idAcademia`) REFERENCES `academia` (`idAcademia`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reunion`
--

LOCK TABLES `reunion` WRITE;
/*!40000 ALTER TABLE `reunion` DISABLE KEYS */;
INSERT INTO `reunion` VALUES (1,1,'Pues la reunion, no?','2018-06-05','2018-06-05','No pues nada','FEI');
/*!40000 ALTER TABLE `reunion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rol` (
  `idRol` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idRol`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
INSERT INTO `rol` VALUES (1,'Maestro'),(2,'Coordinador');
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tema`
--

DROP TABLE IF EXISTS `tema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tema` (
  `idTema` int(11) NOT NULL AUTO_INCREMENT,
  `primerParcial` varchar(500) DEFAULT NULL,
  `segundoParcial` varchar(500) DEFAULT NULL,
  `resto` varchar(500) DEFAULT NULL,
  `idEEPlanTrabajo` int(11) NOT NULL,
  PRIMARY KEY (`idTema`),
  KEY `idEEPlanTrabajo` (`idEEPlanTrabajo`),
  CONSTRAINT `tema_ibfk_1` FOREIGN KEY (`idEEPlanTrabajo`) REFERENCES `eeplantrabajo` (`idEEPlanTrabajo`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tema`
--

LOCK TABLES `tema` WRITE;
/*!40000 ALTER TABLE `tema` DISABLE KEYS */;
INSERT INTO `tema` VALUES (25,'Primer parcial','segundo parcial','Otros examenes',25),(26,'','','',26),(27,'','','',27);
/*!40000 ALTER TABLE `tema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo`
--

DROP TABLE IF EXISTS `tipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo` (
  `idTipo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idTipo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo`
--

LOCK TABLES `tipo` WRITE;
/*!40000 ALTER TABLE `tipo` DISABLE KEYS */;
INSERT INTO `tipo` VALUES (1,'Medio tiempo'),(2,'Tiempo completo'),(3,'De los que no hacen nada');
/*!40000 ALTER TABLE `tipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarioacademico`
--

DROP TABLE IF EXISTS `usuarioacademico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarioacademico` (
  `idUsuarioAcademico` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `apellidos` varchar(100) DEFAULT NULL,
  `correo` varchar(40) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `contrasena` varchar(20) DEFAULT NULL,
  `idRol` int(11) NOT NULL,
  PRIMARY KEY (`idUsuarioAcademico`),
  KEY `idRol` (`idRol`),
  CONSTRAINT `usuarioacademico_ibfk_1` FOREIGN KEY (`idRol`) REFERENCES `rol` (`idRol`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarioacademico`
--

LOCK TABLES `usuarioacademico` WRITE;
/*!40000 ALTER TABLE `usuarioacademico` DISABLE KEYS */;
INSERT INTO `usuarioacademico` VALUES (1,'Manolo','Perez Verdejo','ElQueNoPelea@tugfa.com','2288225566','Manolomon','mani',2),(2,'Karen','Cortes Verdin','karen@uv.mx','2282318482','Karen','diseno',1),(3,'Daniela','Hernandez Valenzuela','daniela@uv.mx','2283213513','Daniela','1234',2);
/*!40000 ALTER TABLE `usuarioacademico` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-13 21:35:48
