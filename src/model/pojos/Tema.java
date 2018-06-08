package model.pojos;

/**
 *
 * Clase principal para modelar los Cursos con la Base de Datos
 * 
 * @author Daniela Hernandez Valenzuela
 * @since 04/06/2018
 * @version 1.0
 */
public class Tema {
  private Integer idTema;
  private String primerParcial;
  private String segundoParcial;
  private String resto;
  private Integer idEEPlanDeTrabajo;

  public Tema() {
  }

  public Tema(Integer idTema, String primerParcial, String segundoParcial, String resto, Integer idEEPlanDeTrabajo) {
    this.idTema = idTema;
    this.primerParcial = primerParcial;
    this.segundoParcial = segundoParcial;
    this.resto = resto;
    this.idEEPlanDeTrabajo = idEEPlanDeTrabajo;
  }

  public Integer getIdTema() {
    return idTema;
  }

  public void setIdTema(Integer idTema) {
    this.idTema = idTema;
  }

  public String getPrimerParcial() {
    return primerParcial;
  }

  public void setPrimerParcial(String primerParcial) {
    this.primerParcial = primerParcial;
  }

  public String getSegundoParcial() {
    return segundoParcial;
  }

  public void setSegundoParcial(String segundoParcial) {
    this.segundoParcial = segundoParcial;
  }

  public String getResto() {
    return resto;
  }

  public void setResto(String resto) {
    this.resto = resto;
  }

  public Integer getIdEEPlanDeTrabajo() {
    return idEEPlanDeTrabajo;
  }

  public void setIdEEPlanDeTrabajo(Integer idEEPlanDeTrabajo) {
    this.idEEPlanDeTrabajo = idEEPlanDeTrabajo;
  }

}
