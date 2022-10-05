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
public abstract class Juego implements Comparable<Juego> {
    private String nombre;
    private Integer precio;
    private int nivel;

    public Juego(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.nivel = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public int getNivel() {
        return nivel;
    }
    
    public void jugarNivel(){
        nivel++;
    }
    
    public abstract double vender();
      
    @Override
    public int compareTo(Juego t) {
        return(this.precio-t.precio);
    } 
}