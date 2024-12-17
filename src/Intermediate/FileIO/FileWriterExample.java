package Intermediate.FileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String content = "Hello, this is a test file.";
        content += "\nThis is the second line of the file.";
        content += "\nThis is the third line of the file.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Intermediate/FileIO/output.txt"))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
