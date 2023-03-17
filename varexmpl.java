// Variable type :
public class varexmpl { 
    int a = 10; // instance variable 
    static int b =20 ; // static variable 
     public static void main(String[] args) {
        int c = 30;
        varexmpl ob1 = new varexmpl(); // Object one 
        System.out.println(ob1.a); //10
        System.out.println(ob1.b); //20
        System.out.println(c);  //30

        //Change the values 
        ob1.a = 1000; 
        ob1.b = 2000;
        c = 3000 ;
        System.out.println(ob1.a); //1000
        System.out.println(ob1.b); //2000
        System.out.println(c); //3000 

        // Create a another object
        varexmpl ob2 = new varexmpl(); // Object one 
        System.out.println(ob2.a); //10 --> Instance var initilz again
        System.out.println(ob2.b); //2000 --> Static var not initilz.
        System.out.println(c);  //3000 --> Its is also.
    }
}
    
