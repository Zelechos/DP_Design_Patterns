/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DP_Design_Patterns
 */
package Ejemplo;

public class ConexionSQLite implements IConexion{
    
    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;
    
    //Constructor

    public ConexionSQLite() {
        this.host = "localhost";
        this.puerto = "5000";
        this.usuario = "root";
        this.contraseña = "ether";
    }
    
    @Override
    public void Conectar() {
        //Aqui ira Codigo JDBC
        System.out.println("Se Conecto a SQLite");
    }

    @Override
    public void Desconectar() {
        System.err.println("Se Desconecto a SQLite");
    }

    @Override
    public String toString() {
        return "ConexionSQLite{" + "host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
}
