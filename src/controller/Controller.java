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

    public void run(View viewInt, Model modelInt) throws Exception {

        String data;
        data = modelInt.getGreeting();
        viewInt.showGreeting(data);
    }
}
