/* Write a java program to count all the words of a string .
 Example : I want to be a software engineer. Output : 7
 */

public class WordCounter {

    public static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = "I want to be a software engineer.";
        int wordCount = countWords(input);
        System.out.println("Output : " + wordCount);
    }
}

