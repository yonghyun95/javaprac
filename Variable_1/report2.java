// byte b = 10;
// char ch = 'A';
// int i = 100;
// long l = 1000L;
// 3-1. 다음 중 형변환을 생략할 수 있는 것은?(모두 고르시오.)1, 2, 4
// 1. (byte)b = (byte)i;
// 2. (char)ch = (char)b;
// 3. short s = (short)ch;
// 4. float f = (float)l;
// 5. (int)i = (int)ch;

public class report2 {
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);
        System.out.println(x += 2);
        System.out.println(!('A' <= c && c <= 'Z'));
        System.out.println('C' - c);
        System.out.println('5' - '0');
        System.out.println(c + 1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

    }
}
