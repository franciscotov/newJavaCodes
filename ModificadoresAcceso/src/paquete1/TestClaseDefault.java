
package paquete1;

public class TestClaseDefault {
    public static void main(String[] args) {
        //Default
        /*
        ClassDefault claseDefault = new ClassDefault();
        claseDefault.attrDefault = "Cambio desde la prueba";
        System.out.println("claseDefault.attrDefault = " + claseDefault.attrDefault);
        claseDefault.metodoDefault();
        //System.out.println("clase1 = " + clase1.attrPublico);
        //clase1.metodoPublico();
        */
        
        //Private
        ClassDefault claseDefault = new ClassDefault("hola");
        claseDefault.setAttrPrivate("Modigficado atrr privado");
        System.out.println("Privado "+ claseDefault.getAttrPrivate());
        //claseDefault.attrPrivate = "Cambio desde la prueba";
        //Systease1 = " + clase1.attrPublico);
        //clase1.metodoPublico();m.out.println("claseDefault.attrDefault = " + claseDefault.attrDefault);
        //claseDefault.metodoDefault();
        //System.out.println("clase1 = " + clase1.attrPublico);
        //clase1.metodoPublico();
    }
}