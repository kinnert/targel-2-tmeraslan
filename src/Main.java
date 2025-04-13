import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        int wordCount = countWords(input);
        System.out.println("Word count: " + wordCount);
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) return 0;
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}
