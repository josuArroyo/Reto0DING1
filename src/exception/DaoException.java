/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author josu
 */
public class DaoException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Crea una nueva instancia de la excepción con un mensaje descriptivo.
     * 
     * @param message El mensaje descriptivo que detalla el error.
     */
    public DaoException(String message) {
        super(message);
    }
}
