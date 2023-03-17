import java.util.Scanner;
public class sumofoddevenseperatly { 
public static void main(String args[]) {
 
    Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
       
       int even=0,odd=0;
       while(n!=0){
           int r = n%10;
           if(r%2==0){
               even+=r;
           }
           else{
               odd += r;
           }
           n/=10;
       }
       System.out.println(even + " " + odd);
}
}