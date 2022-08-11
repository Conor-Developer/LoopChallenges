public class ThreeDigitCodes {
    public static void main(String[] args) {
        char[] digitCodes = {'1', '2', '3', '4'};
        int numOfCombinations = 0;

        for(int i = 0; i <= 3; i++) {
            char[] codes = new char[3];
            codes[0] = digitCodes[i];

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
