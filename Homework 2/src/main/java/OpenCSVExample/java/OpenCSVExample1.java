package OpenCSVExample.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenCSVExample1 {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new File("input1.csv"));

        scanner.useDelimiter(",");

        while (scanner.hasNext())
        {
            System.out.print(scanner.next() + "|");
        }

        scanner.close();
    }

}
