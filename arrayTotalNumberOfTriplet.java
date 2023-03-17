import java.util.*;
public class arrayTotalNumberOfTriplet {
    static int tripletSum(int[] arr , int target){
           int n = arr.length ; 
           int ans = 0 ;

           for(int i = 0 ; i < n ; i++){ // first number 
            for(int j = i + 1 ; j < n ; j++ ){ // second number 
                for(int k = j + 1 ; k < n ; k++){ // third number 
                      if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                      }
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

        System.out.print(tripletSum(arr, target));
    }
}
