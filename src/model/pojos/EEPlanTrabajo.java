package model.pojos;

/**
 *
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */
public class EEPlanTrabajo {
  private Integer idEEPlanTrabajo;
  private String nombre;
  private String herramientas;
  private Integer idPlanDeTrabajo;

  /**
    * Constructor por default de la clase
    */
  public EEPlanTrabajo() {
  }

  /**
    * Constructor de la clase con todos sus atributos
    * @param idEEPlanTrabajo identificador del objeto
    * @param nombre nombre que se le da al documento
    * @param herramientas las herramientas que se utilizan en el documento
    * @param idPlanTrabajo identificador del plan de trabajo con el que está asociado
    */
  public EEPlanTrabajo(Integer idEEPlanTrabajo, String nombre, String herramientas, Integer idPlanDeTrabajo) {
    this.idEEPlanTrabajo = idEEPlanTrabajo;
    this.nombre = nombre;
    this.herramientas = herramientas;
    this.idPlanDeTrabajo = idPlanDeTrabajo;
  }

  /**
    * Retorna el identificador del eeplan de trabajo 
    * @return idEEPlanTrabajo
    */
  public Integer getIdEEPlanTrabajo() {
    return idEEPlanTrabajo;
  }

  /**
    * Establece el identificador del eeplan de trabajo 
    * @param idEEPlanTrabajo
    */
  public void setIdEEPlanTrabajo(Integer idEEPlanTrabajo) {
    this.idEEPlanTrabajo = idEEPlanTrabajo;
  }

  /**
    * Retorna el nombre dado al eeplan de trabajo 
    * @return nombre
    */
  public String getNombre() {
    return nombre;
  }

  /**
    * Establece el nombre dado al eeplan de trabajo 
    * @param nombre
    */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
    * Retorna las herramientas que utiliza el eeplan de trabajo 
    * @return herramientas
    */
  public String getHerramientas() {
    return herramientas;
  }

  /**
    * Establece las herramientas que utiliza el eeplan de trabajo 
    * @param herramientas
    */
  public void setHerramientas(String herramientas) {
    this.herramientas = herramientas;
  }

  /**
    * Retorna el identificador del plan de trabajo que se asocia con el objeto
    * @return idPlanDeTrabajo
    */
  public Integer getIdPlanDeTrabajo() {
    return idPlanDeTrabajo;
  }

    /**
    * Establece el identificador del plan de trabajo que se asocia con el objeto
    * @param idPlanDeTrabajo
    */
  public void setIdPlanDeTrabajo(Integer idPlanDeTrabajo) {
    this.idPlanDeTrabajo = idPlanDeTrabajo;
  }

}
