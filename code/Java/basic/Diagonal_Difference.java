import java.io.*;
import java.util.*;

public class Diagonal_Difference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner in = new Scanner(System.in);
      int primary_result = 0;
      int secondary_result = 0;
      int n = in.nextInt();
      int a [][] = new int[n][n];
      for(int arr_i = 0; arr_i < n; arr_i ++){
       for(int arr_j = 0; arr_j < n; arr_j ++){
          a[arr_i][arr_j] = in.nextInt();
        } 
      }
      
      for(int i = 0; i < n; i ++){
        primary_result += a[i][i];
        secondary_result += a[i][n - i - 1];
      }
      
      System.out.print(Math.abs(secondary_result - primary_result));
    }
}