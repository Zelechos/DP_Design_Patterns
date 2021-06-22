/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DP_Design_Patterns
 */
package Ejemplo;

public class Singleton {

    //Testeamos nuestro Patron Singleton
    public static void main(String[] args) {
        
        //No se puede hacer este tipo de instancia
//        SingleObject  Object = new SingleObject();

        //Esta es la manera de llamar a una Instancia
        SingleObject Object = SingleObject.getInstance();
 
        Object.setMensaje("Hola Soy el Patron Singleton saludandote");
        
        System.out.println(Object.getMensaje());
        
        //Verificamos si es la misma instancia creando otro objeto
        SingleObject Object2 = SingleObject.getInstance();
        
        System.out.println("Segundo objeto Object12");
        System.out.println(Object2.getMensaje());
    }
    
}
