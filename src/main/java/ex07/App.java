package ex07;

import ex07.lib.DB;

public class App {
    public static void main(String[] args) {
        DBFactory factory = DBFactory.getInstance();

        DB mariaDB = factory.createDB("maria"); // DB, MaraiDB
        mariaDB.excute("select");

        DB oracleDB = factory.createDB("oracle"); // DB, MaraiDB
        oracleDB.excute("select");
    }
}