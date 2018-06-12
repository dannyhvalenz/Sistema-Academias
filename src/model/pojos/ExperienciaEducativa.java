package model.pojos;

/**
 *
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */
public class ExperienciaEducativa {
  private Integer idExperienciaEducativa;
  private String nombre;
  private Integer idAcademia;

  /**
    * Constructor por default de la clase
    */
  public ExperienciaEducativa() {
  }

  /**
    * Constructor de la clase con todos sus atributos
    * @param idExperienciaEducativa identificador para el objeto
    * @param nombre el nombre que lleva la experiencia educativa
    * @param idAcademia identificador de la academia a la que pertenece la 
    * experiencia educativa.
    */
  public ExperienciaEducativa(Integer idExperienciaEducativa, String nombre, Integer idAcademia) {
    this.idExperienciaEducativa = idExperienciaEducativa;
    this.nombre = nombre;
    this.idAcademia = idAcademia;
  }

  /**
    * Retorna el identificador del objeto.
    * @return idExperienciaEducativa
    */
  public Integer getIdExperienciaEducativa() {
    return idExperienciaEducativa;
  }

  /**
    * Establece el identificador del objeto.
    * @param idExperienciaEducativa
    */
  public void setIdExperienciaEducativa(Integer idExperienciaEducativa) {
    this.idExperienciaEducativa = idExperienciaEducativa;
  }

  /**
    * Retorna el nombre del objeto.
    * @return nombre
    */
  public String getNombre() {
    return nombre;
  }

  /**
    * Establece el nombre del objeto.
    * @param nombre
    */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
    * Retorna el identificador de la academia a la que pertenece el objeto.
    * @return idAcademia
    */
  public Integer getIdAcademia() {
    return idAcademia;
  }

  /**
    * Establece el identificador de la academia a la que pertenece el objeto.
    * @param idAcademia
    */
  public void setIdAcademia(Integer idAcademia) {
    this.idAcademia = idAcademia;
  }

}
