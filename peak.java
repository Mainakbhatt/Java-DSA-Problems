public class peak {
    public static void main(String [] args){
        int[] arr={1};
        int ans = peakEl(arr);
        System.out.println(ans);

    }

    static  int peakEl(int [] arr){

        int start = 0;
        int end = arr.length-1;



        while(start <= end){

            int mid = start + (end - start) / 2;

            int max  = maxVal(arr);

            if (max == arr[mid]){
                return mid;
            }

            boolean isAsc =  arr[start+1]<= arr[end-1];

            if (isAsc) {

                if (max == arr[mid] ){

                    return mid;
                } else if (max > arr[mid]) {

                    start = mid +1;

                }
                else {
                    end = mid -1;
                }

            }
            else {
                if (max == arr[mid] ){

                    return mid;
                } else if (max > arr[mid]) {

                    end = mid -1;

                }
                else {
                    start = mid +1;
                }
            }

        }
        return -1;

    }
    static int maxVal(int[] arr){
        int maxv=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxv) {
                maxv=arr[i];
            }

        }
        return maxv;
    }
}
