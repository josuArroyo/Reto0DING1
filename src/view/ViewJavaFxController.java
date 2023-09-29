/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Josu
 */
public class ViewJavaFxController{

    @FXML
    private Label lblText;
    private static final Logger LOGGER = Logger.getLogger(Controller.class.getName());
    
    private Stage stage;
    private String greeting;
/*
    public void showGreeting(String data) {

        lblText.setText(data);
    }
*/
    public void setStage(Stage stage) {
        this.stage=stage;
    }

    public void initStage(Parent root) {
       
         LOGGER.info("Starting Stage");
     
        Scene scene = new Scene(root);
        stage.setScene(scene);
    
        
        stage.setTitle("Saludo");
        stage.setResizable(false);
        lblText.setVisible(true);
        lblText.setText(greeting);
       
    
        stage.show();
        
    }
/*
   public void setGreeting(String greeting) {
        this.greeting=greeting;
    }
*/
   /**
     * Muestra un saludo en la ventana.
     * 
     * @param data El saludo que se va a mostrar en la ventana.
     */
    public void showGreeting(String data) {
       this.greeting=data;
    }

}
