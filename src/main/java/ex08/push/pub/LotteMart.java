package ex08.push.pub;

import ex08.push.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class LotteMart implements Mart {
    private List<Customer> customerList = new ArrayList<>();  // 구독자 명단을 여기 담는다.

    @Override
    public void subscribe(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void receive() {
        for (int i = 0; i < 5; i++) {
            System.out.println(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //알림
        notify("롯데마트 : 바나나");

    }

    @Override
    public void notify(String msg) {
        customerList.forEach(customer -> {
            customer.update(msg);
        });

    }

    @Override
    public void remove(Customer customer) {
        customerList.remove(customer);
    }
}
