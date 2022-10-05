package ejemplotutorias.entidades;

/**
 *
 * @author Santiago D'Ippolito
 */
public class JuegoFisico extends Juego {

    private boolean usado;

    //Contructor
    public JuegoFisico(String nombre, Integer precio, Boolean usado) {
        super(nombre, precio);
        this.usado = usado;
    }

    // Heredamos los métodos de nuestra clase padre
    @Override
    public void vender() {
        if (usado == true) {     
            System.out.println("El juego se vendió a mitad de precio por: " + getPrecio()/2);
        } else {
            System.out.println("El juego se vendió por: " + getPrecio());
        }
    }

    @Override
    public void jugarNivel() {
        System.out.println("Se ha jugado el nivel " + getNivel());
        super.jugarNivel();

    }

}
