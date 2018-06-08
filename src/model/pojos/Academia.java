package model.pojos;

/**
 *
 * Clase principal para modelar las Academias con la Base de Datos
 * 
 * @author Daniela Hernandez Valenzuela
 * @since 04/06/2018
 * @version 1.0
 */
public class Academia {
  private Integer idAcademia;
  private String nombre;
  private String coordinador;

  
/**
 * Constructor por defecto
 */
  public Academia() {
  }

/**
 * 
 * Constructor para las nuevas Academias generadas
 * @param idAcademia Identificador de la Academia
 * @param nombre Nombre de la Academia
 * @param coordinador Nombre del coordinador de la Academia
*/
  public Academia(Integer idAcademia, String nombre, String coordinador) {
    this.idAcademia = idAcademia;
    this.nombre = nombre;
    this.coordinador = coordinador;
  }
  /**
   * Getter del idEE
   * @return Identificador de la EE
   */
  public Integer getIdAcademia() {
    return idAcademia;
  }

/**
 * 
 * Setter idAcademia de la academia
 * @param idAcademia Identificador de la academia
 */
  public void setIdAcademia(Integer idAcademia) {
    this.idAcademia = idAcademia;
  }

/**
 * 
 * Getter del nombre de la academia
 * @return Nombre de la academia
 */
  public String getNombre() {
    return nombre;
  }

/**
 * 
 * Setter del nombre de la academia
 * @param nombre Nombre de la academia
 */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

/**
 * 
 * Getter del coordinador de la academia
 * @return Coordinador de la academia
 */
  public String getCoordinador() {
    return coordinador;
  }

/**
 * 
 * Setter del coordinador de la academia
 * @param coordinador Coordinador de la academia
 */
  public void setCoordinador(String coordinador) {
    this.coordinador = coordinador;
  }

}
