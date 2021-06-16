/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DP_Design_Patterns
 */
package Exercise_0;

import java.util.Scanner;

public class Main {
    
    /*
        Mensaje del Creador
        Pero por que decimos que cumplimos el 
        Principio de Responsabilidad Unica(Single Responsibility Principle)
        en este codigo en especifico por que este principio  indica que cada 
        clase deberia tener una unica responsabilidad y eso es lo que exactamente
        estamos haciendo
        en cada clase la utilizamos para un solo proposito ya sea
        conectarse a la base de datos , crear una instancia de la clase
        y lo demas en este ejercicio son complementos para la ejecucion del mismo .
    
    */

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Aqui hacemos una demostracion 
        int Numero_Coches = 0 , posicion =0;
        System.out.print("Cuantos Coches desea Comprar : ");
        Numero_Coches = input.nextInt();
        
        if(Numero_Coches < 2){//Para guardar un solo auto

            Coche_DB.GuardaCoche(Coche.Creacion());
            DB.Mostrar();
            
       }else{//Para guardar mas de un auto

           //Creamos un array de tipo autos 
           Coche [] autos = DB.Autos(Numero_Coches);
           
           while(Numero_Coches > 0){
//Instaciamos un objeto de la clase Coche para pasarlo como parametro
               Coche actual = Coche.Creacion();
               
//aqui llamamos a nuestro rutina para guardar nuestro coche a la BD               
               Coche_DB.GuardaCoche(actual, autos, posicion);
               
//Aumentamos la posicion en la que se guardara la instancia               
               posicion++;
               Numero_Coches--;
           }
           
//Por ultimo mostramos los resultados           
           DB.Mostrar();
       }
    
    }
    
}
