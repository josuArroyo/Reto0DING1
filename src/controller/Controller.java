/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.View;
import model.Model;

/**
 *
 * @author Josu
 */
public class Controller {
    
    /**
     * Ejecuta la lógica de la aplicación.
     * 
     * @param viewInt La vista con la que se va a interactuar.
     * @param modelInt El modelo con el que se va a interactuar.
     * @throws Exception Se lanza si ocurre una excepción durante la ejecución.
     */

    public void run(View viewInt, Model modelInt) throws Exception {

        String data;
        /**
         * obten el saludo en el modelo
         */
        data = modelInt.getGreeting();
        
        /**
         * muestra el saludo en la vista
         */
        viewInt.showGreeting(data);
    }
}
