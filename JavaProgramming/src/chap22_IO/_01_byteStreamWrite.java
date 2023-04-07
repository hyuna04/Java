package chap22_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class _01_byteStreamWrite {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("D:/JavaLec/JavaProgramming/ex01.txt");

            OutputStreamWriter ows = new OutputStreamWriter(os, Charset.forName("utf-8"));

            //1. byte를 1byte씩 출력
            String str = "Hello";
            int num1 = -128;
            int num2 = 127;
            int num3 = 0;

            os.write(num1);
            os.write(num2);
            os.write(num3);

            //2. 버퍼 비워주기
            os.flush();
            //3. 스트림 메모리에서 해제
            os.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
