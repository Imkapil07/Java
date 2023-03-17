//TAKE INPORRT FORM THE USER  

 import java.util.*;
 public class stringreverse {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a String :");
      String name = sc.nextLine();
      int lang = name.length(); 
      String rev = " ";
      for(int i = lang - 1 ; i >=0 ; i--){
            rev = rev + name.charAt(i);
      } 
      System.out.print(" The reverse of " + name + " is " +rev);
  }
} 

/*public class stringreverse {
    public static void main(String[] args) {
        String  name = "kapil";
        int lang = name.length(); 
        String rev = " ";
        for(int i = lang - 1 ; i >=0 ; i--){
              rev = rev + name.charAt(i);
        } 
        System.out.print(" The reverse of " + name + " is " +rev);
    }
} */

/*import java.util.*;
class ReverseString
{
  public static void main(String args[])
  {
    String original, reverse = "";
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a string to reverse");
    original = in.nextLine();

    int length = original.length();

    for (int i = length - 1 ; i >= 0 ; i--)
      reverse = reverse + original.charAt(i);

    System.out.println("Reverse of the string: " + reverse);
  }
}
 */