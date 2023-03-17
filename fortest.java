/*import java.util.Scanner;
public class fortest { /
       int a = 10 ;
      int b = 20 ; 
        public void Ajay(){
          System.out.println(" "+b);
        }
      public void Kapil(){
        System.out.println(" "+a);
      } 
     public static void mian(String []args) {
      System.out.println("hello world "); 
      fortest obj = new fortest();
      obj.Ajay();
     }

    }


class fortest{
  public static void main(String[] args) {
    String name = "\"Zindgi na milengi dooobara\"";
    System.out.print(name);
  }
} 

import java.util.*;;
class fortest{
  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt(); 
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b); 
    System.out.println(a/b);

   }
} 


import java.util.*;
class fortest{
  static int areaofsqr(int side){
    int area = side * side ;
    return area ; }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int side = sc.nextInt();
      System.out.println(areaofsqr(side));
    }
  } 
  


  import java.util.*;
  class fortest{
    static int areaofREct(int lenght , int breadth){
      int area = lenght * breadth ;
      return area ;
    } 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int rect = areaofREct(a ,  b);
      System.out.print(rect);
    }
  }



import java.util.*;

public class fortest{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0 ; i < arr.length ; i++){
      arr[i] = sc.nextInt();
    } 
    for(int i = 0 ; i < arr.length ; i++ ){
      System.out.print(" "+arr[i]);
    }
  }
}*/ 

import java.util.*; 
 public class fortest{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();  
    System.out.println("===================================================================================");
    System.out.println("|Serial No.| Student Name | Enrolment No.|");
    for(int i = 0 ; i < n ; i++){
      System.out.println("| " + i + "| KAPIL RAI    | LNCBBTCSE056 |" );
    }
  }
 }