package Dsa_pratice;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your salary");

        int salary=sc.nextInt();
//        if (salary>10000){

//            salary=(salary*18)/100;
//        }
//        else {
//            salary=salary+1000;
//        }

//        System.out.println(salary);

        if (salary>10000) {
            salary = (salary * 18) / 100;
        }
            else if (salary>15000){
                salary -= 2500;

            }
            else {
                salary -=1000;
        }
        System.out.println(salary);
    }

}
