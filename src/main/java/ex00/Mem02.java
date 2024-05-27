package ex00;

/**
 * 목표 : 다형성, 동적 바인딩
 * 1. 소나타, 제네시스 (오브젝트, 객체) == 자동차 (추상적인 것)
 * 구체적인건 오브젝트,
 */
// 상속의 주 목적은 데이터를 물려받기 위함은 아님. 다형성을 이용하기 위해
abstract class Car { // 추상클래스. 메모리에 new 불가
    abstract void run();

}

class Sonata extends Car {
    @Override
        // 재정의 ( 자식이 부모의 메서드를 다시 정의)
    void run() {
        System.out.println("소나타 달린다");

    } // 소나타이자 자동차

}

class Genesis extends Car {
    @Override
    void run() {
        System.out.println("제네시스 달린다");

    } // 제네시스이자 자동차

}

public class Mem02 {
    public static void main(String[] args) {
        Car s = new Sonata(); // 메모리에 sonata(run), car(run) 떠있음
        s.run();// car 의 run 을 호출하러 갔다가, 자식이 run을 재정의해서
        // 부모의 car의 run이 오버라이드(무효화), sonata의 run이 호출된다.
         Car g = new Genesis();
         g.run();
    }
}
