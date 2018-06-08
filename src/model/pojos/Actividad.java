package model.pojos;

/**
 *
 * Clase principal para modelar los Cursos con la Base de Datos
 * 
 * @author Daniela Hernandez Valenzuela
 * @since 04/06/2018
 * @version 1.0
 */
public class Actividad {
  private Integer idActividad;
  private String descripcion;
  private String fecha;
  private String formaOperar;
  private Integer idObjetivoParticular;

  public Actividad() {}

  public Actividad(Integer idActividad, String descripcion, String fecha, 
          String formaOperar, Integer idObjetivoParticular) {
    this.idActividad = idActividad;
    this.descripcion = descripcion;
    this.fecha = fecha;
    this.formaOperar = formaOperar;
    this.idObjetivoParticular = idObjetivoParticular;
  }

  public Integer getIdActividad() {
    return idActividad;
  }

  public void setIdActividad(Integer idActividad) {
    this.idActividad = idActividad;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getSegundoParcial() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public String getFormaOperar() {
    return formaOperar;
  }

  public void setFormaOperar(String formaOperar) {
    this.formaOperar = formaOperar;
  }

  public Integer getIdObjetivoParticular() {
    return idObjetivoParticular;
  }

  public void setIdObjetivoParticular(Integer idObjetivoParticular) {
    this.idObjetivoParticular = idObjetivoParticular;
  }

}

