public class Variable4_3 {
    public static void main(String[] args){
        int a = 10, b =20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(temp);
    }
}
