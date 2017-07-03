package codekamp;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

/**
 * Created by cerebro on 30/06/17.
 */

public class Demo {

    public static final String JDBC_CLASS = "org.sqlite.JDBC";
    public static final String DATABASE_PATH = "jdbc:sqlite:src/codekamp/mydb.sqlite";

    public static void main(String[] args) {

        try {
            Class.forName(JDBC_CLASS);
        } catch (ClassNotFoundException e) {
            System.out.println("Please user JDBC");
        }


        try {
            Connection c = DriverManager.getConnection(DATABASE_PATH);
            Statement s = c.createStatement();

//            s.execute("INSERT INTO `students`(`name`,`email`,`age`) VALUES ('Ramesh','rameshsingh@gmail.com',55);");


            ResultSet r = s.executeQuery("SELECT * FROM `students` WHERE `email` = 'ramesh@gmail.com'");

            while (r.next()) {
                System.out.println("id is " + r.getInt("id"));
                System.out.println("email is " + r.getString("email"));
                System.out.println("age is " + r.getInt("age"));
                System.out.println("name is " + r.getString("name"));
                System.out.println("-----------------------");
            }


        } catch (SQLException e) {
            System.out.println("Catch code running");
            System.out.println(e.getMessage());
        }
    }
}
