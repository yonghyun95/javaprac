public class Arrays3_3 {
    public static void main(String[] args) {
        int[] score = {65, 97, 88, 43, 33, 91, 28};

        int max = score[0]; // 최대값을 배열의 첫 번째 값으로 초기화 한다.
        int min = score[0]; // 최솟값을 배열의 첫 번째 값으로 초기화 한다.

        for (int i = 0; i< score.length;i++){   // 반복문 for문을 통해 score[] 배열 안에 있는 값을 비
            if (score[i] > max){                // 비교하여 큰값과 작은 값을 출력한다.
                max = score[i];
            } else if (score[i] < min){
                min = score[i];
            }
        }

        System.out.println("최대값 = " + max);
        System.out.println("최솟값 = " + min);
    }
}
