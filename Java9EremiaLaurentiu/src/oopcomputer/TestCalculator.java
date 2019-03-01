/*
 * Testing calculator
 */
package oopcomputer;

import java.util.Scanner;

/**
 *
 * @author laur
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creaza un calculator
       Carcasa calculator = new Carcasa();
  
        // Apasam butoane pana apare un operator
       calculator.getButon1().apasa();
       calculator.getButon2().apasa();
       calculator.getButon3().apasa();
       calculator.getButonPlus().apasa(); 
       calculator.getButon3().apasa();
       calculator.getButon2().apasa();
       calculator.getButon1().apasa();
        // Apasam butoane pana apare =
       calculator.getButonEgal().apasa();
        // afisam rezultatul
        System.out.println("Rezultatul este: " + calculator.getAlu().getRezultat());
        
   
        
    }
    
}