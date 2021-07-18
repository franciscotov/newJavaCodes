
package domain;
/*
la palabra reservada abstract sirve para definir metodos en clases
que n serán defiidos de manera inmediata, o serán definidos a futuro
en clase hijas.
NOTA: para poder declarar metodos abstract se debe usar la etiqueta 
abstract en la clase
*/
public abstract class FiguraGeometrica {
    protected String tipoFigura;
    
    protected FiguraGeometrica (String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    public abstract void dibujar();

    public String getTipoFigura() {
        return this.tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + this.tipoFigura + '}';
    }
    
}
