package chap22_IO;

import java.io.*;

public class _08_byteStreamToCharStream {
    public static void main(String[] args) {
//asdasd
    }

    public static void writer(String str) throws FileNotFoundException {
        try{
            OutputStream os = new FileOutputStream("" + "D:\\Java\\wr01.txt");

        //OutputStreamWriter 를 이용해서
            //바이트 스트림 -> 문자스트림으로 변환
            Writer writer = new OutputStreamWriter(os, "UTF-8");

            writer.write(str);

            writer.flush();
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //InputStreamReader 를 이용해서
    //바이트 스트림 -> 문자 스트림으로 변환해주는 메소드
    public static String read() {
        try {
            InputStream is = new FileInputStream("" + "D:\\Java\\wr01.txt");

            //문자스트림으로 변환
        Reader reader = new InputStreamReader(is);

        char[] chArr = new char[4096];

        String returnStr = "";

        while (true) {
            int cnt = reader.read(chArr);

        if(cnt == -1) {
            break;
        }

            for (int i = 0; i < cnt; i++) {
                returnStr = returnStr +
                String.valueOf(chArr[i]);
            }
        }

        return returnStr;
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return null;
    }

}
