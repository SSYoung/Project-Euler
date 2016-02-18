import java.util.Scanner;
import java.io.*;
import java.util.*;    //ArrayList & the Scanner class in Java 1.5
import java.lang.Math;
import java.util.Arrays;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class DataReader
{
   String filename;
   FileReader fileReader;
   BufferedReader bufferedReader;
   public DataReader()
   {
      filename = "";
   }
   public DataReader(String s)
   {
      filename = s;
      try 
      {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);        
      }
      catch(FileNotFoundException ex) 
      {
         System.out.println("Unable to open file '" + filename + "'");                
      }
//       catch(IOException ex) 
//       {
//          System.out.println("Error reading file '" + filename + "'");                  
//       }

   }
   public int[][] readMatrix()
   {
      int[][] matrix = new int[20][20];
      
      try 
      {
         int count = 0;
         String line = bufferedReader.readLine();
         String[] splitter = line.split(" ");
         for(int i = 0; i < splitter.length; i++)
         {
            matrix[count][i] = Integer.parseInt(splitter[i]);
         }
         count++;
         while( (line = bufferedReader.readLine() ) != null )
         {
            splitter = line.split(" ");
            for(int j = 0; j < splitter.length; j++) {
               matrix[count][j] = Integer.parseInt(splitter[j]); }
            count++;         
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

      return matrix;
   }  
}