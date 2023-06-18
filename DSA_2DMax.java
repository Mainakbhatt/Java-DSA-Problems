package Dsa_pratice;

public class DSA_2DMax {
    public static void main(String [] args){
        int [][] main={
                {723,232,323,45},
                {434,894},
                {45,656,464,656},
        };
        System.out.println(Max(main));
    }

    static int Max(int [][] arr){
        int max=Integer.MIN_VALUE;
        for (int[] elements : arr) {
            for (int anInt : elements) {
                if (max < anInt) {

                    max = anInt;
                }
            }
        }
        return max;
    }
}
