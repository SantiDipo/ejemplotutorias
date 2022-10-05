/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        Juego CD = new JuegoFisico("Crash Bandicoot", 20, true);
        Descargable juegoVirtual = new JuegoDigital("Super Mario Sunshine", 50, 1024);
        Demo demostracion = new Demo(" Metroid Prime", 512);
        System.out.println(CD.vender());
        System.out.println(((Juego) juegoVirtual).vender());
        if (CD.compareTo((Juego) juegoVirtual) >= 0) {
            System.out.println("El crash es igual o más caro");
        } else {
            System.out.println("El Super Mario es más caro");
        }
        juegoVirtual.descargar(256);
        demostracion.descargar(16);
        demostracion.jugarNivel();
        demostracion.jugarNivel();
        demostracion.jugarNivel();
        System.out.println(CD.getNivel());
        ((Juego) juegoVirtual).jugarNivel();
        ((Juego) juegoVirtual).vender();
    }
}
