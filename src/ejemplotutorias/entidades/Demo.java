/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotutorias.entidades;

import ejemplotutorias.interfaces.Descargable;

/**
 *
 * @author Santiago D'Ippolito
 */
public class Demo extends Juego implements Descargable {

    private Integer pesoEnMbs;

    public Demo(String nombre, Integer precio) {
        super(nombre, precio = 0);
        this.pesoEnMbs = pesoEnMbs;
    }

    @Override
    public void descargar(int velocidadDeDescarga) {
        System.out.println("Espere, la demo se descargará en: " + (this.pesoEnMbs / velocidadDeDescarga) + " min");
    }

    @Override
    public double vender() {
        return 0.0;
    }

    @Override
    public void jugarNivel() {
        if (getNivel() > 2) {
            System.out.println("Para continuar adquiera el juego completo");
        } else {
            super.jugarNivel();
        }
    }
}
