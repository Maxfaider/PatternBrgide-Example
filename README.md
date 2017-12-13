# PatternBridge-Example

![vista-logica](vista-logica.png)

La estructura de un Bridge se puede clasificar en dos partes: la parte abstracta y las diferentes implementaciones, de modo que la relaci�n se hace mediante una agregaci�n de la interfaz a la clase abstracta, de esta forma podemos obtener una abstracci�n con comportamientos independientes.

Cuando un objeto tiene unas implementaciones posibles, la manera habitual de implementaci�n es el uso de herencias. Muchas veces la herencia se puede tornar inmanejable o no es lo suficientemente flexible y, por otro lado, acopla la abstracci�n con una implementaci�n concreta, y si, es porque las dos est�n ligadas, pero este patr�n busca eliminar esa inconveniencia, para permitir que las abstracciones e implementaciones evolucionen independientemente.