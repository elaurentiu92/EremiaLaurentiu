/*
 * Test ALU
 */
package oopcomputer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laurentiu
 */
public class ALUTest {
    
    public ALUTest() {
    }

    /**
     * Test of getOperator method, of class ALU.
     */
    @Test
    public void testGetOperator() {
        System.out.println("getOperator");
        ALU instance = new ALU();
        instance.setOperator('+');
        Character expResult = '+';
        Character result = instance.getOperator();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setOperator method, of class ALU.
     */
    @Test
    public void testSetOperator() {
        System.out.println("setOperator");
        Character operator = '+';
        ALU instance = new ALU();
        instance.setOperator(operator);
        Character result = instance.getOperator();
        assertEquals(operator, result);
        
    }

    /**
     * Test of getOperandUnu method, of class ALU.
     */
    @Test
    public void testGetOperandUnu() {
        System.out.println("getOperandUnu");
        ALU instance = new ALU();
        instance.setOperandUnu(1);
        Integer expResult = 1;
        Integer result = instance.getOperandUnu();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setOperandUnu method, of class ALU.
     */
    @Test
    public void testSetOperandUnu() {
        System.out.println("setOperandUnu");
        Integer operandUnu = 1;
        ALU instance = new ALU();
        instance.setOperandUnu(operandUnu);
        
    }

    /**
     * Test of getOperandDoi method, of class ALU.
     */
    @Test
    public void testGetOperandDoi() {
        System.out.println("getOperandDoi");
        ALU instance = new ALU();
        instance.setOperandDoi(2);
        Integer expResult = 2;
        Integer result = instance.getOperandDoi();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setOperandDoi method, of class ALU.
     */
    @Test
    public void testSetOperandDoi() {
        System.out.println("setOperandDoi");
        Integer operandDoi = 2;
        ALU instance = new ALU();
        instance.setOperandDoi(operandDoi);
        
    }

    /**
     * Test of getRezultat method, of class ALU.
     */
    @Test
    public void testGetRezultat() {
        System.out.println("getRezultat");
        ALU instance = new ALU();
        instance.setRezultat(12);
        Integer expResult = 12;
        Integer result = instance.getRezultat();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setRezultat method, of class ALU.
     */
    @Test
    public void testSetRezultat() {
        System.out.println("setRezultat");
        Integer rezultat = 12;
        ALU instance = new ALU();
        instance.setRezultat(rezultat);
       
    }

    /**
     * Test of calculeaza method, of class ALU.
     */
    @Test
    public void testCalculeaza() {
        System.out.println("calculeaza");
        ALU instance = new ALU();
        instance.calculeaza();
        
    }
    
}
