package Dsa_pratice;

public class DSA_Searchininfinte {


    public static void main(String[] args) {

        int [] arr = {10,20,23,34,35,36,56,62,68,78,89,90,600,700,800,801};

        int target = 62;

        System.out.print(findAns(arr,target));

    }



    static int findAns(int [] arr,int target){

        int start=0;
        int end =1;

        while(target > arr[end]){
            int newstart =end+1;
            end = end +(end -start+1)*2;

            start = newstart;

        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int [] arr,int target,int start,int end){

        while(start<end){
            int mid = start+(end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            } else if (target<arr[mid]) {
                end = mid -1;
            }
            else {

                return mid;
            }
        }
        return  -1;
    }
}


