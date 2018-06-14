/**
 * DAO Para las consultas necesarias para el Plan de Trabajo
 *
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
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

public class PlanDeTrabajoDAO {
    public Integer obteneridPlanTrabajo() {
        Integer num = null;
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            num = conn.selectOne("PlanDeTrabajo.obteneridPlanTrabajo");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return num;
    }
    
    public Integer obteneridObjetivoParticular() {
        Integer num = null;
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            num = conn.selectOne("PlanDeTrabajo.obteneridObjetivoParticular");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return num;
    }
    
    public Integer obteneridEEPlanTrabajo() {
        Integer num = null;
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            num = conn.selectOne("PlanDeTrabajo.obteneridEEPlanTrabajo");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return num;
    }
    
    /**
     * Obtener un plan de curso en especifico
     * @param idCurso curso del cual sacar el plan de curso
     * @return plan de curso
     */
    public PlanDeTrabajo obtenerPlanDeTrabajo(Integer idAcademia) {
        PlanDeTrabajo plan = new PlanDeTrabajo();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            plan = conn.selectOne("PlanDeTrabajo.obtenerPlanDeTrabajo", idAcademia);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return plan;
    }

    
    public PlanDeTrabajo obtenerPlanDeTrabajoEspecifico(Integer idPlanTrabajo) {
        PlanDeTrabajo plan = new PlanDeTrabajo();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            plan = conn.selectOne("PlanDeTrabajo.obtenerPlanDeTrabajoEspecifico", idPlanTrabajo);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return plan;
    }
    
    /**
     *
     * @param idPlanTrabajo
     * @return
     */
    public void actualizarPlanDeTrabajoEspecifico(PlanDeTrabajo plandetrabajo) {
        //PlanDeTrabajo plan = new PlanDeTrabajo();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.update("PlanDeTrabajo.actualizarPlanDeTrabajoEspecifico",plandetrabajo);
            conn.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
    
    public void actualizarObjetivoParticularEspecifico(ObjetivoParticular objetivoparticular) {
        //PlanDeTrabajo plan = new PlanDeTrabajo();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.update("PlanDeTrabajo.actualizarObjetivoParticularEspecifico",objetivoparticular);
            conn.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
    
    /**
     * Actualizar una EEPlanTrabajo en especifico
     * @param eeplantrabajo 
     */
    public void actualizarEEPlanDeTrabajo(EEPlanTrabajo eeplantrabajo) {
        //PlanDeTrabajo plan = new PlanDeTrabajo();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.update("PlanDeTrabajo.actualizarEEPlanDeTrabajo",eeplantrabajo);
            conn.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
    
    /**
     * Obtener las evaluaciones base obtenidas con base al Plan de Trabajo de la Academia perteneciente
     * @param idCurso id del curso del cual se esta creando el plan de curso
     * @return evaluaciones
     */
    public List<ObjetivoParticular> obtenerObjetivoParticulares(Integer idPlanDeTrabajo) {
        List<ObjetivoParticular> lista = new ArrayList<ObjetivoParticular>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanDeTrabajo.obtenerObjetivosParticulares", idPlanDeTrabajo);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }
            
    /**
     * Obtener las evaluaciones base obtenidas con base al Plan de Trabajo de la Academia perteneciente
     * @param idCurso id del curso del cual se esta creando el plan de curso
     * @return evaluaciones
     */
    public ObjetivoParticular obtenerObjetivoParticularEspecifico(Integer idPlanTrabajo) {
        ObjetivoParticular objetivo = new ObjetivoParticular();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            objetivo = conn.selectOne("PlanDeTrabajo.obtenerObjetivoParticularEspecifico", idPlanTrabajo);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return objetivo;
    }
        
    /**
     * Obtener todos los cursos de un determinado maestro
     * @param idMaestro id del maestro
     * @return cursos del maestro
     */
    public List<Actividad> obtenerActividades(Integer idObjetivoParticular) {
        List<Actividad> lista = new ArrayList<Actividad>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanDeTrabajo.obtenerActividades", idObjetivoParticular);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }

    /**
     * Obtener las evaluaciones de un Plan de Curso
     * @param idPlanDeCurso id del plan de curso
     * @return evaluaciones
     */
    public List<EEPlanTrabajo> obtenerEEPlanDeTrabajo(Integer idPlanDeTrabajo) {
        List<EEPlanTrabajo> lista = new ArrayList<EEPlanTrabajo>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanDeTrabajo.obtenerEEPlanDeTrabajo", idPlanDeTrabajo);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }
    
    /**
     * Obtener las planeaciones de un Plan de Curso
     * @param idPlanDeCurso id del plan de curso
     * @return planeaciones
     */
    public List<Evaluacion> obtenerEvaluaciones(Integer idPlanDeTrabajo) {
        List<Evaluacion> lista = new ArrayList<Evaluacion>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanDeTrabajo.obtenerEvaluaciones", idPlanDeTrabajo);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }
    
    /**
     * Obtener las planeaciones de un Plan de Curso
     * @param idPlanDeCurso id del plan de curso
     * @return planeaciones
     */
    public Tema obtenerTemaDeEEPlanTrabajo(Integer idEEPlanDeTrabajo) {
        Tema tema = new Tema();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            tema = conn.selectOne("PlanDeTrabajo.obtenerTemaDeEEPlanTrabajo", idEEPlanDeTrabajo);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return tema;
    }
    
    /**
     * Obtener las planeaciones de un Plan de Curso
     * @param idPlanDeCurso id del plan de curso
     * @return planeaciones
     */
    public List<Maestro> obtenerParticipantes(Integer idPlanDeTrabajo) {
        List<Maestro> lista = new ArrayList<Maestro>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanDeTrabajo.obtenerParticipantes", idPlanDeTrabajo);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }
    
    /**
     * Guarda un objeto planeacion en la BD
     * @param planeacion
     * @return true si la consulta fue correcta
     */
    public boolean guardarEEPlanTrabajo(EEPlanTrabajo ee) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanDeTrabajo.guardarEEPlanDeTrabajo", ee);
            conn.commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }
    
    /**
     * Guarda un objeto bibliografia en la BD
     * @param bib bibliografia a guardar
     * @return true si la consulta fue correcta
     */
    public boolean guardarEvaluacion(Evaluacion eval) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanDeTrabajo.guardarEvaluacion", eval);
            conn.commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

    /**
     * Guarda un objeto evaluacion en la BD
     * @param evaluacion
     * @return true si la consulta fue correcta
     */
    public boolean guardarTema(Tema tema) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanDeTrabajo.guardarTema", tema);
            conn.commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }
    
    public boolean guardarObjetivoParticular(ObjetivoParticular obj) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanDeTrabajo.guardarObjetivoParticular", obj);
            conn.commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }
    
    public boolean guardarActividad(Actividad act) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanDeTrabajo.guardarActividad", act);
            conn.commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }
    
    public boolean guardarParticipante(Participante participante) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanDeTrabajo.guardarParticipante", participante);
            conn.commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }
    
    /**
     * Guarda el Plan de Curso en la BD
     * @param plan plan de curso a guardar
     * @return true si la consulta fue correcta
     */
    public boolean guardarPlanDeTrabajo(PlanDeTrabajo plan) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanDeTrabajo.guardarPlanDeTrabajo", plan);
            conn.commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

    public boolean eliminarActividad(Integer idEEPlanTrabajo){
        SqlSession conn = null;
        try{
            conn = MyBatisUtils.getSession();
            conn.delete("PlanDeTrabajo.eliminarEvaluacion", idEEPlanTrabajo);
            conn.commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
        return false;
    }
    
    public boolean eliminarEvaluacion(Integer idEEPlanTrabajo){
        SqlSession conn = null;
        try{
            conn = MyBatisUtils.getSession();
            conn.delete("PlanDeTrabajo.eliminarEvaluacion", idEEPlanTrabajo);
            conn.commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
        return false;
    }
        
    public boolean eliminarParticipante(Integer idPlanDeTrabajo){
        SqlSession conn = null;
        try{
            conn = MyBatisUtils.getSession();
            conn.delete("PlanDeTrabajo.eliminarParticipante", idPlanDeTrabajo);
            conn.commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
        return false;
    }
}
