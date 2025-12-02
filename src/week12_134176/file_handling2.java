package week12_134176;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_handling2 {
    public static void main(String[] args) {
        try {
            File obj = new File("myfile.txt");
            Scanner reader = new Scanner(obj);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
