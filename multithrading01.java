public class multithrading01 implements Runnable {  

    public void run(){
        System.out.println("Thread Created");
    } 
    public static void main(String[] args) {
        multithrading01 t = new multithrading01();
        Thread sc = new Thread(t);
        sc.start();
    }
}
