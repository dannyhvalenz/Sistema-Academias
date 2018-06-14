
package controller;

import com.jfoenix.controls.JFXCheckBox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */

public class AsistenteAReunionController implements Initializable {
  
  @FXML
  public JFXCheckBox checkAsistencia;

  @FXML
  private Label labelNombreMaestro;

  @FXML
  private Label labelEE;

  public void  llenarDatosAsistente(String nombreMaestro) {
    labelNombreMaestro.setText(nombreMaestro);
    //labelEE.setText(nombreEE);
  }
  
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }
}