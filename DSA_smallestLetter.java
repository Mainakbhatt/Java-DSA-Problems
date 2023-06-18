package Dsa_pratice;

public class DSA_smallestLetter {

    public static void main(String[] args) {

        int [] arr = {1,10,2,11,3,12};
        for (int i = 0; i < arr.length-2 ; ++i) {
            System.out.println(arr[i] + " " );

        }

//        char [] arr = {'c','f','j'};
//        char target = 'c';
//        char ans = nextGreatestLetter(arr,target);
//        System.out.println(ans);

    }

//    static char nextGreatestLetter(char[] letters, char target) {
//
//        int start = 0;
//        int end =letters.length-1;
//
//
//        while(start<=end){
//
//            int mid = start +(end-start) /2;
//
//            if(target < letters[mid]){
//                 end = mid-1;
//            }
//            else{
//                start = mid+1;
//            }
//
//
//        }
//        return letters[start% letters.length];
//
//    }
}
