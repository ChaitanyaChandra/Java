package com.naidusons.Test;

import java.util.Scanner;

public class Main {
    public static Scanner input1 = new Scanner(System.in);
    // scanner input

    public static void main(String[] args) {
    int[] a = b(5);
    // array a  stored with method b
    // first b (public static method) is called

    // secondly for loop is called
    for (int j = 0 ; j < a.length ; j++) {
        System.out.println("Element " + j + " stored value was " + a[j] );
    }
    }

    // public static method
    public static int[] b(int number){
        System.out.println("Enter " + number + "integer values.\r");
        int[] c = new int[number];
        // another array which is extended with number

        // this for loop is used to store the array data from  next line input
        for (int i = 0 ; i < c.length ; i++){
            c[i] = input1.nextInt();
        }

        return c;
        // finally return int from public int
    }
}
/*
Enter 5integer values.
10
20
30
40
50
Element 0 stored value was 10
Element 1 stored value was 20
Element 2 stored value was 30
Element 3 stored value was 40
Element 4 stored value was 50
 */
