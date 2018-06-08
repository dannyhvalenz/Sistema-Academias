/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * Clase principal de la ejecución
 * 
 * @author Daniela Hernandez Valenzuela
 * @since 04/06/2018
 * @version 1.0
 */
public class Academias extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/FXMLInicioSesion.fxml"));
        stage.setTitle("Sistema de Academias");
        Scene scene = new Scene(root);//new JFXDecorator(stage, root, false, false, true));
        scene.getStylesheets().add(getClass().getResource("/resources/CSS/Styles.css").toExternalForm());
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
