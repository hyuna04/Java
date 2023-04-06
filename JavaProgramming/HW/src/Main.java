import _0406_.HistoricPerson;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<HistoricPerson>personList = new ArrayList<>();

        //HistoricPerson 객체 생성 및 리스트에 추가
        personList.add(new HistoricPerson("이도", "한글", "조선"));
        personList.add(new HistoricPerson("이순신", "임진왜란", "조선"));
        personList.add(new HistoricPerson("담덕", "세력확장", "고구려"));
        personList.add(new HistoricPerson("장영실", "측우기", "조선"));
        personList.add(new HistoricPerson("이성계", "조선건국", "조선"));
        personList.add(new HistoricPerson("을지문덕", "살수대첩", "고구려"));
        personList.add(new HistoricPerson("이승만", "초대대통령", "대한민국"));
        personList.add(new HistoricPerson("고주몽", "고려건국", "고려"));
        personList.add(new HistoricPerson("김구", "독립운동", "대한민국"));
        personList.add(new HistoricPerson("제갈공명", "책략가", "촉"));

        //사용자로부터 입력받은 업적에 해당하는 인물 정보 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 업적을 입력하세요: ");
        String targetAchievement = sc.nextLine();

        System.out.println(targetAchievement + "에 대한 인물정보:" );
        personList.stream()
                .forEach(person-> System.out.println(person.getPersonInfo(targetAchievement)));
//                .forEach(System.out::println);
    }
}