
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXTextArea;
import controller.dialog.EvaluacionCalendarioDialogController;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import model.pojos.Evaluacion;
import model.pojos.Tema;

/**
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */

public class EvaluacionController implements Initializable {

  @FXML
  private StackPane rootPane;  
    
  @FXML
  private JFXButton btnMenosEvaluacion;

  @FXML
  private JFXButton btnMasEvaluacion;

  @FXML
  private JFXTextArea txtPrimerParcial;

  @FXML
  private JFXTextArea txtSegundoParcial;

  @FXML
  private JFXTextArea txtPosterior;
  
  @FXML
  private JFXTextArea txtHerramientas;

  @FXML
  private TableView<Evaluacion> tableEvaluacion;

  @FXML
  private TableColumn<Evaluacion, String> evaluacionCriterio;

  @FXML
  private TableColumn<Evaluacion, Integer> evaluacionPorcentaje;
  
  public ObservableList<Evaluacion> listaEvaluaciones;
  
  private int posicionTablaEvalucaion;
  
  /**
   * Listener de la tabla personas
   */
  private final ListChangeListener<Evaluacion> selectorTablaEvalucion = new ListChangeListener<Evaluacion>() {
    @Override
    public void onChanged(ListChangeListener.Change<? extends Evaluacion> c) {
      ponerEvalucionSeleccionada();
    }
  };
  
  /**
   * PARA SELECCIONAR UNA CELDA DE LA TABLA "tablaParticipantes"
   */
  public Evaluacion getTablaEvaluacionSeleccionada() {
    if (tableEvaluacion != null) {
      List<Evaluacion> tabla = tableEvaluacion.getSelectionModel().getSelectedItems();
      if (tabla.size() == 1) {
        final Evaluacion competicionSeleccionada = tabla.get(0);
        return competicionSeleccionada;
      }
    }
    return null;
  }
  
  /**
   * 
   * Método para poner en los textFields la tupla que selccionemos
   * 
   */
  private void ponerEvalucionSeleccionada() {
        final Evaluacion plan = getTablaEvaluacionSeleccionada();
    posicionTablaEvalucaion = listaEvaluaciones.indexOf(plan);
    if (plan != null) {
    }
  }

  public void llenarDatos(Tema tema, String herramientas){
      txtPrimerParcial.setText(tema.getPrimerParcial());
      txtSegundoParcial.setText(tema.getSegundoParcial());
      txtPosterior.setText(tema.getResto());
      txtHerramientas.setText(herramientas);
  }
  
  /**
   * 
   * Método para inicializar la tabla
   * 
   */
  private void inicializarTablaEvaluacion() {
    evaluacionCriterio.setCellValueFactory(new PropertyValueFactory<Evaluacion, String>("instrumento"));
    evaluacionPorcentaje.setCellValueFactory(new PropertyValueFactory<Evaluacion, Integer>("porcentaje"));
    listaEvaluaciones = FXCollections.observableArrayList();
    tableEvaluacion.setItems(listaEvaluaciones);
  }

  @FXML
  void clickMasEvaluacion(ActionEvent event) {
    JFXDialogLayout content = new JFXDialogLayout();
    content.setHeading(new Text("Evaluación"));
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("/view/Dialog/EvaluacionCalendarioDialog.fxml"));
    try {
      loader.load();
    } catch (IOException ex) {
      Logger.getLogger(PlanDeTrabajoController.class.getName()).log(Level.SEVERE, null, ex);
    }
    EvaluacionCalendarioDialogController display = loader.getController();
    AnchorPane p = loader.getRoot();
    content.setBody(p);
    JFXDialog dialog = new JFXDialog(rootPane,content, JFXDialog.DialogTransition.CENTER);
    JFXButton aceptar = new JFXButton("ACEPTAR");
    
    aceptar.setOnAction((ActionEvent e) -> {
      Evaluacion evaluacion = display.crearEvaluacion();
      listaEvaluaciones.add(evaluacion);
      dialog.close();
    });

    content.setActions(aceptar);
    dialog.show();
  }

  @FXML
  void clickMenosEvaluacion(ActionEvent event) {
    if (listaEvaluaciones.size() > 0) {
      listaEvaluaciones.remove(listaEvaluaciones.size() - 1);
    }
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    inicializarTablaEvaluacion();
  }
}