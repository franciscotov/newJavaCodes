
package test;

import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Fran6", 2000, "Sistemas");
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        //Polimorfismo
        Empleado empleado = new Empleado("Fran", 5000);
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        /*
        el polimorfismo ocurre cuando ejecutamos por segunda vez
        el método imprimir, la referencia que le pasamos es de
        tipo Gerente(hija de empleado), aún así el metodo 
        la recibe y la la ejecuta(ejecuta e metodo obtener detalles
        de la clase hija), el polimorfismo ocurreo por los 
        multiples comportamientos, así tenemos metodos 
        más genericos
        
        */
        imprimir(empleado);  
        imprimir(gerente1);
    } 
    //Polimorfismo
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
