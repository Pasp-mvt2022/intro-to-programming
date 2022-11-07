package introtoprogramming;

import java.util.Scanner;

public class TextReader {
    public static void main(String[] args) {
        String input;

        Scanner scanner = new Scanner(System.in);
        TextProcessor textProcessor = new TextProcessor();
        System.out.println("Skriv rader med text (avsluta genom att skriva \"stop\"): ");
        while (!textProcessor.isStop()) {
            input = scanner.nextLine();
            textProcessor.add(input);
        }

        System.out.println("Antal tecken: " + textProcessor.getCharacterCount());
        System.out.println("Antal ord: " + textProcessor.getWordCount());
        System.out.println("Antal rader: " + textProcessor.getRowCount());
        System.out.println("Längsta ord: " + textProcessor.getLongestWord());
    }
}