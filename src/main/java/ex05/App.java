package ex05;

// 전략 패턴
// 풀링 : pooling ( 객체를 10개 정도 유지하는 기법으로 구현해보기)
public class App {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Doorman doorman = Doorman.instance;
        doorman.쫓아내(tiger);
    }
}
