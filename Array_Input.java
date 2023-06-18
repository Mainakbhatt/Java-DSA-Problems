package Dsa_pratice;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Input {

    public static void main(String [] args)
    {
        int [] arr=new int[5];

        Scanner in= new Scanner(System.in);


        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

            System.out.println(arr[4]);

        for (int i = 0; i < arr.length ; i++) {

            arr[i]=in.nextInt();

        }

//        for (int i = 0; i < arr.length ; i++) {
//
//            System.out.print(arr.length-1+" ");

        //}
        //For each method
//        for (int a:arr) {
//
//            System.out.print(a+" ");
//
//        }

        System.out.println(Arrays.toString(arr));




    }
}
