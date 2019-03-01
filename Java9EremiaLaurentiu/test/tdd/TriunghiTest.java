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
public class TriunghiTest {
    
    public TriunghiTest() {
    }

    /**
     * Test of getDefinition method, of class Triunghi.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Triunghi instance = new Triunghi();
        String expResult = "TRIANGLE: a plane figure with three straight sides and three angles.";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
       
    }
    
}
