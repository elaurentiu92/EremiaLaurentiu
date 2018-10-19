/*
 * Opening a file and writing in it
 */
package exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Laurentiu
 */
public class WriteInFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filePath = "src/exceptions/text.txt";
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            String content = "Writing something";

            fw = new FileWriter(filePath);
            bw = new BufferedWriter(fw);
            bw.write(content);

            System.out.println("Done");

        } catch (IOException e) {

            e.getMessage();

        } finally {

            try {

                if (bw != null) {
                    bw.close();
                }

                if (fw != null) {
                    fw.close();
                }

            } catch (IOException ex) {

                ex.getMessage();

            }

        }

    }

}
