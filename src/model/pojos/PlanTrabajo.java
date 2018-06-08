/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pojos;

import java.util.Date;

/**
 *
 * Clase principal para modelar los Cursos con la Base de Datos
 * 
 * @author Daniela Hernandez Valenzuela
 * @since 04/06/2018
 * @version 1.0
 */
public class PlanTrabajo {
  private Integer idPlanTrabajo;
  private String objetivoGeneral;
  private String programasEducativos;
  private Date fechaAprobacion;
  private Integer idAcademia;

  public PlanTrabajo() {
  }

  public PlanTrabajo(Integer idPlanTrabajo, String programasEducativos, 
          String objetivoGeneral, Date fechaAprobacion,Integer idAcademia) {
    this.idPlanTrabajo = idPlanTrabajo;
    this.programasEducativos = programasEducativos;
    this.objetivoGeneral = objetivoGeneral;
    this.fechaAprobacion = fechaAprobacion;
    this.idAcademia = idAcademia;
  }

  public Integer getIdPlanTrabajo() {
    return idPlanTrabajo;
  }

  public void setIdPlanTrabajo(Integer idPlanTrabajo) {
    this.idPlanTrabajo = idPlanTrabajo;
  }

  public String getProgramasEducativos() {
    return programasEducativos;
  }

  public void setProgramasEducativos(String programasEducativos) {
    this.programasEducativos = programasEducativos;
  }

  public String getObjetivoGeneral() {
    return objetivoGeneral;
  }

  public void setObjetivoGeneral(String objetivoGeneral) {
    this.objetivoGeneral = objetivoGeneral;
  }

  public Date getFechaAprobacion() {
    return fechaAprobacion;
  }

  public void setFechaAprobacion(Date fechaAprobacion) {
    this.fechaAprobacion = fechaAprobacion;
  }

  public Integer getIdAcademia() {
    return idAcademia;
  }

  public void setIdAcademia(Integer idAcademia) {
    this.idAcademia = idAcademia;
  }

}

