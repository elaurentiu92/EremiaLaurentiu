/*
 * Opening three notes
 */
package multiprocess;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laurentiu
 */
public class ThreeNotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            
          ProcessBuilder pb = new ProcessBuilder("open", "-n" ,"/Applications/Notes.app");
           
          Process p1 = pb.start();
          System.out.println("The first note has been opened");
          Thread.sleep(2000);
          
          Process p2 = pb.start();
          System.out.println("The second note has been opened");
          Thread.sleep(2000);
          
          Process p3 = pb.start();
          System.out.println("The third note has been opened");
          Thread.sleep(2000);
          
        }
        catch(IOException ex){
           Logger.getLogger(ThreeNotes.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
        }
        catch(InterruptedException itr){
           Logger.getLogger(ThreeNotes.class.getName()).log(Level.SEVERE, "An InterruptedException exception is here!", itr);
        }
     
    }
    
}
