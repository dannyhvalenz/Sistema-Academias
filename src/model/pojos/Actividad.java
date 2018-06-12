package model.pojos;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */
public class Actividad {
    private Integer idActividad;
    private SimpleStringProperty accion = new SimpleStringProperty();
    private SimpleStringProperty fecha = new SimpleStringProperty();
    private SimpleStringProperty formaDeOperar = new SimpleStringProperty();
    private Integer idObjetivoParticular;

    /**
     * Constructor por defecto
     */
    public Actividad() {
    }

    /**
     * Construcctor para crear la actividad
     * @param accion
     * @param fecha
     * @param formaDeOperar 
     */
    public Actividad(String accion, String fecha, String formaDeOperar) {
        this.accion = new SimpleStringProperty(accion);
        this.fecha = new SimpleStringProperty(fecha);
        this.formaDeOperar = new SimpleStringProperty(formaDeOperar);
    }

    /**
     * Construcctor para crear la actividad en un determinado objetivo particular
     * @param idActividad
     * @param accion
     * @param fecha
     * @param formaDeOperar
     * @param idObjetivoParticular 
     */
    public Actividad(Integer idActividad, String accion, String fecha, String formaDeOperar, Integer idObjetivoParticular) {
        this.idActividad = idActividad;
        this.accion = new SimpleStringProperty(accion);
        this.fecha = new SimpleStringProperty(fecha);
        this.formaDeOperar = new SimpleStringProperty(formaDeOperar);
        this.idObjetivoParticular = idObjetivoParticular;
    }

    /**
     * Getter id actividad
     * @return idActividad
     */
    public Integer getIdActividad() {
        return idActividad;
    }

    /**
     * Setter idActividad
     * @param idActividad 
     */
    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    /**
     * Getter accion
     * @return accion
     */
    public String getAccion() {
        return accion.get();
    }

    /**
     * Setter de la accion
     * @param accion 
     */
    public void setAccion(String accion) {
        this.accion = new SimpleStringProperty(accion);
    }

    /**
     * Getter fecha de la actividad
     * @return fecha
     */
    public String getFecha() {
        return fecha.get();
    }

    /**
     * setter de la fecha de la actividad
     * @param fecha 
     */
    public void setFecha(String fecha) {
        this.fecha = new SimpleStringProperty(fecha);
    }

    /**
     * Getter forma de operar
     * @return formaOperar
     */
    public String getFormaDeOperar() {
        return formaDeOperar.get();
    }

    /**
     * Setter de forma de operar
     * @param formaDeOperar 
     */
    public void setFormaDeOperar(String formaDeOperar) {
        this.formaDeOperar = new SimpleStringProperty(formaDeOperar);
    }

    /**
     * Getter de idObjetivoParticular
     * @return idObjetivoParticular
     */
    public Integer getIdObjetivoParticular() {
        return idObjetivoParticular;
    }

    /**
     * Setter de idObjetivoParticular
     * @param idObjetivoParticular 
     */
    public void setIdObjetivoParticular(Integer idObjetivoParticular) {
        this.idObjetivoParticular = idObjetivoParticular;
    }
    
    
}
