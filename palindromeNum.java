import java.util.*;
public class palindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num : ");
        int num = sc.nextInt();
        int temp = num ;
        int rev = 0 , rem ; 

        while(temp != 0){
            rem = temp % 10 ;
            rev = rev * 10 + rem ;
            temp = temp / 10 ;
        }
        if(num==rev){
            System.out.println(num+ " Is a palindrome num ");
        } 
        else{
            System.out.println(num+ " Not a palindrome num ");
        }
    }
}
