package ie.atu;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudents {
    public static void main(String[] args) throws IOException {
        //call read function
        showFile();
    }

    //define function
    static void showFile() throws IOException {
        BufferedReader br = null;
        try{
            FileReader fr = new FileReader("st.txt");
            br = new BufferedReader(fr);
            System.out.println("Content of st.txt:");

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(" - " + line);
            }

        }
        catch (IOException ex)
        {
            System.out.println("Could not read file: " + ex.getMessage());
        }
        finally
        {
            if (br != null)
            {
                try
                {
                    br.close();
                }
                catch (IOException closeEx)
                {
                    System.out.println("Could not close file: " + closeEx.getMessage());
                }
            }
        }
    }
}
