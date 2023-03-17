// Isme chck krna hai ki x element kitni br presen hai ... given array element main -->
import java.util.*;
public class arrCountOccurence {
    static int countOcc(int[] arr , int x){
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                count++;
            }
        } 
        return count++;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array :");
        int n = sc.nextInt(); 

        int[] arr = new int[n];
        System.out.print("Enter array elements :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        } 
       
        System.out.print("Enter value of x :");
        int x = sc.nextInt(); 

        System.out.print(countOcc(arr , x));
    }
}
