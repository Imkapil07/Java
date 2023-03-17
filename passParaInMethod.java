public class passParaInMethod {
    public static void para(int x , int y){
        x++ ;
        y = y + 2 ;
        System.out.println(x + " " + y);
    }
    public static void main(String[] args) {
        int a = 10 ; 
        int b = 20 ;
        para(a, b);

        System.out.print(a + " " + b);
    }
}
