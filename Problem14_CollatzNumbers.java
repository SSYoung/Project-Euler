public class Problem14_CollatzNumbers
{
   public static int max = 1000000;
   public static void main(String[] args)
   {
      int[] checks = new int[10*max];
      int bestCollatzCount = 0;
      int bestCollatz = 0;
      for(int i = 2; i < max; i++)
      {
         int cc = collatzCount(i,checks);
         checks[i] = cc;
         if(cc > bestCollatzCount)
         {
            bestCollatzCount = cc;
            bestCollatz = i;
         }         
      }
      System.out.println(bestCollatz);
   }
   public static int collatzCount(int n0, int[] checks)
   {
      int count = 1;
      long n = (long)(n0);
      while(n != 1)
      {
        if(n < (10*max))
        {
           if(checks[(int)(n)] != 0)
              return (count+checks[(int)(n)]);
        }
        if(n%2==0)
           n /= 2;
        else
           n = 3*n+1;
        count++;
      }
      return count;
   }
}