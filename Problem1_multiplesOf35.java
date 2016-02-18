import java.util.ArrayList;
public class Problem1_multiplesOf35 {
   public static final int target = 999;
   
   public static void main(String args[]) {
      int sum = 0;
      for( int i = 0; i < 1000; i++) {
         if( (i%3 == 0) || (i%5 == 0) ) {
            sum += i;
         } 
      }
      System.out.println(sum);
      
      System.out.println( SumDivisibleBy(3) + SumDivisibleBy(5) - SumDivisibleBy(15) );
   }
     
   public static int SumDivisibleBy(int n) 
   {
      int p = target/n;
      return n*(p*(p+1))/2;
   }
}

