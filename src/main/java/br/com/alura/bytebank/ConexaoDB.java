package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    public static void main(String... x) {
        try {
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/byte_bank?user=root&password=admin");

           System.out.println("Recuperei a conexão");
           conn.close();
        } catch (SQLException e){
            System.out.println(e);
        }
    }
}
