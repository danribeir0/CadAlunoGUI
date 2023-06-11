package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    public Connection getConexao(){
        
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cadaluno?serverTimezone=UTC",
                    "root",
                    "");
            return connection;
        } catch (Exception e) {
            System.out.println("Erro ao conectar com o Banco: " + e.getMessage());
            return null;
        }
    }
}
