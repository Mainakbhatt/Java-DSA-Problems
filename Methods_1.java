package Dsa_pratice;

import java.util.Scanner;

public class Methods_1 {

    public static void main(String[] args) {
        fib();
        rev();
        countnum();
    }

    static void fib(){

        Scanner in =new Scanner(System.in);
        System.out.print("Enter n number");
        int n=in.nextInt();

        int a=0;
        int b=1;
        int count=2;
        while(count<n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
    }

    static void rev(){
        long num=1828282882L;

        long ans=0;
        while (num>0){
            long rem=num%10;
            num=num/10;
            ans=ans*10+rem;
        }
        System.out.println(ans);
    }
    static void countnum(){
        int c=14242425;
        int count1=0;
        while(c>0){
            int rem=c%10;
            if (rem == 4) {
                count1++;
            }
            c=c/10;
        }
        System.out.println(count1);
    }
}
