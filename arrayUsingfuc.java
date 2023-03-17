import java.util.*;
public class arrayUsingfuc {
    public  static void arrFuc(int arr[ ]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(" "+ arr[i]);
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[ ] = new int[n]; 
        for(int i = 0 ; i < arr.length ; i++){
             arr[i] = sc.nextInt();
        } 
        arrFuc(arr);

    }

}
