/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pojos;

/**
 *
 * Clase principal para modelar los Cursos con la Base de Datos
 * 
 * @author Daniela Hernandez Valenzuela
 * @since 04/06/2018
 * @version 1.0
 */
public class Curso {
  private Integer idCurso;
  private String NRC;
  private String programaEducativo;
  private Integer bloque;
  private Integer seccion;
  private Integer idExperienciaEducativa;

  
/**
 * 
 * Constructor para los nuevos Cursos generados
 * @param idCurso Identificador del Curso
 * @param NRC NRC del Curso
 * @param programaEducativo Programa educativo del curso
 * @param bloque Bloque al que pertenece el curso
 * @param seccion Seccion a la que pertenece el curso
 * @param idExperienciaEducativa idExperienciaEducativa del la EE a la que pertenece el curso
*/
  public Curso(Integer idCurso, String NRC, String programaEducativo, 
          Integer bloque, Integer seccion,Integer idExperienciaEducativa) {
    this.idCurso = idCurso;
    this.NRC = NRC;
    this.programaEducativo = programaEducativo;
    this.bloque = bloque;
    this.seccion = seccion;
    this.idExperienciaEducativa = idExperienciaEducativa;
  }
/**
 * Constructor por defecto
 */
  public Curso() {}

/**
 * 
 * Getter idCurso del curso
 * @return Identificador del curso
 */
  public Integer getIdCurso() {
    return idCurso;
  }

/**
 * 
 * Setter idCurso del curso
 * @param idCurso Identificador del curso
 */
  public void setIdCurso(Integer idCurso) {
    this.idCurso = idCurso;
  }
/**
 * 
 * Getter NRC del curso
 * @return NRC NRC del curso
 */
  public String getNRC() {
    return NRC;
  }

/**
 * 
 * Getter NRC del curso
 * @param NRC NRC del curso
 */
  public void setNRC(String NRC) {
    this.NRC = NRC;
  }

/**
 * 
 * Getter programa educativo del curso
 * @return programa educativo del curso
 */
  public String getProgramaEducativo() {
    return programaEducativo;
  }

/**
 * 
 * Setter programaEducativo del Curso
 * @param programaEducativo Programa Educativo del Curso
 */
  public void setProgramaEducativo(String programaEducativo) {
    this.programaEducativo = programaEducativo;
  }

/**
 * 
 * Getter Bloque del curso
 * @return Bloque del curso
 */
  public Integer getBloque() {
    return bloque;
  }
  
/**
 * 
 * Setter Bloque del curso
 * @param bloque Bloque del curso
 */
  public void setBloque(Integer bloque) {
    this.bloque = bloque;
  }
  
/**
 * 
 * Getter seccion del curso
 * @return Seccion al que pertenece el Curso
 */
  public Integer getSeccion() {
    return seccion;
  }
  
/**
 * 
 * Setter idExperienciaEducativa de la academia
 * @param idExperienciaEducativa Identificador de la EE
 */
  public void setSeccion(Integer seccion) {
    this.seccion = seccion;
  }

/**
 * 
 * Getter idExperienciaEducativa de la EE
 * @return Identificador de la EE
 */
  public Integer getIdExperienciaEducativa() {
    return idExperienciaEducativa;
  }

/**
 * 
 * Setter idExperienciaEducativa de la EE
 * @param idExperienciaEducativa Identificador de la EE
 */
  public void setIdExperienciaEducativa(Integer idExperienciaEducativa) {
    this.idExperienciaEducativa = idExperienciaEducativa;
  }

}
