package chap20_lambda;

import chap20_lambda.clazz.UserCharString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2main {
    public static void main(String[] args) {
        //main
        //List<UserCharString> => 10 개의 스트링 입력
        //char findCh => 사용자 입력
        //사용자가 입력한 ch가 없으면 "", 있으면 그 문자열 그대로 str에 저장

        List<UserCharString> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // 10개의 문자열 입력
        for (int i = 0; i < 10; i++) {
            System.out.print("Input String " + (i + 1) + ": ");
            String input = sc.nextLine();
            list.add(new UserCharString(input));
        }

        // 사용자 입력 문자 받기
        System.out.print("Input character: ");
        char ch = sc.next().charAt(0);

        // 리스트에서 ch가 존재하는 문자열 출력
        for (UserCharString userCharString : list) {
            userCharString.changeStr(ch, (ch1, str) -> str); // 문자열을 그대로 반환하는 람다식 전달
            if (userCharString.getStr().indexOf(ch) >= 0) {
                System.out.println(userCharString.getStr());
            } else {
                System.out.println("");
            }
        }
    }
}
