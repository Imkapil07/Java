public class stringReplacestrwithotherstr {
    public static void main(String[] args) {
        String s1 = "My name is kapil rai. My fathers name is Mr. Shivnarayan rai";
        String replaceString = s1.replaceAll("rai", "kalar");
        System.out.println("Before replace" + s1);
        System.out.print("After replace" + replaceString);

    }
}
