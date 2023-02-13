// 2-4. 다음 중 변수를 잘못 초기화 한 것은? 1,3,4
// 1. byte b = 256; // byte = 128 ~ -127
// 2. char c = '';  //
// 3. char answer = 'no';
// 4. float f = 3.14
// 5. double d = 1.4e3f;

// 2-7. 다음 문장들의 출력 결과를 적으세요. 오류가 있는 경우, '오류'라고 적으세요.
// system.out.print("1"+"2");   답 : 12
// system.out.print(true+"");   답 : true
// system.out.print('A'+'B');   답 : 131
// system.out.print('1'+2);     답 : 35
// system.out.print('1'+'2');   답 : 88
// system.out.print('J'+"AVA"); 답 : 오류
// system.out.print(true + null);   답 : 오류
public class report1 {
    public static void main(String[] args){
        int x = 1, y = 2, z =3;
        int temp = 0;

        temp = x;
        x = y;
        y = z;
        z = temp;

        System.out.println("x= " + x);
        System.out.println("y= " + y);
        System.out.println("z= " + z);

    }
}
