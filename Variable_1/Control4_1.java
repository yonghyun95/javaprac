public class Control4_1 {
    public static void main(String[] args) {
        // 괄호 { } 안의 내용을 20번 반복
        // 1. 1 ~ 10 사이의 난수를 20개 출력
        // 1,2,3,4,5,6,7,8,9,10

        // 2. -5 ~ 5 사이의 난수를 20개 출력.
        // -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5
        for (int i =0; i < 20; i++){
            System.out.println((int)(Math.random() * 11) - 5);
        }
    }
}
