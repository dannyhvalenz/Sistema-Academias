
package controller.dialog;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import model.pojos.Evaluacion;

/**
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */


public class EvaluacionCalendarioDialogController implements Initializable {
  @FXML
  private JFXTextField txtCriterio;

  @FXML
  private JFXTextField txtPorcentaje;

  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }

  public Evaluacion crearEvaluacion() {
    Evaluacion evaluacion = new Evaluacion(Integer.parseInt(txtPorcentaje.getText()), txtCriterio.getText());
    return evaluacion;
  }

}