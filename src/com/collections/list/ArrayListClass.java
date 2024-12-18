package com.collections.list;

import java.util.ArrayList;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{
public int compare(Integer o1, Integer o2 ){
    return o2-o1;
}
}
public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       list.add(100);
       list.add(20);
       list.add(130);
       list.add(240);
       list.add(50);
        System.out.println("array");
      /* list.sort(new MyComparator());
        System.out.println();
        for(int i : list){
            System.out.println(i);
        }
*/
      /* for(int i=0;i<list.size();i++){

           System.out.print(list.get(i));
           System.out.print(" ");

       }
        System.out.println();
       for(int i : list){
           System.out.println(i);
       }
       ArrayList<Integer> list1= new ArrayList<>();
       */
    }
}
