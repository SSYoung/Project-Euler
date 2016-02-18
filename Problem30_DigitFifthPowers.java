public class Problem30_DigitFifthPowers {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int sum = 0; 
        for (int i = 2; i < 350000; i++) {
            int sumOfDigits = 0;
            int num = i;
            while (num > 0) {
                int digit = num % 10;
                num /= 10;

                sumOfDigits += (int)Math.pow(digit,5);
            }
            if (sumOfDigits == i) {
                sum += sumOfDigits;
            }
        }
        System.out.printf("Elapsed Time: %d\nSum of Digit Fifth Powers %d",System.currentTimeMillis()-startTime,sum);
    }
}