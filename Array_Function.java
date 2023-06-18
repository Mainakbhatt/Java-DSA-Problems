package Dsa_pratice;

import java.util.Arrays;

public class Array_Function {
    public static void main(String[] args) {

        int [] calls={10,20,30,40};
        System.out.print(Arrays.toString(calls));
        change(calls);
        System.out.println(Arrays.toString(calls));


    }
    static void change(int[] arr){
        arr[0]=23;

       // return null;
    }
}
