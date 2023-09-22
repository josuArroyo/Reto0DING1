/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 *
 * @author Josu
 * 
 * Recoge el saludo con el metodo getGreeting del archivo de propiedades de greeting
 */
public class ModelFileImplementation implements Model {

    @Override
    public String getGreeting() {
        String text;
        ResourceBundle text_data; //Sirve para recoger los datos de otros archivos
        text_data=ResourceBundle.getBundle("model.greeting");
        text =text_data.getString("message");
        return text;
    }

}
