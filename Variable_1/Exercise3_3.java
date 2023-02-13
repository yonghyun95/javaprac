public class Exercise3_3 {
    public static void main(String[] args) {
        // 3-3. 아래는 변수의 num 값 중에서 백의 자리 이하를 버리고
        //만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이 '100'이 된다.
        int num = 456;
        int num2 = 111;

        System.out.println((int) (num / 100) * 100);
        System.out.println((int) (num2 / 100) * 100);
    }
}
