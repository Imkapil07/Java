import java.util.*;
public class arraySortedOrNot { 
  
    static boolean isSorted(int[] arr){
        boolean check = true;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] < arr[i-1]){
                //not Sorted..
                check = false ;
                break;
            }
        } 
        return check ;
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array size :");
        int n = sc.nextInt(); 
        System.out.println("Enter array element :");
        int[] brr = new int[n];
        for(int i = 0 ; i < brr.length ; i++){
         brr[i] = sc.nextInt();
        }
   System.out.print("Is Sorted : " + isSorted(brr));
    }
}
