package model.pojos;

/**
 *
 * Clase principal para modelar los Evaluacion con la Base de Datos
 * 
 * @author Daniela Hernandez Valenzuela
 * @since 04/06/2018
 * @version 1.0
 */
public class Evaluacion {
  private Integer idEvaluacion;
  private String criterio;
  private String porcentaje;
  private Integer idPlanDeTrabajo;

  public Evaluacion() {
  }

  public Evaluacion(Integer idEvaluacion, String criterio, String porcentaje, 
      Integer idPlanDeTrabajo) {
    this.idEvaluacion = idEvaluacion;
    this.criterio = criterio;
    this.porcentaje = porcentaje;
    this.idPlanDeTrabajo = idPlanDeTrabajo;
  }

  public Integer getIdEvaluacion() {
    return idEvaluacion;
  }

  public void setIdEvaluacion(Integer idEvaluacion) {
    this.idEvaluacion = idEvaluacion;
  }

  public String getCriterio() {
    return criterio;
  }

  public void setCriterio(String criterio) {
    this.criterio = criterio;
  }

  public String getPorcentaje() {
    return porcentaje;
  }

  public void setPorcentaje(String porcentaje) {
    this.porcentaje = porcentaje;
  }

  public Integer getIdPlanDeTrabajo() {
    return idPlanDeTrabajo;
  }

  public void setIdPlanDeTrabajo(Integer idPlanDeTrabajo) {
    this.idPlanDeTrabajo = idPlanDeTrabajo;
  }
}
