package Dsa_pratice;
public class Duplicate {
    public static void main(String[] args) {
        int [] arr={1,2,2,3,4};
        int target=3;
        int ans=duplicate(arr,target);
        System.out.println(ans);
    }
    static int duplicate(int[] arr,int target){
        int count=0;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]==target){
                        count++;
            }

        }
        return count;
    }

}
