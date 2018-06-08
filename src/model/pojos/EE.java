package model.pojos;

/**
 *
 * Clase principal para modelar las EE con la Base de Datos
 * 
 * @author Daniela Hernandez Valenzuela
 * @since 04/06/2018
 * @version 1.0
 */
public class EE {
  private Integer idEE;
  private String nombre;
  private Integer idAcademia;

/**
 * Constructor por defecto
 */
  public EE() {}

/**
 * 
 * Constructor para las nuevas EE generadas
 * @param idEE Identificador de la EE
 * @param nombre nombre de la EE
 * @param idAcademia Academia a la que pertenece la EE
 */  
  public EE(Integer idEE, String nombre, Integer idAcademia) {
    this.idEE = idEE;
    this.nombre = nombre;
    this.idAcademia = idAcademia;
  }

/**
 * 
 * Getter idEE de la EE
 * @return Identificador de la EE
 */ 
  public Integer getIdEE() {
    return idEE;
  }

/**
 * 
 * Setter idEE de la EE
 * @param idEE Identificador de la EE
 */ 
  public void setIdEE(Integer idEE) {
    this.idEE = idEE;
  }

/**
 * 
 * Setter nombre de la EE
 * @param nombre Identificador de la EE
 */  
  public String getNombre() {
    return nombre;
  }

/**
 * 
 * Getter nombre de la EE
 * @return Identificador de la EE
 */  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

/**
 * 
 * Getter idAcademia de la Academia
 * @return Identificador de la Academia
 */ 
  public Integer getIdAcademia() {
    return idAcademia;
  }

/**
 * 
 * Setter idAcademia de la Academia
 * @param idAcademia Identificador de la Academia
 */ 
  public void setIdAcademia(Integer idAcademia) {
    this.idAcademia = idAcademia;
  }

}
