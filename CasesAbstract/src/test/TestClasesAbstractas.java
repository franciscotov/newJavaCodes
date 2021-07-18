
package test;

import domain.*;

public class TestClasesabstractas {
    public static void main(String[] args) {
        /*
        no podemos crear objetos de la clase abstracta, 
        se deben crear a partir de la clase hija
        generalmente se definen las clases padres como abstractas 
        para impedir crear obejtos desde la clase padre
        */
        //FiguraGeometrica figura = new FiguraGeometrica();
        
        //upcasting
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}

