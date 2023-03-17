// Paramid Pattern--> 
/* 
              *
             ***
            *****
           *******
 */
public class cpq18 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 4 ; i++){
            for(int j = 4 ; j >= i ; j--){ // loop for blank space 
                System.out.print(" ");
            } 
            for(int k = 1 ; k <= i ; k++){ // loop for star pattern
                System.out.print("*");
            }  
            for(int l = 2 ; l <= i ; l++){
                 System.out.print("*"); 
            } 
            System.out.println();
        }
    }
}
