/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laurentiu
 */
public class PlanaTest {
    
    public PlanaTest() {
    }

    /**
     * Test of getDefinition method, of class Plana.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Plana instance = new Plana();
        String expResult = " a plane figure ";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
      
    }
    
}
