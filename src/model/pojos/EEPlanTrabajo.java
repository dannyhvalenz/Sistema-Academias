package model.pojos;

/**
 *
 * Clase principal para modelar las EEPlanTrabajo con la Base de Datos
 * 
 * @author Daniela Hernandez Valenzuela
 * @since 04/06/2018
 * @version 1.0
 */
public class EEPlanTrabajo {
  private Integer idEEPlanTrabajo;
  private String nombre;
  private String herramientas;
  private Integer idPlanTrabajo;
  
/**
 * Constructor por defecto
 */  
  public EEPlanTrabajo() {}

/**
 * 
 * Constructor para los nuevos EEPlanTrabajo generados
 * @param idEEPlanTrabajo Identificador del EEPlanTrabajo
 * @param nombre nombre de la EEPlanTrabajo
 * @param herramientas herramientas de la EEPlanTrabajo 
 * @param idPlanTrabajo Identificador del PlanTrabajo
 */
  public EEPlanTrabajo(Integer idEEPlanTrabajo, String nombre, String herramientas, 
          Integer idPlanTrabajo) {
    this.idEEPlanTrabajo = idEEPlanTrabajo;
    this.nombre = nombre;
    this.herramientas = herramientas;
    this.idPlanTrabajo = idPlanTrabajo;
  }

/**
 * 
 * Getter idEEPlanTrabajo de la EEPlanTrabajo
 * @return Identificador de la EEPlanTrabajo
 */  
  public Integer getIdEEPlanTrabajo() {
    return idEEPlanTrabajo;
  }

/**
 * 
 * Setter idEEPlanTrabajo de la EEPlanTrabajo
 * @param idEEPlanTrabajo Identificador de la EEPlanTrabajo
 */   
  public void setIdEEPlanTrabajo(Integer idEEPlanTrabajo) {
    this.idEEPlanTrabajo = idEEPlanTrabajo;
  }
  
/**
 * 
 * Getter nombre de la EEPlanTrabajo
 * @return nombre de la EEPlanTrabajo
 */
  public String getNombre() {
    return nombre;
  }

/**
 * 
 * Setter nombre de la EEPlanTrabajo
 * @param nombre nombre de la EEPlanTrabajo
 */  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
/**
 * 
 * Getter herramientas de la EEPlanTrabajo
 * @return herramientas de la EEPlanTrabajo
 */
  public String getHerramientas() {
    return herramientas;
  }

/**
 * 
 * Setter herramientas de la EEPlanTrabajo
 * @param herramientas herramientas de la EEPlanTrabajo
 */  
  public void setHerramientas(String herramientas) {
    this.herramientas = herramientas;
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
