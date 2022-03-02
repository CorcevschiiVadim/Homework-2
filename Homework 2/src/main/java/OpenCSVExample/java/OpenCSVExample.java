package OpenCSVExample.java;

import java.io.FileReader;
import java.io.IOException;
import au.com.bytecode.opencsv.CSVReader;

public class OpenCSVExample {
    public static void main(String[] args) {
        CSVReader reader = null;
        try
        {
            reader = new CSVReader(new FileReader("input.csv"), ',');

            String [] nextLine;

            while ((nextLine = reader.readNext()) != null)
            {
                for(String token : nextLine)
                {
                    System.out.println(token);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
