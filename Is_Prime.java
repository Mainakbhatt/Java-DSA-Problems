package Dsa_pratice;

import java.util.Scanner;

public class Is_Prime {

//    public static void main(String[] args){
//        Scanner in=new Scanner(System.in);
//        int n=in.nextInt();
//        boolean ans = prime(n);
//        System.out.println(ans);
//
//
//    }

    public static void main(String args[]) {
        int n = 100;
        for (int i = 1; i < n; i++) {
            isprime(i);
        }

    }

    public static void isprime(int n) {
        int count = 0;
        for (int j = 1; j <= n; j++) {
            if (n % j == 0)
                count = count + 1;
        }
        if (count == 2)
            System.out.println(n + " Is a prime number");
    }

//    static boolean prime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        int c = 2;
//        while (c * c <= n) {
//            if (n % c == 0) {
//
//                return false;
//
//            }
//            c+=1;
//        }
//        if (c *c>n) {
//            return true;
//        }
//        return c*c>n    ;
//    }
}
