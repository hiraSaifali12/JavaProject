package com.javaDsa.java.pattern;

public class a {
    public static void main(String[] args) {
        /*
         *****
         *****
         *****
         *****
         */
        //pattern1(4);
       // pattern2(5);
        pattern3(4);
    }

    static void pattern1(int n) {
        /*
         -------
         *
         **
         ***
         ****
         -------
         */

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    static void pattern2(int n) {
         /*
         -------
         *****
         *****
         *****
         *****
         -------
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern3(int n){
         /*
         -------
         *****
         ****
         ***
         **
         *
         -------
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
