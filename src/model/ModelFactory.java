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
 */
public class ModelFactory {

    private ResourceBundle data;
    private final String bd_tipo = "BD";
    private final String type_file = "FILE";

     /**
     * Obtiene una instancia del modelo según la configuración de la aplicación.
     * 
     * @return Una instancia del modelo concreto basada en la configuración de la aplicación.
     */
    public Model getModel() {

        Model model = null;

        String data = ResourceBundle.getBundle("application.TipoEjecucion").getString("model_type");

        if (type_file.equals(data)) {

            model = new ModelFileImplementation();
        } else {
            
            model = new ModelDBImplementation();
        }

        return model;

    }

}
