/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Laurentiu
 */
public class Calculator {

    int rezultat = 0;

    public int adunare(int a, int b) {
        rezultat = a + b;
        return rezultat;
    }

    public int scadere(int a, int b) {
        rezultat = a - b;
        return rezultat;
    }

    public int inmultire(int a, int b) {
        rezultat = a * b;
        return rezultat;
    }

    public int impartire(int a, int b) {
        rezultat = a / b;
        return rezultat;
    }
}
