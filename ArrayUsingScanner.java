import java.util.Scanner;

public class ArrayUsingScanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n= sc.nextInt();
        int marks[]= new int[n];
        System.out.println("Enter Elements");
        for (int i=0;i< marks.length;i++)
        {
            marks[i]= sc.nextInt();
        }
        System.out.println("Marks of Students Are");
        for (int i=0;i< marks.length;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
