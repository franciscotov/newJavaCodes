
package paquete1;
/*
las clases publicas las podemos acceder desde cualquier
paquete dentro del proyecto
ordenamos de mas a menos restrictivo
public
protected
package(ausencia de modificador)
private
*/
public class Clase1 {
    //Public
    public String attrPublico = "Attr Publico";
    
    public  Clase1(){
        System.out.println("Constructor publico...");
    }
    
    public void metodoPublico(){
        System.out.println("metodo publico");
    }
    
    // Protected
    protected String attrProtected = "attr protegiodo";
    
    protected  Clase1(String str){
        System.out.println("Constructor protegido");
    }
    
    protected void metodoProtected(){
        System.out.println("metodo protegido");
    }
}
