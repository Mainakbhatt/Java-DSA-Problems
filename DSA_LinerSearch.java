package Dsa_pratice;

public class DSA_LinerSearch {

    public static void main(String [] args){
        int [] main={10,20,30,320,4,402,32,232,};
        int target=2324;
        int ans=LinearSearch(main,target);
        System.out.println(ans);

    }
    static int LinearSearch(int [] arr,int target){
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length ; index++) {

            int element=arr[index];
            if (target == element) {
                return index;
            }

        }
        return -1;

    }
}
