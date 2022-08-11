import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String userInput = "";
        boolean isNumber = true;
        int sumTo = 0;

        while (isNumber) {
            System.out.print("Input a number to sum to: ");
            userInput = reader.nextLine();

            try {
                sumTo = Integer.parseInt(userInput);
                isNumber = true;
            } catch (NumberFormatException e) {
                isNumber = false;
                break;
            }

            int i = 1;
            int sumTotal = 0;

            while (i <= sumTo) {
                sumTotal += i;
                i++;
            }

            System.out.println(sumTotal);

        }
    }
}

