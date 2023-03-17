import java.util.*;
public class array01 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        //USING FOR LOOP -->

        System.out.print("Enter size of array Elements : ");
        int n = sc.nextInt(); 
        System.out.print("Enter Array Elements : ");
        int arr[] = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
          arr[i] = sc.nextInt();
        }  
        System.out.print("Elements are :");
        for(int i = 0 ; i < arr.length ; i++ ){
          System.out.print(" "+arr[i]+" ");
        } 
        System.out.println();
        // USING FOR EACH LOOP -->
        
        System.out.print("Enter the elements :");
        int [ ] arr1 = new int [n];
        for(int a = 0 ; a < arr1.length ; a++){
            arr1[a] = sc.nextInt();
        }
        for (int j : arr1){
          System.out.println(j + " ");
        }
    }
  }
