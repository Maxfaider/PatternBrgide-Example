package io.amecodelabs;

import io.amecodelabs.bridge.Arbol;
import io.amecodelabs.bridge.ArbolBinario;
import io.amecodelabs.bridge.Implementation.*;

/**
*
* @author Alan M.E
* @see 5/03/2017
*/
public class Principal {

   public static void main(String[] args) {
       
       Arbol arbol = new ArbolBinario();
       arbol.addImplementador(new InOrden());
       
       arbol.agregar(10);
       arbol.agregar(12);
       arbol.agregar(15);
       arbol.agregar(8);
       arbol.agregar(2);
       arbol.agregar(9);
       arbol.agregar(20);
       arbol.agregar(11);
       arbol.agregar(14);
       arbol.agregar(1);
       arbol.imprimirElementos();
       
       System.out.println("\n"+arbol.eliminar(12));
       
       arbol.imprimirElementos();
   }
   
}

