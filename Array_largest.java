package Dsa_pratice;

public class Array_largest {

    public static void main(String[] args) {
        int[] arr={10,30,70,46,90};
        System.out.println(maxRange(arr,1,3));
        System.out.println(max(arr));
    }

     static int maxRange(int[] arr,int start,int end) {
        int maxval=start;
         for (int i = 0; i <=end ; i++) {
             if (arr[i] > maxval) {
                 maxval=arr[i];
             }
         }
         return maxval;
    }

    static int max(int[] arr){
        int maxv=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxv) {
                maxv=arr[i];
            }

        }
        return maxv;
    }
}
