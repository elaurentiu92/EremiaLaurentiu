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
public class CarcasaTest {
    
    public CarcasaTest() {
    }

    /**
     * Test of getEcran method, of class Carcasa.
     */
    @Test
    public void testGetEcran() {
        System.out.println("getEcran");
        Carcasa instance = new Carcasa();
        instance.getEcran();
        Ecran expResult = instance.getEcran();
        Ecran result = instance.getEcran();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEcran method, of class Carcasa.
     */
    @Test
    public void testSetEcran() {
        System.out.println("setEcran");
        Carcasa instance = new Carcasa();
        Ecran ecran = new Ecran(instance);
        instance.setEcran(ecran);
        
    }

    /**
     * Test of getButon0 method, of class Carcasa.
     */
    @Test
    public void testGetButon0() {
        System.out.println("getButon0");
        Carcasa instance = new Carcasa();
        Buton buton = new Buton('0');
        instance.setButon0(buton);
        Buton expResult = buton;
        Buton result = instance.getButon0();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setButon0 method, of class Carcasa.
     */
    @Test
    public void testSetButon0() {
        System.out.println("setButon0");
        Buton buton0 = new Buton('0');
        Carcasa instance = new Carcasa();
        instance.setButon0(buton0);
        
    }

    /**
     * Test of getButon1 method, of class Carcasa.
     */
    @Test
    public void testGetButon1() {
        System.out.println("getButon1");
        Carcasa instance = new Carcasa();
        Buton expResult = new Buton('1');
        instance.setButon1(expResult);
        Buton result = instance.getButon1();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setButon1 method, of class Carcasa.
     */
    @Test
    public void testSetButon1() {
        System.out.println("setButon1");
        Buton buton1 = new Buton('1');
        Carcasa instance = new Carcasa();
        instance.setButon1(buton1);
       
    }

    /**
     * Test of getButon2 method, of class Carcasa.
     */
    @Test
    public void testGetButon2() {
        System.out.println("getButon2");
        Carcasa instance = new Carcasa();
        Buton expResult = new Buton('2');
        instance.setButon2(expResult);
        Buton result = instance.getButon2();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setButon2 method, of class Carcasa.
     */
    @Test
    public void testSetButon2() {
        System.out.println("setButon2");
        Buton buton2 = new Buton('2');
        Carcasa instance = new Carcasa();
        instance.setButon2(buton2);

    }

    /**
     * Test of getButon3 method, of class Carcasa.
     */
    @Test
    public void testGetButon3() {
        System.out.println("getButon3");
        Carcasa instance = new Carcasa();
        Buton expResult = new Buton('3');
        instance.setButon3(expResult);
        Buton result = instance.getButon3();
        assertEquals(expResult, result);

    }

    /**
     * Test of setButon3 method, of class Carcasa.
     */
    @Test
    public void testSetButon3() {
        System.out.println("setButon3");
        Buton buton3 = new Buton('3');
        Carcasa instance = new Carcasa();
        instance.setButon3(buton3);

    }

    /**
     * Test of getButon4 method, of class Carcasa.
     */
    @Test
    public void testGetButon4() {
        System.out.println("getButon4");
        Carcasa instance = new Carcasa();
        Buton expResult = new Buton('4');
        instance.setButon4(expResult);
        Buton result = instance.getButon4();
        assertEquals(expResult, result);

    }

    /**
     * Test of setButon4 method, of class Carcasa.
     */
    @Test
    public void testSetButon4() {
        System.out.println("setButon4");
        Buton buton4 = new Buton('4');
        Carcasa instance = new Carcasa();
        instance.setButon4(buton4);
  
    }

    /**
     * Test of getButon5 method, of class Carcasa.
     */
    @Test
    public void testGetButon5() {
        System.out.println("getButon5");
        Carcasa instance = new Carcasa();
        Buton expResult = new Buton('5');
        instance.setButon5(expResult);
        Buton result = instance.getButon5();
        assertEquals(expResult, result);

    }

    /**
     * Test of setButon5 method, of class Carcasa.
     */
    @Test
    public void testSetButon5() {
        System.out.println("setButon5");
        Buton buton5 = new Buton('5');
        Carcasa instance = new Carcasa();
        instance.setButon5(buton5);
  
    }

    /**
     * Test of getButon6 method, of class Carcasa.
     */
    @Test
    public void testGetButon6() {
        System.out.println("getButon6");
        Carcasa instance = new Carcasa();
        Buton expResult = new Buton('6');
        instance.setButon6(expResult);
        Buton result = instance.getButon6();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of setButon6 method, of class Carcasa.
     */
    @Test
    public void testSetButon6() {
        System.out.println("setButon6");
        Buton buton6 = new Buton('6');
        Carcasa instance = new Carcasa();
        instance.setButon6(buton6);
  
    }

    /**
     * Test of getButon7 method, of class Carcasa.
     */
    @Test
    public void testGetButon7() {
        System.out.println("getButon7");
        Carcasa instance = new Carcasa();
        Buton expResult = new Buton('7');
        instance.setButon7(expResult);
        Buton result = instance.getButon7();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of setButon7 method, of class Carcasa.
     */
    @Test
    public void testSetButon7() {
        System.out.println("setButon7");
        Buton buton7 = new Buton('7');
        Carcasa instance = new Carcasa();
        instance.setButon7(buton7);
  
    }

    /**
     * Test of getButon8 method, of class Carcasa.
     */
    @Test
    public void testGetButon8() {
        System.out.println("getButon8");
        Carcasa instance = new Carcasa();
        Buton expResult = new Buton('8');
        instance.setButon8(expResult);
        Buton result = instance.getButon8();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of setButon8 method, of class Carcasa.
     */
    @Test
    public void testSetButon8() {
        System.out.println("setButon8");
        Buton buton8 = new Buton('8');
        Carcasa instance = new Carcasa();
        instance.setButon8(buton8);
  
    }

    /**
     * Test of getButon9 method, of class Carcasa.
     */
    @Test
    public void testGetButon9() {
        System.out.println("getButon9");
        Carcasa instance = new Carcasa();
        Buton expResult = new Buton('9');
        instance.setButon9(expResult);
        Buton result = instance.getButon9();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of setButon9 method, of class Carcasa.
     */
    @Test
    public void testSetButon9() {
        System.out.println("setButon9");
        Buton buton9 = new Buton('9');
        Carcasa instance = new Carcasa();
        instance.setButon9(buton9);
  
    }

    /**
     * Test of getButonPlus method, of class Carcasa.
     */
    @Test
    public void testGetButonPlus() {
        System.out.println("getButonPlus");
        Carcasa instance = new Carcasa();
        Buton expResult = new Buton('+');
        instance.setButonPlus(expResult);
        Buton result = instance.getButonPlus();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of setButonPlus method, of class Carcasa.
     */
    @Test
    public void testSetButonPlus() {
        System.out.println("setButonPlus");
        Buton butonPlus = new Buton('+');
        Carcasa instance = new Carcasa();
        instance.setButonPlus(butonPlus);

    }

    /**
     * Test of getButonMinus method, of class Carcasa.
     */
    @Test
    public void testGetButonMinus() {
        System.out.println("getButonMinus");
        Carcasa instance = new Carcasa();
        Buton expResult = new Buton('-');
        instance.setButonMinus(expResult);
        Buton result = instance.getButonMinus();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of setButonMinus method, of class Carcasa.
     */
    @Test
    public void testSetButonMinus() {
        System.out.println("setButonMinus");
        Buton butonMinus = new Buton('-');
        Carcasa instance = new Carcasa();
        instance.setButonMinus(butonMinus);
   
    }

    /**
     * Test of getButonOri method, of class Carcasa.
     */
    @Test
    public void testGetButonOri() {
        System.out.println("getButonOri");
        Carcasa instance = new Carcasa();
        Buton expResult = new Buton('*');
        instance.setButonOri(expResult);
        Buton result = instance.getButonOri();
        assertEquals(expResult, result);

    }

    /**
     * Test of setButonOri method, of class Carcasa.
     */
    @Test
    public void testSetButonOri() {
        System.out.println("setButonOri");
        Buton butonOri = new Buton('*');
        Carcasa instance = new Carcasa();
        instance.setButonOri(butonOri);
  
    }

    /**
     * Test of getButonImpartire method, of class Carcasa.
     */
    @Test
    public void testGetButonImpartire() {
        System.out.println("getButonImpartire");
        Carcasa instance = new Carcasa();
        Buton expResult = new Buton('/');
        instance.setButonImpartire(expResult);
        Buton result = instance.getButonImpartire();
        assertEquals(expResult, result);

    }

    /**
     * Test of setButonImpartire method, of class Carcasa.
     */
    @Test
    public void testSetButonImpartire() {
        System.out.println("setButonImpartire");
        Buton butonImpartire = new Buton('*');
        Carcasa instance = new Carcasa();
        instance.setButonImpartire(butonImpartire);

    }

    /**
     * Test of getButonEgal method, of class Carcasa.
     */
    @Test
    public void testGetButonEgal() {
        System.out.println("getButonEgal");
        Carcasa instance = new Carcasa();
        Buton expResult = new Buton('=');
        instance.setButonEgal(expResult);
        Buton result = instance.getButonEgal();
        assertEquals(expResult, result);

    }

    /**
     * Test of setButonEgal method, of class Carcasa.
     */
    @Test
    public void testSetButonEgal() {
        System.out.println("setButonEgal");
        Buton butonEgal = new Buton('=');
        Carcasa instance = new Carcasa();
        instance.setButonEgal(butonEgal);
 
    }

    /**
     * Test of getAlu method, of class Carcasa.
     */
    @Test
    public void testGetAlu() {
        System.out.println("getAlu");
        Carcasa instance = new Carcasa();
        ALU expResult = new ALU();
        instance.setAlu(expResult);
        ALU result = instance.getAlu();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of setAlu method, of class Carcasa.
     */
    @Test
    public void testSetAlu() {
        System.out.println("setAlu");
        ALU alu = new ALU();
        Carcasa instance = new Carcasa();
        instance.setAlu(alu);

    }
    
}
