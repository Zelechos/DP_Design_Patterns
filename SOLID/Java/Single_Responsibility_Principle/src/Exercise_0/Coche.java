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
    
    String Marca;
    int Modelo;
    float Precio;
    
    
    public Coche(String Marca, int Modelo, float Precio){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
    }
    
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
        System.out.print("Introduzca la Marca : ");
        precio = Input.nextFloat();        
        
        return  new Coche(marca, modelo, precio);
    }
    
}
