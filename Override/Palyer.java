//abstract class Palyer {
//    boolean pause;
//    int currentPos;
//
//    Palyer() {
//        pause = true;
//        currentPos = 0;
//    }
//
//    abstract void play(int pos);
//    abstract void stop();
//
//    void play(){
//        System.out.println();
//        System.out.println("play() 일반 인스턴스 메서드");
//        play(currentPos);
//    }
//}
//
//class AudioPlayer extends Palyer {
//    @Override
//    void play(int pos) {
//        System.out.println();
//        this.currentPos = pos;
//        this.pause = false;
//        System.out.println("추상클래스 Player의 play(int pos) 구현");
//        System.out.println("현재 위치 = " + this.currentPos);
//        System.out.println("다시 시작합니다.");
//    }
//
//    @Override
//    void stop() {
//        System.out.println("재생을 멈춥니다.");
//        this.pause = true;
//    }
//}
//
//class AudionPlayerTest {
//    public static void main(String[] args) {
//        AudioPlayer audioPlayer = new AudioPlayer();
//        audioPlayer.play(100);
//        audioPlayer.stop();
//        audioPlayer.play();
//    }
//}
