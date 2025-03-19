package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileinputStreamEx4 {

    public static void main(String[] args) {

        int data = 0;
        byte b[] = new byte[1024];
        // try-with-resource : finally 애서 지원하는
        try (FileInputStream fis = new FileInputStream("c:/temp/Free.jpg");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("c:/temp/output1.jpg");
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            while ((data = fis.read(b)) != -1) {
                // char ch = (char) data;
                // System.out.print(ch);
                fos.write(b);
            }
            bos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
