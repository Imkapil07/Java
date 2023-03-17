import java.net.PortUnreachableException;

//Overloading By chaining the no. of argument -->
public class methodOverloading {
    public static int add(int num1 , int num2 ){
        return num1 + num2 ;
    } 

   public static int add(int num1 , int num2 , int num3){
    return num1 + num2 + num3 ;
   }  

   public static void main(String[] args) {
    int sumOftwoNumbers = methodOverloading.add(10, 20);
    int sumOfthreeNumbers = methodOverloading.add(10, 20, 30);

    System.out.println(sumOftwoNumbers);
    System.out.println(sumOfthreeNumbers);
    }
}
