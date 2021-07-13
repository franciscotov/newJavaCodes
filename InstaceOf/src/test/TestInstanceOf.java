
package test;

import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Fran", 5000);
        //determinarTipo(empleado);
        empleado = new Gerente("Karla", 1000, "contabilidad");
        determinarTipo(empleado);
    } 
    public static void determinarTipo(Empleado empleado){
        /*
        al consultar si una variable es instancia de cierta clase 
        es buena practica preguntar primero por las clases mas genericas
        hasta llegar a la clase Object
        */
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo gerente");
        }
        if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }
        if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}
