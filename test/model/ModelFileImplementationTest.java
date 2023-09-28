/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.ReadException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ModelFileImplementationTest {

    public ModelFileImplementationTest() {
    }

    /**
     * Test of getGreeting method, of class ModelFileImplementation.
     */
    @Test
    public void testGetGreeting() {
        try {
            ModelFileImplementation mfi = new ModelFileImplementation();
            String message = mfi.getGreeting();
            String expectedResult = "Hello world";

            assertEquals(message, expectedResult);
        } catch (ReadException e) {
            Logger.getLogger(ModelFileImplementation.class
                    .getName()).log(Level.SEVERE, null, e);
        }

    }

}
