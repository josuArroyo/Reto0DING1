/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author 2dam
 */
public class ViewJavaFxImplementation extends javafx.application.Application implements View{

    @Override
    public void start(Stage primaryStage) throws Exception {
    
        Application application = null;
        application.start(primaryStage);
    }

    @Override
    public void showGreeting(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //aqui le tenemos que pasar e lgreting al controller creo not sure 
    }
    
}
