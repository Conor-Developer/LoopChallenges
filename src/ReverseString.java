import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String reverseString = "";
        System.out.print("Input a string: ");

        // User input changed into an array of characters
        char[] letters = reader.nextLine().toCharArray();

        // Iterates through user input (string) by adding each character one at a time to reverse the string
        for(int i = 1; i <= letters.length; i++) {
            int letterLength = letters.length - i;
            reverseString += letters[letters.length - i];
        }

        System.out.println(reverseString);
    }
}
