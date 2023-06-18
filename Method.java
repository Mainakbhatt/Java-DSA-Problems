import java.util.Scanner;
class Method {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.println("Enter String");
        String str=sc.nextLine();
        int multi=n*2;
        System.out.print(""+multi);
        System.out.print(""+str);

    }
}
