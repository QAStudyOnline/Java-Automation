package online.qastudy.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    public static final String JDBC_DRIVER = Config.getJDBCProp("driver"); //"com.mysql.jdbc.Driver";
    public static final String URL = Config.getJDBCProp("url");       //"jdbc:mysql://localhost:3306/automation";
    public static final String USER = Config.getJDBCProp("user");     //"root";
    public static final String PASS = Config.getJDBCProp("pass");     //"root";

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public static Connection getConnectionAutoCommitFalse() throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USER, PASS);
        connection.setAutoCommit(false);
        return connection;
    }
}