package ex05;

//목적 : 문지기를 메모리에 하나만 띄우고 싶다.
public class Doorman {
    public static Doorman instance = new Doorman(); // instance는 static에 저장,  new Doorman() 는 heap 에 저장

    private Doorman() {}

    public void 쫓아내(Animal animal) {
        System.out.println(animal.getName() + " 을 쫓아내");
    }
}
