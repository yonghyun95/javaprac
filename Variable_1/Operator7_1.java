public class Operator7_1 {
    public static void main(String[] args) {
        boolean result1, result2, result3, result4, result5, result6;

        char ch1 = 'a', ch2 = 'B';

        result1 = ch1 > 'A' && ch2 < 'C';
        result2 = ch1 == 'A' && ch2 < 'C';

        result3 = ch1 > 'A' || ch2 < 'C';
        result4 = ch1 < 'A' || ch2 > 'C';

        System.out.println("&& 연산자에 의한 결과 result1 = " + result1);
        System.out.println("&& 연산자에 의한 결과 result1 = " + result2);

        System.out.println("|| 연산자에 의한 결과 result1 = " + result3);
        System.out.println("|| 연산자에 의한 결과 result1 = " + result4);

        System.out.println("! 연산자에 의한 결과 result1 = " + result4);

        System.out.println();

        int num = 10;

        result5 = num % 2 == 0 && num % 3 == 0;
        System.out.println("num 은 2의 배수 그리고 3의 배수 = " + num);

        result6 = num % 2 == 0 || num % 3 == 0;
        System.out.println("num 은 2의 배수 또는 3의 배수 = " + result6);
    }
}
