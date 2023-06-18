public class Array_Loop {

    public static void main(String[] args) {


        int marks[] = new int[5];
        marks[0] = 55;
        marks[1] = 60;
        marks[2] = 61;
        marks[3] = 65;
        marks[4] = 70;

        System.out.println("The marks of the Student are:");

        for (int i=0;i< marks.length-1;i++)
        {
            System.out.println("The marks are:"+marks[i]);
        }
    }
}