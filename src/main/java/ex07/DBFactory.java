package ex07;

import ex07.lib.DB;
import ex07.lib.MariaDB;
import ex07.lib.OracleDB;

public class DBFactory {
    private static DBFactory instance = new DBFactory();

    private DBFactory() {};

    public static DBFactory getInstance() {
        return instance;
    }

    // 팩토리 메서드 : 책임. new 를 대신해준다.(생성패턴)
    // 팩토리 패턴은 새로운게 추가될 떄마다 기존 코드가 수정되는 단점이 있음. (OCP 위배)
    // 그래서 리플랙션을 쓰면 편해짐. 근데 리플렉션은 코드 전체를 분석하기 때문에 느려질 수 밖에 없음.
    public DB createDB(String protocol) { // maria,oracle, mysql, mssql
        if (protocol.equals("maria")) {
            MariaDB mariaDB = new MariaDB();
            mariaDB.setUrl("jdbc:mariadb://127.0.0.1:3306");
            return mariaDB;
        } else if (protocol.equals("oracle")) {
            OracleDB oracleDB = new OracleDB();
            oracleDB.setUrl("jdbc:oracle:thin://127.0.0.1:8080");
            return oracleDB;
        }else {
            throw new NullPointerException("db driver not found exception");
        }
    }
}
