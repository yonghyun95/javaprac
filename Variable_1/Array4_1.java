import java.util.Arrays;

public class Array4_1 {
    public static void main(String[] args){
        String str = "ABCDEFG";
        char ch = str.charAt(3);
        System.out.println("ch = " + ch);

        String str2 = str.substring(1, 4);
        System.out.println("str2 = " + str2);

        String str3 = str.substring(1);
        System.out.println("str3 = " + str3);

        String str4 = str.substring(1, str.length());
        System.out.println("str4 = " + str4);

        char[] chArr = str.toCharArray();
        System.out.println("Arrays.toString(chArr) = " + Arrays.toString(chArr));
    }
}
