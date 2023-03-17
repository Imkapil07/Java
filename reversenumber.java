import java.util.*;
public class reversenumber {
     public static void main(String[] args) {
        int num , reverse = 0 ;  
        System.out.print("Enter a number :");
        Scanner sc = new Scanner(System.in); 
        num = sc.nextInt(); 

        while(num != 0){
            int rem = num % 10; 
            reverse = reverse * 10 + rem ;
            num = num / 10 ; 
        }
       System.out.println("Reverse of number is :" + reverse);
        
    }
}