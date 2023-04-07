package RV.JTJ;

public class _03_05 {
    public static void main(String[] args) {
        //StringBuffer
        //StringBuffer 는 문자열을 추가하거나 변경할 때
        //주로 사용하는 자료형

        //append//
        //StringBuffer 자료형은 append 메서드를 사용하여
        // 계속해서 문자열을 추가해 나갈 수 있다.
        // 그리고 밑 예제와 같이 toString() 메서드를 이용하여
        // String 자료형으로 변경할 수 있다.

        //StringBuffer 객체 생성, 문자열 객체 생성하기

//        StringBuffer sb = new StringBuffer();
//        //StringBuffer 객체 sb 생성
//        sb.append("hello");
//        sb.append(" ");
//        sb.append("jump to java");
//        String result = sb.toString();
//        System.out.println(result);
//        //"hello jump to java" 출력


        //위 예제를 StringBuffer 대신
        //String 자료형을 사용하도록 변경하기
//        String result1 = "";
//        result1 += "hello";
//        result1 += " ";
//        result1 += "jump to java";
//        System.out.println(result1);
        //"hello jump to java" 출력

        //두 개의 예제의 결과는 동일하지만 내부적으로
        //객체가 생성되고 메모리가 사용되는 과정은 다르다.
        //첫번 째 예제의 경우 StringBuffer 객체는 한번만 생성된다.
        //두번 째 예제는 String 자료형에 + 연산이 있을 때마다 새로운 String 객체가 생성된다
        //(문자열 간 + 연산이 있는 경우 자바는 자동으로 새로운 String 객체를 만들어 낸다).
        //두번 째 예제에서는 총 4개의 String 자료형 객체가 만들어진다.

        //insert//
        //insert 메서드는 특정 위치에 원하는 문자열을 삽입할 수 있다.
//        StringBuffer sb = new StringBuffer();
//        sb.append("jump to java");
//        sb.insert(0, "hello ");
//        System.out.println(sb.toString());
        //insert 를 사용하여 0번쨰 위치에 "hello" 라는 문자열을 삽입함.
        //0자리에 문자위치 지정해줌

        //substring//
        //substring 메서드는 String 자료형의 substring 메서드와 동일하게 동작함
        StringBuffer sb = new StringBuffer();
        sb.append("Hello jump to java");
        System.out.println(sb.substring(0, 4)); //(시작위치, 끝위치)
        //"Hell"출력
        //끝 4번째부터 날린다는 뜻으로 생각하기
        //substring(시작위치, 끝위치)와 같이 사용하면
        // StringBuffer 객체의 시작위치에서 끝위치까지의 문자를 뽑아낸다.
    }
}
