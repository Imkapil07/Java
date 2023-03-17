public class fibSeriesUsingRecur {
    static int a = 0 , b = 1 , c ;
    public static void main(String[] args) {
        System.out.print(a+" "+b);
       fibSeriesUsingRecur ob1 = new fibSeriesUsingRecur();
        ob1.printfib(10);
    } 
    void printfib(int i){
        if(i>=1){
        c = a + b ;
        System.out.print(" "+c);
        a = b ; 
        b = c ;  
        printfib(i-1);
        }
    }
}
