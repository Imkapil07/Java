public class constructor { 
    int id ;
    String name ; 
    constructor(int i , String n){ 
    id = i ;
    name = n ; 
    } 
    public void disply(){
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        constructor sc = new constructor(10, "Kapil");
        sc.disply();
    }
}
