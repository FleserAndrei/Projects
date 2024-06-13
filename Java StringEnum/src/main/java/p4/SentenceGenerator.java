package p4;

import java.util.Random;

public class SentenceGenerator {
private static  String[] article = {"the", "a", "one", "some", "any"};
private static  String[] nouns = {"boy", "girl", "dog", "town", "car"};
private static  String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
private static  String[] preposition = {"to", "from", "over", "under", "on"};

public static String generateSentence() {
    Random random = new Random();
    StringBuilder sentence = new StringBuilder();

    sentence.append(capitalizeFirst(article[random.nextInt(article.length)]))
            .append(" ")
            .append(nouns[random.nextInt(nouns.length)])
            .append(" ")
            .append(verbs[random.nextInt(verbs.length)])
            .append(" ")
            .append(preposition[random.nextInt(preposition.length)])
            .append(" ")
            .append(article[random.nextInt(article.length)])
            .append(" ")
            .append(nouns[random.nextInt(nouns.length)])
            .append(".");

    return sentence.toString();
}

private static String capitalizeFirst(String word) {
    return Character.toUpperCase(word.charAt(0)) + word.substring(1);
}
}
