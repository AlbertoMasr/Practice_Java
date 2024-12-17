package Intermediate.FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("src/Intermediate/FileIO/output.txt"))) {
            String line = reader.readLine();

            while(line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
