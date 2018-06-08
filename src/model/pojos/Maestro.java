package model.pojos;

/**
 *
 * Clase principal para modelar los Cursos con la Base de Datos
 * 
 * @author Daniela Hernandez Valenzuela
 * @since 04/06/2018
 * @version 1.0
 */
public class Maestro {
  private Integer idUsuario;
  private String nombre;
  private String apellidos;

  public Maestro() {
  }

    public Maestro(Integer idUsuario, String nombre, String apellidos) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Integer getIdUsuarioAcademico() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
  
  
}
