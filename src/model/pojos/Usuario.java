package model.pojos;

/**
 *
 * Clase principal para modelar los Usuario con la Base de Datos
 * 
 * @author Daniela Hernandez Valenzuela
 * @since 04/06/2018
 * @version 1.0
 */
public class Usuario {
  private Integer idUsuarioAcademico;
  private String nombre;
  private String apellidos;
  private String correo;
  private String telefono;
  private String username;
  private String contrasena;
  private Integer idRol;

  
  public Usuario() {}

  public Usuario(Integer idUsuarioAcademico, String nombre, String apellidos, String correo, String telefono,
      String username, String contrasena, Integer idRol) {
    this.idUsuarioAcademico = idUsuarioAcademico;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.correo = correo;
    this.telefono = telefono;
    this.username = username;
    this.contrasena = contrasena;
    this.idRol = idRol;
  }

  public Integer getIdUsuarioAcademico() {
    return idUsuarioAcademico;
  }

  public void setIdUsuarioAcademico(Integer idUsuarioAcademico) {
    this.idUsuarioAcademico = idUsuarioAcademico;
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

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getContrasena() {
    return contrasena;
  }

  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }

  public Integer getIdRol() {
    return idRol;
  }

  public void setIdRol(Integer idRol) {
    this.idRol = idRol;
  }

}
