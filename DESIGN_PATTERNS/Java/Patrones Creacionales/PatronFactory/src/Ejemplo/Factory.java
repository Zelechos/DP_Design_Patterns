/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DP_Design_Patterns
 */
package Ejemplo;

public class Factory {
    
    public static void main(String[] args) {
        
        //Intanciampos la clase ConexionFactory
        ConexionFactory fabrica = new  ConexionFactory();
        
        //Creamos una instancia de la interface
        
        /*
        Una vez creada la instancia invocamos al metodo getConexion()
        porque este retorna una instancia de las clases hijas de
        interface.
      */
        
        IConexion connection = fabrica.getConexion(""); 
        connection.Conectar();
        
        
        //Creamos otra conexion
        IConexion connection2 = fabrica.getConexion("SQLServer");
        connection2.Conectar();
        System.out.println(connection2.toString());
    }
    
}
