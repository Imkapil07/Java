import java.util.*;
public class trycatch{
    public static void main( String [] args){ 
        try { 
            int error = 10/0; 
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception : "+e.getMessage());
        }
    }
}