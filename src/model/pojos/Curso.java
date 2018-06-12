/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pojos;

/**
 *
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */
public class Curso {
  private Integer idCurso;
  private String NRC;
  private String programaEducativo;
  private Integer bloque;
  private Integer seccion;
  private Integer idExperienciaEducativa;

    /**
    * Constructor de la clase con todos sus atributos
    * @param idCurso identificador del objeto
    * @param NRC codigo que se utiliza para identificar el curso
    * @param programaEducativo programa educativo al que corresponde
    * @param bloque semestre en el que se imparte el curso
    * @param seccion el horario en donde se encuientra el curso
    * @param idExperienciaEducativa identificador de la experiencia educativa 
    * a la que está relacionada
    */
  public Curso(Integer idCurso, String NRC, String programaEducativo, Integer bloque, Integer seccion,
      Integer idExperienciaEducativa) {
    this.idCurso = idCurso;
    this.NRC = NRC;
    this.programaEducativo = programaEducativo;
    this.bloque = bloque;
    this.seccion = seccion;
    this.idExperienciaEducativa = idExperienciaEducativa;
  }

    /**
    * Constructor por default de la clase
    */
  public Curso() {
  }

    /**
    * Retorna el identificador del curso
    * @return idCurso
    */
  public Integer getIdCurso() {
    return idCurso;
  }

  /**
    * Establece el identificador del curso
    * @param idCurso
    */
  public void setIdCurso(Integer idCurso) {
    this.idCurso = idCurso;
  }

  /**
    * Retorna el NRC del curso
    * @return NRC 
    */
  public String getNRC() {
    return NRC;
  }

  /**
    * Establece el NRC del curso
    * @param NRC 
    */
  public void setNRC(String NRC) {
    this.NRC = NRC;
  }

  /**
    * Retorna el programa educativo al que pertenece el curso
    * @return programaEducativo
    */
  public String getProgramaEducativo() {
    return programaEducativo;
  }

  /**
    * Establece el programa educativo al que pertenece el curso
    * @param programaEducativo
    */
  public void setProgramaEducativo(String programaEducativo) {
    this.programaEducativo = programaEducativo;
  }

  /**
    * Retorna el bloque al que pertenece el curso
    * @return bloque
    */
  public Integer getBloque() {
    return bloque;
  }

  /**
    * Establece el bloque al que pertenece el curso
    * @param bloque
    */
  public void setBloque(Integer bloque) {
    this.bloque = bloque;
  }

  /**
    * Retorna la seccion a la que pertenece el curso
    * @param bloque
    */
  public Integer getSeccion() {
    return seccion;
  }

  /**
    * Establece la seccion a la que pertenece el curso
    * @param seccion
    */
  public void setSeccion(Integer seccion) {
    this.seccion = seccion;
  }

  /**
    * Retorna el identificador de la experiencia educativa a la que pertenece el curso
    * @return idExperienciaEducativa
    */
  public Integer getIdExperienciaEducativa() {
    return idExperienciaEducativa;
  }

  /**
    * Establece el identificador de la experiencia educativa a la que pertenece el curso
    * @param idExperienciaEducativa
    */
  public void setIdExperienciaEducativa(Integer idExperienciaEducativa) {
    this.idExperienciaEducativa = idExperienciaEducativa;
  }

}
