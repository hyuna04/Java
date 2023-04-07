package RV.JTJ;

public class _03_06 {
    public static void main(String[] args) {
        //Array

        //ex)
        //1. 홀수의 집합
        int[] odds = {1, 3, 5, 7, 9};
        //2. 요일 집합
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

        //배열의 길이는 고정되어 있다.
        String[] weeks1 = new String[7];
        weeks[0] = "월";
        weeks[0] = "화";
        weeks[0] = "수";
        weeks[0] = "목";
        weeks[0] = "금";
        weeks[0] = "토";
        weeks[0] = "일";

        //배열의 길이를 먼저 설정하여 배열 변수를 먼저 생성
        //그 값은 나중에 대입
        //단, 위 예처럼 초기값 없이 배열 변수를 만들때에는
        // 반드시 길이에 대한 7과 같은 숫자값이 필요하다.

        //만든 요일의 배열중 "목" 요일에 해당되는 값을 얻으려면
        // 다음과 같이 인덱싱을 이용해야 한다.
        String[] weeks2 = {"월", "화", "수", "목", "금", "토", "일"};
        System.out.println(weeks[3]);
        //"목" 출력

        //배열의 길이

        //ex) weeks의 배열을 순서대로 출력하는 프로그램을 작성하기
        String[] weeks3 = {"월", "화", "수", "목", "금", "토", "일"};
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
//            월
//            화
//            수
//            목
//            금
//            토
//            일
            //출력


        //빈번한 배열의 오류
            System.out.println(weeks[7]);
            // 8번째 배열값이 없으므로 ArrayIndexOutOfBoundsException 오류가 발생한다.
        }
    }
}
