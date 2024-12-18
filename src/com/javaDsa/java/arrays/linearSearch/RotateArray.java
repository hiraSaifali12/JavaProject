package com.javaDsa.java.arrays.linearSearch;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={2,3,5,8,6,7};
        revArray(arr,6,2);
        System.out.println(Arrays.toString(arr));
    }

    public static void revArray(int[] arr, int n, int d){
        swapArray(arr,0,d-1);
        swapArray(arr,d,n-1);
        swapArray(arr,0,n-1);
    }
    public static void swapArray(int[] arr,int i, int j){

       while(i<=j) {
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }

    }
}
