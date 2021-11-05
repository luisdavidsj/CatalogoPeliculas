package mx.com.gm.peliculas.domain;

//Esto es un Java Bean o tambien se le puede llamar clase de entidad (JDBC)
//Opcionalmente esta clase puede implementar la clase serializable pero en este caso no se hace por que se hara de manera local
public class Pelicula {
    private String nombre;
    
    public Pelicula(){
    }
    
    public Pelicula(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
}
