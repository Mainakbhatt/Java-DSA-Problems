package Dsa_pratice;

public class DSA_BinarySeach {
    public static void main(String[] args) {
         int [] arr={2,5,19,23,89,100};
         int target=55;
         int ans = binary(arr,target);
         System.out.println(ans);
    }
    // Creating a method that returns the mid
    static int binary(int [] arr,int target){
        int start=0;            // start will always start from 0;
        int end= arr.length-1;   // end will always be length array -1 ;

        // run the loop
        while(start<=end){
            int mid = start + ( end - start ) / 2;  // Instead of using regular formula we use this beacuse the int value range may exceed;
            if (target < arr[mid]) {  // mid val is less than target we search in left so
                end = mid - 1;     // end will mid-1
            } else if (target > arr[mid]) {   // mid val is greater than 1 we search in right;
                start = mid + 1;   // start will mid+1;
            }
            else {
                return mid;    // if mid == target it will return mid
            }
        }
        return -1;  // if target is not present return -1
    }

}
    
