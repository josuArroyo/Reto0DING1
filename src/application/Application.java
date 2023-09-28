/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import controller.Controller;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ModelFactory;

import view.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Application {
     /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {

        ViewFactory view = new ViewFactory();
        ModelFactory model = new ModelFactory();

        Controller controller = new Controller();

        try {
            controller.run(view.geView(), model.getModel());
        } catch (Exception ex) {
            //Logger.getLogger(application.APP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
