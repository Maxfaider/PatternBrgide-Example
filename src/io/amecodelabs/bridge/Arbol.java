
package io.amecodelabs.bridge;

import io.amecodelabs.bridge.Implementation.*;

/**
 *
 * @author Alan M.E
 * @see 5/03/2017
 */

public abstract class Arbol {
    
    protected Recorrido implementador;
    
    public Arbol() {
        
    }
    
    public void addImplementador(Recorrido implementador) {
        this.implementador = implementador;
    }
    
    public abstract void agregar(int elemento);
    public abstract boolean eliminar(int elemento);
    public abstract void imprimirElementos();

}
