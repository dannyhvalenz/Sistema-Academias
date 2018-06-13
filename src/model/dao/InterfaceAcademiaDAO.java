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
import model.pojos.ExperienciaEducativa;
import model.pojos.Maestro;
import org.apache.ibatis.session.SqlSession;

/**
 * Interface para la clase AcademiaDAO.java
 *
 * @author Daniela Hernandez
 * @since Jun 11, 2018
 * @version 1.1
 */

public interface InterfaceAcademiaDAO {
    /**
     * Obtiene todas las Academias existentes
     * @return academias
     */
    List<Academia> obtenerAcademias();
    
    Academia obtenerCoordinacion(Integer idMaestro);

    /**
     * Obtiene una academia en especifico con base al id
     * @param idAcademia id de la academia a recuperar
     * @return academia
     */
    Academia obtenerAcademiaId(Integer idAcademia);

    /**
     * Obtener todas las experiencias educativas de una academia
     * @param idAcademia id de la academia
     * @return experiencias educativas
     */
    List<ExperienciaEducativa> obtenerExperienciasEducativas(Integer idAcademia);

    /**
     * Guarda la Academia
     * @param nombreAcademia
     * @return true si la consulta fue correcta
     */
    boolean guardarAcademia(String nombreAcademia);

    /**
     * Elimina una academia en especifico
     * @param id de la academia a eliminar
     * @return true si la consulta fue correcta
     */
    boolean eliminarAcademia(Integer id);

    /**
     * Obtiene los maestros pertenecientes a una academia
     * @param idAcademia
     * @return maestros
     */
    List<Maestro> obtenerMaestros(Integer idAcademia);
}
