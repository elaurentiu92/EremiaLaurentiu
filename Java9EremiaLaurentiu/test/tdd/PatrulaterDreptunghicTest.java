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
public class PatrulaterDreptunghicTest {
    
    public PatrulaterDreptunghicTest() {
    }

    /**
     * Test of getDefinition method, of class PatrulaterDreptunghic.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        PatrulaterDreptunghic instance = new PatrulaterDreptunghic();
        String expResult = " a plane figure with four straight sides and four right angles";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
      
    }
    
}
