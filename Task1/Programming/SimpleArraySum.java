import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
  public static void main(String[] args)
  {
      int n;
      int sum=0;
      int ar[] = new int[1000];
      
      Scanner s = new Scanner(System.in);
      n = s.nextInt();
      
      for(int i=0; i<n; i++){
          ar[i] = s.nextInt();
      }
      for(int i=0; i<n; i++){
          sum = sum+ar[i];
      }
      System.out.println(sum);
      
  }
}
