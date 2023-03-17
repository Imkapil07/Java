import java.util.*;
import java.io.*;   
public class printdivisorofnum { 
    public void printDivisor(int n){   
        for(int i=1;i<=n;i++){  
            if(n%i==0){  
                System.out.print(i+" ");
            }
        } 
    } 
    public static void main(String args[]) {  
        printdivisorofnum obj = new printdivisorofnum(); 
        Scanner sc =  new Scanner(System.in);  
        int n = sc.nextInt();
        obj.printDivisor(n); 
    } 
}