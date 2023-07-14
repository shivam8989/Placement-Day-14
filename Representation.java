package TwoDarray;
import java.util.*;
public class Representation {
    public static void  search(int arr[][],int z){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
               if(arr[i][j]==z){
                   System.out.println(i+","+j);

               }
            }
        }
        System.out.println("Key Not Found");
    }
    public static void main(String args[]){
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                arr [i][j] = sc.nextInt();
            }
        }
        search(arr,3);
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
