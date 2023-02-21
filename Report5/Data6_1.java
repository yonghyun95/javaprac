//6-8. 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
//        a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
//        b. 생성자는 객체를 생성하기 위한 것이다.  // 객체 생성은 new 연산자 담당이다.
//        c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
//        d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
//        e. 생성자는 오버로딩 할 수 없다.  //생성자는 오버로딩 가능하다.
//
//
//        6-9. 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오)
//        a. 객체 자신을 가리키는 참조변수이다.
//        b. 클래스 내에서라면 어디서든 사용할 수 있다. // 클래스 내가 아니라 인스턴스 메서드에서 사용 가능
//        c. 지역변수와 인스턴스변수를 구별할 때 사용한다.
//        d. 클래스 메서드 내에서는 사용할 수 없다. // 클래스 내에서는 사용 가능합니다.
//
//
//        6-10. 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)
//        a. 메서드의 이름이 같아야 한다.
//        b. 매개변수의 개수나 타입이 달라야 한다.
//        c. 리턴타입이 달라야 한다.  // 영향을 받지 않습니다.
//        d. 매개변수의 이름이 달라야 한다. // 매개 변수의 이름이 같아야한다.
//
//        6-11. 다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)
//        > long add(int a, int b) { return a+b; }
//
//        a. long add(int x, int y) { return x+y; }
//        b. long add(long a, long b) { return a+b; }
//        c. int add(byte a, byte b) { return a+b; } // 오버로딩 성립
//        d. int add(long a, int b) { return (int)(a+b); }
//
//        6-12. 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
//        a. 멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참고할 수 있다.
//        b. 지역변수는 사용하기 전에 반드시 초기화해야 한다.
//        c. 초기화 블럭보다 생성자가 먼저 수행된다. // 생성자는 마지막에 수행된다.
//        d. 명시적 초기화를 제일 우선적으로 고려해야 한다.
//        e. 클래스변수보다 인스턴스변수가 먼저 초기화된다 // 인스턴스 변수는 생성될때 초기화됩니다.
//
//        6-13. 다음 중 인스턴스변수의 초기화 순서가 올바른 것은?
//        a. 기본값-명시적초기화-초기화블럭-생성자 // a
//        b. 기본값-명시적초기화-생성자-초기화블럭
//        c. 기본값-초기화블럭-명시적초기화-생성자
//        d. 기본값-초기화블럭-생성자-명시적초기화
//
//        6-14. 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
//        a. 자동 초기화되므로 별도의 초기화가 필요없다. // 초기화 하면 성능이 떨어진다.
//        b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
//        c. 메서드의 매개변수로 선언된 변수도 지역변수이다.
//        d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.
//        e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다. // 호출스택에 생성된다.
//
//        6-15. 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은? (모두 고르시오)
//        a. 제일 먼저 호출스택에 저장된 것은 main메서드이다. // 대기 중인 상태!
//        b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.
//        c. method2메서드를 호출한 것은 main메서드이다.
//        d. println메서드가 종료되면 method1메서드가 수행을 재개한다.
//        e. main-method2-method1-println의 순서로 호출되었다.
//        f. 현재 실행중인 메서드는 println뿐이다.

//public class Data6_1 {
//    int x; // 기본형
//    int y; // 기본형
//}
//
//class Data6_1Main {
//    public static void main(String[] args) {
//
//        Data6_1 data  = new Data6_1();
//        data.x = 10;
//        data.y = 20;
//
//        System.out.println("Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수 x, y 값 확인");
//        System.out.println("data 인스턴스 변수 x = " + data.x);
//        System.out.println("data 인스턴스 변수 y = " + data.y);
//        System.out.println();
//
//        // changeParameter 메서드 의 매개변수에 Data 클래스의 인스턴스 변수를 입력한다.
//        System.out.println("입력받은 매개변수의 값을 바꾸는 메서드 수행");
//        changeParameter(data.x, data.y);
//        System.out.println();
//
//        // changeParameter(data.x, data.y); 여기서의 data.x 와 data.y 는
//        // data 의 인스턴스 변수의 값 그자체가 복사되어 넘어갑니다.
//        // 따라서 changeParameter 메서드에서 입력받은 매개변수의 값을 바꿔도
//        // 영향을 받지 않습니다.
//        System.out.println("Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수의 값이 변경되었는지 확인");
//        System.out.println("changeParameter 메서드 수행 후 data 인스턴스 변수 x = " + data.x);
//        System.out.println("changeParameter 메서드 수행 후 data 인스턴스 변수 y = " + data.y);
//    }
//
//    static void changeParameter(int x, int y) {
//        System.out.println();
//        System.out.println("changeParameter 메서드 시작");
//        System.out.println("입력 받은 매개변수 x 와 y의 값 확인");
//        System.out.println("입력 받은 매개변수 x = " + x);
//        System.out.println("입력 받은 매개변수 y = " + y);
//
//        System.out.println();
//        System.out.println("입력 받은 매개변수 x 와 y의 값을 변경 한 후 확인");
//        x = 100;
//        y = 200;
//        System.out.println("변경 한 후 x = " + x);
//        System.out.println("변경 한 후 y = " + y);
//        System.out.println("changeParameter 메서드 끝");
//    }
//}
