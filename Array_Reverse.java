package Dsa_pratice;

import java.util.Arrays;

public class Array_Reverse {
    public static void main(String[] args) {
        int [] arr={10,20 ,45,55,99};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        swap(arr,2,4);
    }

     static void reverse(int[] arr) {
        int start=0;
        int end= arr.length-1;
        while(end>start){
            swap(arr,start,end);
            start+=1;
            end-=1;
        }

    }

    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;


    }

}
