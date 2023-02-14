public class Arrays2_2 {
    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,3,4,5,6,7,8,9,};
        int[] num2 = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < num1.length;i++){
            System.out.println("num1[" + i +"] = " + num1[i]);
        }
        System.out.println();

        // 주의 할 점 !
        int[] num3;
        // num3 = {1,2,3,4,5,6,7,8,9}; // Error 발생

        // 위처럼 나눠서 표현을 해야한다면 아래처럼 초기화 하셔야 합니다.
        int[] num4;
        num4 = new int[]{1,2,3,4,5,6,7,8,9};

        for (int i = 0;i < num4.length;i++){
            System.out.println("num4[" + i + "] = " + num4[i]);
        }
    }
}
