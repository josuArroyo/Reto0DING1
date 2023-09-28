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

    /**
     * Muestra un mensaje en la consola.
     * 
     * @param message El mensaje que se va a mostrar en la consola.
     */
    @Override
    public void showGreeting(String message) {
        System.out.println(message);
    }
    
}
