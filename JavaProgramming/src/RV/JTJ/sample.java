package RV.JTJ;

import chap07_inherit.animal.Animal;

class class_Animal {  //class: 큰 틀, 껍데기, (객체를 만드는 기능이 있음)
    String name;
    //Animal 이라는 클래스에 String 변수를 추가함
    //이렇게 클래스에 선언된 변수(name)를 객체변수라고 한다.
    //객체변수 = 인스턴스변수, 멤버변수, 속성

    public void setName(String name) {
        this.name = name;
    }
}

    public class sample {
        public static void main(String[] args) {
            class_Animal cat = new class_Animal();
            cat.setName("boby"); //메서드 호출
            System.out.println(cat.name);

            class_Animal dog = new class_Animal();
            dog.setName("happy");

            System.out.println(cat.name);
            System.out.println(dog.name);
            //출력결과 : boby
            //         happy

            //-> 객체변수(name)은 공유되지 않는다.
            //-> 객체변수 값이 독립적으로 유지된다는 점이 클래스의 존재이유이기도 함.

        }
    }


