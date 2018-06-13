
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.dao.AcademiaDAO;
import model.pojos.Academia;
import model.pojos.UsuarioAcademico;

/**
 * Clase controladora de la escena de Dashboard
 * 
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */
public class DashboardController implements Initializable {

  @FXML
  private StackPane rootPane;

  @FXML
  private AnchorPane panelTopBar;

  @FXML
  private JFXButton btnHamburger;

  @FXML
  private JFXButton btnModoMaestro;

  @FXML
  private AnchorPane panelMaestro;

  @FXML
  private JFXButton btnLogOut;

  @FXML
  private ImageView imageLogOut;

  @FXML
  private Label lblnombreMaestro;

  @FXML
  private Label lblMaestro;

  @FXML
  private JFXButton btnModoCoordinador;

  @FXML
  private AnchorPane panelCoordinador;

  @FXML
  private Label lblCoordinador;

  @FXML
  private Label lblAcademia;

  @FXML
  private JFXDrawer drawer;

  private String modoDeUsuario = "Maestro";

  private UsuarioAcademico usuario;

  private Integer idAcademia;

  @Override
  public void initialize(URL url, ResourceBundle rb) {}

  @FXML
  public void cerrarDrawer(MouseEvent event) {

  }

  public void cargarUsuario(UsuarioAcademico usuario) {
    this.usuario = usuario;
    lblnombreMaestro.setText(usuario.getNombre() + " " + usuario.getApellidos());
    AcademiaDAO acad = new AcademiaDAO();
    Academia academia = acad.obtenerCoordinacion(usuario.getIdUsuarioAcademico());
    idAcademia = academia.getIdAcademia();
    lblAcademia.setText(academia.getNombre());
  }

  public void cargarPantalla() {
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("/view/PlanDeTrabajo.fxml"));
    try {
      loader.load();
    } catch (IOException ex) {
      Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
    PlanDeTrabajoController planTrabajo = loader.getController();
    planTrabajo.iniciarDatosUsuario(usuario, usuario.getIdUsuarioAcademico(), this.idAcademia);
    StackPane agregarView = loader.getRoot();
    Scene newScene = new Scene(agregarView);
    Stage curStage = (Stage) rootPane.getScene().getWindow();
    newScene.getStylesheets().add(getClass().getResource("/resources/CSS/Styles.css").toExternalForm());
    curStage.setScene(newScene);
    curStage.show();
  }

  /**
   * Metodo de la accion que realiza el hamburger para cerrar sesion 
   * @param event 
   */
  @FXML
  public void clickHamburger(ActionEvent event) {
    try {
      StackPane Login;
      Login = FXMLLoader.load(getClass().getResource("/view/Inicio.fxml"));
      Scene newScene = new Scene(Login);
      Stage curStage = (Stage) rootPane.getScene().getWindow();
      curStage.setScene(newScene);
      curStage.show();
    } catch (IOException e) {
      System.out.println("No se enecontró: " + e);
    }
  }

  @FXML
  public void clickAtras(ActionEvent event) {
    try {
      StackPane Login;
      Login = FXMLLoader.load(getClass().getResource("/view/Inicio.fxml"));
      Scene newScene = new Scene(Login);
      Stage curStage = (Stage) rootPane.getScene().getWindow();
      curStage.setScene(newScene);
      curStage.show();
    } catch (IOException e) {
      System.out.println("No se enecontró: " + e);
    }
  }

    public void clickGenerar(ActionEvent event) {
        cargarPantalla();
  }

}
