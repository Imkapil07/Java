import java.util.*;
public class array2D {
   public static void main(String[] args) {
    
        /* int[ ][ ] arr = {{2 , 5}, { 4, 0}, {9 , 1}};

       for(int i = 0 ; i < 3 ; i++){ // Loop for Rows-->
        for(int j = 0 ; j < 2 ; j++){ // Loop for columns-->
                     System.out.println("arr[" + i + "] [" + j + "] = "+ arr[i][j]);
        }
       }  */

         Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number of Rows :");
       int n = sc.nextInt(); 
       System.out.print("Enter a number of columns :");
       int m = sc.nextInt();
     
    System.out.print("Enter the Elements :");
        int[][] arr = new int[n][m];
        for(int i = 0 ; i < n ; i++){ // Loop for Rows-->
            for(int j = 0 ; j < m ; j++){ 
                arr[i][j] = sc.nextInt();
          }
       } 
       for(int i = 0 ; i < n ; i++){ // Loop for Rows-->
        for(int j = 0 ; j < m ; j++){ // Loop for columns-->
                     System.out.print(arr[i][j]+" ");
        } 
        System.out.println();
      } 
   }
}
