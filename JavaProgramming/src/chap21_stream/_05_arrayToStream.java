package chap21_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_arrayToStream {
    public static void main(String[] args) {
        int[] intArr = new int[10];

        for (int i = 0; i < 10; i++) {
            intArr[i] = (int) (Math.random() * 10) + 1;
            System.out.println(intArr[i] + ", ");
        }
                              //IntStream.of(intArr);
        IntStream intStream = Arrays.stream(intArr);

        //5이상인 값들만 스트림으로 만들기
        IntStream fiveStream = intStream.filter(a -> a >= 5);

        //* 4 새로운 스트림 만들기
        IntStream fourStream = fiveStream.map(num -> {
            int result = 0;
            result= num * 4;
            return result;
        });

        fourStream.forEach(num -> System.out.println(num + ", "));

//        Arrays.stream(intArr)
//                .filter(num -> num >= 5)
//                .map(num -> num * 4)
//                .forEach(num -> System.out.println(num + ", "));
    }
}
