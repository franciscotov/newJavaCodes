
package domain;

public class Persona {
    private String nombre;
    private final int idPersona;
    private static int contadorPersonas;
    
    public Persona(){
        this.idPersona = ++Persona.contadorPersonas;
    }
}
