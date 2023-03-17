import java.util.*;
public class trycatchhh{ 
    public static void main(String [] args) {
    
 Scanner obj = new Scanner(System.in);
 System.out.println("Enter two values : ");
 int a = obj.nextInt();
 int b = obj.nextInt();
try {
  int c = a / b ; 
  System.out.print("Division of 2 no. = "+c);  
} catch (ArithmeticException e) {
    System.out.println("Not divisible by 0");  
    }
  }
}