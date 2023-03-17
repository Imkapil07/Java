public class stringSplitString {
    public static void main(String[] args) {
        String s1 = "My family is my first priority";
        System.out.println("String before a split : \n" + s1 );
        String[] word = s1.split(" ");
        System.out.println("String after a split : ");
        for(String w : word){
            System.out.println(w);
        }
    }
}
