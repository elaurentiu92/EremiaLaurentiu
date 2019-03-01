/*
 * Test Definitions
 */
package tdd;

import java.util.LinkedList;

/**
 *
 * @author Laurentiu
 */
public class TestDefinitions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             //Cream mai multe instante din fiecare clasa
        
        Dreptunghi d1 = new Dreptunghi();
        Dreptunghi d2 = new Dreptunghi();
        Cerc c = new Cerc();
        Patrat p = new Patrat();
        Triunghi t1 =new Triunghi();
        Triunghi t2 =new Triunghi();
        
        //Cream o colectie de date si incarcam in ea
        
        LinkedList<FiguraGeometrica> listaDeFiguri = new LinkedList();
        
        listaDeFiguri.add(d1);
        listaDeFiguri.add(d2);
        listaDeFiguri.add(c);
        listaDeFiguri.add(p);
        listaDeFiguri.add(t1);
        listaDeFiguri.add(t1);
        
        //parcurgem lista si listam figurile
        
        listaDeFiguri.forEach((t) -> {
            System.out.println(t.getDefinition());
        });
    }
    
}
