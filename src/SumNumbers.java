import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String userInput = "";
        boolean isNumber = true;
        int sumTo = 0;

        // Allows user to repeatedly input new numbers to sum
        while (isNumber) {
            System.out.print("Input a number to sum to: ");
            userInput = reader.nextLine();

            // Checks user inputs an integer. Cancels loop on next iteration if input is not an integer
            try {
                sumTo = Integer.parseInt(userInput);
                isNumber = true;
            } catch (NumberFormatException e) {
                isNumber = false;
                break;
            }

            int i = 1;
            int sumTotal = 0;

            // Sums up the range of numbers between 1 and the number inputted by the user
            while (i <= sumTo) {
                sumTotal += i;
                i++;
            }

            System.out.println(sumTotal);

        }
    }
}

