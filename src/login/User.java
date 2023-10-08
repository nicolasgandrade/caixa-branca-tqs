package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * Classe que representa um Usuário e possui métodos responsáveis por autenticá-lo no banco de dados.
 *
 * @version 1.0
 * */
public class User {
    /**
     * Método responsável por estabelecer uma conexão com o banco de dados (MySQL) usando JDBC.
     *
     * @return Connection - O Objeto de conexão com o banco do pacote java.sql.
     * @see java.sql.Connection
     * */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch  (Exception e) { }
        return conn; }
    /**
     * Nome do usuário, inicializado como uma String vazia.
     * */
    public String nome="";
    /**
     * Resultado da autenticação do usuário no banco. <br />
     * Se inicia como false pois ainda não houve tentativa de verificação.
     *
     * @see User#verificarUsuario(String, String)
     * */
    public boolean result = false;
    /**
     * Método responsável por autenticar o usuário. <br />
     * Envia o login e senha do User para o banco e checa se há algum registro a partir do comando
     * select em SQL. Caso positivo, armazena o nome do usuário na classe. Ao fim, armazena
     * o resultado da operação no atributo result.
     *
     * @param login
     * @param senha
     * @return boolean - O resultado da tentativa de login.
     * @see User#conectarBD()
     * */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        sql += "select nome from usuarios ";
        sql +="where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "';";
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome"); }
        }catch (Exception e) { }
        return result; }
    }
