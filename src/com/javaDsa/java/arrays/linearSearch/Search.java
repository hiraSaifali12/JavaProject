package com.javaDsa.java.arrays.linearSearch;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        //search in the array if the value founds return index , if not found return -1
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n=in.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of an array :");
       for(int i=0;i<n;i++){
           arr[i]=in.nextInt();

       }
        System.out.println("the array :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);

        }
        int sum=0;
        for (int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("the sum of an array");

        System.out.println(sum);
        System.out.println("the max value of an array");
      Search.maximumValue(arr,n);
        System.out.println("the swap array is :");
        Search.rotateArray(arr,n);

    }
    static void maximumValue(int [] arr,int n){
        int maxi=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
           if(arr[i]>maxi){
               maxi=arr[i];
           }
       }
        System.out.println(maxi);

    }
    static void rotateArray(int [] arr , int n){
       int i=0;
       int  j=n-1;
       while(i<j){
           int temp = arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
       for(int k=0;k<n;k++){
           System.out.print(arr[k] + " ");
       }

    }
}
