package io.amecodelabs.bridge.Implementation;

import io.amecodelabs.bridge.Nodo;

/**
 *
 * @author Alan M.E
 * @see 5/0372017
 */

public class InOrden implements Recorrido {

    @Override
    public void imprimir(Nodo elementos) {
        recorridoInorden(elementos);
    }
    
    public void recorridoInorden(Nodo raiz) {
        if(raiz != null) {
            recorridoInorden(raiz.getHijoIzquierdo());
            System.out.print(raiz.getContenido()+"-");
            recorridoInorden(raiz.getHijoDerecho());
        }
    }
    
}
