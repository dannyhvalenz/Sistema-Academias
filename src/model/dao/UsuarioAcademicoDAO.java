

package model.dao;

import model.MyBatisUtils;
import model.pojos.UsuarioAcademico;
import org.apache.ibatis.session.SqlSession;

/**
 * DAO Para las consultas necesarias para el Usuario
 *
 * @author Daniela Hernandez 
 * @since Jun 05, 2018
 * @version 1.1
 */

public class UsuarioAcademicoDAO implements InterfaceUsuarioDAO{
    public UsuarioAcademico login(UsuarioAcademico datos) {
        UsuarioAcademico user = null;
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            user = conn.selectOne("UsuarioAcademico.login", datos);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return user;
    }
}