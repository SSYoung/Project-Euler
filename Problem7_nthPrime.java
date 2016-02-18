import java.util.Arrays;
public class Problem7_nthPrime
{
   public static void main(String args[])
   {
       int nth = 10001;
       int num, count, i;
       num=1;
       count=0;
    
       while (count < nth)
       {
         num=num+1;
         for (i = 2; i <= num; i++)
         {
           if (num % i == 0) 
           {
             break;
           }
         }
         if ( i == num)
         {
           count = count+1;
         }
       }
       System.out.println("Value of nth prime: " + num);
   }
   
}