import java.util.*;
public class numPrimeorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num :");
        int num = sc.nextInt();
        int temp = 0 ; // use for avoid print statement again and again ---->

        for(int i = 2 ; i <= num-1 ; i++){
            if(num%i==0){   // like if(7%2==0)--->
                temp = temp + 1 ;
            } 
        }
            if(temp>0){
                System.out.print("Not a prime num");
            } else
            {
                System.out.print("Is a prime num");
            }
        }
    }

// Or..... 

/*import java.util.*;
public class numPrimeorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num :");
        int num = sc.nextInt();
        int temp = 0 ;

        for(int i = 2 ; i <= num-1 ; i++){
            if(num%i==0){
                temp = temp + 1 ;
            } 
        }
            if(temp==0){
                System.out.print("Is a prime num");
            } else
            {
                System.out.print("Not a prime num");
            }
        }
    }*/
