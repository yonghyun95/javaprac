//import java.util.Scanner;
//public class Solution04 {
//    public static long solution(int a, int b) {
//        long answer = 0;
//
//        if (a < b) {
//            for (int i = a; i <= b; i++) {
//                answer += i;
//            }
//        } else if (a > b) {
//            for (int i = a; i >= b; i--) {
//                answer += i;
//            }
//        } else if (a == b) {
//            return (long) a;
//        }
//        return answer;
//    }
//
//
//    public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);
//
//            int num = sc.nextInt(); //정수형 숫자를 입력 받다..
//            int num2 = sc.nextInt();
//
//            long aa = solution(num, num2);
//
//            System.out.println(aa);
//        }
//    }
