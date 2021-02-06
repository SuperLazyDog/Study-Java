package com.company;

//import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SQLTest {
    void test1() {
        try {
            String dbName1 = "local-test";
            String tableName1 = "first";
            String tableName2 = "first_copy";
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/local-test", "xu", "jyoitatsu1234AA");
            PreparedStatement sql = con.prepareStatement(String.format("select * from %s where id>%d", tableName1, 0));
            ResultSet set = sql.executeQuery();
            int i = 1;
            while (set.next()) {
                System.out.println("--------------------------------");
                System.out.printf("line[%d]: \n", i++);
                System.out.println(set.wasNull());
                System.out.println(set.getString(1));
                System.out.println(set.wasNull());
                System.out.println(set.getString(2));
                System.out.println(set.wasNull());
                System.out.println(set.getString(3));
                System.out.println(set.wasNull());
                System.out.println(set.getString(4));
                System.out.println(set.wasNull());
                System.out.println(set.getString(5));
                System.out.println(set.wasNull());
                System.out.println(set.getString(6));
                System.out.println(set.wasNull());
                System.out.println(set.getString(7));
                System.out.println(set.wasNull());
                System.out.println(set.getLong(7));
                System.out.println(set.wasNull());
                System.out.println(set.getString(8));
                System.out.println(set.wasNull());
                System.out.println(set.getLong("double"));
                System.out.println("--------------------------------");
            }
            System.out.println(set);
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }
}
