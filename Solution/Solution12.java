//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//
//public class Solution12 {
//    public long solution(long n) {
//        long answer = 0;
//
//        String str = String.valueOf(n); // String으로 형변환
//        String[] str2 = str.split("");  // 문자열 쪼개기
//        Arrays.sort(str2, Collections.reverseOrder());  // 배열을 정렬한다. str2 배열을!
//
//        str = String.join("", str2);  // str2 배열에 있는 값을 공간 없이 str에 합친다.
//        answer = Long.parseLong(str);   // Stirng str을 answer에 Long으로 형변환한다.
//
//        return answer;
//    }
//}
