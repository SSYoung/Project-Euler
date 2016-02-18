import java.util.Arrays;
public class Problem10_SumPrimes
{
   public static int max = 2000000; 
   public static void main(String args[])
   {
      PrimeSieve primes = new PrimeSieve(max);
      boolean[] isPrime = primes.array;
      long sum = 0;
      for(int i = 0; i < max; i++)
      {
         if(isPrime[i])
            sum+=i;
      } 
      System.out.println(sum); 
   }
}