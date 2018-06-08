
package model.dao;

import model.MyBatisUtils;
import model.pojos.Usuario;
import org.apache.ibatis.session.SqlSession;

/**
    * @author Daniela Hernandez
 * @since Thu Jun 07 2018
 * @version 0.1
 */

public class UsuarioDAO {
    public static Usuario login(Usuario datos) {
        Usuario user = null;
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            user = conn.selectOne("Usuario.login", datos);
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