import java.util.*;
class arrayDemo{
     public static void main(String[] args) {
        int[] a = new int[0];  // it is run successfully-->
        
        /*if we proved negative size of value 
        int[] b = new int[-3]; // java.lang.NegativeArraySizeException */

        //Using For Loop-->
        int[] b = { 10 , 20 , 30};
        for(int i = 0 ; i < 3 ; i++){
            System.out.print(b[i] + " ");
        } 

        //Using for Each Loop-->
        int[] c = { 10 , 20 , 30};
        for(int j : c ){
            System.out.print(j + " ");
        }
     
     }
}