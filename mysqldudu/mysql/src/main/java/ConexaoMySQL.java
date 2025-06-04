import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {

    private static final String URL = "jdbc:mysql://localhost:3306/db_senhaelogin"; // nome do banco de dados
    private static final String USUARIO = "root"; // seu usuário do MySQL
    private static final String SENHA = "senac@2025"; // sua senha do MySQL

    public static void main(String[] args) {
        try {
            Connection conexao = conectar(); // Chama o método conectar
            if (conexao != null) {
                System.out.println("Conexão bem-sucedida pelo método main!");
                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar (via main): " + e.getMessage());
        }
    }

    static Connection conectar() throws SQLException { // Adicionado throws SQLException
        System.out.println("Tentando conectar ao banco de dados...");
        Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        System.out.println("Conexão (dentro do método conectar) bem-sucedida!");
        return conexao;
    }
}