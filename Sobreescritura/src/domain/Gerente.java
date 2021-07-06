
package domain;

public class Gerente extends Empleado{
    private String departamento; 
    
    public Gerente (String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //Anotacion, modifica de cierta manera el comportamiento del
    //metodo posterior, en nuestro caso estamos sobreescribiendo
    //el metodo desde la clase padre(indicando esto al compilador)
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + " Departamento: " + this.departamento;
    }
}
