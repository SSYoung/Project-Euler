import java.util.*;
// public class Problem23_NonAbundantSums
// {
//    public static int max = 20161;
//    public static boolean[] abundants = new boolean[max+1];
//    public static void main(String[] args)
//    {
//       for(int i = 1; i < abundants.length; i++)
//       {
//          if(sumDivisors(i) > i)
//             abundants[i] = true;
//       }
//       int sum = 0;
//       for(int i = 1; i <= max; i++)
//       {
//          if(!isSumOf2Abundants(i))
//             sum += i;
//       }
//       System.out.println(sum);
//    }
//    public static boolean isSumOf2Abundants(int n)
//    {
//       for(int i = 0; i <= n; i++)
//       {
//          if(abundants[i] && abundants[n-i])
//             return true;
//       }
//       return false;
//    }
//    public static int sumDivisors(int n)
//    {
//       int maxD = (int)Math.sqrt(n);
//       int sum = 1;
//       for(int i = 2; i < maxD; i++)
//       {
//          if(n%i == 0)
//          {
//             sum+=i;
//             int d = n/i;
//             if(d!=i)
//                sum+=d;
//          }
//       }
//       return sum;
//    }
// 
// }

public class Problem23_NonAbundantSums {

    /**
     * A brute force solution - 
     * 1. Calculate the abundant numbers till the limit. 
     * 2. Check each number if it can be written as a sum of any two
     *    abundant numbers in the pre-calculated set
     * 
     * @param args
     */
    public static void main(String[] args) {

        Set<Integer> abundantNumSet = new LinkedHashSet<Integer>(); //sorted set of abundant numbers

        // find all abundant numbers from 13 to 28123, since 12 is the smallest
        // abundant number and greatest number that cannot be expressed as the
        // sum of two abundant numbers is less than 28123
        abundantNumSet.add(12);
        for (int i = 13; i < 28124; ++i) {
            if (isAbundant(i)) {
                abundantNumSet.add(i);
            }
        }

        int total = 276; // sigma 23, since 24 = 12 * 2
        for (int i = 25; i < 28124; ++i) {
            boolean isRep = false;

            for (Integer num : abundantNumSet) {
                // iterating through half of the numbers in the set is enough
                if (abundantNumSet.contains(i - num)) {
                    // the number can be represented as a sum of two
                    isRep = true;
                    break;
                }
                if (i < num) {
                    // the abundant number should less than a given number to
                    // be part of the numbers forming the sum
                    break;
                }
            }

            if (!isRep) {
                // the number cannot be represented as sum of two abundant
                // numbers
                total += i;
            }
        }

        System.out.println(total);
    }

    public static boolean isAbundant(int n) {
        int sum = 1;
        int end = (int) Math.sqrt(n);

        for (int i = 2; i <= end; ++i) {
            if (n % i == 0) {
                int quotient = n / i;

                if (quotient != i) {
                    sum += i + quotient; // add the factors
                } else {
                    // avoid adding twice - factor in case of perfect squares
                    sum += quotient;
                }
            }
        }

        if (sum > n) {
            return true;
        }

        return false;
    }
}