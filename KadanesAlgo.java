import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class MAXSUBARRAY {
   
 public static void printprefixsum(int arr[]){
   int  sum =0;
   int largest = Integer.MIN_VALUE;
   int prefix []= new int[arr.length];
     prefix[0]= arr[0];
     for(int i =1;i<prefix.length;i++){
      prefix[i]= prefix[i-1]+arr[i];
     }
      for(int i =0;i<arr.length;i++){
           int start = i;
         for(int j = i;j<arr.length;j++){
             int end = j;
           sum = start ==0? prefix[end]: prefix[end]-prefix[start-1];
            if(largest <sum){
               largest = sum;
              }
             sum  =0;
             System.out.println();  
         }
         System.out.println();
      }
         
      System.out.println("largets sum of all subarray is" +largest);
   }
 
    public static void printBruteforce(int arr[]){
      int largest = Integer.MIN_VALUE;
      int sum =0;
      for(int i =0;i<=arr.length;i++){
         int first = i;
         for(int j =i;j<arr.length;j++){
         int end =  j;
         for(int k = first;k<=end;k++){
            sum = sum+arr[k];
         }
         System.out.print(sum);
         if(largest <sum){
            largest = sum;
         }
         sum =0;
         System.out.println();
         }
         System.out.println();
      }
      System.out.println("the largest sum of all subarray is :-"+ largest);
    }
    public static  void kadanes(int arr[]){
      int ms = Integer.MIN_VALUE;
      int sum =0;
     
  
   
      for(int i =0;i<arr.length;i++){
         sum = sum +arr[i];
      
      if(arr[i]<0){
         sum =0;
      }
      ms = Math.max(ms,sum);
   }
    System.out.println("the largest sum is "+ ms);
    }
    public static void main(String[] args) {
    int arr[] ={-2,-4,-6,8,-10};
     printprefixsum(arr);
     printBruteforce(arr);
     kadanes(arr);
   }
}