/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.MyBatisUtils;
import model.pojos.Actividad;
import model.pojos.EEPlanTrabajo;
import model.pojos.Evaluacion;
import model.pojos.Maestro;
import model.pojos.ObjetivoParticular;
import model.pojos.Participante;
import model.pojos.PlanDeTrabajo;
import model.pojos.Tema;
import org.apache.ibatis.session.SqlSession;

/**
 * Interface para la clase PlanDeTrabajoDAO.java
 *
 * @author Daniela Hernandez
 * @since Jun 11, 2018
 * @version 1.1
 */
public interface InterfacePlanDeTrabajoDAO {
    
    /**
     * Obtener el id del plan de Trabajo en especifico
     * @return idObjetivo
     */
    Integer obteneridPlanTrabajo();
    
    /**
     * Obtener el id del objetivoParticular en especifico
     * @return idObjetivo
     */
    Integer obteneridObjetivoParticular();
    
    /**
     * Obtener el id del EEPlanTrabajo en especifico
     * @return idEE
     */
    Integer obteneridEEPlanTrabajo();
    
    /**
     * Obtener un plan de Trabajo en especifico
     * @param idTrabajo Trabajo del cual sacar el plan de Trabajo
     * @return plan de Trabajo
     */
    PlanDeTrabajo obtenerPlanDeTrabajo(Integer idAcademia);
    
    
    PlanDeTrabajo obtenerPlanDeTrabajoEspecifico(Integer idPlanTrabajo);
    /**
     * Obtener las evaluaciones base obtenidas con base al Plan de Trabajo de la Academia perteneciente
     * @param idTrabajo id del Trabajo del cual se esta creando el plan de Trabajo
     * @return evaluaciones
     */
    List<ObjetivoParticular> obtenerObjetivoParticulares(Integer idPlanDeTrabajo);
    
    /**
     * Obtener todos los Trabajos de un determinado maestro
     * @param idMaestro id del maestro
     * @return Trabajos del maestro
     */
    List<Actividad> obtenerActividades(Integer idPlanDeTrabajo);

    /**
     * Obtener las evaluaciones de un Plan de Trabajo
     * @param idPlanDeTrabajo id del plan de Trabajo
     * @return evaluaciones
     */
    List<EEPlanTrabajo> obtenerEEPlanTrabajo(Integer idPlanDeTrabajo);
    
    /**
     * Obtener las planeaciones de un Plan de Trabajo
     * @param idPlanDeTrabajo id del plan de Trabajo
     * @return planeaciones
     */
    List<Evaluacion> obtenerEvaluaciones(Integer idPlanDeTrabajo);
    
    /**
     * Obtener las planeaciones de un Plan de Trabajo
     * @param idPlanDeTrabajo id del plan de Trabajo
     * @return planeaciones
     */
    List<Tema> obtenerTemas(Integer idPlanDeTrabajo);
    
    /**
     * Obtener las planeaciones de un Plan de Trabajo
     * @param idPlanDeTrabajo id del plan de Trabajo
     * @return planeaciones
     */
    List<Maestro> obtenerParticipantes(Integer idPlanDeTrabajo);
    
    /**
     * Guarda un objeto planeacion en la BD
     * @param planeacion
     * @return true si la consulta fue correcta
     */
    boolean guardarEEPlanTrabajo(EEPlanTrabajo ee);
    
    /**
     * Guarda un objeto bibliografia en la BD
     * @param bib bibliografia a guardar
     * @return true si la consulta fue correcta
     */
    boolean guardarEvaluacion(Evaluacion eval);

    /**
     * Guarda un objeto evaluacion en la BD
     * @param evaluacion
     * @return true si la consulta fue correcta
     */
    boolean guardarTema(Tema tema);
    
    /**
     * Guarda un objeto objetivoParticular en la BD
     * @param obj
     * @return true si la consulta fue correcta
     */
    boolean guardarObjetivoParticular(ObjetivoParticular obj);
    
    /**
     * Guarda un objeto actividad en la BD
     * @param act
     * @return true si la consulta fue correcta
     */
    boolean guardarActividad(Actividad act);
    
    /**
     * Guarda un objeto participante en la BD
     * @param participante
     * @return true si la consulta fue correcta
     */
    boolean guardarParticipante(Participante participante);
    
    /**
     * Guarda el Plan de Trabajo en la BD
     * @param plan plan de Trabajo a guardar
     * @return true si la consulta fue correcta
     */
    boolean guardarPlanDeTrabajo(PlanDeTrabajo plan);

}
