public class constructorOverloading {
    int id ;
    String name ; 
    int age ;
    constructorOverloading(int i , String n){ 
    id = i ;
    name = n ; 
    }   
    constructorOverloading(int i , String n , int a){ 
        id = i ;
        name = n ;
        age = a ;
    }
    public void disply(){
        System.out.println(id + " " + name + " " + age);
    } 
    public static void main(String[] args) {
        constructorOverloading s1 = new constructorOverloading(12,"Kapil");
        constructorOverloading s2 = new constructorOverloading(123,"sachin", 25);
        s1.disply();
        s2.disply();
    }
}
