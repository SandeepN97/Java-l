package exceptionHandling;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterDemo {

    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        try {
            // Create a PrintWriter with FileWriter
            PrintWriter writer = new PrintWriter(new FileWriter(filePath));

            // Write some text to the file
            writer.println("Hello, PrintWriter!");
            writer.println("This is a sample text.");

            // Close the PrintWriter
            writer.close();

            System.out.println("Data has been written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
