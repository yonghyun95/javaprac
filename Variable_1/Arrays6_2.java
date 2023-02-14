import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays6_2 {
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println();
        // copyOf
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOf(arr, 3);
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOf(arr, 7);
        System.out.println("Array.toString(arr4) = " + Arrays.toString(arr4));

        System.out.println();
        // copyOfRange
        int[] arr5 = Arrays.copyOfRange(arr,2,4);
        System.out.println("Arrays.toString(arr5) = " + Arrays.toString(arr5));
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // 배열의 범위가 넘어가면 초기화 값이 들어간다.
        System.out.println("Arrays.toString(arr6) = "+ Arrays.toString(arr6));
    }

}
