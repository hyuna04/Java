package chap21_stream;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        while (a <= 1000) {
            if (a % 3 == 0) {
                sum += a;
            }
            a++;
        }
        System.out.println("총합 : " + sum);
    }
}
