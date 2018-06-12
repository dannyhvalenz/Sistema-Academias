package model.pojos;

/**
 *
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */
public class Academia {
  private Integer idAcademia;
  private String nombre;
  private Integer idCoordinador;

  /**
    * Constructor por defecto de la clase
    */
  public Academia() {
  }

  /**
    * Constructor de la clase con todos sus atributos
    * @param idAcademia identificador del objeto
    * @param nombre nombre que tiene la academia
    * @param idCoordinador coordinador de la academia
    */
  public Academia(Integer idAcademia, String nombre, Integer idCoordinador) {
    this.idAcademia = idAcademia;
    this.nombre = nombre;
    this.idCoordinador = idCoordinador;
  }

  /**
    * Retorna el identificador de la academia
    * @return idAcademia
    */
  public Integer getIdAcademia() {
    return idAcademia;
  }

  /**
    * Establece el identificador de la academia
    * @param idAcademia
    */
  public void setIdAcademia(Integer idAcademia) {
    this.idAcademia = idAcademia;
  }

  /**
    * Retorna el nombre de la academia
    * @return nombre
    */
  public String getNombre() {
    return nombre;
  }

  /**
    * Establece el nombre de la academia
    * @param nombre
    */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
    * Retorna el coordinador de la academia
    * @return coordinador
    */
  public Integer getIdCoordinador() {
    return idCoordinador;
  }

  /**
    * Establece el coordinador de la academia
    * @param coordinador
    */
  public void setIdCoordinador(Integer idCoordinador) {
    this.idCoordinador = idCoordinador;
  }

}
