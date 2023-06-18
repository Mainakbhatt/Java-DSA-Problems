package Dsa_pratice;

import java.util.Arrays;

public class Array_Swap {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int arr[],int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
