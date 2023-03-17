//In this Program Agar 2 same elemnet fash Gye to vo phela bale element ka index print krnega -->

import java.util.Scanner;
class arrayFindXelement {
     public static int firstIndex(int arr[],int n,int x){
       for(int i=0; i<n; i++){
           if(arr[i]==x){
               return i;
           }
       }
       return -1;
   }
       public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Size of Array:");
       int n = sc.nextInt();
       
       System.out.print("Enter array Element : ");
       int[] arr = new int[n];
       for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
       }
       System.out.print("Enter a Value of X for Searching :");
       int x = sc.nextInt();
       System.out.println(x + " Is Present at Index : " +firstIndex(arr,n,x));
       
 
}
}
