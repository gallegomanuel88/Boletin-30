package boletin.pkg30;

/**
 *
 * @author gallemanuel88
 */
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int anosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad,String titulacion,int anosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.anosExperiencia=anosExperiencia;
        this.titulacion=titulacion;
    }
    
    public void darMasaje(){
        System.out.println("masajista dando masaje");
    }

    @Override
    public void concentrarse() {
        System.out.println("masajista concentrandose");
    }

    @Override
    public void viajar() {
        System.out.println("masajista viajando");
    }

    @Override
    public void entrenar() {
        System.out.println("masajista entrenando");
    }

    @Override
    public void jugarPartido() {
        System.out.println("masajista jugando partido");
    }
}
