//import java.util.*;
//public class Capsule {
//    private int age;
//    private String name;
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = checkName(name) ? name : "anonymous";
//    }
//    // 이름을 입력할 때 공백인지 확인하는 메소드
//    // Capsule 클래스 내부에서만 사용할 것이기 때문에 private
//    private boolean checkName(String name){
//        return name.length() > 0;
//    }
//}
//
//class CasuleMain {
//    public static void main(String[] args) {
//        Capsule capsule = new Capsule();
//
//        capsule.setAge(28);
//        capsule.setName("bin");
//
//        System.out.println("Capsule.getName() = " + capsule.getName());
//        System.out.println("Capsule.getage() = " + capsule.getAge());
//
//        capsule.setName("");
//        System.out.println("capsule.getName() = " + capsule.getName());
//
//    }
//}