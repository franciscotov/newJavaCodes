
package test;

import domain.*;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("fran", 4000);
        Empleado empleado2 = new Empleado("fran", 5000);
        
        /*
        preguntamos por la referencia en memoria
        */
        if(empleado1 == empleado2){
            System.out.println("tienen la misma referencia en memoria");
        }
        else{
            System.out.println("tienen distinta referencia");
        }
        /*
        consultamos si son iguales en contenido
        */
        if(empleado1.equals(empleado2)){
            System.out.println("Lso objetos son iguales en contenido");
        }else{
            System.out.println("Lso objetos son distintos en contenido");
        }
        
        /*
        ahora usando hasCode
        */
        if(empleado1.hashCode() == empleado2.hashCode() ){
            System.out.println("El valor hashcode es igual");
        }else{
            System.out.println("El valor hashcode No es igual");
        }
        
    }
}
