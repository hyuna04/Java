package chap20_lambda.clazz;

public class UserCharString {
    private String str;

    public UserCharString(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    //함수형 인터페이스를 매개변수로 갖는 메소드가 호출되는 부분에서
    //함수형 인터페이스를 람다식으로 구현한다.
    public void changeStr(char ch, UserChar userChar) {
        if (str.indexOf(ch) >= 0) { // ch가 str 안에 존재하는 경우
            str = userChar.findUserChar(ch, str); // UserChar 함수형 인터페이스를 통해 처리
        }
    }
}
