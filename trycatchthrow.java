public class trycatchthrow {
    public static void main( String [] args){  
    
        try {  
            int error = 10; 
            throw new ArithmeticException("Invaild");  
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception : "+e.getMessage());
        } 
    }
} 

