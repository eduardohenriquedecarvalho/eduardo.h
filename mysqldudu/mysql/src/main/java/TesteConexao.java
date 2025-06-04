
import java.sql.Connection;

public class TesteConexao {
    public static void main(String[] args) {
        try {
            Connection con = Mysql.conectar();
            if (con != null) {
                System.out.println("Conexão realizada com sucesso!");
                con.close();
            }
        } catch (Exception e) {
            System.out.println("Erro ao conectar:");
            e.printStackTrace();
        }
    }
}
