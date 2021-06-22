/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DP_Design_Patterns
 */
package Ejemplo;

public class SingleObject {
    
    private static SingleObject Instancia = null;
    String Mensaje;
    
    
    //Constructor Privado
    private SingleObject(){}
    
    
    //Metodo para obtener la instancia de la clase
    public static SingleObject getInstance(){
        
        //Condicional para verificar si ya existe una instancia
        if(Instancia == null)
           Instancia = new SingleObject();
        
        return Instancia;
    }
    
    
    public String getMensaje(){
        return Mensaje;
    }
    
    public void setMensaje(String Mensaje){
        this.Mensaje = Mensaje;
    }
    
    
    
    
}
