package sql.checker;

import java.sql.*;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: Alexander Gostev
 * Date: 7/19/12
 * Time: 6:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Database {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/yourDB";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String QUERY = "SELECT * FROM yourTable.yourDB";

    static Connection connection = null;
    static Statement statement = null;
    static ResultSet resultSet = null;

    public static ResultSet execution() {
        try {
            Class.forName(DRIVER);
        }
        catch (ClassNotFoundException e) {
            System.out.println("Issue with your JDBC driver!");
            e.printStackTrace();
        }

        Properties props = new Properties();
        props.put("user", USER);
        props.put("password", PASSWORD);
        props.put("autoReconnect", "true");

        try {
            connection = DriverManager.getConnection(DATABASE_URL, props);
        } catch (SQLException ex) {
            System.out.println("SQLException raised while connecting to db!");
            ex.printStackTrace();
        }

        try {
            statement = connection.createStatement();
            statement.executeQuery(QUERY);
            resultSet = statement.getResultSet();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public static void closeConnection() {
        try {
        statement.close();
        connection.close();
        }
        catch (SQLException e) {
            System.out.println("SQLException raised while closing statement/connection to db!");
            e.printStackTrace();
        }
    }
}