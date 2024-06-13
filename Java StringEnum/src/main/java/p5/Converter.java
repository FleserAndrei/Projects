package p5;

import java.util.StringTokenizer;

public class Converter {
    public String translateToPigLatin(String englishSentence) {

        StringTokenizer tokenizer = new StringTokenizer(englishSentence, " ");

        StringBuilder pigLatinSentence = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {


            String englishWord = tokenizer.nextToken();

            String pigLatinWord = StringUsage.translateWordToPigLatin(englishWord);

            pigLatinSentence.append(pigLatinWord).append(" ");
        }

        return pigLatinSentence.toString().trim();
    }
}
