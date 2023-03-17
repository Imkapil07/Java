import java.util.*;
public class threadSleep01 extends Thread{
    public void run(){
        for(int i = 1 ; i <= 5 ; i++){
            try{
                Thread.sleep(1000);
            } 
            catch(Exception e){
                System.out.println(e);
            } 
            System.out.println(i);
        }
    } 
    public static void main(String[] args) {
        threadSleep t = new threadSleep();
        
    }
}
