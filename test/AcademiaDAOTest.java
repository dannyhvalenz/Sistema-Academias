/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import model.dao.AcademiaDAO;
import model.pojos.Academia;
import model.pojos.ExperienciaEducativa;
import model.pojos.Maestro;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test de ACADEMIADAO.java
 * 
 * @author Daniela Hernandez Valenzuela
 * @since Jun 09, 2018
 * @version 1.1
 */
public class AcademiaDAOTest {
    
    public AcademiaDAOTest() {
    }
    
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
     * Test of obtenerAcademias method, of class AcademiaDAO.
     */
    @Test
    public void testObtenerAcademias() {
        System.out.println("obtenerAcademias");
        List<Academia> expResult = null;
        AcademiaDAO academiadao = new AcademiaDAO();
        List<Academia> result = academiadao.obtenerAcademias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("La operacion ha fallado al obtener las academias");
    }

    /**
     * Test of obtenerAcademiaId method, of class AcademiaDAO.
     */
    @Test
    public void testObtenerAcademiaId() {
        System.out.println("obtenerAcademiPorId");
        Integer idAcademia = 1;
        Academia expResult = null;
        AcademiaDAO academiadao = new AcademiaDAO();
        Academia result = academiadao.obtenerAcademiaId(idAcademia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No hay una academia con esa ID");
    }

    /**
     * Test of obtenerExperienciasEducativas method, of class AcademiaDAO.
     */
    @Test
    public void testObtenerExperienciasEducativas() {
        System.out.println("obtenerExperienciasEducativas");
        List<ExperienciaEducativa> expResult = null;
        AcademiaDAO academiadao = new AcademiaDAO();
        List<ExperienciaEducativa> result = academiadao.obtenerExperienciasEducativas(1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se han obtenido las EE.");
    }

    /**
     * Test of guardarAcademia method, of class AcademiaDAO.
     */
    @Test
    public void testGuardarAcademia() {
        System.out.println("guardarAcademia");
        String nombreAcademia = "";
        boolean expResult = false;
        AcademiaDAO academiadao = new AcademiaDAO();
        boolean result = academiadao.guardarAcademia(nombreAcademia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se han podido guardar academias.");
    }

    /**
     * Test of eliminarAcademia method, of class AcademiaDAO.
     */
    @Test
    public void testEliminarAcademia() {
        System.out.println("eliminarAcademia");
        Integer id = null;
        boolean expResult = false;
        AcademiaDAO academiadao = new AcademiaDAO();
        boolean result = academiadao.eliminarAcademia(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se ha podido eliminar esa academia.");
    }

    /**
     * Test of obtenerMaestros method, of class AcademiaDAO.
     */
    @Test
    public void testObtenerMaestros() throws Exception {
        System.out.println("obtenerMaestros");
        Integer idAcademia = null;
        List<Maestro> expResult = null;
        AcademiaDAO academiadao = new AcademiaDAO();
        List<Maestro> result = academiadao.obtenerMaestros(idAcademia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se han podido botener tales maestros.");
    }
    
}
