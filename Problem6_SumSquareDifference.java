public class Problem6_SumSquareDifference
{
   public static int max = 100;
   public static void main(String args[])
   {
      long sumOfSquares = max*(max+1)*(2*max+1)/6;
      long squareOfSums = ( (max)*(max+1)/2 )*( (max)*(max+1)/2 );
      System.out.println(squareOfSums-sumOfSquares);
   }
}