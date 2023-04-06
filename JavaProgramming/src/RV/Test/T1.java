import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {


//		--------------------변수--------------------
//		1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("이름");
//        String name = sc.nextLine();
//        System.out.println("나이");
//        int age = sc.nextInt();
//        System.out.println("성별");
//        String gen = sc.nextLine();
//
//        System.out.println("이름 : " + name + "나이 : " + age + "성별 : " + gen);

//		2. 사용자가 입력한 두 개의 정수와
//		문자(char) 연산자를 받아 두 정수로 해당 연산
//		을 진행한 결과를 출력하세요.
//				Scanner sc = new Scanner(System.in);
//
//				int intInput1 = 2;
//				int intInput2 = 5;
//
//				char charInput = sc.next().charAt(0) ;
//				switch (charInput) {
//				case '+':
//					System.out.println(intInput1 + "+" + intInput2 + "=" + (intInput1+intInput2));
//					break;
//
//				case '-':
//					System.out.println(intInput1 + "-" + intInput2 + "=" + (intInput1-intInput2));
//					break;
//
//				case '*':
//					System.out.println(intInput1 + "*" + intInput2 + "=" + (intInput1*intInput2));
//					break;
//
//				case '/':
//					System.out.println(intInput1 + "/" + intInput2 + "=" + (intInput1/intInput2));
//					break;
//
//				case '%':
//					System.out.println(intInput1 + "%" + intInput2 + "=" + (intInput1%intInput2));
//					break;
//
//				default:
//					System.out.println("X");
//					break;
//				}

//		3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//			    단, 원주율 3.14는 상수로 선언하세요.
//		int r = 20;
//		System.out.println(2 * 3.14 * r * r); //넓이 츨력
//		System.out.println(4 * 3.14 * r); //둘레 출력


//		4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
//Scanner sc = new Scanner(System.in);
//        System.out.println("정수 5개 입력");
//int a = sc.nextInt();
//int b = sc.nextInt();
//int c = sc.nextInt();
//int d = sc.nextInt();
//int e = sc.nextInt();
//System.out.println("합계 : " + (a + b + c + d + e));
//System.out.println("평균 : " + (a + b + c + d + e) / 5);


//		5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
        Scanner sc = new Scanner(System.in);
        System.out.println("세 정수를 입력하세요.");
        int a = sc.nextInt(); // 4
        int b = sc.nextInt(); // 3
        int c = sc.nextInt(); // 2

//        int arr[] = {a, b, c};

        int max = a;
        if (max<b){
            max = b;
        }
         if(max<c){
            max = c;
        }
        System.out.println(max);



//		6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
//													  2 * 2 = 4
//													  .....
//													  2 * 9 = 18
//				Scanner n = new Scanner(System.in);
//				System.out.println("정수 하나를 입력하세요.");
//				int input = n.nextInt();
//				for(int i = input; i <= input; i++) {
//					for(int j = 1; j <=9; j++) {
//
//						System.out.println(i + "*" + j + "=" + (i * j));
//					}
//					}
//				n.close();


//		7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
//				Scanner scn = new Scanner(System.in);
//				int nt = scn.nextInt();
//				for(int a = nt; a <= nt; a++) { //사용자가 입력한 a값까지 1씩증가
//				int pc = nt;
//				System.out.println();
//				}
//		8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
//		   사용자가 입력할 수 있는 값은 2 ~ 30로 제한
//
//
//		--------------------형 변환--------------------
//		1. 사용자가  입력한 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요.
//				Scanner num4 = new Scanner(System.in);
//				String nn1 = num4.next();
//				String nn2 = num4.next();
//
//				int nn3 = Integer.valueOf(nn1);
//				int nn4 = Integer.parseInt(nn2);
//
//				System.out.println(nn3 + nn4);
//		2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.
//		(단, b는 0을 입력할 수 없습니다.)
//				Scanner num5 = new Scanner(System.in);
//				int a = num5.nextInt();
//				int b = num5.nextInt();
//				if (b != 0) {
//				double num = (a / b);
//				System.out.println(num);
//				} else if(b == 0) {
//				System.out.println("X");
//				}

//		3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
//				Scanner num6 = new Scanner(System.in);
//				double num = num6.nextInt();
//				//정수를 출력해서 double을 써도 정수형으로 나옴
//				//앞에 double num 이니까 뒤에도 nextDouble쓰기
//				System.out.println(Integer.valueOf((int)num));
//
//		4. 사용자가 한 개의 실수를 입력하면
//		그 실수의 제곱의 결과를
//		문자열로 변환하여 출력하세요.
//				Scanner num7 = new Scanner(System.in);
//				double a = num7.nextDouble();
//				System.out.println(String.valueOf((double)(a * a)).getClass());

//		5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.

//				int iNum = 10;
//				long lNum = 20;

//		Integer.valueOf((int)lNum);
//		  -> integer.어쩌고 를 쓰면 다양한 기능을 쓸 수 있어서 씀(밑에처럼 형변환 해도 됨)
//		  입자가 큰 타입은 작은타입으로 자동적으로 형변환이 안되고
//		  입자가 작은타입은 큰타입으로 자동형변환이 됨
//				long temp = iNum; // int 값을 long 변수에 대입(int -> long 자동 형변환)
//				iNum = (int) lNum; // long 값을 int 변수에 대입(long -> int 묵시적 형변환)
//				lNum = temp;
//
//				System.out.println("iNum: " + iNum); // 출력 결과: iNum: 20
//				System.out.println("lNum: " + lNum); // 출력 결과: lNum: 10

//		6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
//				Scanner str = new Scanner(System.in);
//				System.out.println("문자 2개 입력하기");
//				char ch1 = str.next().charAt(0);
//				char ch2 = str.next().charAt(0);
//
//				int num1 = ch1;
//				int num2 = (int) ch2;
//				System.out.println("문자 "+ ch1 + " 의 유니코드 값 : " + num1);
//				System.out.println("문자 "+ ch2 + " 의 유니코드 값 : " + num2);
//


//		--------------------연산자--------------------
//
//		1. 사용자가 입력한 두 정수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//		  (메소드로 따로 만들지 말고 메인메소드에서 구현)
//				Scanner sc = new Scanner(System.in);
//				System.out.println("두 정수 입력하기");
//				int a = sc.nextInt();
//				int b = sc.nextInt();
//				System.out.println("덧셈 : " + (a + b));
//				System.out.println("뺄셈 : " + (a - b));
//				System.out.println("곱셈 : " + (a * b));
//				System.out.println("나눗셈 : " + (a / b));
//				System.out.println("나머지 : " + (a % b));
//		2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요.
//		21, 22, 22, 22, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20
//				int num = 20;
//				System.out.println(++num); //21
//				System.out.println(++num); //22
//				System.out.println(num); //22
//				System.out.println(num--); //22
//				System.out.println(--num); //20
//				System.out.println(num--); //20
//				System.out.println(num++); //19
//				System.out.println(num); //20

//		3. 사용자가 입력한 정수가 2와 7의 공배수면
//		"2와 7의 공배수"라고 출력하고
//		아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
//				Scanner scn = new Scanner(System.in);
//				int x = scn.nextInt();
//				if(x % 2 == 0 && x % 7 == 0) {
//					System.out.println("2와 7의 공배수");
//				} else {
//					System.out.println("2와 7의 공배수가 아님");
//				}

//		4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
//				Scanner sc = new Scanner(System.in);
//				String h; // || String h = "Hello";
//				String str = sc.next();
//
//				h = str.equals("Hello") ? "yes" : "no";
//				System.out.println(h);
//		5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
//				Scanner sc = new Scanner(System.in);
//				int n = sc.nextInt(); //사용자 입력값을 n에 대입
//				String result = ""; //String 타입의 변수 "result"를 선언하고,
//									//빈 문자열("")을 초기값으로 할당하는 것을 의미
//				result = n % 2 == 0? "짝수": "홀수";
//				System.out.println(result);

//		6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가
//		100보다 크면 "100보다 큼" 작으면 "100보다 작음" 같으면 "100"을 출력하세요.

//		(A ? B : C ? D : E; => A가 false면 :뒤의 삼항 조건 연산자가
//		다시 실행된다. A가 false면서 C가
//		true면 D가 실행. A가 false면 C도
//		false면 E가 실행)
//
//				Scanner sc = new Scanner(System.in);
//				int i = sc.nextInt();
//				String k;
//				System.out.println(k = i > 100? "100보다 큼"
//						: i == 100? "100"
//						: i < 100 ? "100보다 작음" : "X");

//		7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//				Scanner sc = new Scanner(System.in);
//				double num1 = sc.nextDouble();
//				double num2 = sc.nextDouble();
//				System.out.println("덧셈 : " + (num1 + num2));
//				System.out.println("뺄셈 : " + (num1 - num2));
//				System.out.println("곱셈 : " + (num1 * num2));
//				System.out.println("나눗셈 : " + (num1 / num2));
//				System.out.println("나머지 : " + (num1 % num2));
//		8. 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열은 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.
//				Scanner sc = new Scanner(System.in);
//				System.out.println("문자열을 입력하세요");
//				String str = sc.nextLine(); //문자열(한 줄)입력->.next뒤에 Line써주기
//				System.out.println("숫자를 입력하세요");
//				int t = sc.nextInt();
//				System.out.println("입력한 문자열은 " + str + " 이고, "
//									+ "입력한 숫자는 " + t + " 입니다." );

//		--------------------조건문--------------------
//		1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
//        System.out.println("정수 두개를 입력하세요.");
//Scanner sc = new Scanner(System.in);
//int a = sc.nextInt();
//int b = sc.nextInt();
//if (a < b) {
//    System.out.println(b);
//} else if (a > b) {
//    System.out.println(a);
//} else {
//    System.out.println("비교할 수 없습니다.");
//}


//		2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
//        Scanner num = new Scanner(System.in);
//        System.out.println("정수를 입력하세요.");
//        int a = num.nextInt();
//        if (a > 0) {
//            System.out.println("양수");
//        } else if (a < 0) {
//            System.out.println("음수");
//        } else {
//            System.out.println("같음");
//        }
//		3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고,
//		"Python"인 경우 "공부중인 언어입니다."를 출력하고,
//		그렇지 않은 경우 "다른 언어를 공부해보세요."를 출력하세요.(switch~case~default 사용)
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        switch (str) {
//
//            case "Java":
//                System.out.println("좋아하는 언어입니다.");
//                break;
//            case "Python":
//                System.out.println("공부중인 언어입니다.");
//                break;
//
//            default:
//                System.out.println("다른언어를 공부해보세요.");
//                break;
//        }


//		4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)
//Scanner sc = new Scanner(System.in);
//int num = sc.nextInt();
//int a = num % 3;
//switch (a) {
//    case  0 :
//        System.out.println("3의 배수입니다.");
//        break;
//    default :
//        System.out.println("3의 배수가 아닙니다.");
//        break;
//}
//		5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고,
//		짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.
//				Scanner sc = new Scanner(System.in);
//				int input = sc.nextInt();
//				System.out.println("숫자를 입력하세요");
//				switch (input % 2) {
//						case 0 : System.out.println("짝수입니다.");
//						break;
//						default : System.out.println("홀수 입니다");
//						break;
//				}
//		6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
//				Scanner sc = new Scanner(System.in);
//				int a = sc.nextInt();
//				int b = sc.nextInt();
//				int c = sc.nextInt();
//				int d = sc.nextInt();
//				int e = sc.nextInt();
//
//				int max = a;
//
//				if(b > max) {
//				   max = b;
//				}
//				if(c > max) {
//				   max = c;
//				}
//				if(d > max) {
//				   max = d;
//				}
//				if(e > max) {
//				   max = e;
//				}
//
//				System.out.println(max);

//		7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고,
//		"No"인 경우 "아니오"를 출력하고,
//		그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
//				Scanner sc = new Scanner(System.in);
//				String input = sc.nextLine();
//				만약 if를 쓴다면 if(input.equals("Yes")) //String일 때 equals쓰기
//						switch (input) {
//						case "Yes" : System.out.println("예");
//						break;
//						case "No" : System.out.println("아니오");
//						break;
//						default : System.out.println("잘못 입력하셨습니다");
//						break;
//				}

//		8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다."
//		첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다."
//		두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
//				Scanner sc = new Scanner(System.in);
//				int a = sc.nextInt();
//				int b = sc.nextInt();
//				if(a == b) {
//					System.out.println("두 수가 같습니다.");
//				} else if(a > b) {
//					System.out.println("첫 번쨰 수가 더 큽니다.");
//				} else {
//					System.out.println("두 번쨰 수가 더 큽니다.");
//				}

//		9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다."
//		모두 홀수인 경우 "모두 홀수입니다."
//		그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
//				Scanner sc = new Scanner(System.in);
//				int a = sc.nextInt();
//				int b = sc.nextInt();
//				int c = sc.nextInt();
//				System.out.println("세 정수 입력하기");
//				if(a % 2 == 1 && b % 2 == 1 && c % 2 == 1) {
//					System.out.println("모두 홀수입니다.");
//				} else if(a % 2 == 1 && b % 2 == 1 && c % 2 == 0) {
//					System.out.println("홀수 2개, 짝수 1개 입니다.");
//				} else if(a % 2 == 1 && b % 2 == 0 && c % 2 == 0) {
//					System.out.println("홀수 1개, 짝수 2개 입니다.");
//				} else if(a % 2 == 1 && b % 2 == 0 && c % 2 == 1 ) {
//					System.out.println("홀수 2개, 짝수 1개 입니다.");
//
//				} else if(a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
//					System.out.println("모두 짝수입니다.");
//				} else if(a % 2 == 0 && b % 2 == 0 && c % 2 == 1) {
//					System.out.println("홀수 1개, 짝수 2개 입니다.");
//				} else if(a % 2 == 0 && b % 2 == 0 && c % 2 == 1 ) {
//					System.out.println("홀수 1개, 짝수 2개 입니다.");
//				} else if(a % 2 == 0 && b % 2 == 1 && c % 2 == 0 ) {
//					System.out.println("홀수 1개, 짝수 2개 입니다.");
//				}


//		--------------------반복문--------------------
//		1. 1부터 10까지의 정수의 합을 출력하세요.
//				int sum = 0;
//				for(int i = 1; i <= 10; i++) {
//				    sum += i;
//				}
//				System.out.println(sum);

//		2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
//					int num = 2;
//					String str = "* 2
// for(int i=0; i <10; i++) {

// num *= 2;// 4 8 16 32 ...

// System.out.println("2 " + str +" = " + num);

// str = str + " * 2"; //

// }


// 3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.

//소수란 1과 자기자신만을 약수로 갖는 수

//15라는 수가 있을 떄, 2~ 14로 나눠본다.

//15 % 2, 15 % 3, 15 % 4 ... 15 % 14

//11 % 2, % 3 % 4 ... 11 % 10 -> 전부 다 나머지가 0이 아니면 소수이다.

// System.out.println("숫자를 하나 입력해주세요.");

// Scanner sc1 = new Scanner(System.in);

// int num = sc1.nextInt();

// boolean isPrime = true;

// for(int i = 2; i < num; i++) {

// if(num % i == 0) {

// isPrime = false;

// }

// }

// if(isPrime == true) {

// System.out.println(num + "은 소수입니다.");

// }


// 4. 사용자가 입력한 정수의 약수를 출력하세요.

        /* 설계도 :

         * 처음에 프린트 함 : 정수를 입력해주세요.

         * sc. ~ 입력을 받아.

         *

         * 일단 for을 적어. 조건 : 1 ~ 입력받은 숫자까지

         * 약수는 입력받은 숫자를 나눌 수 있는 수이기떄문에 -> 6 % 2 = 0

         * true false의 값을 받고 싶을 때 -> ==

         * 그냥 값을 대입할 때 -> =

         * 나누어 떨어지는 수를 저장을 해서

         * for문이 끝나고 출력을 함. 정답.

         * String, Array, List 등등 length, length(), size() ...

         * String.(),,,,, -> google에 쳐보고,

         * int[] intArr = new int[10];

         * for문 돌리면서 열심히 사용자로부터 입력을 받았어

         *

         * syso(intArr); -> 이 배열의 주소값이 뜸.

         * syso(?) -> 배열을 출력하는법

         *

         */

//

// 5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)

// Scanner sc = new Scanner(System.in);

// System.out.println("10개의 정수 입력하기");

// int[] arr = new int[10];

//

// for(int i = 0; i < arr.length; i++) {

// arr[i] = sc.nextInt();

// }

// for(int i = 9; i >=0; i--) {

// System.out.println(arr[i]+" ");

// }


// 6. 사용자가 입력한 문자열을 역순으로 출력하세요.

// Scanner sc = new Scanner(System.in); //사용자 입력값 받기

// System.out.println("문자열을 입력하세요");

// String str = sc.nextLine(); //문자열 str에 사용자 입력값 대입

// String reverse = ""; //reverse : 문자열에서 역순으로 변환시켜줌

// for(int i = str.length() - 1; i >= 0; i--) { //문자열 길이를 길이-1 부터 0 까지 빼줌

// reverse = reverse + str.charAt(i); //역순한 값 = 역순 +

// }

// System.out.println(reverse);


// 7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.


// // 사용자로부터 두 정수 입력받기

// System.out.print("첫 번째 정수를 입력하세요: ");

// int num1 = Scanner.nextInt();

// System.out.print("두 번째 정수를 입력하세요: ");

// int num2 = Scanner.nextInt();

//

// // 최대공약수 구하기

// int gcd = getGCD(num1, num2);

// System.out.println("두 수의 최대공약수: " + gcd);

//

// // 최소공배수 구하기

// int lcm = getLCM(num1, num2, gcd);

// System.out.println("두 수의 최소공배수: " + lcm);

// }

//

// // 최대공약수를 구하는 메소드

// public static int getGCD(int a, int b) {

// while (b != 0) {

// int r = a % b;

// a = b;

// b = r;

// }

// return a;

// }

//

// // 최소공배수를 구하는 메소드

// public static int getLCM(int a, int b, int gcd) {

// return (a * b) / gcd;

// }

// }

// 8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.
// 8-1.
// *
// **
// ***
// ****
// *****
// 8-2.
// *****
// ****
// ***
// **
// *
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

// 9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        while (true) {
//            System.out.print("정수를 입력하세요 (종료하려면 q): ");
//            String input = scanner.nextLine();
//            if (input.equals("q")) {
//                break;
//            }
//            int num = Integer.parseInt(input);
//            sum += num;
//        }
//        System.out.println("입력한 정수의 총 합은 " + sum + "입니다.");
//        scanner.close();


    }
}