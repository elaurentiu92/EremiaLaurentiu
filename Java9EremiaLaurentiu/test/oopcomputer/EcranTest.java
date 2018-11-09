/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopcomputer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laurentiu
 */
public class EcranTest {
    
    public EcranTest() {
    }

    /**
     * Test of getAfisaj method, of class Ecran.
     */
    @Test
    public void testGetAfisaj() {
        System.out.println("getAfisaj");
        Carcasa carcasa = new Carcasa();
        Ecran instance = new Ecran(carcasa);
        instance.setAfisaj("");
        String expResult = "";
        String result = instance.getAfisaj();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAfisaj method, of class Ecran.
     */
    @Test
    public void testSetAfisaj() {
        System.out.println("setAfisaj");
        String afisaj = "";
        Carcasa carcasa = new Carcasa();
        Ecran instance = new Ecran(carcasa);
        instance.setAfisaj(afisaj);
       
    }
    
}
