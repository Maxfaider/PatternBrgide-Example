
package io.amecodelabs.bridge.Implementation;

import io.amecodelabs.bridge.Nodo;

/**
 *
 * @author Alan M.E
 * @see 5/03/2017
 */

public class PreOrden implements Recorrido {

    @Override
    public void imprimir(Nodo elementos) {
        recorridoPreorden(elementos);
    }
    
    public void recorridoPreorden(Nodo raiz) {
        if(raiz != null) {
            System.out.print(raiz.getContenido()+"-");
            recorridoPreorden(raiz.getHijoIzquierdo());
            recorridoPreorden(raiz.getHijoDerecho());
        }
    }
    
}
