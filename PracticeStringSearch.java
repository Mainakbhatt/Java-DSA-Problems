public class PracticeStringSearch {
    public static void main(String [] args)
    {
            String [] arr={"Every","Living","Worst","Life"};
            String target="Life";
            boolean ans=stringSearch(arr,target);
            System.out.print(ans);
    }

     static boolean stringSearch(String[] arr, String target) {

        if(arr.length==0)
            return false;
         for (int i = 0; i < arr.length ; i++) {
             if (target == arr[i]) {
                    return true;
             }

         }
         return false;
    }
}
