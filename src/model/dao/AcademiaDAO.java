/**
 * DAO Para las consultas necesarias de la Academia
 * @author Daniel Escamilla Cortes y Jose Manuel Perez Verdejo
 */
package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.MyBatisUtils;
import model.pojos.Academia;
import model.pojos.EE;
import model.pojos.Maestro;
import model.pojos.PlanTrabajo;
import org.apache.ibatis.session.SqlSession;

public class AcademiaDAO {
    /**
     * Obtiene todas las Academias existentes
     * @return academias
     */
    public static List<Academia> obtenerAcademias() {
        List<Academia> lista = new ArrayList<Academia>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("Academia.obtenerAcademias");
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
     * Obtiene una academia en especifico con base al id
     * @param idAcademia id de la academia a recuperar
     * @return academia
     */
    public static Academia obtenerAcademiaId(Integer idAcademia) {//throws Exception{
        Academia lista = null;
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectOne("Academia.obtenerAcademiaId", idAcademia);
        } catch (Exception ex) {
            ex.printStackTrace();
            //throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }

    /**
     * Obtener todas las experiencias educativas de una academia
     * @param idAcademia id de la academia
     * @return experiencias educativas
     */
    public static List<EE> obtenerExperienciasEducativas(Integer idAcademia) {
        List<EE> lista = new ArrayList<EE>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("Academia.obtenerExperienciasEducativas", idAcademia);
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
     * Obtiene todas las PlanTrabajo de una academia
     * @param academia
     * @return PlanTrabajo
     * @throws Exception si la consulta es incorrecta 
     */
    public static List<PlanTrabajo> obtenerPlanTrabajo(Academia academia) throws Exception{
        List<PlanTrabajo> lista = new ArrayList<PlanTrabajo>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            System.out.println("Holis");
            lista = conn.selectList("Academia.obtenerPlanTrabajo", academia);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }

    /**
     * Guarda la Academia
     * @param nombreAcademia
     * @return true si la consulta fue correcta
     */
    public static boolean guardarAcademia(String nombreAcademia) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("Academia.guardarAcademia", nombreAcademia);
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
     * Elimina una academia en especifico
     * @param id de la academia a eliminar
     * @return true si la consulta fue correcta
     */
    public static boolean eliminarAcademia(Integer id) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.delete("Academia.eliminarAcademia", id);
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
     * Obtiene los maestros pertenecientes a una academia
     * @param idAcademia
     * @return maestros
     * @throws Exception si la consulta es incorrecta 
     */
    public static List<Maestro> obtenerMaestros(Integer idAcademia) throws Exception{
        List<Maestro> lista = new ArrayList<Maestro>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("Academia.obtenerMaestros", idAcademia);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }
}
