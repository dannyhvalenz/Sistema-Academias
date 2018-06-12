/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import model.dao.PlanDeTrabajoDAO;
import model.pojos.Actividad;
import model.pojos.Evaluacion;
import model.pojos.ObjetivoParticular;
import model.pojos.PlanDeTrabajo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniela Hernandez Valenzuela
 * @since Jun 08, 2018
 */
public class PlanDeTrabajoDAOTest {
    
    public PlanDeTrabajoDAOTest() {
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
     * Test of obtenerPlanDeTrabajo method, of class PlanDeTrabajoDAO.
     */
    @Test
    public void testObtenerPlanDeTrabajo() {
        System.out.println("obtenerPlanDeTrabajo");
        Integer idAcademia = null;
        PlanDeTrabajo expResult = null;
        PlanDeTrabajoDAO ptdao = new PlanDeTrabajoDAO();
        PlanDeTrabajo result = ptdao.obtenerPlanDeTrabajo(idAcademia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se puede obtener el PDC.");
    }

    /**
     * Test of obtenerEvaluaciones method, of class PlanDeTrabajoDAO.
     */
    @Test
    public void testObtenerEvaluaciones() {
        System.out.println("obtenerEvaluaciones");
        Integer idPlanDeTrabajo = null;
        List<Evaluacion> expResult = null;
        PlanDeTrabajoDAO ptdao = new PlanDeTrabajoDAO();
        List<Evaluacion> result = ptdao.obtenerEvaluaciones(idPlanDeTrabajo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se pueden obtener las Evaluaciones.");
    }

    /**
     * Test of obtenerActividades method, of class PlanDeTrabajoDAO.
     */
    @Test
    public void testObtenerActividades() {
        System.out.println("obtenerPlaneaciones");
        Integer idPlanDeTrabajo = null;
        List<Actividad> expResult = null;
        PlanDeTrabajoDAO ptdao = new PlanDeTrabajoDAO();
        List<Actividad> result = ptdao.obtenerActividades(idPlanDeTrabajo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se pueden obtener las evaluaciones.");
    }

    /**
     * Test of obtenerActividades method, of class PlanDeTrabajoDAO.
     */
    @Test
    public void testObtenerObjetivoParticular() {
        System.out.println("obtenerObjetivosParticules");
        Integer idPlanDeTrabajo = null;
        List<ObjetivoParticular> expResult = null;
        PlanDeTrabajoDAO ptdao = new PlanDeTrabajoDAO();
        List<ObjetivoParticular> result = ptdao.obtenerObjetivoParticulares(idPlanDeTrabajo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se pueden obtener los objetivos.");
    }

    /**
     * Test of guardarActividad method, of class PlanDeTrabajoDAO.
     */
    @Test
    public void testGuardarActividades() {
        System.out.println("guardarActividad");
        Actividad act = null;
        boolean expResult = false;
        PlanDeTrabajoDAO ptdao = new PlanDeTrabajoDAO();
        boolean result = ptdao.guardarActividad(act);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se pueden guardar las Actividades.");
    }
    
    /**
     * Test of guardarActividad method, of class PlanDeTrabajoDAO.
     */
    @Test
    public void testGuardarObjetivoParticular() {
        System.out.println("guardarObjetivoParticular");
        ObjetivoParticular obj = null;
        boolean expResult = false;
        PlanDeTrabajoDAO ptdao = new PlanDeTrabajoDAO();
        boolean result = ptdao.guardarObjetivoParticular(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se pueden guardar los ObjetivoParticular.");
    }

    /**
     * Test of guardarEvaluacion method, of class PlanDeTrabajoDAO.
     */
    @Test
    public void testGuardarEvaluacion() {
        System.out.println("guardarEvaluacion");
        Evaluacion evaluacion = null;
        boolean expResult = false;
        PlanDeTrabajoDAO ptdao = new PlanDeTrabajoDAO();
        boolean result = ptdao.guardarEvaluacion(evaluacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se pueden guardar las evaluaciones.");
    }

    /**
     * Test of guardarPlanDeTrabajo method, of class PlanDeTrabajoDAO.
     */
    @Test
    public void testGuardarPlanDeTrabajo() {
        System.out.println("guardarPlanDeTrabajo");
        PlanDeTrabajo plan = null;
        boolean expResult = false;
        PlanDeTrabajoDAO ptdao = new PlanDeTrabajoDAO();
        boolean result = ptdao.guardarPlanDeTrabajo(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se ouede guadar ek PDC.");
    }
    
}
