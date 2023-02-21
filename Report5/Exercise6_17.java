//import java.util.Map;
//import java.util.Random;
//
//public class Exercise6_17 {
//    static int[] shuffle(int[] arr) {
//        int r1, r2;
//        int temp;
//        for (int i = 0; i < arr.length; i++) {
//            r1 = (int) (Math.random() * 9);
//            r2 = (int) (Math.random() * 9);
//
//            temp = arr[r1];
//            arr[r1] = arr[r2];
//            arr[r2] = temp;
//        }
//        return arr;
//    }
//
//
//    public static void main(String[] args) {
//        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//        System.out.println(java.util.Arrays.toString(original));
//
//        int[] result = shuffle(original);
//        System.out.println(java.util.Arrays.toString(result));
//    }
//}
