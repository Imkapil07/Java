// MEHTOD OVERLLOADING WITH CHANING THE DATA TYPE OF ARGUMENT 
public class methodOverloading01 {
    public static int add(int num1 , int num2 ){
        return num1 + num2 ;
    } 

   public static double add(double num1 , double num2){
    return num1 + num2 ;
   }  

   public static void main(String[] args) {
    int sumOftwoNumbers = methodOverloading01.add(10, 20);
    double sumOfthreeNumbers = methodOverloading01.add(10.5 , 20.5);

    System.out.println(sumOftwoNumbers);
    System.out.println(sumOfthreeNumbers);
  } 
}
