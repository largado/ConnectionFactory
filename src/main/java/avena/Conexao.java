package avena;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class Conexao {
    public Connection conectando() throws SQLException{
        return DriverManager.getConnection("jdbc:oracle:thin:@endereço do banco:1521/orcl","usuário","senha");
    }

}
