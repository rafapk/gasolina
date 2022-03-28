package conexao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael
 */
public class Conexao {
    
    
public static Connection Conecta() {
        Connection con = null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
           
            String url = "jdbc:mysql://localhost:3306/gasolina";
            // o nome do usuario que foi colocado no mysql
            String usuario = "root";
            //a senha que foi colocada no mysql
            String senha = "root";
            // faz a conexao com o bd
            con = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            // vai aparecer caso haja erro
            System.out.println("Erro na conexao");
        } catch (ClassNotFoundException ex) {
           
            //se der problema no driver
            System.out.println("Classe não encontrada");
        }
        //retorna a conexao que será utilizada para executar as consultas, inserts, etc
        return con;
    }
}
    

