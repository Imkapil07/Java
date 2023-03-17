/* 
        *
       **
      ***
     ****
      ***
       **
        * 
 
*/

public class cpq16 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 4 ; i++){
            for(int j = 3 ; j >= i ; j--){ // loop for blank space 
                System.out.print(" ");
            } 
            for(int k = 1 ; k <= i ; k++){ // loop for star pattern
                System.out.print("*");
            } 
            System.out.println();
        }

        for(int i = 1 ; i <= 4 ; i++){
            for(int j = 1 ; j <= i ; j++){ // loop for blank space 
                System.out.print(" ");
            } 
            for(int k = 3 ; k >= i ; k--){ // loop for star pattern
                System.out.print("*");
            } 
            System.out.println();
         }
     }
  }