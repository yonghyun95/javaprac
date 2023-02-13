public class Variable3_1 {
    public static void main(String[] args){
        // 부호있는 경우
        short sMin = -32768;
        short sMax = 32767;

        // short 타입에서 최솟값 범위를 넘었을 때
        // sMin - 1 = 32767
        System.out.println("sMin = " + sMin);
        System.out.println("sMin - 1 = " );
        System.out.println((short)(sMin - 1));

        // short 타입에서 최댓값 범위를 넘었을 때
        // sMax + 1 = -32768
        System.out.println("sMax = " + sMax);
        System.out.println("sMax + 1 = " );
        System.out.println((short)(sMax + 1));

        char cMin = 0;
        char cMax = 65535;

        System.out.println("cMin = " + (int)cMin);
        System.out.println("cMin - 1 = " );
        System.out.println((int)(--cMin));

        System.out.println("cMax = " + (int)cMax);
        System.out.println("cMax + 1 = " );
        System.out.println((int)(++cMax));
    }
}