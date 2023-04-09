package RV.JTJ;

import com.sun.jdi.connect.AttachingConnector;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
//ArrayList를 사용하기 위해
//import java.util.ArrayList; 와 같이
//Array를 먼저 import 해야한다.
public class _03_07 {
    public static void main(String[] args) {
        //List
        //Array 와 List의 차이점은 Array는 담을 수 있는
        //배열의 크기가 정해져 있지만 List는 크기가 정해져 있지 않아
        //원하는 만큼의 값을 담을 수 있다.

        //1. ArrayList

        //  - add
        ArrayList pitches = new ArrayList(); //ArrayList : 객체
        pitches.add("138"); //1번째 투구 스피드 ->(출력시)0
                            // add : 메서드
        pitches.add("129"); //2번쨰 투구 스피드 ->1
        pitches.add("142"); //3번째 투구 스피드 ->2
        //ArrayList 객체인 pitches에 add라는 메서드를 이용해서
        //투구스피드를 저장했다.
        //만약 첫번째 위치에 "133"이라는 투구스피드를 삽입하고 싶을때는
        //삽입할 위치를 파라미터로 넘겨줘야한다.
        //->
        //        pitches.add(0, "133");//1번째 위치에 133삽입
        //        pitches.add(1, "133");//2번째 위치에 133삽입


        //  - get
        //ArrayList의 get메서드를 통해 특정 인덱스의 값을 추출할 수 있다.
        //-> 박찬호 선수의 2번째 투구 스피드 출력하기
        System.out.println(pitches.get(0));

        //  - size
        //ArrayList의 갯수 리턴
        System.out.println(pitches.size());
        //위 코드를 실행하면 pitches에 담긴 갯수가 출력됨
        //pitches.add("138");
        //pitches.add("129");
        //pitches.add("142");
        //세개가 ArrayList의 개수이므로 갸수(3개) 출력
        //->3출력

        //  - contains
        //contains메서드는 리스트안에 해당 항목이 있는지를 판별하여
        //그 결과를 boolean으로 리턴한다.
        System.out.println(pitches.contains("142"));
        //pitches 객체가 142값을 포함하고 있으므로 true를 리턴
        //->true출력

        //  - remove
        //remove 메서드에는 두가지 방식이 있다.
        //이름은 같지만 입력 파라미터가 다르다.
        //ex)
        System.out.println(pitches.remove("129"));
        //첫번째 remove(객체)의 경우 리스트에서 객체에 해당되는 항목을 삭제하고
        //삭제한 결과 (true, false)를 리턴
        //->true출력
        System.out.println(pitches.remove(0));
        //두번째 remove(인덱스)의 경우 해당 인덱스의 항목을 삭제하고
        //삭제된 항목을 리턴
        //->138출력(pitches 의 첫번째 항목은 138이므로 138리턴)
        //2. 제네릭스
        //3. 다양한 방법으로 ArrarList 만들기
        //4. String.join
        //5. 리스트 정렬하기
    }
}
