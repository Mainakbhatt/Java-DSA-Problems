package Dsa_pratice;

public class DSA_MAXWEALTH {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5},
                {7,8,9,10}
        };
        int max=maxWealth(arr);
        System.out.println(max);
    }
    static int maxWealth(int [][] arr){
        int ans=Integer.MIN_VALUE;
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {

                ans = sum;

            }

        }
        return ans;

    }
}
