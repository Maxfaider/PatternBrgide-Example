
package io.amecodelabs.bridge.Implementation;

import io.amecodelabs.bridge.Nodo;

/**
 *
 * @author Alan m.E
 * @see 5/03/2017
 */

public class PostOrden implements Recorrido {

    @Override
    public void imprimir(Nodo elementos) {
        recorridoPostorden(elementos);
    }
    
    public void recorridoPostorden(Nodo raiz) {
        if(raiz != null) {
            recorridoPostorden(raiz.getHijoIzquierdo());
            recorridoPostorden(raiz.getHijoDerecho());
            System.out.print(raiz.getContenido()+"-");
        }
    }
    
}
