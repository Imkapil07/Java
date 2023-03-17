// create a file 
package fileheadling;

import java.io.*;

public class createfile {
    public static void main(String [] args) throws IOException{
        File f = new File("D:\\JAVA\\fileheadling\\file1.txt"); 
        if(f.createNewFile()){
        System.out.println("File Successfully Created :");
        } 
        else 
        {
            System.out.println("File Already Exit :)");
        }
    }
}
