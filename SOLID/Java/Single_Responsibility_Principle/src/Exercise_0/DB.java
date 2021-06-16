/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DP_Design_Patterns
 */
package Exercise_0;

/*
    Vamos a simular una base de datos con un Array
*/

public class DB {
    
    static Coche [] Autos;
    static int Spaces = 1;
    
    //Hacemos los metodos estatico para hacelerar la demostracion del ejemplo
    
    public static void More(){
        Autos = new Coche[Spaces];
    }
    
    public static int Length(){
        return Autos.length;
    }
    
    public static Coche[] Autos(int numero){
        Autos = new Coche[numero];
        return Autos;
    }
    
    public static void Mostrar(){
        
        for (int Iterador = 0; Iterador < Autos.length; Iterador++) {
                System.out.println("Coche "+(Iterador+1)+" :");
                System.out.println("-----------------------------------------------------");
                System.out.println("Marca : "+ Autos[Iterador].getMarca());
                System.out.println("Modelo : "+ Autos[Iterador].getModelo());
                System.out.println("Precio : "+ Autos[Iterador].getPrecio());
                System.out.println("-----------------------------------------------------");
        }
    }
    
    
}
