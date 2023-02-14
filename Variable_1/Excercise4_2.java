//4-1. 다음의 문장들을 조건식으로 표현해보세요.

//int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
// if ( x > 10 || x < 20)

//char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
// if ( ch != ' ' || ch != '\n') { System.out.println("공백이나 탭이 아니다");

//char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
// if( ch == 'x' || ch == 'X') {System.out.println("true");

//char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
// if(ch>='0' && ch< <= '9'){"true"};

//char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
// if (ch >= 'A' && ch <= 'Z') { else if(ch >= 'a' && ch <= 'z'){System.out.println("true")}}

//int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을때 true인 조건식
// if( year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {System.out.println("true")))

//boolean형 변수 powerOn이 false일 때 true인 조건식
// if( bolean powerOn == false) {true};

//문자열 참조변수 str이 "yes"일 때 true인 조건식
// if(str.equals("yes")


// 4- 2. 1부터 20까지의 정수중에서 2 또는 3의 배수가 아닌 수의 총합을 구하기
public class Excercise4_2 {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 0; i <20; i++){
            if (i % 2 != 0 && i % 3 != 0){
                sum += i++;

            }
        }

        System.out.println("sum= " + sum);
    }
}

