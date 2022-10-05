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
public class JuegoDigital extends Juego implements Descargable{
    private Integer pesoEnMbs;

    public JuegoDigital(String nombre, Integer precio,int pesoEnMbs) {
        super(nombre, precio);
        this.pesoEnMbs = pesoEnMbs;
    }
   

    @Override
    public void descargar(int velocidadDeDescarga) {
        System.out.println("Espere, el Juego se descargará en: " +(this.pesoEnMbs/velocidadDeDescarga)+ " min");
    }

    @Override
    public double vender() {
        return getPrecio();
    }
    
}
