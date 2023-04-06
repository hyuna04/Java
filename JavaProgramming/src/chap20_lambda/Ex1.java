package chap20_lambda;

import chap20_lambda.clazz.CompareStr;

public class Ex1 {
    public static void main(String[] args) {
    action(String :: equals );
    }
    public static void action(CompareStr cs){
        boolean result = cs.compareTwoStr("n", "s");
        if(result){
            System.out.println("두 문자열은 같습니다");
        } else {
            System.out.println("두 문자열은 다릅니다");
        }
    }
}
