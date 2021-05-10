/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DP_Design_Patterns
 */
package Exercise_0;

/*
    Vamos a simular una base de dator con un Array
*/

public class DB {
    
    static Coche [] Autos;
    static int Spaces = 0;
    
    public static void More(){
        Spaces += 1;
        Autos = new Coche[Spaces];
    }
    
    public static int Length(){
        return Autos.length;
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
