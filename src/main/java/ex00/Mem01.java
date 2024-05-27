package ex00;

/**
 *  heap ,stack , static 구분
 1. JVM는 static 키워드가 붙은 친구들은 static 메모리에 로드한다.
 2. JVM 은 static 메모리에서 main 메서드를 찾아서 실행한다.
 3. JVM 의 생명주기는 main 메서드의 코드 줄 (queue)에 저장됨
 4. heap 동적 메모리 할당.
 5. 메서드 실행 시 stack 열림
 */

class Animal {
    String name = "강아지";

    void speak(){ // speak 메서드 stack 생성
        String sound = "멍멍";
        System.out.println(sound);
    }  // speak 메서드 스택 소멸
}

public class Mem01 {

    public static void main(String[] args) {
       Animal a1 = new Animal() ; // 메모리에 띄움
        a1.speak();
        System.out.println(a1.name);

    }

}
