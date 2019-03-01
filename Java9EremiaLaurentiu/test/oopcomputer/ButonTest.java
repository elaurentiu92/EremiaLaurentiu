/*
 * Test Buton
 */
package oopcomputer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laurentiu
 */
public class ButonTest {
    
    public ButonTest() {
    }

    /**
     * Test of getSimbol method, of class Buton.
     */
    @Test
    public void testGetSimbol() {
        System.out.println("getSimbol");
        Buton instance = new Buton('+');
        instance.setSimbol('+');
        Character expResult = '+';
        Character result = instance.getSimbol();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSimbol method, of class Buton.
     */
    @Test
    public void testSetSimbol() {
        System.out.println("setSimbol");
        Character simbol = '+';
        Buton instance = new Buton('+');
        instance.setSimbol(simbol);
        
    }

    /**
     * Test of getStapana method, of class Buton.
     */
    @Test
    public void testGetStapana() {
        System.out.println("getStapana");
        Buton instance = new Buton('5');
        Carcasa carcasa = new Carcasa();
        instance.setStapana(carcasa);
        Carcasa expResult = carcasa;
        Carcasa result = instance.getStapana();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setStapana method, of class Buton.
     */
    @Test
    public void testSetStapana() {
        System.out.println("setStapana");
        Carcasa stapana = new Carcasa();
        Buton instance = new Buton('5');
        instance.setStapana(stapana);
       
    }

    /**
     * Test of apasa method, of class Buton.
     */
    @Test
    public void testApasa() {
        System.out.println("apasa");
        Carcasa carcasa = new Carcasa();
        Buton instance = new Buton('3');
        instance.setSimbol('3');
        instance.setStapana(carcasa);
        instance.apasa();
        
    }
    
}
