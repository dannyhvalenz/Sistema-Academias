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
import model.pojos.EE;
import model.pojos.Maestro;
import model.pojos.Periodo;
import org.apache.ibatis.session.SqlSession;

public class AcademiaDAO {
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

    public static List<EE> obtenerEE() {
        List<EE> lista = new ArrayList<EE>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("Academia.obtenerExperienciasEducativas");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }

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
