package ex07.lib;

public class MariaDB implements DB{
    private String path;

    // sql 쿼리 전송, 1은 성공 -1 은 실패
    public int excute(String sql){
        if(path==null){
            System.out.println("path : null point error");
        }

        if(sql.equals("select")){
            System.out.println("query excute: " +path+"/"+sql);
            return 1;
        }else {
            System.out.println("query fail : syntax error");
        }

        return -1 ;
    }
    @Override
    public void setUrl(String url) {
        this.path = url;

    }
}
