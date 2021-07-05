
package test;

import paquete1.Clase1;
import paquete2.ClaseHija;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1.attrPublico);
        clase1.metodoPublico();
        
        //Protected
        //no se pueden acceder a los atributos y metodos protegidos
        //Clase1 clase2 = new Clase1("hola");
        //System.out.println("clase1 = " + clase1.attrProtected);
        //clase2.me;
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
        
    }
}
