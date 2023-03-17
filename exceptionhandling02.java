import java.util.*;   
public class exceptionhandling02{
    public static void voting(int age) {
        if(age < 18){
        throw new ArithmeticException("You are not eligible");
        } else {
        System.out.println("You are Eligible");
    }
 } 
         public static void main(String[] args) { 
            Scanner sc = new Scanner(System.in); 
            int n = sc.nextInt();
            voting(n);
            System.out.println("Rest program");
    } 
}

