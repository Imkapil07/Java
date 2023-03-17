/*  
 *******
  *****
   ***
    * 
*/

public class cpq19 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 4 ; i++){
            for(int j = 1 ; j <= i ; j++){ // loop for blank space 
                System.out.print(" ");
            } 
            for(int k = 4 ; k >= i ; k--){ // loop for star pattern
                System.out.print("*");
            } 
            for(int l = 3 ; l >= i ; l-- ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
