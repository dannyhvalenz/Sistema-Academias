/*
 * SiAcad-Data.sql
 *
 * Copyright (c) 2018, SiAcad
 * All rights reserved.
 */
 
/**
 * Author:  Charly
 * Created: Jun 6, 2018
 */

USE SiAcad;

INSERT INTO rol VALUES (null,"Maestro");
INSERT INTO rol VALUES (null,"Coordinador");

INSERT INTO tipo VALUES (null,"Medio tiempo");
INSERT INTO tipo VALUES (null,"Tiempo completo");
INSERT INTO tipo VALUES (null,"De los que no hacen nada");

INSERT INTO usuarioacademico VALUES (1, "Manolo","Perez Verdejo","ElQueNoPelea@tugfa.com","2288225566","Manolomon","mani",2);
INSERT INTO usuarioacademico VALUES (2, "Charly","Carrillo Ceballos","ElQueJuegFut@tugfa.com","2282318482","Charly","fuck",1);
INSERT INTO usuarioacademico VALUES (3, "Daniel","Escamilla Cortes","JuegoLOL@tugfa.com","2283213513","Escamilla","lol",2);

INSERT INTO maestro VALUES (1,"123456", 1);
INSERT INTO maestro VALUES (2,"654321", 2);
INSERT INTO maestro VALUES (3,"456123", 3);

INSERT INTO academia VALUES (null, "Comunicacion", 1);
INSERT INTO academia VALUES (null, "Matematicas", 2);
INSERT INTO academia VALUES (null, "Programacion", 3);
/* INSERT INTO academia VALUES (null, "Diseño");
INSERT INTO academia VALUES (null, "Inutil");
INSERT INTO academia VALUES (null, "De Rellenno"); */

INSERT INTO experienciaeducativa VALUES (null, "Programacion",1);
INSERT INTO experienciaeducativa VALUES (null, "Principios de Diseño",1);
INSERT INTO experienciaeducativa VALUES (null, "Principios de Construccion",1);
INSERT INTO experienciaeducativa VALUES (null, "Paradigmas de Programacion",3);
INSERT INTO experienciaeducativa VALUES (null, "Matematicas Discretas",2);
INSERT INTO experienciaeducativa VALUES (null, "Procesos",2);
INSERT INTO experienciaeducativa VALUES (null, "Ingles",2);
INSERT INTO experienciaeducativa VALUES (null, "Estructuras",4);
INSERT INTO experienciaeducativa VALUES (null, "Programacion II",1);
INSERT INTO experienciaeducativa VALUES (null, "Algebra",1);
INSERT INTO experienciaeducativa VALUES (null, "Estadistica",2);
INSERT INTO experienciaeducativa VALUES (null, "Redes",1);

INSERT INTO curso VALUES (null, "312645","Ingenieria De Software",2,2,1);
INSERT INTO curso VALUES (null, "961885","Ingenieria De Software",1,2,6);
INSERT INTO curso VALUES (null, "318541","Ingenieria De Software",3,2,1);
INSERT INTO curso VALUES (null, "958132","Ingenieria De Software",2,1,2);
INSERT INTO curso VALUES (null, "358468","Ingenieria De Software",1,1,3);
INSERT INTO curso VALUES (null, "815321","Ingenieria De Software",3,2,4);
INSERT INTO curso VALUES (null, "131523","Ingenieria De Software",5,1,5);

INSERT INTO periodoc VALUES (null, 1, 1, '2018-06-06', '2019-06-06');
INSERT INTO periodoc VALUES (null, 2, 2, '2018-06-06', '2019-06-06');
INSERT INTO periodoc VALUES (null, 3, 3, '2018-06-06', '2019-06-06');

INSERT INTO reunion VALUES (null, 1, "Pues la reunion, no?",'2018-06-05','2018-06-05', "No pues nada", "FEI");

insert into eeplantrabajo values (1,"placeholder","placeholder",1);
insert into plandetrabajo values (1,"placeholder","2018-01-01","placeholder","placeholder");
insert into objetivoparticular values (1,"placeholder","placeholder",1);
insert into plandecurso values (1, "placeholder", "placeholder", "2018-01-01", 1);

/* INSERT INTO minutadeacademia VALUES (null, '2018-06-06', '16:45', "Pues nada mas pasar el rato, estuvo chido", "la familia, el medio ambiente, AMLO2018, Trump, la inseguridad","Estariamos mejor con ya sabes quien");

INSERT INTO reunion VALUES (null, 1, "Pues la reunion, no?",'2018-06-05','2018-06-05', "No pues nada", "FEI",null);

INSERT INTO periodoe VALUES (null,null,null);
INSERT INTO periodoe VALUES (null,null,null);
INSERT INTO periodoe VALUES (null,null,null);

INSERT INTO eeplantrabajo VALUES (null, "Plan de Trabajo", "Exposiciones, PDF's, Lecturas, Proyectos");
INSERT INTO eeplantrabajo VALUES (null, "Plan de Trabajo", "Exposiciones, Ensayos, Lecturas");
INSERT INTO eeplantrabajo VALUES (null, "Plan de Trabajo", "Exposiciones, PDF's, Lecturas, Proyectos");
INSERT INTO eeplantrabajo VALUES (null, "Plan de Trabajo", "PDF's, Lecturas, Proyectos,Ejercicios en clase");

INSERT INTO evaluacion VALUES (null, 1, "No se a que se refiere fechas we", "Elaboracion de programas","Videos, Ejercicios en clase, Lectura","Tema 1, tema 2, tema 9",null);
INSERT INTO evaluacion VALUES (null, 1, "No se a que se refiere fechas we", "Elaboracion de programas","Videos, Ejercicios en clase, Lectura","Tema 4, tema 3, tema 2",null);
INSERT INTO evaluacion VALUES (null, 1, "No se a que se refiere fechas we", "Elaboracion de programas","Videos, Ejercicios en clase, Lectura","Tema 56, tema 5, tema 34",null);
INSERT INTO evaluacion VALUES (null, 1, "No se a que se refiere fechas we", "Elaboracion de programas","Videos, Ejercicios en clase, Lectura","Tema 12, tema 8, tema 12",null);

INSERT INTO evaluacion_plandecurso VALUES (null, null);
INSERT INTO evaluacion_plandecurso VALUES (null, null);
INSERT INTO evaluacion_plandecurso VALUES (null, null);

INSERT INTO plandecurso VALUES (null, "Plan de Curso", "Saber que es lo que se va a hacer en el curso", '2018-06-06', "wikipedia.org",null);
INSERT INTO plandecurso VALUES (null, "Plan de Curso", "Saber que es lo que se va a hacer en el curso", '2018-06-03', "encuentratodo.org",null);
INSERT INTO plandecurso VALUES (null, "Plan de Curso", "Saber que es lo que se va a hacer en el curso", '2018-06-04', "lawikiteacher.org",null);
INSERT INTO plandecurso VALUES (null, "Plan de Curso", "Saber que es lo que se va a hacer en el curso", '2018-06-06', "wikipedia.org",null);

INSERT INTO plandetrabajo VALUES (null, "Plan de Trabajo", '2018-06-09', "Saber como se va a trabajar en el curso", "Ingenieria de Software");
INSERT INTO plandetrabajo VALUES (null, "Plan de Trabajo", '2018-06-10', "Saber como se va a trabajar en el curso", "Redes y servicios de computo");
INSERT INTO plandetrabajo VALUES (null, "Plan de Trabajo", '2018-06-12', "Saber como se va a trabajar en el curso", "Ingenieria de Software");
INSERT INTO plandetrabajo VALUES (null, "Plan de Trabajo", '2018-06-08', "Saber como se va a trabajar en el curso", "Ingenieria de Software");

INSERT INTO planeacion VALUES (null, "no se que pedo con estas fechas", "programar, resolver problemas, pensamiento analitico",1,"mapas mentales, ejercicios en clase", null);
INSERT INTO planeacion VALUES (null, "no se que pedo con estas fechas", "programar, pensamiento critico",1,"mapas mentales, ejercicios en clase", null);
INSERT INTO planeacion VALUES (null, "no se que pedo con estas fechas", "programar, resolver problemas, paradigmas",1,"diagramas, ejercicios en clase, exposiciones", null);
INSERT INTO planeacion VALUES (null, "no se que pedo con estas fechas", "programar, razonar",1,"mapas comnceptuales, ejercicios en clase", null);
INSERT INTO planeacion VALUES (null, "no se que pedo con estas fechas", "programar, diseñar, pruebas",1,"ejercicios en clase", null);

INSERT INTO tema VALUES (null, "tema 1, tema 2", "tema 3, tema 4", "temas extra", null);
INSERT INTO tema VALUES (null, "tema 1, tema 2,tema 4", "tema 3, tema 5", "temas extra", null);
INSERT INTO tema VALUES (null, "tema 1, tema 2", "tema 3, tema 4", "temas extra", null);
INSERT INTO tema VALUES (null, "tema 1, tema 2", "tema 3, tema 4", "temas extra", null);
INSERT INTO tema VALUES (null, "tema 1, tema 2", "tema 3, tema 4", "temas extra", null); */









