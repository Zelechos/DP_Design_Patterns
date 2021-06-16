/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/DP_Design_Patterns
 */
package Exercise_0;

import java.util.Scanner;

/*
Creamos una clase Coche para Instanciar Objetos y solo para 
Instanciar objetos de la clase coche cumpliendo asi 
el Principio de Responsobalidad Unica.
*/


public class Coche {
    
    //Atributos de la Clase .. 
    String Marca;
    int Modelo;
    float Precio;
    
    
    //El Constructor obvio ... ;)
    public Coche(String Marca, int Modelo, float Precio){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
    }
    
    
    //El desarrollo automatico de getters & setters
    public String getMarca(){
        return Marca;
    }
    
    public void setMarca(String Marca){
        this.Marca = Marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }
    
    
    //Metodo que retorna una Instancia de la Clase Coche
    public static Coche Creacion(){
        String marca;
        int modelo;
        float precio;
        Scanner Input = new Scanner(System.in);

        System.out.println("Que auto desea Agregar al Carrito de compras :");
        System.out.print("Introduzca la Marca : ");
        marca = Input.nextLine();
        System.out.print("Introduzca el Modelo : ");
        modelo = Input.nextInt();
        System.out.print("Introduzca la Precio : ");
        precio = Input.nextFloat();        
        
        return  new Coche(marca, modelo, precio);
    }
    
}
