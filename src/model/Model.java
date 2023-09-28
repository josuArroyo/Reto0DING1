/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Interfaz que define el contrato para el modelo de la aplicación.
 * El modelo proporciona métodos para obtener datos y realizar operaciones lógicas.
 * 
 * En este caso, la interfaz define un único método para obtener un saludo.
 * 
 * @author Egoitz
 */
public interface Model {
    /**
     * Obtiene un saludo desde el modelo.
     * 
     * @return El saludo obtenido desde el modelo.
     * @throws Exception Se lanza si ocurre una excepción durante la obtención del saludo.
     */

    public String getGreeting() throws Exception;
    
}
