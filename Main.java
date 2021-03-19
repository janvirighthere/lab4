import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = myObj.nextLine();

        int vowel_count = getVowel_count(sentence);
        int number_of_letters = getLettersCount(sentence);

        double percentage = 100 * vowel_count / (double) number_of_letters;
        BigDecimal raw = new BigDecimal(percentage);
        BigDecimal value = raw.setScale(2, RoundingMode.DOWN);
        System.out.println("Vowels: " + value + "%");

    }

    public static int getVowel_count(String sentence) {
        int vowel_count = 0;
        String vowels = "aeiou";
        for(int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            c = Character.toLowerCase(c);
            String s = Character.toString(c);
            if (vowels.contains(s)) {
                vowel_count++;
            }

        }
        return vowel_count;
        }
    public static int getLettersCount(String sentence) {
        int num_letters = 0;
        for(int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                num_letters ++;
            }

        }
        return num_letters;

    }


}



