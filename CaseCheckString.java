package Dsa_pratice;

import java.util.Scanner;

public class CaseCheckString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter String");

        char s= in.next().trim().charAt(0);

        if (s>='a'&& s<='z') {
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }
    }
}
