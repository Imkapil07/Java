import java.util.*;
public class areaofRectUsingFuc {
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
