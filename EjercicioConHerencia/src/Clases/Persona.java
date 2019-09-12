
package Clases;


public class Persona {
    private String nombre;
    private String direccion;
   
    
public Persona (String nombre, String direccion){
    this.nombre=nombre;
    this.direccion=direccion;
    
}
public String getNombre(){
    return nombre;    
}
public String getDireccion(){
    return direccion;
}
@Override
public String toString(){
    return nombre+"("+ direccion +")";
}   
}
