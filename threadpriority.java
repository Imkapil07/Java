public class threadpriority extends Thread { 
    public void run(){
        System.out.println("Inside Run() Method");      
    }
   public static void main(String[] args) {
    threadclass t1 = new threadclass();
    threadclass t2 = new threadclass(); 
    threadclass t3 = new threadclass();  

    System.out.println("Priority of thread 1 " +t1.getPriority());
    System.out.println("Priority of thread 2 " +t2.getPriority());
    System.out.println("Priority of thread 3 " +t3.getPriority()); 

    t1.setPriority(6); 
    t2.setPriority(3); 
    t3.setPriority(9); 

    System.out.println("Priority of thread 1 is :" +t1.getPriority());
    System.out.println("Priority of thread 2 is :" +t2.getPriority());
    System.out.println("Priority of thread 3 is :" +t3.getPriority()); 
   }
}
