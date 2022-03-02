package OpenCSVExample.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OpenCSVExapmle2 {
    public static void main(String[] args) {
        String fileToParse = "input2.csv";
        BufferedReader fileReader = null;

        final String DELIMITER = ",";
        try
        {
            String line = "";
            fileReader = new BufferedReader(new FileReader(fileToParse));

            while ((line = fileReader.readLine()) != null)
            {
                String[] tokens = line.split(DELIMITER);
                for (String token : tokens)
                {
                    System.out.println(token);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}