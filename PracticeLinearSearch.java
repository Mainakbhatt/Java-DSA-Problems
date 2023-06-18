public class PracticeLinearSearch {
    public static void main(String[] args) {


        int[] arr = {10, 20, 34, 78, 98, 88};
        int target = 78;
        int ans = Linearsearch(arr, target);
        System.out.println(ans);

    }



     static int Linearsearch(int[] arr, int target) {

         for (int index = 0; index < arr.length ; index++) {

             if (target == arr[index]) {

                 target=index;
             }

         }
         return target;

}
}