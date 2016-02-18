import java.lang.Math;
public class Problem12_HighestDivisibleTriangleNumber
{
   public static void main(String args[])
   {
      int row = 1;
      int step = 2;
      int count = 0;
//       System.out.println("21 " + divisorNumber(21) + " 4");
//       System.out.println("28 " + divisorNumber(28) + " 6");
//       System.out.println("36 " + divisorNumber(36) + " 5");
//       System.out.println("45 " + divisorNumber(45) + " 6");
//       System.out.println("55 " + divisorNumber(55) + " 4");
      while(divisorNumber(row) < 501)
      {
         row += step;
         step+= 1;
      }
     System.out.println(row);
   }
   
   public static int divisorNumber(int n)
   {
      int row = n;
      double sqrt = Math.sqrt(n);
      int divisors = 1;
      int count = 0;
      while(n%2 == 0)
      {
         count++;
         n /= 2;
      }
      divisors *= (count+1);
      int p = 3;
      while(n != 1)
      {
         count = 0;
         while(n%p == 0)
         {
            count++;
            n/=p;
         }
         divisors *= (count+1);
         p+=2;
      }
   
      return divisors;
   }
}