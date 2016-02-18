import java.math.BigInteger;
import java.util.*;
public class Problem16_2tothe1000
{
   public static int max = 1000;
   public static void main(String[] args)
   {
      int[] array = new int[max];
      array[0] = 1;
      for(int power = 0; power < max; power++)
      {
         int carry = 0;
         for(int index = 0; index < max; index++)
         {
            int prod = array[index]*2 + carry;
            if(prod > 9)
            {
               carry = 1;
               prod = prod%10;
            }
            else
               carry = 0;
            array[index] = prod;
         }
      }
      int sum = 0;
      for(int i = 0; i < array.length; i++)
         sum+= array[i];
      System.out.println(sum);
   }
}