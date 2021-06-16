/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DP_Design_Patterns
 */
package Exercise_0;

/*
    Creamos una clase solo para hacer que nuestras instancias de 
    la clase coche trabajen con la base de datos no importa cual sea
    asi cumplimos el Principio de Responsobalidad Unica.
*/
        
        
public class Coche_DB {
    
    //La Clase se encarga del CRUD en la BD
    
    //Hacemos los metodos estatico para hacelerar la demostracion del ejemplo
    public static void GuardaCoche(Coche coche){
        
        DB.More();
        DB.Autos[0] = coche;
        
        System.out.println("Se Guardo el Coche en la Base de Datos");
    }
    
    public static void GuardaCoche(Coche coche , Coche[] autos , int posicion){
        autos[posicion] = coche;
        
        System.out.println("Se Guardo el Coche en la Base de Datos");
    }
    
    public static void EliminarCoche(Coche coche){
        System.out.println("Se elimino el Coche de la Base de Datos");
    }
    
    public static void ActualizarCoche(Coche coche){
        System.out.println("Se actualizo el Coche en la Base de Datos");
    }
    
    public static void MostrarCoche(Coche coche){
        System.out.println("Se actualizo el Coche en la Base de Datos");
    }
    
    
}
