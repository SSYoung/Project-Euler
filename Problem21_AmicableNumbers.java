import java.lang.Math;
public class Problem21_AmicableNumbers
{
   public static int[] amicables = new int[10000];
   public static void main(String[] args)
   {
      int sum = 0;
      for(int i = 2; i < amicables.length; i++)
      {
         if(isAmicable(i))
            sum += i;
      }
      System.out.println(sum);
   }
   public static boolean isAmicable(int n)
   {
      int m = sumDivisors(n);
      return( m != n && sumDivisors(m) == n);
   }
   public static int sumDivisors(int n)
   {
      int maxD = (int)Math.sqrt(n);
      int sum = 1;
      for(int i = 2; i < maxD; i++)
      {
         if(n%i == 0)
         {
            sum+=i;
            int d = n/i;
            if(d!=i)
               sum+=d;
         }
      }
      return sum;
   }
}