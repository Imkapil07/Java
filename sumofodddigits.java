 import java.util.*;
public class sumofodddigits { 
    public static void main(String [] args) {
        
    int n = 933; 
    int sum = 0 ;   
     
    while(n!=0) {  
     int  b = n % 10 ;  
     if(b%2==1){
      sum = sum + b;
        } 
       n = n / 10 ; 
     }
     System.out.println(sum); 
  }  
}

