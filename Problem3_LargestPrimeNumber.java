public class Problem3_LargestPrimeNumber
{  
   public static long max = 600851475143L;
   public static void main(String args[])
   {
      long a = max;
      long b = 2;
      long c = 1;
      while( (a/b) != 1 )
      {
         if(a%b == 0)
         {
            a = a/b;
            b = 2;
         }
         else
            b++; 
      }
      System.out.println(a);
   }
   public static boolean isPrime(int n)
   {
      if(n%2 == 0)
         return false;
      for(int i=3; i<(n/2); i+=2)
      {
         if(n%i == 0)
            return false;  
      }
      return true;
   }
}