
import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cgpa to convert:");
        float nm= sc.nextFloat();

        for(float i = nm;i<10;i++)
        {
            float result = (float) (i * 9.5);
            System.out.println("Cgpa is:" +result);
        }
    }
}
