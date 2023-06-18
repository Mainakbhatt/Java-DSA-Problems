package Dsa_pratice;

public class DSA_LinearSearchStrings {

    public static void main(String [] args){
        String [] main={"Mainak","Bhattacharjee","Cool","Beautiful","Sky","Imagination"};
        String target="Cool";
        boolean ans=LinearSearch(main,target);
        System.out.println(ans);

    }

    static boolean LinearSearch(String [] arr,String target){

        if (arr.length == 0) {
            return false;

        }
        for (int index = 0; index < arr.length ; index++) {
            String element=arr[index];
            if (target == element) {
                return true;
            }

        }
        return false;
    }
}
