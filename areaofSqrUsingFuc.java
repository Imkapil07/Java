import java.util.*;
public class areaofSqrUsingFuc {
    static int areaofsqr(int side){
        int area = side * side ;
        return area ;
     }
    
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          int side = sc.nextInt();
          System.out.println(areaofsqr(side));
        }
}
