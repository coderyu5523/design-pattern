package ex03;

import ex03.lib.OuterRabbit;

// 전략 패턴
public class App {
    public static void main(String[] args) {
        Animal mouse = new Mouse();
        Animal tiger = new Tiger();
        Animal rabbit = new RabbitAdapter(new OuterRabbit());
        Doorman doorman = new Doorman();
        doorman.쫓아내(mouse);
        doorman.쫓아내(tiger);
        doorman.쫓아내(rabbit);
    }
}
