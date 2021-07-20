
package accesodatos;
/*
estamos obligando a la clase que implemente 
el comportamiento definido en el cuerpo de la 
interfase
*/
public class ImplementacionMySql implements IAcessoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde MySQL");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySQL");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde MySQL");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listar() {
        System.out.println("Listar ");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
