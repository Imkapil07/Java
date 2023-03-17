public class string01 {
    public static void main(String[] args) {
        
        String str = "Coding Ninjas";
        System.out.println(" Lenght of String :"+ str.length()); // chck length
        System.out.println("Index of character 'i' : " + str.indexOf('i')); // chck index of given char
        System.out.println("Contain sequence ing: " + str.contains("ing")); // ye chck krenga ki ye charater sequence present h ya nhi string m
        System.out.println("Contain sequence ing: " + str.contains("ign")); // ye sirf true false m ans dete hai
        System.out.println("String ends with s: " + str.endsWith("s")); // ye chck krenga ki given charater se string value end ho rhi h ya nhi;
        System.out.println("Convert to Lowercase: " + str.toLowerCase());
        System.out.println("Convert to UpperCase: " + str.toUpperCase());
        
        //compare two string -->
        String s1 = "Kapil";
        String s2 = "Sachin";
        System.out.println(s1.compareTo(s2));  

        //rough work
        String name ="kapil";
        System.out.println(name.substring(3,4)); 

        String s = new String("Kapil");
        System.out.println(s);
       
    }
}
