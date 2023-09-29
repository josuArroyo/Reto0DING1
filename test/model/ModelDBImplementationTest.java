/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.DBException;
import exception.DaoException;
import exception.ReadException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author 2dam
 */
public class ModelDBImplementationTest {
    private ModelDBImplementation bdi;
    
    public ModelDBImplementationTest() {
    }

    /**
     * Test of openConnection method, of class ModelDBImplementation.
     */
    @Before
    public void testOpenConnection() throws Exception {
        try {
            bdi= new ModelDBImplementation();
            bdi.openConnection();
        } catch (Exception e) {
             Logger.getLogger(ModelDBImplementationTest.class.getName()).log(Level.SEVERE, null, e);
        }
    }

   

    /**
     * Test of getGreeting method, of class ModelDBImplementation.
     */
    @Test
    public void testGetGreeting() throws DaoException, ReadException {
      
            String message = bdi.getGreeting();
            String result = "Hello World";
            assertEquals(message, result);
        
    }
    
     /**
     * Test of closeConnection method, of class ModelDBImplementation.
     */
    @After
    public void testCloseConnection() throws Exception {
        bdi.closeConnection();
    }
    
}
