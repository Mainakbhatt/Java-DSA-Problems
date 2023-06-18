import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of classes");
        int row=sc.nextInt();
        System.out.println("Enter number of students ");
        int columns=sc.nextInt();

        sc.nextLine();
        String name[][]=new String[row][columns];

        System.out.println("Enter names");

        for (int i=0;i< name.length;i++)
        {
            for (int j=0;j<name[i].length;j++)
            {
                name[i][j]=sc.nextLine();
            }
        }
        for (int i=0;i< name.length;i++)
        {
            for(int j=0;j< name[i].length;j++)
            {
                System.out.println(name[i][j]);
            }
        }

    }
}
