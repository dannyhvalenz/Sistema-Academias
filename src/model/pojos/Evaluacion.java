package model.pojos;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */
public class Evaluacion {
  private Integer idEvaluacion;
  private SimpleIntegerProperty porcentaje = new SimpleIntegerProperty();
  private SimpleStringProperty instrumento = new SimpleStringProperty();
  private Integer idEEPlanTrabajo;

  /**
    * Constructor por default de la clase
    */
  public Evaluacion() {
  }

  public Evaluacion(Integer porcentaje, String instrumento) {
    this.porcentaje = new SimpleIntegerProperty(porcentaje);
    this.instrumento = new SimpleStringProperty(instrumento);
}

  /**
    * Constructor de la clase con todos sus atributos
    * @param idEvaluacion identificador del objeto
    * @param porcentaje el valor de la evaluacion
    * @param instrumento el instrumento que se utiliza para la evaluacion
    * @param idPlanDeTrabajo identificador del plan de trabajo al que esta asociada la evaluacion
    */
    public Evaluacion(Integer idEvaluacion, Integer porcentaje, String instrumento, Integer idPlanDeTrabajo) {
        this.idEvaluacion = idEvaluacion;
        this.porcentaje = new SimpleIntegerProperty(porcentaje);
        this.instrumento = new SimpleStringProperty(instrumento);
        this.idEEPlanTrabajo = idPlanDeTrabajo;
    }

    /**
    * Getter del identificador de la evaluacion
    * @return idEvaluacion
    */
    public Integer getIdEvaluacion() {
        return idEvaluacion;
    }

    /**
    * Setter del identificador de la evaluacion
    * @param idEvaluacion
    */
    public void setIdEvaluacion(Integer idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    /**
    * Getter del porcentaje de la evaluacion
    * @return porcentaje
    */
    public Integer getPorcentaje() {
        return porcentaje.get();
    }

    /**
    * Setter del porcentaje de la evaluacion
    * @param porcentaje
    */
    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = new SimpleIntegerProperty(porcentaje);
    }

    /**
    * Getter del instrumento de  evaluacion
    * @return instrumento
    */
    public String getInstrumento() {
        return instrumento.get();
    }

    /**
    * Setter del instrumento de  evaluacion
    * @param instrumento
    */
    public void setInstrumento(String instrumento) {
        this.instrumento = new SimpleStringProperty(instrumento);
    }

    /**
     * Getter del idEEPlanTrabajo
     * @return 
     */
    public Integer getIdEEPlanTrabajo() {
        return idEEPlanTrabajo;
    }

    /**
     * Setter del idEEPlanTrabajo
     * @param idEEPlanTrabajo 
     */
    public void setIdEEPlanTrabajo(Integer idEEPlanTrabajo) {
        this.idEEPlanTrabajo = idEEPlanTrabajo;
    }
}
