package p3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static final Set<String> IGNORED_WORDS = new HashSet<>(Arrays.asList("the", "a", "to", "in", "o"));

    public static void main(String[] args) {

        String input = "Now is the time to act!";
        String titlelizedString = titlelize(input);
        System.out.println(titlelizedString);

    }

    private static String titlelize(String input) {

        String[] words = input.split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!IGNORED_WORDS.contains(word.toLowerCase())) {
                result.append(word).append(" ");
            } else {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        return result.toString().trim();
    }
}