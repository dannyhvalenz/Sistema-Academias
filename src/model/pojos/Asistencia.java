package model.pojos;

/**
 *
 * Clase principal para modelar las Asistencia con la Base de Datos
 * 
 * @author Daniela Hernandez Valenzuela
 * @since 04/06/2018
 * @version 1.0
 */
public class Asistencia {
    private Integer idPlanTrabajo;
    private Integer idMaestro;

    public Asistencia() {
    }

    public Asistencia(Integer idPlanTrabajo, Integer idMaestro) {
        this.idPlanTrabajo = idPlanTrabajo;
        this.idMaestro = idMaestro;
    }
    
    public Integer getIdDocumento() {
        return idPlanTrabajo;
    }

    public void setIdPlanTrabajo(Integer idPlanTrabajo) {
        this.idPlanTrabajo = idPlanTrabajo;
    }

    public Integer getIdPlanTrabajo() {
        return idMaestro;
    }

    public void setIdMaestro(Integer idMaestro) {
        this.idMaestro = idMaestro;
    }
}
