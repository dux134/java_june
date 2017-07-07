package codekamp;

import java.sql.*;

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
            Statement s = c.createStatement();
//            s.execute("INSERT INTO `students` (`name`,`age`) VALUES ('Jignesh', 18);");

            ResultSet result = s.executeQuery("SELECT * FROM `students`;");

            while (result.next()) {
                System.out.println(result.getString("name"));
                System.out.println(result.getInt("age"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
