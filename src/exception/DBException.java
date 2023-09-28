/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Josu
 */
public class DBException extends Exception{
    
    /**
     * Crea una nueva instancia de la excepción con un mensaje descriptivo.
     * 
     * @param message El mensaje descriptivo que detalla el error.
     */
     public DBException (String message){
        super (message);
    }
    
}
