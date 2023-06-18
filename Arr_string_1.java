package Dsa_pratice;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_string_1 {

    public static void main(String[] args) {
        String [] arr=new String[4];
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < arr.length ; i++) {

            arr[i]=sc.next();

        }
        //To intiliaze  objects in array
        System.out.println(Arrays.toString(arr));

        //to modify
        arr[3]="Family";
        System.out.println(Arrays.toString(arr));
    }
}
