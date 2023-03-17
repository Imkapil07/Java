// read a file data
package fileheadling;

import java.io.FileReader;
import java.io.IOException;

public class readatextfromafile { 
    public static void main(String[] args) throws IOException {
        FileReader r = new FileReader("D:\\JAVA\\fileheadling\\file2.txt");   
       int i;
       while((i=r.read())!= -1){
        System.out.print((char)i);
       }
        r.close();
    }
    
}
