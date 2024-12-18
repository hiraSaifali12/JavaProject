package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringListClass {
 static   class StringLengthComparator implements Comparator<String>{
       @Override
       public int compare(String o1,String o2){
           return o1.length()-o2.length();
       }
   }
    public static void main(String[] args) {
       // List<String> list = new ArrayList<>();
       // list.add("hello");
        List<String> list1 = Arrays.asList("apple","ok","thanks");
        // o = new StringLengthComparator();
        list1.sort(new StringLengthComparator());
        System.out.println();
        for(String i : list1){
            System.out.println(i);
        }
    }
}
