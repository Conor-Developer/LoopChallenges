import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String reverseString = "";
        System.out.print("Input a string: ");
        char[] letters = reader.nextLine().toCharArray();


        for(int i = 1; i <= letters.length; i++) {
            int letterLength = letters.length - i;
            reverseString += letters[letters.length - i];
        }

        System.out.println(reverseString);
    }
}
