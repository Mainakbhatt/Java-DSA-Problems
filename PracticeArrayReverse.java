import java.util.Arrays;

public class PracticeArrayReverse {
    public static void main(String[] args) {
        int [] arr={10,223,34,34,54,657};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    
     static void reverse(int[] arr) {
        int start=0;
        int end=arr.length-1;
        if(end>start){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

     static void swap(int [] arr,int index1,int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}