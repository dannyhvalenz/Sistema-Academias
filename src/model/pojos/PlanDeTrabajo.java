package model.pojos;

import java.util.Date;

/**
 *
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */
public class PlanDeTrabajo {
    private Integer idPlanDetrabajo;
    private String formato;
    private Date fechaAprobacion;
    private String objetivoGeneral;
    private String programaEducativo;
    /**
   *Constructor por default de la clase 
   */
    public PlanDeTrabajo() {
    }
    /**
   *Constructor de la clase con todos sus atributos.
   * @param idPlanDeTrabajo Corresponde al identificador del objeto.
   * @param formato Corresponde al tipo de formato que es el objeto, en este 
   * caso, es un plan de trabajo.
   * @param fechaAprobacion Corresponde a la fecha en la que se aprobó el doc.
   * @param objetivoGeneral Corresponde a un solo objetivo general que es parte
   * del documento.
   * @param programaEducativo Corresponde al programa educativo al que pertenece
   * el plan de trabajo.
   */
    public PlanDeTrabajo(Integer idPlanDetrabajo, String formato, Date fechaAprobacion, String objetivoGeneral, String programaEducativo) {
        this.idPlanDetrabajo = idPlanDetrabajo;
        this.formato = formato;
        this.fechaAprobacion = fechaAprobacion;
        this.objetivoGeneral = objetivoGeneral;
        this.programaEducativo = programaEducativo;
    }
    /**
     *Retorna el identificador del Plan de trabajo.
     * @return idPlanDeTrabajo
     */
    public Integer getIdPlanDetrabajo() {
        return idPlanDetrabajo;
    }

    /**
    *Establece el identificador del Plan de trabajo.
    * @param idPlanDeTrabajo Corresponde al identificador del plan de trabajo.
    */
    public void setIdPlanDetrabajo(Integer idPlanDetrabajo) {
        this.idPlanDetrabajo = idPlanDetrabajo;
    }

    /**
    *Retorna el formato del Plan de trabajo.
    * @return formato
    */ 
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    /**
    *Retorna el la fecha en que fue aprobado el documento.
    * @return fechaAprobacion
    */ 
    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    /**
    *Establece la fecha en la que se aprobó el plan de trabajo.
    * @param fechaAprobacion Corresponde a la fecha de aprobacion del plan de trabajo.
    */
    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    /**
    *Retorna el objetivo general del Plan de trabajo.
    * @return objetivoGeneral
    */ 
    public String getObjetivoGeneral() {
        return objetivoGeneral;
    }

    /**
    *Establece el objetivo general del Plan de trabajo.
    * @param objetivoGeneral Corresponde al objetivo general del plan de trabajo.
    */
    public void setObjetivoGeneral(String objetivoGeneral) {
        this.objetivoGeneral = objetivoGeneral;
    }

    /**
    *Retorna el programa educativo al que pertence el Plan de trabajo.
    * @return programaEducativo
    */ 
    public String getProgramaEducativo() {
        return programaEducativo;
    }

    /**
    *Establece el programa educativo al que pertenece el Plan de trabajo.
    * @param programaEducativo Corresponde al programa educativo al que pertenece
    * el plan de trabajo.
    */ 
    public void setProgramaEducativo(String programaEducativo) {
        this.programaEducativo = programaEducativo;
    }
}
