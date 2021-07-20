
package accesodatos;
/*
se puede trabajar herencia similar a como se 
hace con clases
*/
public interface IAcessoDatos {
    //en una interface debemos inicializar obligatoria
    //mente un atributo
    int MAX_REGISTROS = 10;
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
