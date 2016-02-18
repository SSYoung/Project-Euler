import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
public class Problem32_PandigitProducts {
    public static void main(String[] args) {
        // Set<Integer> sums = new HashSet<Integer>();
        // for(int i = 2; i < 100; i++) {
        //     for(int j = 100; j < 5000; j++) {
        //         int product = i*j;
        //         String nums = i + "" + j + "" + product;
        //         for(int c = 1; c <= 10; c++) {
        //             if(nums.indexOf(""+c) == -1)
        //                 break;
        //         }
        //         sums.add(product);
        //     }
        // }
        // long sum = 0;
        // for(int elt : sums) {
        //     sum += (long)elt;
        // }
        // System.out.println(sum);

        ArrayList<Long> products = new ArrayList<Long>();
        long sum = 0;
        long prod, len;
         
        for (long m = 2; m < 100; m++) {
            long nbegin = (m > 9) ? 123 : 1234;
            long nend = 10000 / m + 1;
         
            for (long n = nbegin; n < nend; n++) {
                prod = m * n;
                len = (concat(concat(prod, n), m));
                if (len >= 1E8 && len < 1E9 && isPandigital(prod,m,n)) {
                    if (!products.contains(prod)) {
                        products.add(prod);
                    }
                }
            }
        }
         
        for (int i = 0; i < products.size(); i++) {
            sum += products.get(i);
        }
        System.out.println(sum);
    }
    private static boolean isPandigital(long m, long n, long p) {
        String s = m + "" + n + "" + p;
        for(int i = 1; i < 10; i++) {
            if(s.indexOf(i+"") == -1)
                return false;
        }
        return true;
    }
    private static long concat(long a, long b) {
        long c = b;
        while (c > 0) {
            a *= 10;
            c /= 10;
        }
        return a + b;
    }

}