import java.util.Scanner;

public class Cont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        sc.close();
        int countOnes = 0;
        boolean hasZero = false;
        String binaryString = Integer.toBinaryString(n);
        for (int i = 0; i < binaryString.length(); i++) {
            char c = binaryString.charAt(i);
            if (c == '1') {
                countOnes++;
            } else if (c == '0') {
                hasZero = true;
            }
        }
        System.out.println("Number of 1's in binary representation: " + countOnes);
        if (hasZero) {
            System.out.println("The number contains a 0 in its binary representation.");
        } else {
            System.out.println("The number does not contain a 0 in its binary representation.");
        }
    }
}
