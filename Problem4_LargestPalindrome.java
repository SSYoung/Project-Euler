public class Problem4_LargestPalindrome
{
   public static void main(String args[])
   {
       int bestPalindrome = 0;
       for(int i = 0; i < 1000; i++)
       {
         for(int j = 0; j < 1000; j++)
         {
            int ij = i*j;
            if( isPalindrome(ij) && (ij > bestPalindrome))
               bestPalindrome = ij;            
         }
       }
       System.out.println(bestPalindrome);
       LCM();
   }
   public static boolean isPalindrome(int num)
   {
      int n = num;
      int reverse = 0;
      while (num > 0)
      {
         int dig = num % 10;
         reverse = reverse * 10 + dig;
         num = num / 10;
      }
      return(reverse == n);
   }
   public static void LCM()
   {
       for(int i = 190; ; i += 190) {
           if(i % 3 == 0 
                   && i % 4 == 0
                   && i % 6 == 0 
                   && i % 7 == 0
                   && i % 8 == 0 
                   && i % 9 == 0
                   && i % 11 == 0
                   && i % 12 == 0 
                   && i % 13 == 0 
                   && i % 14 == 0 
                   && i % 15 == 0
                   && i % 16 == 0
                   && i % 17 == 0
                   && i % 18 == 0
                   && i % 20 == 0) {
               System.out.println(i);
               break;
           }
       }
   }    
}

