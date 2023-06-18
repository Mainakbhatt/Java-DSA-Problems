package Dsa_pratice;

public class Reversenum {
    public static void main(String[] args) {
//        int n = 7923;
//
//        int ans = 0;
//
//        while (n > 0) {
//            int rem = n % 10;
//            n = n / 10;
//            ans = ans * 10 + rem;
//
//        }
//        System.out.println(ans);
//    }


        int num = 12345;

        int sum =0 ;

        do{
            // System.out.print(sum);
            int rem = num%10;

            sum = rem +sum;

            num = num/10;

        }
        while(num>0);

        System.out.println(sum);

    }





}
