package Dsa_pratice;

import java.util.Scanner;

public class Switch_case {

    public static void main(String[] args) {

//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter operation");
//        char ch=in.next().trim().charAt(0);
//        System.out.println("Enter A");
//        float a=in.nextFloat();
//        System.out.println("Enter B");
//        float b=in.nextFloat();
//
//        switch (ch) {
//            case '+' -> System.out.println("Addition" + (a + b));
//            case '-' -> System.out.println("Subtraction" + (a - b));
//            case '/' -> System.out.println("Division" + (a / b));
//            case '%' -> System.out.println("Modulus" + (a % b));
//            case 'F' -> {
//                long n = 1799127192L;
//                long ans = 0;
//                while (n > 0) {
//                    long rem = n % 10;
//                    n = n / 10;
//                    ans = ans * 10 + rem;
//                }
//                System.out.println(ans);
//            }
//            case 'f' -> {
//                int m = 7;
//                int i = 0;
//                int l = 1;
//                int count = 2;
//                while (count < m) {
//                    int temp = l;
//                    l = l + i;
//                    i = temp;
//                    count++;
//                }
//                System.out.println(l);
//            }
//            case 'c'-> {
//                int c=123445;
//                int count=0;
//                while(c>0){
//                    int rem=c%10;
//                    if (rem == 4) {
//
//                            count++;
//                    }
//                    c=c/10;
//
//                }
//                System.out.println("The count is:"+count);
//            }
//            default -> System.out.println("Enter Wrong Operation");
//        }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter character");

        char ch = in.next().trim().charAt(0);


        switch(ch){

            case 'A': case 'a':
                System.out.println("Vowel");
                break;
            case 'E': case 'e':

                System.out.println("Vowel");
                break;
            case 'I': case 'i':
                System.out.println("Vowel");
                break;
            case 'O': case 'o':
                System.out.println("Vowel");
                break;
            case 'U': case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not Vowel");
                break;

        }
    }
}
