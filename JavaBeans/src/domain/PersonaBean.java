
package domain;

import java.io.Serializable;

/*
para que una clase se considere JavaBeans debe implementar
java Serializable, sus atributos deben ser privados, su constructor 
vacio y debe tener metodos getter and setters. Un JavaBean nos sirve para las tecnologias como 
Hibernate o Spring o java empresarial, ya que al usarlos 
no saben cuantos parametro deben pasarle
*/
public class PersonaBean implements Serializable{
    
    private String nombre;
    private String apellido;
    
    public PersonaBean(){
        
    }
    
    public PersonaBean(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "PersonaBean{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
