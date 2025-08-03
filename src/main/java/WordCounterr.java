/*  Write a Java method to count all words in a string
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:
Number of words in the string: 9
*/
public class WordCounterr {
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) return 0;
        return sentence.trim().split("\\s+").length;
    }
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Number of words in the string: " + countWords(input));
    }
}