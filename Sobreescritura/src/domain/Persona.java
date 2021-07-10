
package domain;

public class Persona {
    private String nombre;
    private final int idPersona;
    private static int contadorPersonas;
    
    public Persona(){
        this.idPersona = ++Persona.contadorPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }
    
}
