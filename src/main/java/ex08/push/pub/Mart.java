package ex08.push.pub;

import ex08.push.sub.Customer;

public interface Mart {
    //1. 구독자 등록
    void subscribe(Customer customer);

    //2. 출판(상품 관찰)
    void receive();

    //3. 알림(구독자에게 알림)
    void notify(String msg);

    //4. 구독 취소
    void remove(Customer customer);


}
