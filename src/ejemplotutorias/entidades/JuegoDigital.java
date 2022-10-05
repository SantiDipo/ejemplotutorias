package ejemplotutorias.entidades;

import ejemplotutorias.interfaces.Descargable;

/**
 *
 * @author Santiago D'Ippolito
 */
public class JuegoDigital extends Juego implements Descargable {

    private Integer pesoEnMbs;
    // Contructor 

    public JuegoDigital(String nombre, Integer precio, int pesoEnMbs) {
        super(nombre, precio);
        this.pesoEnMbs = pesoEnMbs;
    }

    // Heredamos los métodos de nuestra clase padre
    @Override
    public void descargar(int velocidadDeDescarga) {
        System.out.println("Espere, el Juego se descargará en: " + (this.pesoEnMbs / velocidadDeDescarga) + " min");
    }

    @Override
    public void vender() {
        System.out.println("El juego se vendió a: " + getPrecio());
    }

    @Override
    public void jugarNivel() {
        super.jugarNivel();
    }

}
