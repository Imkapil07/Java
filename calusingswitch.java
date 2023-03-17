import java.util.*;
public class calusingswitch {
     public static void main(String[] args) { 
        System.out.println("************************************************************************************************************************************************");
        System.out.println("**SIMPLE CALCULATOR USING SWITCH**");
        String yn ;

   do 
     {
      Scanner obj = new Scanner(System.in);
      System.out.print("Enter First Value :");  
      int num1 = obj.nextInt();
      System.out.print("Enter Second Value :");  
      int num2 = obj.nextInt(); 

      System.out.print("Select Symbol (+-*/%) :");
      String st = obj.next(); 

      int ans;
      
      switch(st)
      {
           case "+" :
           ans = num1 + num2 ;
           System.out.println("Addittion is :" +ans);
           break;

           case "-" :
           ans = num1 - num2 ;
           System.out.println("Subtraction is :" +ans);
           break;

           case "*" :
           ans = num1 * num2 ;
           System.out.println("Multiplication is :" +ans);
           break;

           case "/" :
           ans = num1 / num2 ;
           System.out.println("Division is :" +ans);
           break;

           case "%" :
           ans = num1 % num2 ;
           System.out.println("Mode is :" +ans);
           break;
            
           
           default :
           System.out.println("Invaild Symbol"); 

          } 
          System.out.print("Do you want to continue (Press y for Yes and n for No) :");
          yn = obj.next();
          System.out.println("************************************************************************************************************************************************");
        } while(yn.equals("y") || yn.equals("Y"));
     }
}
