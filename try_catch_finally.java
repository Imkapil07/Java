import java.util.*;
public class try_catch_finally {
    
    public static void main( String [] args){  
        Scanner obj = new Scanner(System.in);
        int a , b ; 
        System.out.println("Enter Value of a and b : ");
        a = obj.nextInt();
        b = obj.nextInt();
        try { 
            int error = a/b;   
            System.out.println("Statement in Try block ->");
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception : "+e.getMessage());
        } 
        finally 
        {
            System.out.println("End --> Here");
        } 
    }
}
