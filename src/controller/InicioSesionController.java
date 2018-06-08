
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Clase controladora de la escena de Inicio del Sistema de Academias
 * 
 * @author Daniela Herandez Valenzuela
 * @since 1/Jun/2018
 * @version 1.1
 */
public class InicioSesionController implements Initializable {
  @FXML
  private StackPane rootPane;

  @FXML
  private JFXTextField txtUsuario;

  @FXML
  private JFXPasswordField txtPassword;

  @FXML
  private JFXButton btnInicioSesion;


  @FXML
  public void clickInicioSesion(ActionEvent event) {
    try {
      StackPane registroView;
      registroView = FXMLLoader.load(getClass().getResource("/view/FXMLHome.fxml"));
      Scene newScene = new Scene(registroView);
      Stage curStage = (Stage) rootPane.getScene().getWindow();
      curStage.setScene(newScene);
      curStage.show();
    } catch (IOException e) {
      System.out.println("No se encontró: " + e);
    }
  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }

}
