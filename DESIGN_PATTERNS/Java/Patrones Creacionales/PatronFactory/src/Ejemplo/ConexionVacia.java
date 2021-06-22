/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DP_Design_Patterns
 */
package Ejemplo;

public class ConexionVacia implements IConexion{

    @Override
    public void Conectar() {
        System.err.println("No se especifico un Proveedor de data");
    }

    @Override
    public void Desconectar() {
        System.err.println("No se especifico un Proveedor de data");
    }
    
}
