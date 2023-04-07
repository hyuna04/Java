package RV.JTJ;

public class _03_02 {
    public static void main(String[] args) {
        //boolean
        boolean isSuccess = true;
        boolean isTest = false;

        //연산
        //2 > 1 -> 참
        //1 == 2 -> 거짓
        //3 % 2 == 1 -> 참(3을 2로 나눈 나머지는 1이므로 참이다.)
        //"3".equals("2") -> 거짓

        //조건문
        //ex1
        int base = 100;
        int height = 185;
        boolean isTall = height > base;

        if (isTall) {
            System.out.println("키가 큽니다.");
        }
        //출력->키가 큽니다.

        //ex2
        int i = 3;
        boolean isOdd = i % 2 ==1;
        System.out.println(isOdd);
        //출력->true
    }
}
