// LOGIC 
 /*   A  |   B    | A | B 
  *   0       0     0
      0       1     1
      1       0     1
      1       1     1   


      Given 12 and 25 
      so first Convert 12 into Binary 11000 
                    &  25 into Binary 11001

  */
  import java.util.Scanner;
  public class bitwiseOR {
      public static void main(String [ ] args ){
          int a , b ; 
          Scanner sc = new Scanner(System.in); 
          System.out.println("Enter the Value Of a nd b"); 
          a = sc.nextInt();
          b = sc.nextInt();
          System.out.println(a | b);
     }
  }
  