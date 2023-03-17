
import java.util.* ;
    public class findpowerofnum {
public static void main(String args[]) {
 
 Scanner sc = new Scanner(System.in);
       int base = sc.nextInt();
       int power = sc.nextInt();
       int ans = 1;
       
       if(power==0){
           System.out.println(ans);
       }
       else{
           for(int i=1; i<=power; i++){
               ans*=base;
           }
           System.out.println(ans);
           }
       }
    } 
