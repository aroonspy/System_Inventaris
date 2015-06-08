package PreSistem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class BufferReader {
    public void Reader() {
        String lokasi_file = "ID.txt";
        
        try {
            FileReader fr = new FileReader(lokasi_file);
            BufferedReader br = new BufferedReader(fr);
            
            String text;
            
            while ((text = br.readLine()) != null)
                System.out.println(text);
        } 
        catch (FileNotFoundException fnfe) {
            fnfe.getMessage();
        } 
        catch (IOException ioe) {
            ioe.getMessage();
        }
    }
}
