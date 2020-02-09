import java.sql.*;

public class Main {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    static final String DATABASE_URL = "jdbc:mysql://localhost/BASE_NAME?serverTimezone=UTC";

    static final String USER = "USERNAME HERE";
    static final String PASSWORD = "PASSWORD HERE";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);

        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM BASE_NAME.TABLE_NAME");

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");

            System.out.println(id + " " + name);
        }
    }
}
