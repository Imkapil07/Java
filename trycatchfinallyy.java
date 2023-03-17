import java.util.*;
    public class trycatchfinallyy { 
    public static void main(String [] args) {
    
 Scanner obj = new Scanner(System.in);
 System.out.println("Enter two values : ");
 int a = obj.nextInt();
 int b = obj.nextInt();
try {
  int c = a / b ; 
  System.out.println("Division of 2 no. = "+c);  
} catch (ArithmeticException e) {
    System.out.println("Not divisible by 0");  
    } 
    finally{
        System.out.println(" finally");
    }
  }
}
