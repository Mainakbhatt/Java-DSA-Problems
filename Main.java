/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
public class Main

{
    public static void main(String [] args){
        
        int [] arr ={5,3,4,1,2};
        insertion(arr);
        System.out.print(Arrays.toString(arr));
    }
        
        static void insertion(int [] arr){
            
            for (int i =0;i<=arr.length-2;i++){
                for(int j = i+1;j>0;j--){
                    
                    if(arr[j]<arr[j-1]){
                        swap(arr,j,j-1);
                    }
                }
            }
        }
        
        static void swap(int [] arr,int f,int s){
            int temp = arr[f];
            arr[f] = arr[s];
            arr[s]= temp;
        }
}
