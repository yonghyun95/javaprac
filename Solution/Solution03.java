//import java.util.Scanner;
//
//public class Solution03 {
//    public static String solution(String s) {   // solution s는 앞에 타입이 맞으면 변수명은 상관이 없다.
//        String answer = "";
//
//        if (s.length() % 2 == 0 ){
//            answer = s.substring(s.length()/2-1, s.length()/2+1);// 2 , 4
//        } else {
//            answer = s.substring(s.length() / 2, s.length() / 2 + 1);// 4, 5
//        }
//
//        return answer;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String s = sc.next();     // next()는 문자열을 입력 받는 것!
//        String str = solution(s);
//
//        System.out.println(str);
//    }
//}