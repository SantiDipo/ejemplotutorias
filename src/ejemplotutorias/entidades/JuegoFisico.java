/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotutorias.entidades;

/**
 *
 * @author Santiago D'Ippolito
 */
public class JuegoFisico extends Juego {

    private boolean usado;

    public JuegoFisico(String nombre, Integer precio, Boolean usado) {
        super(nombre, precio);
        this.usado = usado;
    }

    @Override
    public double vender() {
        int mitadPrecio = 0;
        if (usado = true) {
            mitadPrecio = getPrecio() / 2;
        }
        return mitadPrecio;
    }
}
