import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        int number;

    /*    for (int i = 0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/
        for(int i=0;i<num;i++)
        {
            number=1;

            for (int j=0;j<=i;j++)
            {
                System.out.print(number+" ");
                number++;
            }

            System.out.println();
        }


    }
}
