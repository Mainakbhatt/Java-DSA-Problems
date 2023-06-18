package Dsa_pratice;

public class DSA_OrderAgin {

        public static void main(String[] args){
//                 int [] arr = {90 , 50 ,45,23,12,2,3,1,0};
                 int [] arr = {2,4,5,12,23,34,43,45,56,67,99};
              //   int target = 67;
                 int ans=orderBinary(arr);
                 System.out.println(ans);
        }
    static int orderBinary(int [] arr){
//
//            int start=0;
//            int end= arr.length-1;
////            int x= Math.sqrt(target)
//
//            boolean isAsc = arr[start] < arr[end];
//
//            while(start<=end){
//
//                int mid=start + (end-start) / 2;
//
//                if(arr[mid] == target){
//                    return mid;
//                }
//                if (isAsc) {
//
//                    if(target > arr[mid]){
//
//                        start= mid+1;
//                    }
//                    else {
//                        end = mid-1;
//                    }
//
//                }
//                else {
//                    if(target>arr[mid]){
//                        end = mid-1;
//                    }
//                    else {
//                        start = mid +1;
//                    }
//                }
//
//            }
//
//            return -1;
        int start= 0 ;
        int end = arr.length-1;

        for (start =0 ; start<= end;start++)
        {
            int mid = start + (end - start) / 2;
            if (arr[start] == arr[mid]){
                return mid;
            }
            boolean asc = arr[start] < arr[end];

            if(asc){
                if(arr[start] > arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid -1;
                }
            }
            else {
                if(arr[start] > arr[mid]){
                     end = mid -1;
                }
                    start = mid +1;
                }
            }
        return start;

        }

    }



