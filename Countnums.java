package Dsa_pratice;

public class Countnums {
    public static void main(String[] args) {
        long n=113244434355l;

        int count=0;
        while (n>0)
        {
            long rem= n%10;
            if (rem== 4)
            {
                count++;
            }
            n=n/10;

        }

        System.out.println(count);
    }
}
