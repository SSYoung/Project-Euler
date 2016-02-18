public class Problem2_EvenFibonacciNumbers
{
   public static int sum = 0; 
   public static int max = 4000000;
   public static void main(String args[])
   {
      int a = 1;
      int b = 1;
      int fibValue = 0;
      while(fibValue < max)
      {
         fibValue = a + b;
         if(fibValue%2 == 0)
            sum += fibValue;
         a = b;
         b = fibValue;
      } 
      System.out.println(sum);
   }
}