package p4;

public class StoryGenerator {
    public static void main(String[] args) {
        for (int i = 0 ; i< 100 ; i++){
            System.out.println(SentenceGenerator.generateSentence());
        }
    }
}
