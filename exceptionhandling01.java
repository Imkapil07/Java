import java.util.*;
class YoungerAgeException extends RuntimeException{
        YoungerAgeException(String msg){
           super(msg);
        }
}
public class exceptionhandling01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter age"); 
        int age = sc.nextInt();
        try{
            if(age < 18){
                throw new YoungerAgeException("You are not eligible");
            } 
            else 
              System.out.println("you are eligible");
        }
            catch (YoungerAgeException e) {
               e.printStackTrace();
            } 
            System.out.println("Hello World");
        }
    }

