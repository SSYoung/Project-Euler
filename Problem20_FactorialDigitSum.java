import java.math.BigInteger;
public class Problem20_FactorialDigitSum
{
   public static void main(String[] args)
   {
      int max = 100;
      BigInteger num = new BigInteger("1");
      for(int i = 1; i<= max; i++)
      {
         num = num.multiply(new BigInteger(i+""));
      }
      String answer = num.toString();
      int total = 0;
      for(int i = 0; i < answer.length(); i++)
         total += Integer.parseInt(answer.substring(i,i+1));
      System.out.println(total);
   }
}