package Dsa_pratice;

public class DSA_SearchRange {
    public static void main(String [] args){
        int [] main={10,23,45,44,43,56,657};
        int target=44;
        boolean ans=Search(main,target,0,5);
        System.out.println(ans);

    }
    static boolean Search(int [] arr,int target,int start,int end){
        if (arr.length==0)
            return false;

        for (int index = start; index <end ; index++) {

            int element=arr[index];
            if (element == target)
                return true;

        }
        return false;

    }
}
