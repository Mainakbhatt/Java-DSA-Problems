package Dsa_pratice;

public class DSA_StringChar {
    public static void main(String [] args){

        String main="MainakBhattacharjee";
        char ch='B';
        System.out.println(search(main,ch));
    }
    static boolean search(String main, char ch) {

        if (main.length()==0){
            return false;
        }
        for (int i = 0; i <main.length() ; i++) {
            if(ch==main.charAt(i));
            return true;
        }
//        for (char ch:main.toCharArray()
//             ) {
//
//        }
        return false;
    }
}
