
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.dao.UsuarioDAO;
import model.pojos.Usuario;

/**
 * Clase controladora de la escena de Inicio
 * 
 * @author Daniela Hernandez
 * @since Mon May 07 2018
 * @version 0.1
 */
public class InicioSesionController implements Initializable {
  @FXML
  private StackPane rootPane;

  @FXML
  private JFXTextField txtEmail;

  @FXML
  private JFXPasswordField txtPassword;

  @FXML
  private JFXButton btnLogin;

  @FXML
  private JFXButton btnSignUp;

  @FXML
  private ImageView btnInfo;

  private Usuario usuario;

  private Usuario datosIngresados;

  @FXML
  public void clickAcceder(ActionEvent event) {
    iniciarSesion();
  }
  
  public void cargarDrawer(){
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("/view/FXMLHome.fxml"));
    try {
      loader.load();
    } catch (IOException ex) {
      Logger.getLogger(InicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
    }
    FXMLHomeController display = loader.getController();
    //display.cargarUsuario(this.usuario);
    StackPane vistaCursos = loader.getRoot();
    Scene newScene = new Scene(vistaCursos);
    Stage curStage = (Stage) rootPane.getScene().getWindow();
    curStage.setScene(newScene);
    curStage.show();
  }
  
  @FXML
  public void clickSignUp(ActionEvent event) {

  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }

  public boolean camposIncompletos(){
    return txtEmail.getText().isEmpty() || txtPassword.getText().isEmpty();
  }

  /**
   * Método de Inicio de Sesión, con validación de datos
   */
  public void iniciarSesion() {
    if (!camposIncompletos()) {
      datosIngresados = new Usuario(txtEmail.getText(), txtPassword.getText());
      usuario = UsuarioDAO.login(datosIngresados);
      if (usuario != null) {
        cargarDrawer();
      } else {
        mensaje("Usuario no registrado", "Revise su matrícula y su contraseña");
      }
    } else {
      mensaje("Campos incompletos", "Por favor llene todos los campos necesarios");
    }
  }

  /**
   * Inicialización y muestra de un JFXDialog al centro de la pantalla, mandando
   * una advertencia a alguna operación
   * 
   * @param head Título del dialog
   * @param body Texto principal del dialog
   */
  public void mensaje(String head, String body) {
    JFXDialogLayout content = new JFXDialogLayout();
    content.setHeading(new Text(head));
    content.setBody(new Text(body));
    JFXDialog dialog = new JFXDialog(rootPane, content, JFXDialog.DialogTransition.CENTER);
    JFXButton aceptar = new JFXButton("ACEPTAR");
    aceptar.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
        dialog.close();
      }
    });
    content.setActions(aceptar);
    dialog.show();
  }

}
