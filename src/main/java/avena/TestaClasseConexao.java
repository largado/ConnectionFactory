package avena;

import java.sql.Connection;
import java.sql.SQLException;


public class TestaClasseConexao {
    public static void main(String[] args) throws SQLException {
        Conexao abreconexao = new Conexao();
        Connection comecaconectando = abreconexao.conectando();






        comecaconectando.close();
    }
}
