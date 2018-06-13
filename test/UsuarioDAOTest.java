/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import model.dao.UsuarioAcademicoDAO;
import model.pojos.UsuarioAcademico;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniela Hernandez
 * @since Sun Jun 09, 2018
 * @version 1.2
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {}
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of login method, of class  UsuarioAcademicoDAO.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        UsuarioAcademico datos = null;
        UsuarioAcademico expResult = null;
        UsuarioAcademicoDAO usuarioA = new UsuarioAcademicoDAO();
        UsuarioAcademico result = usuarioA.login(datos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se ha accedido a la sesion");
    }    
    
    
}
