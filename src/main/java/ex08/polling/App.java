package ex08.polling;

/**
 * 1. 주기적으로 잘 물어보고
 * 2. 실시간을 반응하려고
 * 3. 핵심은 주기를 잘 정해야됨.
 */

public class App {
    public static void main(String[] args) {
        LotteMart lotteMart = new LotteMart();
        Customer1 customer1 = new Customer1();

        // 1 . 마트 입고 준비
        new Thread(() -> {
            lotteMart.reveived();
        }).start();

        // 2. 손님1
        while (true){ // 반복하지 않으면 비동기로 진행되기 떄문에 값이 차기 전에 null 로 끝난다.
            // 폴링의 핵심. 통신 주기
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (lotteMart.getValue()!=null){
                customer1.update(lotteMart.getValue()+"가 들어왔습니다.");
            }else {
                System.out.println("상품이 아직 들어오지 않았습니다.");
            }

        }
    }
}
