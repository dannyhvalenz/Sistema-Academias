/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.pojos.PlanTrabajo;
import model.dao.PlanTrabajoDAO;

/**
 *
 * @author dany
 */
public class FXMLBuscarPlanTrabajoController implements Initializable {
    
    @FXML
    private JFXButton btnHamburger;

    @FXML
    private JFXListView<?> listaPlanTrabajo;
    
    private List<PlanTrabajo> planTrabajo;

    @FXML
    void clickHamburger(ActionEvent event) {

    }

    @FXML
    void clickListCategories(MouseEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cargarPlanTrabajo();
    }
    
  public void cargarPlanTrabajo() {
    
  }
    

}
