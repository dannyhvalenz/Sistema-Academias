package model.pojos;

/**
 *
 * Clase principal para modelar las ObjetivoParticular con la Base de Datos
 * 
 * @author Daniela Hernandez Valenzuela
 * @since 04/06/2018
 * @version 1.0
 */
public class ObjetivoParticular {
  private Integer idObjetivoParticular;
  private String descripcion;
  private String meta;
  private Integer idPlanTrabajo;
  
/**
 * Constructor por defecto
 */  
  public ObjetivoParticular() {}

/**
 * 
 * Constructor para los nuevos ObjetivoParticular generados
 * @param idObjetivoParticular Identificador del ObjetivoParticular
 * @param descripcion descripcion de la ObjetivoParticular
 * @param meta meta de la ObjetivoParticular 
 * @param idPlanTrabajo Identificador del PlanTrabajo
 */
  public ObjetivoParticular(Integer idObjetivoParticular, String descripcion, String meta, 
          Integer idPlanTrabajo) {
    this.idObjetivoParticular = idObjetivoParticular;
    this.descripcion = descripcion;
    this.meta = meta;
    this.idPlanTrabajo = idPlanTrabajo;
  }

/**
 * 
 * Getter idObjetivoParticular de la ObjetivoParticular
 * @return Identificador de la ObjetivoParticular
 */  
  public Integer getIdObjetivoParticular() {
    return idObjetivoParticular;
  }

/**
 * 
 * Setter idObjetivoParticular de la ObjetivoParticular
 * @param idObjetivoParticular Identificador de la ObjetivoParticular
 */   
  public void setIdObjetivoParticular(Integer idObjetivoParticular) {
    this.idObjetivoParticular = idObjetivoParticular;
  }
  
/**
 * 
 * Getter descripcion de la ObjetivoParticular
 * @return descripcion de la ObjetivoParticular
 */
  public String getDescripcion() {
    return descripcion;
  }

/**
 * 
 * Setter descripcion de la ObjetivoParticular
 * @param descripcion descripcion de la ObjetivoParticular
 */  
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  
/**
 * 
 * Getter meta de la ObjetivoParticular
 * @return meta de la ObjetivoParticular
 */
  public String getMeta() {
    return meta;
  }

/**
 * 
 * Setter meta de la ObjetivoParticular
 * @param meta meta de la ObjetivoParticular
 */  
  public void setMeta(String meta) {
    this.meta = meta;
  }
  
/**
 * 
 * Getter idPlanDeTrabajo del PlanTrabajo
 * @return Identificador del Plan de trabajo
 */
  public Integer getIdPlanTrabajo() {
    return idPlanTrabajo;
  }

/**
 * 
 * Setter idPlanTrabajo de la PlanTrabajo
 * @param idPlanTrabajo Identificador del PlanTrabajo
 */
  public void setIdPlanTrabajo(Integer idPlanTrabajo) {
    this.idPlanTrabajo = idPlanTrabajo;
  }

}
