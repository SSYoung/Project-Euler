/**
* @author Stefan Young
* @version 1.0
*/
public class Problem33_DigitCancelling {
    /**
    * This problem asks us to find the product of the denominators
    * of non-trivial fractions where removing the unit term in the
    * numerator and the tens term in the denomenator are removed to
    * simplify to the proper fraction. 
    * Ex: 49/98 = 4/8 by cancelling the nines.
    * The solution requires noticing that all numbers of this type
    * follow the form (10n + i)/(10i + d) = n / d
    * @param args
    */
    public static void main(String[] args) {
        int denomenatorProduct = 1, numeratorProduct = 1;
        for (int i = 1; i < 10; i++) {
            for (int d = 1; d < 10; d++) {
                for (int n = 1; n < 10; n++) {
                    if ((10 * n + i) * d == n * (10 * i + d)) {
                        denomenatorProduct *= d;
                        numeratorProduct *= n;
                    }
                }
            }
        }
        denomenatorProduct /= gcd(numeratorProduct, denomenatorProduct);
        System.out.println(denomenatorProduct);
    }
    public static int gcd(int x, int y) {
        int r = 0, a, b;
        a = (x > y) ? x : y;
        b = (x < y) ? x : y;
        r = b;
        while(a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
}