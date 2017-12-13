
package io.amecodelabs.bridge;

/**
 *
 * @author Alan M.E
 * @see 5/03/2017
 */

public class ArbolBinario extends Arbol {
    
    private Nodo raiz;
    
    public ArbolBinario() {
        
    }

    @Override
    public void agregar(int elemento) {
        if(raiz == null) {
            raiz = new Nodo(elemento);
        } else {
            Nodo recorrido = raiz;
            Nodo anterior = raiz;
            
            while(recorrido != null) {
                anterior = recorrido;
                if(recorrido.getContenido() > elemento) {
                    recorrido = recorrido.getHijoIzquierdo();
                } else {
                    recorrido = recorrido.getHijoDerecho();
                }
            }
            
            if(anterior.getContenido() > elemento) {
                anterior.setHijoIzquierdo(new Nodo(elemento));
            } else {
                anterior.setHijoDerecho(new Nodo(elemento));
            }
        }
    }

    @Override
    public boolean eliminar(int elemento) {
        
        Nodo recorrido = raiz;
        Nodo anterior = raiz;
        int lado = 0;
        
        while(recorrido != null) {
            if(recorrido.getContenido() == elemento) {
                if(anterior==raiz && raiz.getContenido()==elemento ) {
                    raiz = desplazar(raiz);
                } else {
                    if(lado == 0 ) {
                        anterior.setHijoIzquierdo(desplazar(anterior.getHijoIzquierdo()));
                    } else {
                        anterior.setHijoDerecho(desplazar(anterior.getHijoDerecho()));
                    }
                }
                return true;
            }
            
            anterior = recorrido;
            if(recorrido.getContenido() > elemento) {
                recorrido = recorrido.getHijoIzquierdo();
                lado = 0;
            } else {
                recorrido = recorrido.getHijoDerecho();
                lado = 1;
            }
        }
        return false;
    }
    
    private Nodo desplazar(Nodo raiz) {
        if(raiz.getHijoIzquierdo()==null && raiz.getHijoDerecho()==null) {
            return null;
        } else {
            Nodo aux = raiz.getHijoIzquierdo();
            raiz = raiz.getHijoDerecho();
            if(raiz != null) {
                
                if(aux == null) {
                    return raiz;
                }
            
                Nodo recorrido = raiz;
                Nodo anterior = null;
                
                while(recorrido != null) {
                    anterior = recorrido;
                    recorrido = recorrido.getHijoIzquierdo();
                }
                anterior.setHijoIzquierdo(aux);
                return raiz;
            } else {
                return aux;
            }
        }
    }

    @Override
    public void imprimirElementos() {
        this.implementador.imprimir(raiz);
    }
    
}
