import java.util.Scanner;
public class factofnum {

public static void main(String args[]) {
 
 Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       int ans = 1;
       if(n==0){
           System.out.println(ans);
       }
       else if(n<0){
           System.out.println("Error");
       }
       else{
           for(int i=2; i<=n; i++){
               ans*=i;
           }
           System.out.println(ans);
    }
   }
}