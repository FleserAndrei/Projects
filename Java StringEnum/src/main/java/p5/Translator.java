package p5;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence in English:");
        String englishSentence = scanner.nextLine();

        while (!englishSentence.equalsIgnoreCase("exit")) {

            Converter converter = new Converter();

            String pigLatinSentence = converter.translateToPigLatin(englishSentence);

            System.out.println("Pig Latin: " + pigLatinSentence);

            System.out.println("Enter another sentence in english or type 'exit' to quit:");

            englishSentence = scanner.nextLine();
        }

        System.out.println("Exiting PigTranslator.");
    }
}
