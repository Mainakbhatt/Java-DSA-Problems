package Dsa_pratice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String [] args){
            int [] arr={10,20,30,40,50};
            reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseArray(int [] arr){
        int start=0;
        int end= arr.length-1;
        while(end>start){
            swap(arr,start,end);
            start++;
            end--;
        }

    }

     static void swap(int[] arr, int ind1, int ind2) {
        int temp=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }
}
