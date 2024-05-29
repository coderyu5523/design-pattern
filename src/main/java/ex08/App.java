package ex08;

import ex08.push.pub.EMart;
import ex08.push.pub.LotteMart;
import ex08.push.pub.Mart;
import ex08.push.sub.Customer;
import ex08.push.sub.Customer1;
import ex08.push.sub.Customer2;

public class App {
    public static void main(String[] args) {
        // 1. bean 로드
        Mart lotteMart = new LotteMart();
        Mart emart = new EMart();
        Customer customer1 = new Customer1();
        Customer customer2 = new Customer2();

        // 2. 구독
        lotteMart.subscribe(customer1);
        lotteMart.subscribe(customer2);
        emart.subscribe(customer1);
        emart.subscribe(customer2);

        // 3. 구독취소
        lotteMart.remove(customer2);

        // 4. 출판
        new Thread(() -> {
            lotteMart.receive();
        }).start();
//        new Thread(() -> {
//            emart.receive();
//        }).start();


        // 구독자는 구독만 함. 업데이트는 출판을 했더니 자동으로 update가 호출됨. 콜백
    }
}
