import java.util.*;
import java.io.*;
import java.lang.Math.*;
public class Problem18_MaximumPathTriangleOne{
   public static int best = 0; 
   public static void main(String[] args)
   {
      int[][] matrix = readMatrix("Problem18_Data.txt");
      int[] results = new int[15];
      printMatrix(matrix);
      for(int i = 0; i < 15; i++)
      {
         results[i] = findMaxRoute(14,i,matrix);
      }
      System.out.println(getMax(results));
  
      System.out.println(bruteForce(0,0,0,matrix));
   }
////////////////////////////////////////////////////////////////////////////////
   public static int findMaxRoute(int rowNumber, int colNumber, int[][] matrix)
   {
      if(rowNumber == 0)
         return matrix[0][0];
      if(colNumber == 0)
         return matrix[rowNumber][colNumber] + findMaxRoute(rowNumber-1,colNumber,matrix);
      if(colNumber == rowNumber)
         return matrix[rowNumber][colNumber] + findMaxRoute(rowNumber-1,colNumber-1,matrix);
      else
      {
         if(matrix[rowNumber-1][colNumber-1] < matrix[rowNumber-1][colNumber])
            return matrix[rowNumber][colNumber] + findMaxRoute(rowNumber-1,colNumber,matrix);
         else
            return matrix[rowNumber][colNumber] + findMaxRoute(rowNumber-1,colNumber-1,matrix);
      }    
   }
////////////////////////////////////////////////////////////////////////////////
   public static int bruteForce(int row, int col, int total, int[][] matrix)
   {
      total += matrix[row][col];
      if(row == 14)
      {
         return total;         
      }
      else
      {
         return Math.max(bruteForce(row+1,col,total,matrix),bruteForce(row+1,col+1,total,matrix));         
      }
   }
    
////////////////////////////////////////////////////////////////////////////////        
   public static int[][] readMatrix(String fileName){
      int[][] matrix = new int[15][15];
      fillMatrix(matrix);
      try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
         String line;
         int row = 0;
         while( (line = br.readLine()) != null ) {
            String[] splitter = line.split(" ");
            for(int i = 0; i < splitter.length; i++)
            {
               matrix[row][i] = Integer.parseInt(splitter[i]);
            }
            row++;
         }
            
      }
      catch(FileNotFoundException ex){
         System.out.println("Unable to open file '" + fileName + "'");                
      }
      catch(IOException ex){
         System.out.println("Error reading file '" + fileName + "'");                  
      }  
      return matrix;   
   }
////////////////////////////////////////////////////////////////////////////////   
   public static void fillMatrix(int[][] matrix)
   {
      for(int i = 0; i < matrix.length; i++){
         for(int j = 0; j < matrix[0].length; j++){
            matrix[i][j] = -1;
         }
      }
   }
////////////////////////////////////////////////////////////////////////////////   
   public static void printMatrix(int[][] matrix)
   {
      for (int i = 0; i < matrix.length; i++)
      {
         for (int j = 0; j < matrix[0].length; j++)
         {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
      }
   }
////////////////////////////////////////////////////////////////////////////////   
  public static int getMax(int[] inputArray)
  { 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
}