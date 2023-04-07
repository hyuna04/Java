package _0406_;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class HW02 {
    public static void main(String[] args) {
//        2. HistoricPerson이란 클래스를 만들고
//        String name; String achievement; String country; 를 멤버변수로 만들고
//        getter/setter 메소드를 생성합니다.
//        getPersonInfo(String achievement);
//        매개변수로 받아온 업적에 해당하는 역사적 인물의
//        정보를 리턴하는 기능을 만들고 메인메소드에서
//        (이도, 한글, 조선),
//        (이순신, 임진왜란, 조선),
//        (담덕, 세력확장, 고구려)
//        (장영실, 측우기, 조선),
//        (이성계, 조선건국, 조선),
//        (을지문덕, 살수대첩, 고구려),
//        (이승만, 초대대통령, 대한민국),
//        (고주몽, 고려건국, 고려),
//        (김구, 독립운동, 대한민국),
//        (제갈공명, 책략가, 촉)
//        데이터를 갖는 List<HistoricPerson>를 만들어서
//        스트림으로 변환 후 사용자가 입력한 업적
//        하나만 갖는 스트림을 생성하고 출력하세요.
        List<HistoricPerson> hpList =
                new ArrayList<HistoricPerson>();

        hpList.add(new HistoricPerson("이도", "한글", "조선"));
        hpList.add(new HistoricPerson("이순신", "임진왜란", "조선"));
        hpList.add(new HistoricPerson("담덕", "세력확장", "고구려"));
        hpList.add(new HistoricPerson("장영실", "측우기", "조선"));
        hpList.add(new HistoricPerson("이성계", "조선건국", "조선"));
        hpList.add(new HistoricPerson("을지문덕", "살수대첩", "고구려"));
        hpList.add(new HistoricPerson("이승만", "초대대통령", "대한민국"));
        hpList.add(new HistoricPerson("고주몽", "고려건국", "고려"));
        hpList.add(new HistoricPerson("김구", "독립운동", "대한민국"));
        hpList.add(new HistoricPerson("제갈공명", "책략가", "촉"));
        hpList.add(new HistoricPerson("선우용녀", "책략가", "촉"));

        Stream<HistoricPerson> hpStream = hpList.stream();

        System.out.println("검색할 업적을 입력하세요.");
        String inputAchievemenqt = sc.nextLine();

        hpStream.map(hp ->
                        hp.getPerInfo(inputAchievement))
                .forEach(hp -> {
                    if(hp != null) {
                        System.out.println(hp.getName() + ", "
                                + hp.getAchivement() + ", " + hp.getCountry());
                    }
                });

        hpStream = hpList.stream();

        System.out.println("검색할 나라를 입력하세요.");
        String inputConutry = sc.nextLine();

        hpStream.filter(hp ->
                        hp.getSameCountryPerson(inputConutry))
                .forEach(hp -> System.out.println(hp.getName()
                        + ", " + hp.getAchivement() + ", "
                        + hp.getCountry()));

        hpStream = hpList.stream();

        hpStream.filter(hp -> hp.getName().charAt(0) == '이')
                .forEach(hp -> System.out.println(hp.getName()
                        + ", " + hp.getAchivement() + ", "
                        + hp.getCountry()));

        hpStream = hpList.stream();

        String[] firstName =
                {"제갈", "을지", "독고", "황보", "남궁", "동방", "선우"};

        hpStream.filter(hp -> {
                    for(String fName : firstName) {
                        if(hp.getName().contains(fName)) {
                            return true;
                        }
                    }
                    return false;
                })
                .forEach(hp -> System.out.println(hp.getName()
                        + ", " + hp.getAchivement() + ", "
                        + hp.getCountry()));












        sc.close();

    }
}
