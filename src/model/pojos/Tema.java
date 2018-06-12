package model.pojos;

/**
 *
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */
public class Tema {
  private Integer idTema;
  private String primerParcial;
  private String segundoParcial;
  private String resto;
  private Integer idEEPlanDeTrabajo;

  /**
   * Constructor por defecto
   */
  public Tema() {
  }

  public Tema(String primerParcial, String segundoParcial, String resto) {
    this.primerParcial = primerParcial;
    this.segundoParcial = segundoParcial;
    this.resto = resto;
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
