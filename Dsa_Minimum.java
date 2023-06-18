package Dsa_pratice;

public class Dsa_Minimum {
    public static void main(String [] args){
            int [] arr={10,23,-1,45,89,44};
        System.out.println(min(arr));
    }

    static int min(int arr[]){
        if (arr.length==0){
            return -1;
        }
        int ans=arr[0];
        for (int i = 0; i < arr.length ; i++) {

            if (ans >arr[i]) {
                    ans=arr[i];
            }

        }
        return ans;
    }
}
