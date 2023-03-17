/* Progrm to find the total number of pairs in the arrays whose sum 
 * is equal to given value x 
 */ 
import java.util.*;
public class arrayTotalNumberOfPair {
    static int pairSum(int[] arr , int target){
        int n = arr.length;
        int ans = 0 ; 

        for(int i = 0 ; i < n ; i++){ // for First number 
            for(int j = i + 1 ; j < n ; j++){ // for second number
                   if(arr[i] + arr[j] == target){
                    ans++;
                   }
            }
        } 
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :");
        int n = sc.nextInt(); 

        System.out.print("Enter array element :");
        int arr[ ] = new int[n]; 
        for(int i = 0 ; i < arr.length ; i++){
             arr[i] = sc.nextInt();
        } 
        
        System.out.print("Enter target sum :");
        int target = sc.nextInt(); 

        System.out.print(pairSum(arr, target));
    }
}
