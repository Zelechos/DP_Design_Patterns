/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DP_Design_Patterns
 */
package Ejemplo;

public class ConexionPostgreSQL implements IConexion {
    
    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;
    
    //Constructor

    public ConexionPostgreSQL() {
        this.host = "localhost";
        this.puerto = "3309";
        this.usuario = "root";
        this.contraseña = "ether";
    }
    
    @Override
    public void Conectar() {
        //Aqui ira Codigo JDBC
        System.out.println("Se Conecto a PostgreSQL");
    }

    @Override
    public void Desconectar() {
        System.err.println("Se Desconecto a PostgreSQL");
    }

    @Override
    public String toString() {
        return "ConexionPostgreSQL{" + "host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
}
