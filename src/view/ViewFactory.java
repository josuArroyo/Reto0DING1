/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ResourceBundle;

/**
 *
 * @author Egoitz
 *
 * Recoge que tipo de ejecucion vamos a realizar del archivo de propiedades de
 * TipoEjecucion comprueba la ejecucion que hemos elegido e implementa el modelo
 * de vista adecuado
 */
public class ViewFactory {

    private ResourceBundle data;
    private final String type_text = "TEXT";
    private final String FX_TYPE = "FX";

    public View geView() {
        View view = null;
        String data = ResourceBundle.getBundle("application.TipoEjecucion").getString("view_type");
        if (type_text.equals(data)) {
            view = new ViewFileImplementation();
        }else{
            view = new ViewJavaFxImplementation();
        }
        return view;
    }
}
