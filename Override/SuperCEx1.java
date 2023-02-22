//class Parent {
//    int x,y,z;
//
//    public Parent(){
//        System.out.println("난 부모 클래스 생성자");
//    }
//
//    public Parent(int x, int y, int z){
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
//}
//
//class Child extends Parent{
//    Child(){
//        super(10,20,30);
//    }
//
//    Child(int num) {
//        System.out.println("오버로딩 생성자");
//    }
//}
//
//public class SuperCEx1 {
//    public static void main(String[] args) {
//        Child child = new Child();
//        System.out.println(child.x);
//        System.out.println(child.y);
//        System.out.println(child.z);
//
//        new Child(10000);
//    }
//}
