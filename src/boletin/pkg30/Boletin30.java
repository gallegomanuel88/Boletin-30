
package boletin.pkg30;

import java.util.ArrayList;

/**
 *
 * @author gallemanuel88
 */
public class Boletin30 {

    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> selfut = new ArrayList();
     SeleccionFutbol ent = new Entrenador(3,"entrenador","apellido",40,5);
     SeleccionFutbol fut = new Futbolista(4,"futolista","apellido",27,5,"demarcacion");
     SeleccionFutbol mas = new Masajista(1, "masajista","apellido",30,"masajeador",5);
     SeleccionFutbol sel = new Seleccionador(2,"seleccionador","apellido",55);
     
     selfut.add(ent);
     selfut.add(fut);
     selfut.add(mas);
     selfut.add(sel);
     
     for(SeleccionFutbol sf:selfut){
         sf.concentrarse();
         sf.entrenar();
         sf.viajar();
         sf.jugarPartido();
     }
    }
    
}
