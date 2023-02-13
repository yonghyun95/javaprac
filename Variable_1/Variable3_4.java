public class Variable3_4 {
    public static void main(String[] args) {
        String str1 = "100";
        String str2 = "3.14";
        String str3 = "8";

        // 문자열 -> 숫자
        System.out.println("Integer.parseInt(str) = " + Integer.parseInt(str1));
        // Integer.ParseInt() 은 int 타입만 가능
        // System.out.println("Integer.ParseInt(str2)=" + Integer.ParseInt(str2;
        System.out.println("Double.ParseDouble(str2) = " + Double.parseDouble(str2));

        // 문자열 - > 문자
        System.out.println("str.charAt(0) = " + str1.charAt(0) + str1.charAt(1) + str1.charAt(2));
        System.out.println("str2.charAt(0) = " + str3.charAt(0));

    }
}
