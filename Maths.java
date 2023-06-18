class Square{

    int num1;
    public int square(int a)
    {
        num1=a;
        return a*a;
    }
}

public class Maths{
    public static void main(String args[])
    {
       Sum s1 = new Sum();
       System.out.println(s1.square(10));
       System.out.println(s1.sum(10,20));
    }

}
