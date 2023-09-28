/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import view.ViewJavaFxController;

/**
 *
 * @author 2dam
 */
public class ViewJavaFxImplementation extends javafx.application.Application implements View {

    private static String greeting;

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ViewImplementation.fxml"));
        Parent root = (Parent) loader.load();

        ViewJavaFxController viewController = ((ViewJavaFxController) loader.getController());

        viewController.setStage(primaryStage);
        viewController.showGreeting(greeting);
       
        viewController.initStage(root);

    }

    @Override
    public void showGreeting(String data) {
        
        greeting = data;
        System.out.println(greeting);
        launch(data);
    }

}
