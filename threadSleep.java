public class threadSleep{ 
    public static void main(String[] args) throws Exception {
         for(int i = 1 ; i <= 5 ; i++ ){
            Thread.sleep(4000); 
            System.out.println(i);
         }
    }
    
}
