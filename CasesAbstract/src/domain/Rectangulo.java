
package domain;

public class Rectangulo extends FiguraGeometrica{
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    //implementaremos por primera vez el metodo abstracto
    @Override
    public void dibujar(){
        System.out.println("Se imprime un : " + this.getClass().getSimpleName());
    }
    
}
