/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Egoitz
 * 
 * Con el metodo showGreeting mostraremos el mensaje mediente texto
 */
public class ViewFileImplementation implements View {

    @Override
    public void showGreeting(String message) {
        System.out.println(message);
    }
    
}
