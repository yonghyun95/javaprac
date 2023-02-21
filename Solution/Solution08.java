//public class Solution08 {
//    boolean solution(String s) {
//        boolean answer = true;
//        int p = 0;  // 정수형 p 초기화
//        int y = 0;  // 정수형 y 초기화
////        char[] tmp = s.toCharArray(); // 문자열.toCharArray() <- 한글자씩 뽑을때 쓰여진다. (예시: "안녕하세요" -> '안','녕',
//
//        for (int i=0; i<s.length();i++){
//            if (s.charAt(i) == 'p' || s.charAt(i) == 'P'){
//                p++;
//            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
//                y++;
//            }
//
//            if (p == y){
//                answer =true;
//            }else {
//                answer = false;
//            }
//        }
//
//        return answer;
//    }
//}
