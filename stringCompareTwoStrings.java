import java.util.*;
public class stringCompareTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String 1st :");
        String s1 = sc.nextLine();
        System.out.print("Enter a Strinf 2nd :");
        String s2 = sc.nextLine();

       if(s1.compareTo(s2) > 0)

          System.out.println("first string is greather than second.");

       else if(s1.compareTo(s2) < 0)

          System.err.println("First string is smaller than second.");

        else 

          System.out.println("Both string are equal.");
    }
}
