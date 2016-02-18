import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.math.BigInteger;
public class Problem13_EvaluateHugeNumber
{
   public static void main(String[] args)
   {
      LinkedList<Integer> link = new LinkedList<Integer>();
      ArrayList<String> total = readData("Problem13_Data.txt");
      BigInteger summer = new BigInteger("0");
      for(String s : total)
      {
         BigInteger b = new BigInteger(s);
         summer = summer.add(b);
      }
      System.out.println(summer);
      
   }
   public static ArrayList<String> readData(String filename)
   {
      ArrayList<String> s = new ArrayList<String>();
      try 
      {
         FileReader fileReader = new FileReader(filename);
         BufferedReader bufferedReader = new BufferedReader(fileReader);  
         
         String line = bufferedReader.readLine();
         s.add(line);
         while( (line = bufferedReader.readLine() ) != null)
         {
            s.add(line);
         }      
      }
      catch(FileNotFoundException ex) 
      {
         System.out.println("Unable to open file '" + filename + "'");                
      }
      catch(IOException ex) 
      {
         System.out.println("Error reading file '" + filename + "'");                  
      }
      return s; 
   }
}