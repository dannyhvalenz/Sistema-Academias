/**
 * DAO Para las consultas necesarias de la Academia
 *
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */

package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.MyBatisUtils;
import model.pojos.Academia;
import model.pojos.ExperienciaEducativa;
import model.pojos.Maestro;
import model.pojos.Periodo;
import org.apache.ibatis.session.SqlSession;

public class AcademiaDAO implements InterfaceAcademiaDAO {
    /**
     * Obtiene todas las Academias existentes
     * @return academias
     */
    public List<Academia> obtenerAcademias() {
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
    
    public Academia obtenerCoordinacion(Integer idMaestro) {
        Academia user = null;
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            user = conn.selectOne("Academia.obtenerCoordinacion", idMaestro);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return user;
    }

    /**
     * Obtiene una academia en especifico con base al id
     * @param idAcademia id de la academia a recuperar
     * @return academia
     */
    public Academia obtenerAcademiaId(Integer idAcademia) {//throws Exception{
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
    public List<ExperienciaEducativa> obtenerExperienciasEducativas(Integer idAcademia) {
        List<ExperienciaEducativa> lista = new ArrayList<ExperienciaEducativa>();
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
     * Guarda la Academia
     * @param nombreAcademia
     * @return true si la consulta fue correcta
     */
    public boolean guardarAcademia(String nombreAcademia) {
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
    public boolean eliminarAcademia(Integer id) {
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
     */
    public List<Maestro> obtenerMaestros(Integer idAcademia){ //throws Exception{
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
