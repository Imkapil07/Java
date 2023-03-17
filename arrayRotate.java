import java.util.* ;
import java.io.*; 
class arrayRotate {

public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter array size :");
       int n = sc.nextInt(); // 8
       System.out.print("Enter array Elements :");
       int arr[] = new int[n]; // 7 5 2 11 2 43 1 1 
       
       for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
       }
       
       System.out.print("Enter value of K (Value jaha se rotate karna hai-->): ");
       int k = sc.nextInt(); // 2 // Value jaha se rotate karna hai-->
       for(int i=k; i<n; i++){
           System.out.print(arr[i]+" "); // 2 11 2 43 1 1 // Ye index value se print krenga end tak
       }
       for(int i=0; i<k; i++){
           System.out.print(arr[i]+" "); // 7 5 //or ye vo value print krwyenga jo reh jayenge uske aage
       }
 
}
}