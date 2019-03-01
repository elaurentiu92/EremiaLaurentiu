/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java9eremialaurentiu;
import java.util.*;

/**
 *
 * @author Laurentiu
 */
public class Java9EremiaLaurentiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Please introduce your first number: ");
            int num01 = sc.nextInt();

            System.out.print("Please introduce operator(+/-/*//): ");
            String operator = sc.next();
            if (!"+".equals(operator) && !"*".equals(operator) && !"-".equals(operator) && !"/".equals(operator)) {
                System.out.println("Sorry, you introduced wrong data. I quit :)");
                System.exit(0);
            }

            System.out.print("Please introduce your second number: ");
            int num02 = sc.nextInt();

            System.out.print("Please introduce \"=\": ");
            String equalSign = sc.next();

            if ("*".equals(operator)) {
                System.out.print("Result is: " + (num01 * num02));
            } else if ("+".equals(operator)) {
                System.out.print("Result is: " + (num01 + num02));
            } else if ("-".equals(operator)) {
                System.out.print("Result is: " + (num01 - num02));
            } else if ("/".equals(operator)) {
                System.out.print("Result is: " + (num01 / num02));
            }

        } catch (java.util.InputMismatchException e) {
            System.out.print("Sorry, you introduced wrong data. I quit :)");
        }
        
    }
    
}
