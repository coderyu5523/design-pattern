package ex01;

// 전략 패턴
public class App {
    public static void main(String[] args) {
        Animal mouse = new Mouse();
        Animal tiger = new Tiger();
        Doorman doorman = new Doorman();
        doorman.쫓아내(mouse);
        doorman.쫓아내(tiger);
    }
}
