//public class Solution06 {
//    public int solution(int[] numbers){
//        int answer = -1;
//        int sum = 0;    // 1~9 의 길이 합을 담을 변수
//        int sum2 = 0;   // 0~9 의 합을 담을 변수
//
//        for (int i = 0; i<numbers.length;i++) { // numbers의 길이만큼
//            sum += numbers[i];
//        }
//        for(int j = 0;j<10;j++){
//            sum2 += j;
//        }
//        answer = sum2 - sum;
//        return answer;
//    }
//}
