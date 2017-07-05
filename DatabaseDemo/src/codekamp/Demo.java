package codekamp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by cerebro on 05/07/17.
 */
public class Demo {
    public static void main(String[] args) {

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.out.println("We need to download JDBC. Allow/Deny");
        }


        try {
            Connection c = DriverManager.getConnection("jdbc:sqlite:src/codekamp/mydb.sqlite");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
