//public class Main02 {
//    public int solution(String s) {
//        int answer = 0;
//        int num = 0;    // x가 들어있을때 수를 초기화해줄 변수선언
//          char[] ch = s.toCharArray();
//        // 지금 구현할려고 하는 함수
//        // 1. "OOXXOXXOOO" -> 1 + 2 + 0 + 0 + 1 + 2 + 3 -> toCharArray
//        // 2. 연속된 O의 개수 - for
//        // 3. 문제를 맞은 경우 - if 조건문
//        for (int i = 0; i < s.length();i++){
//            if (ch[i] == 'O'){
//                num++;
//            } else {
//
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main02 method = new Main02();
//        String s = "OXOOOXXXOXOOXOOOOOXO";
//        System.out.println(method.solution(s));
//    }
//}
