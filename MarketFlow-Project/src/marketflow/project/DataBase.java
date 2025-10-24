package marketflow.project;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/";

    public static java.sql.Connection getConnection(String nomeBanco, String usuario, String senha)
            throws ClassNotFoundException, SQLException 
    {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL + nomeBanco, usuario, senha);
    }

    public static boolean insert(Connection conn, String sql)
            throws SQLException 
    {
        Statement cmd = conn.createStatement();
        cmd.executeUpdate(sql);

        return true;
    }
}
