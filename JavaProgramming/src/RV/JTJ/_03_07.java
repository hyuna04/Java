package RV.JTJ;

import com.sun.jdi.connect.AttachingConnector;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

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
        //세개가 ArrayList의 개수이므로 개수(3개) 출력
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


        //2. 제네릭스(Generics)
        //코드에서 String과 같이 자료형을 지정해주는 것
        ArrayList<String> pitches1 = new ArrayList<>();
        //위에서 사용한 첫번째 코드의 <String> 이라는 제네릭스 표현식은
        // "ArrayList 안에 담을 수 있는 자료형은 String 타입 뿐이다"
        // 라는 것을 의미한다.
        // 즉, 제네릭스를 이용하면 좀 더 명확한 타입체크가 가능해 진다.
        // 이것은 코드를 작성할 때도 몇 가지 이득을 준다.

        // 제네릭을 사용하지 않는 경우
        ArrayList pitches2 = new ArrayList();
        pitches2.add("138");
        pitches2.add("129");
        //-> ArrayList안에 추가되는 객체(pitches2)는
        //Object 자료형으로 인식됨
        //(Object 자료형은 모든 객체가 상속하고 있는 가장 기본적인 자료형)
        //ArrayList 객체인 pitches에 값을 넣을 때는 문제가 안되지만
        //값을 가져올 경우에는 항상 Object 자료형에서 String자료형으로
        //형변환(casting)을 해야한다.
        //형변환 ex)
        String one = (String) pitches2.get(0);
        String two = (String) pitches2.get(1);
        //그런데 여기서 주의할 점은 pitches 안에는
        // String 객체 이외의 객체도 넣을 수 있기 때문에
        // 형 변환 과정에서 잘못된 형변환으로 인한 오류가 발생할 가능성이 있다는 점이다.
        // 바로 이러한 점이 제네릭스의 탄생 이유이기도 하다.
        //-> 제네릭스를 사용해 변경하기
        ArrayList<String> pitches3 = new ArrayList<>();
        pitches3.add("138"); //형변환이 필요없다.
        pitches3.add("129"); //형변환이 필요없다.
        String three = pitches3.get(0);
        String four = pitches3.get(1);
        //제네릭스로 자료형을 선언하기만 하면 그 이후로는 자료형에 대한
        //형변환 과정이 필요없다.
        //이미 컴파일러가 pitches에는 반드시 String 자료형만 추가 되어야 함을
        //알기 때문이다. 이렇게 제네릭스를 이용하면 형변환에 의한
        //불필요한 코딩과 잘못된 형변환에 의한 런타임 오류를 방지할 수 있다.


        //3. 다양한 방법으로 ArrayList 만들기
        //ArrayList에 add메서드를 사용하면 다음처럼 ArrayList 객체에
        //요소를 추가할 수 있다.
        ArrayList<String> pitches4 = new ArrayList<>();  // 제네릭스를 사용한 표현
        pitches4.add("138");
        pitches4.add("129");
        pitches4.add("142");
        System.out.println(pitches4);
        // [138, 129, 142] 출력

        //하지만 다음처럼 이미 문자열 배열이 존재할 경우에는
        // 보다 편하게 ArrayList를 생성할 수 있다.
        String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches5 = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches5);
        // [138, 129, 142] 출력


        //4. String.join
        //앞에서 "138", "129", "142" 의 요소로 이루어진 ArrayList를 만들어 보았다.
        //그렇다면 이렇게 만들어진 ArrayList의 각 요소를
        //콤마(",")로 구분하여 다음과 같은 하나의 문자열로 만들 수 있는 방법이 있을까?
        ArrayList<String> pitches6 =
                new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result1 = "";
        for (int i = 0; i < pitches6.size(); i++) {
            result1 += pitches6.get(i);
            result1 += ","; //콤마를 추가한다.
            result1 = result1.substring(0, result1.length()-1);
            //마지막 콤마는 제거한다.
            System.out.println(result1);
            //->result1(138,129,142)출력

            //위 예에서도 볼 수 있듯이 리스트의 각각의 요소 사이에 구분자를 끼워넣어
            //하나의 문자열로 만드는 것은 꽤 까다로운 일이다.
            //하지만 String.join을 사용하면 다음처럼 매우 간단하게 처리할 수 있다.
            ArrayList<String> pitches7 = new ArrayList<>(Arrays.asList("138", "129", "142"));
            String result2 = String.join(",", pitches7);
            System.out.println(result2);
            //->result2(138,129,142)출력

            //String.join은 다음처럼 문자열 배열에도 사용할 수 있다.
            String[] pitches8 = new String[]{"138", "129", "142"};
            String result3 = String.join(",", pitches8);
            System.out.println(result3);
            //->result3(138,129,142)출력
        }

        //5. 리스트 정렬하기
        //이번에는 "138", "129", "142"의 요소로 이루어진 ArrayList를
        //순서대로 정렬해 보자.
        //순서대로 정렬하기 위해서는 다음처럼 리스트의 sort 메서드를 사용해야 한다.
        ArrayList<String> pitches9 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println(pitches);
        // [129, 138, 142] 출력
        //sort 메서드에는 정렬기준을 파라미터로 전달해야 한다.
        //정렬기준에는 다음처럼 오름차순, 내림차순이 있다.
        //오름차순(순방향) 정렬 - Comparator.naturalOrder()
        //내림차순(역방향) 정렬 - Comparator.reverseOrder()
    }
}
