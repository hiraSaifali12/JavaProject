package com.javaDsa.java.arrays.linearSearch;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class SecondSmallerAndSecondLargest {
    static void secondSmallestAndSecondLargest(int []arr,int n){
        if(n==0 || n==1){
            System.out.println(-1 + " "+ -1 +"\n");
        }
        Arrays.sort(arr);
        int smallest =arr[1];
        int largest = arr[n-2];

        System.out.printf("the smallest is %d and the largest is %d",smallest ,largest);

    }
    static void otherWay(int[] arr, int n){
        if(n==0 || n==1){
            System.out.println(-1 +" "+-1+"\n");

         }
        int small = Integer.MAX_VALUE;
        int secondSmall=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        int secondLarger=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        for(int k=0;k<n;k++){
                if(arr[k] > secondLarger && arr[k] !=large ){
                    secondLarger=arr[k];
                }
                if(arr[k]< secondSmall && arr[k] != small){
                    secondSmall=arr[k];
                }
        }
        System.out.printf("secondLarge is : %d and secondSmallest is : %d ", secondLarger, secondSmall);

        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n= in.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of an array :");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        //secondSmallestAndSecondLargest(arr,n);
        otherWay(arr,n);

    }
}
