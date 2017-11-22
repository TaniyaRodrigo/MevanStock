package javaapplication3;


import java.sql.*;
//import java.sql.DriverManager;

//import javafx.scene.shape.VLineTo;
public class dataBaseConnection{

    public static Connection dataBaseConnectionMethod() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mevanstock", "root", "donz2014");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

}
