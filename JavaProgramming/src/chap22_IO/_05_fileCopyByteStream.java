package chap22_IO;

import java.io.*;

public class _05_fileCopyByteStream {
    public static void main(String[] args) throws IOException {
        String originFileNm = "D:\\Java\\images\\LinkedList.jpg";
        String copyFileNm = "D:\\Java\\images\\LinkedList.jpg";


            InputStream is =
                    new FileInputStream(originFileNm);
            OutputStream os =
                    new FileOutputStream(copyFileNm);

//            byte[] readData = new byte[1024];
//
//            while (true) {
//                int cnt = is.read(readData);
//
//                if(cnt == -1) {
//                    break;
//                }
//
//                os.write(readData);
//            }
            //java9부터 transferTo 메소드가 생겼다
            is.transferTo(os);

            os.flush();

            is.close();
            os.close();

    }
}
