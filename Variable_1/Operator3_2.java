public class Operator3_2 {
    public static void main(String[] args){
        // 큰 타입을 작은 타입에 저장!
        // int i = 3.14f // 형변환 필요!
        int i = (int)3.14f;
        System.out.println("i= " + i);

        byte b = 100;
        System.out.println("b= " + b);

        int num = 100;
        byte b2 = (byte) num;
        System.out.println("b2= " + b2);

        byte b3 = (byte) 1000;
        System.out.println("b3 = " + b3);
    }
}
