/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.MyBatisUtils;
import model.pojos.UsuarioAcademico;
import org.apache.ibatis.session.SqlSession;

/**
 * Interface para la clase UsuarioDAO.java
 *
 * @author Daniela Hernandez
 * @since Jun 11, 2018
 * @version 1.1
 */
public interface InterfaceUsuarioDAO {
    UsuarioAcademico login(UsuarioAcademico datos);
}
