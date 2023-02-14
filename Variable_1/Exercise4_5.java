public class Exercise4_5 {
    public static void main(String[] args) {
//        for(int i=0; i<=10; i++) {
//            for (int j = 0; j <= i; j++)
//                System.out.print("*");
//                System.out.println();
        int i=0;
        while( i<=10) {

            int j=0;    // 이때 j값을 0으로 초기화시키는 것에 주의!!
            while(j<=i) {
                System.out.print("*");
                j++;
            } System.out.println();
            i++;
        }
        }
    }
//        }
//    }

