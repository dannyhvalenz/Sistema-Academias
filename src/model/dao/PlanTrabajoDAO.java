/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.MyBatisUtils;
import model.pojos.Academia;
import model.pojos.Evaluacion;
import model.pojos.ObjetivoParticular;
import model.pojos.Actividad;
import model.pojos.EEPlanTrabajo;
import model.pojos.Tema;
import model.pojos.PlanTrabajo;
import model.pojos.Asistencia;
import model.pojos.Curso;
import org.apache.ibatis.session.SqlSession;

public class PlanTrabajoDAO {
    public static PlanTrabajo obtenerPlanTrabajo(Integer idAcademia) {
        PlanTrabajo plan = new PlanTrabajo();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            plan = conn.selectOne("PlanTrabajo.obtenerPlanTrabajo", idAcademia);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return plan;
    }
    
    public static List<Curso> obtenerCursoesDeMaestro(Integer idMaestro) {
        List<Curso> lista = new ArrayList<Curso>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanTrabajo.obtenerCursosDeMaestro", idMaestro);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }

    public static List<EEPlanTrabajo> obtenerEEPlanTrabajo(Integer idPlanTrabajo) {
        List<EEPlanTrabajo> lista = new ArrayList<EEPlanTrabajo>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanTrabajo.obtenerEvaluaciones", idPlanTrabajo);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }
    
    public static List<ObjetivoParticular> obtenerObjetivosParticulares(Integer idPlanTrabajo) {
        List<ObjetivoParticular> lista = new ArrayList<ObjetivoParticular>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanTrabajo.obtenerEvaluaciones", idPlanTrabajo);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }
    
    public static List<Actividad> obtenerActividades(Integer idObjetivoParticular) {
        List<Actividad> lista = new ArrayList<Actividad>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanTrabajo.obtenerEvaluaciones", idObjetivoParticular);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }
    
    public static List<Evaluacion> obtenerEvaluaciones(Integer idEEPlanTrabajo) {
        List<Evaluacion> lista = new ArrayList<Evaluacion>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanTrabajo.obtenerPlaneaciones", idEEPlanTrabajo);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }
    
    public static List<Tema> obtenerTemas(Integer idEEPlanTrabajo) {
        List<Tema> lista = new ArrayList<Tema>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanTrabajo.obtenerPlaneaciones", idEEPlanTrabajo);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }
    
    public static boolean guardarTema(Tema tema) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanTrabajo.guardarPlaneaciones", tema);
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

    public static boolean guardarEvaluacion(Evaluacion evaluacion) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanTrabajo.guardarEvaluaciones", evaluacion);
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
    
    public static boolean guardarEEPlanTrabajo(EEPlanTrabajo eePlan) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanTrabajo.guardarEEPlanTrabajo", eePlan);
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
    
    public static boolean guardarActividad(Actividad act) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanTrabajo.guardarActividad", act);
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
    
    public static boolean guardarObjetivoParticular(ObjetivoParticular op) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanTrabajo.guardarObjetivoParticular", op);
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
    
    public static boolean guardarPlanTrabajo(PlanTrabajo plan) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanTrabajo.guardarPlanTrabajo", plan);
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

    
    public static boolean guardarParticipante(Asistencia participante) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanTrabajo.guardarParticipante", participante);
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
}
