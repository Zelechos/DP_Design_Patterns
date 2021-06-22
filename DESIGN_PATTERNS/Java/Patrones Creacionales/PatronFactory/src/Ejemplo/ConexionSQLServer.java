/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DP_Design_Patterns
 */
package Ejemplo;

public class ConexionSQLServer implements IConexion {
    
    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;
    
    //Constructor

    public ConexionSQLServer() {
        this.host = "localhost";
        this.puerto = "4406";
        this.usuario = "root";
        this.contraseña = "ether";
    }
    
    @Override
    public void Conectar() {
        //Aqui ira Codigo JDBC
        System.out.println("Se Conecto a SQLServer");
    }

    @Override
    public void Desconectar() {
        System.err.println("Se Desconecto a SQLServer");
    }

    @Override
    public String toString() {
        return "ConexionSQLServer{" + "host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
}
