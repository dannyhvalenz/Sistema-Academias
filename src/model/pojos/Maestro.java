package model.pojos;

/**
 *
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */
public class Maestro {
  private Integer idUsuarioAcademico;
  private String nombre;
  private String apellidos;

  /**
    * Constructor por default de la clase. 
    */
  public Maestro() {
  }

  /**
    * Constructor de la clase con todos sus atributos.
    * @param idUsuarioAcademico identificador del objeto
    * @param nombre el nombre que lleva el maestro
    * @param apellidos los apellidos (paterno y materno) del maestro
    */
    public Maestro(Integer idUsuarioAcademico, String nombre, String apellidos) {
        this.idUsuarioAcademico = idUsuarioAcademico;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    /**
    * Retorna el identificador del maestro.
    * @return idUsuarioAcademico
    */
    public Integer getIdUsuarioAcademico() {
        return idUsuarioAcademico;
    }

    /**
    * Establece el identificador del maestro.
    * @param idUsuarioAcademico
    */
    public void setIdUsuarioAcademico(Integer idUsuarioAcademico) {
        this.idUsuarioAcademico = idUsuarioAcademico;
    }

    /**
    * Retorna el nombre del maestro.
    * @return nombre
    */
    public String getNombre() {
        return nombre;
    }

    /**
    * Establece el nombre del maestro.
    * @param nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
    * Retorna los apellidos del maestro.
    * @return apellidos
    */
    public String getApellidos() {
        return apellidos;
    }

    /**
    * Establece los apellidos del maestro.
    * @param apellidos
    */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
  
  
}
