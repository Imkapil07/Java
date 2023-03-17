// Write a data on a file
package fileheadling;

import java.io.FileWriter;
import java.io.IOException;

public class writeinfile {
    public static void main(String [] args) throws IOException {
        FileWriter f = new FileWriter("D:\\JAVA\\fileheadling\\file2.txt");  
        f.write("Hello Kapil In Coding World :");
        f.close();
        System.out.println("Succesfully Data Wrote in file--->:");
    }
}
