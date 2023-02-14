//5-1. 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하세요.
//      1.  int[] arr[];
//      2.  int[] arr = {1,2,3,};
//      3.  int[] arr = new int[5];
//      4.  int[] arr = new int[5]{1,2,3,4,5};
//      5.  int arr[5];
//      6.  int[] arr[] = new int[3][];
// 답 : 4 이유 : 배열의 크기를 두번 선언해서 / 5번 이유: 배열을 선언만 했고, 크기를 표현하지 않았습니다.


//5-2. 다음과 같은 배열이 있을 때, arr[3].length의 값은? 2
//        int[][]arr ={
//        {5,5,5,5,5},
//        {10,10,10},
//        {20,20,20,20},
//        {30,30}
//        };


// 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성
public class Excercise5_3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("sum=" + sum);
    }
}
