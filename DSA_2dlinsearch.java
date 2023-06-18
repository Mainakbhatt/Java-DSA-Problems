package Dsa_pratice;

import java.util.Arrays;

public class DSA_2dlinsearch {
    public static void main(String[]args){
        int[][] arr ={
                {10,9,25},
                {23,89,78},
                {-2,0,7}
        };
        int target=-2;
        int []ans=Search2D(arr,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] Search2D(int [][]arr, int target){
        if (arr.length == 0) {
            return new int[]{-1,-1};
        }
        for (int rows = 0; rows < arr.length ; rows++) {
            for (int col = 0; col <arr[rows].length ; col++) {
                   if(target == arr[rows][col]){
                    return new int[]{rows, col};
                   }
            }
        }
        return new int[]{-1,-1};
    }
}
