
package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * 
 * Clase principal de la ejecución
 * 
 *
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */
public class SistemaAcademias extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("/view/Inicio.fxml"));
    stage.setTitle("Sistema de Academias");
    Scene scene = new Scene(root);
    scene.getStylesheets().add(getClass().getResource("/resources/CSS/Styles.css").toExternalForm());
    stage.getIcons().add(new Image(getClass().getResourceAsStream("/resources/UV.png")));
    stage.setResizable(false);
    stage.sizeToScene();
    stage.setMaximized(true);
    stage.setScene(scene);
    stage.show();
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }

}
