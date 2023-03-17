package fileheadling;

import java.io.*;

public class displayfileinformation {
    public static void main(String [] args) throws IOException {
        File f = new File("D:\\JAVA\\fileheadling\\file1.txt"); 
        if(f.exists()){
        System.out.println(" File Name :" +f.getName()); //  getName Use for the getting Name of the file -->
        System.out.println("File Location :" +f.getAbsolutePath()); // getAbsolutePath use for the getting address of the following -->
        System.out.println("File Writable :" +f.canWrite()); // use for check we write or not in the file -->  
        System.out.println("File Readable :" +f.canRead()); // use for file is readable or not -->
        System.out.println("File size :"+ f.length()); // check length of the file 
        // by using f.delete() we ca delete the data
         }
      else 
        {
            System.out.println("File Doesn't Exists ");
        } 
    }
}
