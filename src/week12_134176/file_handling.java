package week12_134176;

import java.io.File;
import java.io.IOException;

public class file_handling {
    public static void main(String[] args) {
        try {
            File obj = new File("myfile.txt");

            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}