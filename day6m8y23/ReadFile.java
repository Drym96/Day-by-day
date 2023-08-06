package day6m8y23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\phant\\OneDrive\\Máy tính\\Programing\\Source code\\Java\\Day by day\\day6m8y23\\index.txt"))) {
            String line = reader.readLine();
            line += reader.readLine();
            System.out.println(line);
            // String line;
            // while ((line = reader.readLine()) !=  null) {
            //     System.out.println(line);
            //     System.out.println("1");
            // }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
