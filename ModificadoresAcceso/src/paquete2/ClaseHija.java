
package paquete2;

import paquete1.Clase1;

/*
desde una clase hija podemos acceder a los atributos
metodos y constructores de la clase padre
*/
public class ClaseHija extends Clase1{
    public ClaseHija(){
        super("hola");
        System.out.println("goaooaosoaos");
        this.attrProtected = "Modificacion atrr protegido" ;
        System.out.println("this = " + this.attrProtected);
        this.metodoProtected();
    }
    
}
