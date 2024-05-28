package ex03.lib;

// 목적: OuterRabbit을 문지기에 전달하는 법 (코드를 수정할 수 없다)
// 외부에서 만든 토끼, 그래서 Animal 을 상속받지 않음
public class OuterRabbit {
    private String fullname = "토끼";

    public String getFullname() {
        return fullname;
    }
}
