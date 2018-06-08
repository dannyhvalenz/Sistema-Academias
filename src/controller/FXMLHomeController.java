/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author dany
 */
public class FXMLHomeController implements Initializable {
    @FXML
    private StackPane rootPane;
    
    @FXML
    private AnchorPane homePane;
    
    @FXML
    private AnchorPane barra;
    
    @FXML
    private JFXButton menu;
    
    @FXML
    private Label lblNombreUsuario;
    
    @FXML
    private ImageView iconoUsuario;
    
    @FXML
    private AnchorPane generarPTPane;
    
    @FXML
    private Label lblGenerar;

    @FXML
    private JFXButton btnGenerar;
    
    @FXML
    private AnchorPane consultarPTPane;
    
    @FXML
    private Label lblConsultar;
    
    @FXML
    private JFXButton btnConsultar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void cargarPantalla(String nombrePantalla) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/" + nombrePantalla + ".fxml"));
        try {
          loader.load();
        } catch (IOException ex) {
          Logger.getLogger(FXMLHomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        //FXMLVerMisCursosController display = loader.getController();
        //display.asignarDatos(user);
        StackPane agregarView = loader.getRoot();
        Scene newScene = new Scene(agregarView);
        Stage curStage = (Stage) rootPane.getScene().getWindow();
        newScene.getStylesheets().add(getClass().getResource("/resources/CSS/Styles.css").toExternalForm());
        curStage.setScene(newScene);
        curStage.show();
    }
    
    @FXML
    public void clickGenerar(ActionEvent event) {
        cargarPantalla("FXMLGenerarPlanDeTrabajo");
    }
    
    @FXML
    public void clickConsultar(ActionEvent event) {
        cargarPantalla("FXMLBuscarPlanDeTrabajo");
    }
}
