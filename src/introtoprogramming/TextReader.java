package introtoprogramming;

import java.util.Scanner;

public class TextReader {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TextProcessor textProcessor = new TextProcessor();

        System.out.println("Skriv rader med text (avsluta genom att skriva \"stop\"): ");

        while (!textProcessor.isStop()) {
            textProcessor.add(scanner.nextLine());
        }

        System.out.println("Antal tecken: " + textProcessor.getCharacterCount());
        System.out.println("Antal ord: " + textProcessor.getWordCount());
        System.out.println("Antal rader: " + textProcessor.getRowCount());
        System.out.println("Längsta ord: " + textProcessor.getLongestWord());
    }
}