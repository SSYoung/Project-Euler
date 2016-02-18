import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.BigInteger;
public class Problem22_NamesScore
{
   public static void main(String[] args)
   {
      // capital characters start with 'A' = 10
      String[] names = readData("Problem22_Data.txt");
      Arrays.sort(names);
      BigInteger total = new BigInteger("0");
      for(int i = 0; i < names.length; i++)
      {
         int score = getScore(names[i]) * (i+1);
         total = total.add(new BigInteger(score+""));
      }
      System.out.println(total);
   }
   public static int getScore(String s)
   {
      int score = 0;
      s = s.substring(1,s.length()-1);
      for(int i = 0; i < s.length(); i++)
         score += ( Character.getNumericValue(s.charAt(i)) - 9 );
      return score;
   }
   public static String[] readData(String filename)
   {
      try 
      {
         FileReader fileReader = new FileReader(filename);
         BufferedReader bufferedReader = new BufferedReader(fileReader);  
         
         String line = bufferedReader.readLine();
         return line.split(",");     
      }
      catch(FileNotFoundException ex) 
      {
         System.out.println("Unable to open file '" + filename + "'");                
      }
      catch(IOException ex) 
      {
         System.out.println("Error reading file '" + filename + "'");                  
      }
      return null; 
   }
}