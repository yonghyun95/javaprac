////6-1. 다음과 같은 멤버 변수를 갖는 Student 클래스를 정의하세요.
//// 타입 : String, 변수명 : name, 설명 : 학생 이름
//// 타입 : int, 변수명 : ban, 설명 : 반
//// 타입 : int, 변수명 : no, 설명 : 번호
//// 타입 : int, 변수명 : kor, 설명 : 국어 점수
//// 타입 : int, 변수명 : eng, 설명 : 영어 점수
//// 타입 : int, 변수명 : math, 설명 : 수학 점수
//
//public class Student {
//    String name;
//    int ban, no, kor, eng, math, total ;
//    public Student(String name, int ban, int no, int kor, int eng, int math) {
//        this.name = name;
//        this.ban = ban;
//        this.no = no;
//        this.kor = kor;
//        this.eng = eng;
//        this.math = math;
//    }
//    public String info() {
//        int sum = kor + eng + math;
//        float avg = (int)(sum / 3f * 10 + 0.5f)/ 10.0f;
//        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + sum + "," + avg;
//        // sum / 3f = 78. 666664 -> 786.666664 + 0.5 = 787.111119 / 10.0f = 78.7
//    }
//}
//
//class Exercise6_2 {
//    public static void main(String[] args) {
//        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
//
//        String str = s.info();
//        System.out.println(str);
//
//    }
//}
//
