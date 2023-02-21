//public class Exercise6_20 {
//    static int max(int[] arr){
//        if (arr == null || arr.length == 0){
//            return -999999;
//        }
//        int max = arr[0];   // max의 배열 첫번째 값에 제일 큰수를 넣는다.
//
//        for (int i = 1; i < arr.length; i++) {
//            if(max < arr[i]){   // 배열의 첫번째 자리가 arr[i]가 크면 max 값에 삽입
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//        int[] data = {3,2,9,4,7};
//        System.out.println(java.util.Arrays.toString(data));
//        System.out.println("최대값 :"+max(data));
//        System.out.println("최대값 :"+max(null));
//        System.out.println("최대값  :"+max(new int[]{})); // 크기가 0인 배열  }
//    }
//}
//예상 결과 : 최대값: 9 / 최대값: -99999 최대값: -999999