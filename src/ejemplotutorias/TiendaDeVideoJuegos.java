package ejemplotutorias;

import ejemplotutorias.entidades.Demo;
import ejemplotutorias.entidades.Juego;
import ejemplotutorias.entidades.JuegoDigital;
import ejemplotutorias.entidades.JuegoFisico;
import ejemplotutorias.interfaces.Descargable;
import java.util.Scanner;

/**
 *
 * @author Santiago D'Ippolito
 */
public class TiendaDeVideoJuegos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos los objetos de tipo Juego
        Juego CD = new JuegoFisico("Crash Bandicoot", 20, false);
        JuegoDigital juegoVirtual = new JuegoDigital("Super Mario Sunshine", 50, 1024);
        Demo demostracion = new Demo("Metroid Prime", 512);
        
        System.out.println("-------------------");
        // Llamos a los métodos abstractos que venden los juegos
        CD.vender();
        juegoVirtual.vender();
        demostracion.vender();
        
        System.out.println(" ");
        // Comparamos los precios de los juegos con el método compareTo de la interface "Comparable"
        if (CD.compareTo((Juego) juegoVirtual) >= 0) {
            System.out.println("El "+CD.getNombre()+" es igual o más caro");
        } else {
            System.out.println("El "+juegoVirtual.getNombre()+" es más caro");
        }
        
        System.out.println("-------------------");
        // Utilizamos el método de la interface  
        juegoVirtual.descargar(256);
        demostracion.descargar(80);
        
        System.out.println("-------------------");
        // Llamamos los métodos para jugar niveles
        //Demo
        System.out.println("Demo");
        demostracion.jugarNivel();
        demostracion.jugarNivel();
        demostracion.jugarNivel();
        System.out.println(" ");
        //Juego Físico
        System.out.println("Juego Físico");
        CD.jugarNivel();
        //Juego Digital
        System.out.println(" ");
        System.out.println("Juego Digital");
        juegoVirtual.jugarNivel();

    }
}
