package chap20_lambda;

import chap20_lambda.clazz.CustomString;
import chap20_lambda.clazz.CustomString2;

public class _04_returnLambda {
    public static void main(String[] args) {
        action((a, b) -> {
            String returnStr = b.concat(a);
            return returnStr;
        });
        //중괄호가 없을 떄는 return 구문 사용불가
        action2((a, b, c) -> a.concat(b).indexOf(c));
    }

    public static void action (CustomString cs) {
        String resultStr = cs.concat("bit","naver");

        System.out.println(resultStr);
    }

    public static void action2(CustomString2 cs) {
        int index = cs.indexOf("google", "microsoft", 'f');

        System.out.println(index);
    }
}
