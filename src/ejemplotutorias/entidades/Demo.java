package ejemplotutorias.entidades;

import ejemplotutorias.interfaces.Descargable;

/**
 *
 * @author Santiago D'Ippolito
 */
public class Demo extends Juego implements Descargable {

    private int pesoEnMbs;

    public Demo(String nombre, int pesoEnMbs) {
        super(nombre, 0);
        this.pesoEnMbs = pesoEnMbs;
    }

    @Override
    public void descargar(int velocidadDeDescarga) {
        System.out.println("Espere, la demo se descargará en: " + (this.pesoEnMbs / velocidadDeDescarga) + " min");
    }

    @Override
    public void vender() {
        System.out.println("Gracias por adquirir su demo ");   
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
