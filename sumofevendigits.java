import java.util.*;
public class sumofevendigits { 
    public static void main(String [] args) {
        
    int n = 323; 
    int sum = 0 ;   
     
    while(n!=0) {  
     int  b = n % 10 ;  
     if(b%2==0){
      sum = sum + b;
        } 
       n = n / 10 ; 
     }
     System.out.println(sum); 
  }  
}

