package filehandling;

import java.io.*;

public class filehandling {

    public static void main(String[] args) {


        File file = new File("/home/vaibhav/workspace/DYPDemo/src/filehandling/FHDemo.txt");
        FileOutputStream fileOutputStream =null;
        try {
            fileOutputStream =  new FileOutputStream(file);
            String s = "Today is 25 March";
            byte[] arr = s.getBytes();
            fileOutputStream.write(arr);
            System.out.println("File write successfully...");

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }


        try {
            FileInputStream fileInputStream = new FileInputStream("FHDemo.txt");
            int i = fileInputStream.read();
            System.out.println(i);
            while (i>0){
                System.out.print((char)i);
                i= fileInputStream.read();
            }

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        System.out.println();
        float f  = 10.8f;

        int i = (int)f;
        System.out.println(i);
    }
}
