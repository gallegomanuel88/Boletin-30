package boletin.pkg30;

/**
 *
 * @author gallemanuel88
 */
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
    
    
}
