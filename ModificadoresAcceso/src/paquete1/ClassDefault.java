
package paquete1;
/*
el modificadors de acceso por defecto se puede usar incluso 
a nivel de clases, y este restirge en acceso del uso
de la misma, al mismo paquete
*/
//el modificador de acceso privado no funciona a nivel de 
class ClassDefault {
    //Default
    /*
    String attrDefault = "Attr Default";
    
    ClassDefault(){
        System.out.println("Constructor Default...");
    }
    
    void metodoDefault(){
        System.out.println("metodo Default");
    }
    */
    
    //Private
    /*
    private nos inpide modificar los atributos desde otra clase
    sin importas si esta es hija o está en otro paquete, 
    se deben agregar los metodos para poder modificarlos
    (encapsulamiento)
    */
    private String attrPrivate = "Attr Privado";
    
    private ClassDefault(){
        System.out.println("Constructor Privado...");
    }
    public ClassDefault(String str){
        this();
        System.out.println("constructor publico");
    }
    private void metodoPrivate(){
        System.out.println("metodo Privado");
    }

    public String getAttrPrivate() {
        return attrPrivate;
    }

    public void setAttrPrivate(String attrPrivate) {
        this.attrPrivate = attrPrivate;
    }
}
