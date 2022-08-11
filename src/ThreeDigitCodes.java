public class ThreeDigitCodes {
    public static void main(String[] args) {
        char[] digitCodes = {'1', '2', '3', '4'};
        int numOfCombinations = 0;

        // 3 loops (with 2 nested) to iterate through digitCodes and find unique 3-digit combinations


        // First loop iterates through digitCodes for the first number in the combination
        for(int i = 0; i <= 3; i++) {
            char[] codes = new char[3];
            codes[0] = digitCodes[i];

            // Second loop iterates through digitCodes for the second number in the combination
            for(int j = 0; j <= 3; j++)
            {
                if(codes[0] != digitCodes[j] && codes[1] != digitCodes[j])
                {
                    codes[1] = digitCodes[j];
                }
                else if ((j + 1) <= 3)
                {
                    codes[1] = digitCodes[j + 1];
                } else
                {
                    continue;
                }

                // Third loop iterates through digitCodes for the third number in the combination
                for(int k = 0; k <= 3; k++)
                {
                    if(codes[0] != digitCodes[k] && codes[1] != digitCodes[k])
                    {
                        codes[2] = digitCodes[k];
                        numOfCombinations++;
                        System.out.println(codes);
                    }
                }
            }
        }
        System.out.println("Number of unique combinations: " + numOfCombinations);
    }
}
