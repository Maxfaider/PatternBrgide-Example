
package io.amecodelabs.bridge;

/**
 *
 * @author Alan M.E
 * @see 5/03/2017
 */

public class Nodo {
    
    private int contenido;
    private Nodo hijoDerecho;
    private Nodo hijoIzquierdo;
    
    public Nodo(int contenido) {
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public Nodo getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(Nodo hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public Nodo getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(Nodo hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }
    
}
