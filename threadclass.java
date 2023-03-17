public class threadclass extends Thread {  

    public void run() {
        System.out.println("Thread Create");
    }
  public static void main(String[] args) {
    threadclass sc = new threadclass();
    sc.start();
  }    
}
