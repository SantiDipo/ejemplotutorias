package ejemplotutorias.entidades;

/**
 *
 * @author Santiago D'Ippolito
 */
public abstract class Juego implements Comparable<Juego> {

    private String nombre;
    private Integer precio;
    private int nivel;

    // Contructor 
    public Juego(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.nivel = 1;
    }

    // Getters 
    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public int getNivel() {
        return nivel;
    }

    //Método que permite jugar niveles    
    public void jugarNivel() {
        this.nivel++;
        System.out.println("Se ha jugado el nivel " + (nivel - 1));
    }

    //Declaramos método abstracto 
    public abstract void vender();

    // Utilizamos el método de la interface Comparable
    @Override
    public int compareTo(Juego t) {
        return (this.precio - t.precio);
    }
}
