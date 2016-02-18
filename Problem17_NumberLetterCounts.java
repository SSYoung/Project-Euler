import java.util.*;
public class Problem17_NumberLetterCounts
{
   public static int max = 1000;
   public static void main(String[] args)
   {
      Map<Integer,String> n = new HashMap<Integer,String>();
      n.put(0,"");
      n.put(1,"one");
      n.put(2,"two");
      n.put(3,"three");
      n.put(4,"four");
      n.put(5,"five");
      n.put(6,"six");
      n.put(7,"seven");
      n.put(8,"eight");
      n.put(9,"nine");
      n.put(10,"ten");
      n.put(11,"eleven");
      n.put(12,"twelve");
      n.put(13,"thirteen");
      n.put(14,"fourteen");
      n.put(15,"fifteen");
      n.put(16,"sixteen");
      n.put(17,"seventeen");
      n.put(18,"eighteen");
      n.put(19,"nineteen");
      int sum = 0;
      for(int j = 1; j < max; j++)
      {
         if( j > 99 )
            sum += n.get(j/100).length() + 10;
         if( j%100 == 0)
            sum -= 3;
         int i = j%100;
         if( i < 20)
            sum += n.get(i).length();
         else
         {
            if( (19 < i && i < 50) )
               sum += 6;
            else if( 49 < i && i < 60 )
               sum += 5;
            else 
            {
               int copy = i/10;
               sum += n.get(copy).length() + 2;
               if( 79 < i && i < 90)
                  sum -= 2;
            } 
            int copy = i % 10;
            sum += n.get(copy).length();           
         }

      }
      sum += 11;
      System.out.println(sum);
   }
}