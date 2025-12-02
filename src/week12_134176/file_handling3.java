package week12_134176;

import java.io.FileWriter;
import java.io.IOException;

public class file_handling3 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myfile.txt");

            writer.write("Nama saya John Doe\n");
            writer.write("Saya dari Universitas Multimedia Nusantara");

            writer.close();
            System.out.println("Successfully written.");

        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}