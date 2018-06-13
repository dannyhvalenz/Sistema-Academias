
package controller.dialog;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import model.pojos.Actividad;

/**
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */


public class ActividadDialogController implements Initializable {
    
  @FXML
    private JFXTextField txtFechas;

    @FXML
    private JFXTextArea txtFormaOperar;

    @FXML
    private JFXTextArea txtAcciones;

  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }
  /**
   * Metodo para crear actividades
   * @return actividad
   */
  public Actividad crearActividad(Integer idObjetivoParticular) {
    Actividad act = new Actividad(txtAcciones.getText(), txtFechas.getText(), txtFormaOperar.getText(), idObjetivoParticular);
    return act;
  }

    public Actividad crearActividad() {
    Actividad act = new Actividad(txtAcciones.getText(), txtFechas.getText(), txtFormaOperar.getText());
    return act;
  }
}