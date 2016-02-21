/**
* @author Stefan Young
* @version 1.0
*/
public class Problem34_DigitFactorials {
    /**
    * @param args
    */
    public static void main(String[] args) {
        int[] factorials = new int[10];
        for (int i = 0; i < 10; i++) {
            factorials[i] = factorial(i);
        }
        int factorialSum = 0;
        for (int i = 0; i < 2540160; i++) {
            int sum = 0;
            int num = i;
            while (num > 0) {
                int d = num % 10;
                num /= 10;
                sum += factorials[d];
            }
            if (sum == i)
                factorialSum += i;
        }
        System.out.println(factorialSum);
    }
    /**
    * @param x integer to factorial
    * @return factorial of x
    */
    public static int factorial(int x) {
        if (x == 0)
            return 1;
        int fac = 1;
        for (int i = 1; i <= x; i++) {
            fac *= i;
        }
        return fac;
    }
}