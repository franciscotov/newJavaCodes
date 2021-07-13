
package test;

import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Fran", 5000);
        determinarTipo(empleado);
        empleado = new Gerente("Karla", 1000, "contabilidad");
        //determinarTipo(empleado);
    }
    public static void determinarTipo(Empleado empleado){
        /*
        al consultar si una variable es instancia de cierta clase 
        es buena practica preguntar primero por las clases mas genericas
        hasta llegar a la clase Object
        */
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo gerente");
            //conversion con ayuda del IDE
            //((Gerente) empleado).getDepartamento();
            //convertimos la variable empleado en una de tipo hijo
            Gerente gerente = (Gerente)empleado;
            //ya podriamos acceder a los atributos
            System.out.println("gerente = " + gerente.getDepartamento());
        }
        if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            System.out.println("empleado = " + empleado.getNombre());
            //nos arroja un error ya que no es valida la conversion
            //Gerente gerente = (Gerente)empleado;
            //ya podriamos acceder a los atributos
            //System.out.println("gerente = " + gerente.getDepartamento());
        }
        if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
            
        }
    }
}
