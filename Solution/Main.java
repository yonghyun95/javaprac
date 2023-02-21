public class Main {
    public int solution(int num) {
        int answer = 0;
        int change = 1000 - num; // 잔돈 = change

        while (change != 0){    // 잔돈이 0이 될때까지 전체 while문 사용
           if (change >= 500) { // 잔돈이 500 크면
               change -= 500;   // 잔돈에서 500원 빼고
           } else if (change >= 100){   // 잔돈이 100원보다 크면
               change -= 100;   // 잔돈에서 100원 빼고
           } else if (change >=50){ // 잔돈이 50원보다 크면
               change -= 50;    // 잔돈에서 50원 뺴고
           } else if (change >= 10){    // 잔돈이 10원보다 크면
               change -= 10;    // 10원 뺴고
           }
           answer++;    // 포인트! 뺄때마다 동전이 하나씩 증감!!
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int num1 = 160;
        System.out.println(method.solution(num1));
    }
}


