
package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        //no se puede instanciar ya q es abstracta
        //IAcessoDatos datos = new IAcessoDatos();
        
        //tenemos que usar las clases que implementan el 
        //comportamiento de las interfase
        IAcessoDatos datos = new ImplementacionMySql();
        //datos.listar();
        imprimir(datos);
        
        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
    }
    public static void imprimir(IAcessoDatos datos){
        datos.listar();
    }
}
