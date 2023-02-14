public class Arrays2_1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("배열의 길이는 = " + arr.length);

        for (int i =0; i<arr.length; i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println();
        // index 범위를 벗어나는 경우 Error 발생
        for(int i = 0; i< arr.length + 1;i ++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
