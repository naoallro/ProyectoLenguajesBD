import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String USER = "C##ECOMMERCE";
    private static final String PASSWORD = "Pass123";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión establecida con Oracle DB.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver JDBC de Oracle.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos.");
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            if (conn != null) {
                System.out.println("Conexión exitosa y cerrada correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
