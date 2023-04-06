package chap20_lambda;

import chap20_lambda.clazz.Add;

public class _02_nonParamLambda {
    public static void main(String[] args) {
        action(()-> {
            System.out.println(3 + 4);
            System.out.println(5 + 6);
        });

        action(()-> System.out.println(10 + 20));
    }

    public static void action(Add add) {
        add.add();
    }
}
