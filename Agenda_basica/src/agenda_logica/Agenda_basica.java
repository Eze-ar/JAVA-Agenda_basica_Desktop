/*
Agenda Electrónica (super básica)
Ing. Adrián Ezequiel Angió
 */
package agenda_logica;

import agenda_GUI.Pantalla;

public class Agenda_basica {

    public static void main(String[] args) {
        Pantalla pantalla =  new Pantalla();
        pantalla.setVisible(true); //pongo la pantalla recién creada visible
        pantalla.setLocationRelativeTo(null); //para que se muestre en el centro
    }  
}
