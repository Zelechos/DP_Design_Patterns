/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DP_Design_Patterns
 */
package Ejemplo;


public class ConexionMySQL implements IConexion{

    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;
    
    //Constructor

    public ConexionMySQL() {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contraseña = "ether";
    }
    
    @Override
    public void Conectar() {
        //Aqui ira Codigo JDBC
        System.out.println("Se Conecto a MySQL");
    }

    @Override
    public void Desconectar() {
        System.err.println("Se Desconecto a MySQL");
    }

    @Override
    public String toString() {
        return "ConexionMySQL{" + "host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
}
