package ex06.notification;

public class EmailNotifier implements Notifier{

    private Notifier notifier;

    public EmailNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public EmailNotifier() {}

    public void send(){
        if(notifier!=null){
            notifier.send(); // 집어넣은 객체를 선 실행
        }
        System.out.println("이메일 알림");

    }

}
