package com.javaDsa.java.arrays.BinarySearch;

public class OccurrenceNo {
  public static int firstOcuurrance(int[] arr,int key, int n){
      int res=-1;
      int start=0;
      int end=n-1;
      while(start<=end){
          int mid=start+(end-start)/2;
          if(arr[mid]==key){
              res=mid;
              end=mid-1;
          }
          else if (arr[mid]>key){
              end=mid-1;
          }
          else{
              start = mid+1;
          }
      }
      return res;


  }
  public static int lastOccurrance(int[] arr,int key,int n){
      int res=-1;
      int start=0;
      int end=n-1;
      while(start<=end){
          int mid=start+(end-start)/2;
          if(arr[mid]==key){
              res=mid;
              start=mid+1;
          }
          else if (arr[mid]>key){
              end=mid-1;
          }
          else{
              start = mid+1;
          }
      }
      return res;

  }
  public static int[] FirstAndLast(int[] arr, int key, int n){
      int first = firstOcuurrance(arr,  key, n);
      if (first == -1) return new int[] { -1, -1};
      int last = lastOccurrance(arr,  key, n);
      return new int[] {first, last};
  }
  public static int countOccurrance(int[] arr, int key, int n){
    int[] ans=  FirstAndLast(arr,key,n);
      return  (ans[1]-ans[0]+1);
  }
  public static void main(String[] args){
      int[] arr={1,2,3,4,4,4,4,4,5};
      int n= arr.length;
      int key =4;

      int ans = countOccurrance(arr,key, n);
      System.out.println("The number of occurrences is: " + ans);
      int ans1 = firstOcuurrance(arr,key, n);
      System.out.println("The number of occurrences is: " + ans1);
      int ans2 = lastOccurrance(arr,key, n);
      System.out.println("The number of occurrences is: " + ans2);


  }
}
