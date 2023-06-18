package Dsa_pratice;

import java.util.Arrays;

public class DSA_SelectionSort {

    public static void main(String[] args) {

        int [] arr = {5,2,6,3,4,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
    static void selection(int [] arr){

        for (int i = 0; i < arr.length ; i++) {

            int last = arr.length-i-1;
            int maxIndex = max(arr,0,last);
            swapped(arr,maxIndex,last);
            
        }
    }

    private static void swapped(int[] arr, int firstindex, int secondIndex) {

        int temp = arr[firstindex];
        arr[firstindex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    static int max(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <=end  ; i++) {

            if (arr[max] < arr[i]) {

                max = i;

            }

        }
        return max;
    }


}
