import java.util.Arrays;
import java.util.*;
public class arrayaReturnTypeArray {
     static int[] smallestAndLargest(int[] arr){
       Arrays.sort(arr);
       int[] ans = {arr[0], arr[arr.length-1]};
       return ans ;
     } // wrong code 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array size :");
        int n = sc.nextInt(); 
        System.out.println("Enter array element :");
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
         arr[i] = sc.nextInt();
        } 
        int[] ans = smallestAndLargest(arr);

         System.out.println("Smallest : " + arr[0]);
         System.out.println("largest : " + arr[1]);

    }
}
