//class SutdaDeck {
//    final int CARD_NUM = 20;
//    SutdaCard[] cards = new SutdaCard[CARD_NUM];
//
//    SutdaDeck(){
//        for (int i = 0; i < CARD_NUM; i++) {
//            if (i == 0 || i == 2 || i == 7) {
//                cards[i] = new SutdaCard(i + 1, true);
//            }
//            else {
//                cards[i] = new SutdaCard(i%10  + 1, false);
//            }
//        }
//
//    }
//
//    public void shuffle() {
//        int index = 0;
//        SutdaCard temp;
//        for (int i = 0; i < CARD_NUM; i++) {
//            index = (int)Math.random() % CARD_NUM;
//            temp = cards[index];
//            cards[index] = cards[i];
//            cards[i] = temp;
//
//        }
//    }
//
//    SutdaCard pick(int index) {
//        if (index < 0 || index >= CARD_NUM){
//            return null;
//        }
//        return cards[index];
//    }
//
//    SutdaCard pick() {
//        int index = (int)Math.random() % CARD_NUM;
//        return cards[index];
//    }
//}
//
//class SutdaCard {
//    int num;
//    boolean isKwang;
//
//    SutdaCard() {
//        this(1, true);
//    }
//
//    SutdaCard(int num, boolean isKwang) {
//        this.num = num;
//        this.isKwang = isKwang;
//    }
//
//    // info()대신 Object클래스의 toString()을 오버라이딩했다.
//    public String toString() {
//        return num + ( isKwang ? "K":"");
//    }
//}
//// 예상결과) 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,
//public class Exercise7_2 {
//    public static void main(String args[]) {
//        SutdaDeck deck = new SutdaDeck();
//
//        System.out.println(deck.pick(0));
//        System.out.println(deck.pick());
//        deck.shuffle();
//
//        for (int i = 0; i < deck.cards.length; i++)
//            System.out.print(deck.cards[i] + ",");
//
//        System.out.println();
//        System.out.println(deck.pick(0));
//    }
//}
////예상결과)
//// 1K
//// 7
//// 2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K,
//// 2