package codekamp;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by cerebro on 30/06/17.
 */

public class Demo {

    public static final String JDBC_CLASS = "org.sqlite.JDBC";
    public static final String DATABASE_PATH = "jdbc:sqlite:src/codekamp/mydb.sqlite";

    public static void main(String[] args) {


        System.out.println("Our Main Function");

        try {
            Class.forName(JDBC_CLASS);
        } catch (ClassNotFoundException e) {
            System.out.println("Please user JDBC");
        }


        try {
            Connection c = DriverManager.getConnection(DATABASE_PATH);

            // https://www.w3schools.com/SQL/

        } catch (SQLException e) {

        }
    }
}
