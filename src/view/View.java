/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * Interfaz que define el contrato para la vista de la aplicación.
 * La vista es responsable de mostrar información al usuario.
 * 
 * En este caso, la interfaz define un único método para mostrar un saludo.
 * 
 * @author josu
 */
public interface View {

    /**
     * Muestra un saludo en la vista.
     * 
     * @param data El saludo que se va a mostrar en la vista.
     */
    public void showGreeting(String data);
    
}
