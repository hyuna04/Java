package _0406_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class HW01 {
    public static void main(String[] args) {

//1.1. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여
// 문자열의 길이가 5이상인 문자열만 출력하세요.

        Scanner scanner = new Scanner(System.in); //사용자 입력값

        List<String> stringList = new ArrayList<>();

        //사용자로부터 입력한 값 10개 List에 대입
        for (int i = 0; i < 10; i++) {
            System.out.print("문자열을 입력해주세요");
            String a = scanner.nextLine();
            stringList.add(a);
        }

        //stream 생성.
        Stream<String> stringStream = stringList.stream();

        //stream을 받아서, 필터링한 stream을 새로 생성.
        Stream<String> fs = stringStream.filter(c -> c.length() >= 5);


        //필터링한 Stream을 출력하기.
        fs.forEach(t -> System.out.println(t));



    }

}
