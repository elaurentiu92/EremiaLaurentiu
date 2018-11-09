/*
 * Test Class for Cerc
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laurentiu
 */
public class CercTest {
    
    public CercTest() {
    }

    /**
     * Test of getdefinition method, of class Cerc.
     */
    @Test
    public void testGetdefinition() {
        System.out.println("getdefinition");
        Cerc instance = new Cerc();
        String expResult = "CIRCLE: a plane figure whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).";
        String result = instance.getdefinition();
        assertEquals(expResult, result);
        
    }
    
}
