package lalu_WordCounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java WordCounter <filename>");
            return;
        }

        String fileName = args[0];
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split the line into words using whitespace as a delimiter
                wordCount += words.length;
            }

            System.out.println("Word count: " + wordCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
