package ex08.polling;

public class LotteMart {

    private String value = null ;

    public String getValue(){
        return value;
    }
    public void reveived(){
        for (int i = 0 ; i < 5 ; i++){
           try{
               Thread.sleep(1000);
           }catch (InterruptedException e){
               throw new RuntimeException();
           }
        }
        value = "상품";
    }
}
