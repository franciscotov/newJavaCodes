package test;

import domain.*;

public class TestCanversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Fran", 4000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        /*
        a nivel de compilacion o se sabe a donde apunta la variable empleado
        el polimorfismo no se puede definir a nivel de compilador
        se define al mmento en q se ejecuta la linea que llama al metodo
        */
        System.out.println(empleado.obtenerDetalles());
        
        /*
        no es posible llamar a un metodo que no es común entre las 
        clases(padre-hija), se debe hacer conversión de objetos
        
        */
        ((Empleado) empleado).getTipoEscritura();
    }
}
