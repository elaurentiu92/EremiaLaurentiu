/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;


/**
 *
 * @author Laurentiu
 */
public class ExecutorCalcule {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator unCalculator = new Calculator(); // instantiate
        
        System.out.println("Introduceti primul numar:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        System.out.println("Introduceti al 2-lea numar");
        Scanner sc1 = new Scanner(System.in);
        int j = sc1.nextInt();
        
        int iesireAdunare = unCalculator.adunare(i, j);
        System.out.println(iesireAdunare);
        
        int iesireScadere = unCalculator.scadere(10,10);
        System.out.println(iesireScadere);
        
        int iesireInmultire= unCalculator.inmultire(8, 9);
        System.out.println(iesireInmultire);
        
        int iesireImpartire = unCalculator.impartire(10,10);
        System.out.println(iesireImpartire);
    }
      
    
}
