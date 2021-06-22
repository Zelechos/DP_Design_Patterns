/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DP_Design_Patterns
 */
package Ejemplo;

public class ConexionFactory {
    
    //Con este metodo generamos instancias dinamicas 
    public IConexion getConexion(String motor){
        
        switch(motor){
            
            case "MySQL":
                
                return new ConexionMySQL();
                
            case "PostgreSQL":
                
                return new ConexionPostgreSQL();
                
            case "Sqlite":
                
                return new ConexionSQLite();
                
            case "SQLServer":
                
                return new ConexionSQLServer();
                
            default:
                
                return new ConexionVacia();
                    
                    
                    
        }
    }
    
    
    
}
