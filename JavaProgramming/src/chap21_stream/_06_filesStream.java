package chap21_stream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class _06_filesStream {
    public static void main(String[] args) {
        //hyunadaicar.txt의 경로(path)객체 얻기
        try {
            Path path = Paths.get(_06_filesStream.class.getResource("hyundaicar.txt").toURI());
            Stream<String> fileStream = Files.lines (path, Charset.defaultCharset());
fileStream.forEach(l -> System.out.println(l));

        } catch (URISyntaxException ue) {
            throw new RuntimeException(ue);
        } catch (IOException ie) {
            throw new RuntimeException(ie);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        //files.lines() => 텍스트 파일을 행응로 분리해서 행들의 스트림을 만들어준다.


    }
}
