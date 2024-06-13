package p5;

public class StringUsage {
    public static String translateWordToPigLatin(String englishWord) {
        if (englishWord.length() >= 2) {
            // Extract the first letter
            char firstLetter = englishWord.charAt(0);

            String restOfWord = englishWord.substring(1);

            return restOfWord + firstLetter +  "ay";
        } else {
            return englishWord;
        }
    }
}
