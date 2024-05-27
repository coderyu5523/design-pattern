package ex02;

// 프록시 패턴
public class App {
    public static void main(String[] args) {
        Animal mouse = new Mouse();
        Animal tiger = new Tiger();
//        DoormanProxy doorman = new DoormanProxy();
        DoormanProxy2 doorman2 = new DoormanProxy2(new Doorman());
//        doorman.쫓아내(mouse);
        doorman2.쫓아내(mouse);
    }
}
