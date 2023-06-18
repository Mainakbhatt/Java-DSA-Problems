package Dsa_pratice;

public class DSA_NumberofdigitsinElement {
    public static void main(String [] args){
        int [] arr={142,23,4,54,66,767,88};
        int ans=findnumbers(arr);
        System.out.println(ans);

    }
    static int findnumbers(int [] nums){
        int count=0;
        for (int num:
             nums){

            {
                if (even(num)) {
                    count++;
                }
            }
        }
        return count;

    }

    static boolean even(int num) {

        int digit=digit(num);
        return digit % 2 == 0;

    }
    static int digit(int num){
        int count=0;
        while (num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
