package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    // o método retorna a conexao com o banco
    public Connection retornaConexao() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/byte_bank?user=root&password=admin");
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
