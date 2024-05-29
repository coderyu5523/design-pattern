package ex07.lib;

public class OracleDB implements DB{
    private String url;

    // sql 쿼리 전송, 1은 성공 -1 은 실패
    public int excute(String sql){

        if(sql.equals("select")){
            System.out.println("query excute: " +url+"/"+sql);
            return 1;
        }else {
            System.out.println("query fail : syntax error");
        }

        return -1 ;
    }
    //dbms 서버 ip 찾기
    public void setUrl(String url){
        this.url = url;
    }

}
