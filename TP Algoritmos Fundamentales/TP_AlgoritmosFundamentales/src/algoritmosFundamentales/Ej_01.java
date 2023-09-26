/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosFundamentales;

/**
 *
 * @author Manuel
 */
public class Ej_01 {
    public static void main(String[] args) {
        System.out.println("""
                           Algoritmos de Ordenación:
                                -Ordenamiento por Inserción: Este algoritmo compara elementos uno por uno 
                           e inserta cada elemento en la posición correcta dentro de la parte ya ordenada de la lista. Es eficiente para listas pequeñas.
                                -Algoritmo de la burbuja: Este algoritmo consiste en comparar cada elemento de la lista con el siguiente (por
                           parejas), si no están en el orden correcto, se intercambian entre sí sus valores. El
                           valor más pequeño flota hasta el principio de la lista como si fuera una burbuja en
                           un vaso de gaseosa. La recorrida completa de la lista será ejecutada hasta que intercambiado deje de
                           ser verdadero, es decir que seguiremos recorriendo la lista e intercambiando
                           elementos desordenados hasta que no encontremos ninguno más fuera de orden. 
                                -Ordenamiento por selección: : Inicialmente se recorre toda la lista buscando el
                           menor de todos los elementos, una vez terminada la recorrida el menor elemento
                           se coloca al inicio de la lista recorrida. En la siguiente iteración se recorre
                           nuevamente la lista pero comenzando en el segundo elemento (ya que al haber
                           insertado el menor encontrado al inicio ya lo consideramos ordenado). El
                           procedimiento continúa hasta que el último elemento recorrido es el menor de su
                           subconjunto.
                           Una desventaja de este algoritmo con respecto a los anteriores mencionados es
                           que no mejora su rendimiento cuando los datos ya están ordenados o parcialmente
                           ordenados debido a que necesariamente recorre la lista en busca del menor de los
                           datos aun cuando el primero de ellos ya es el menor a encontrar. 
                                - Algoritmo Quick-Sort: Se basa en la técnica "divide y vencerás", lo que supone que
                           es más rápido y fácil ordenar dos arreglos o listas de datos pequeños, que un
                           arreglo o lista más grande.
                           El algoritmo trabaja de la siguiente forma:
                           ● Elegir un elemento de la lista de elementos a ordenar, al que llamaremos pivote.
                           ● Resituar los demás elementos de la lista a cada lado del pivote, de manera que a
                           un lado queden todos los menores que él, y al otro los mayores. Los elementos
                           iguales al pivote pueden ser colocados tanto a su derecha como a su izquierda,
                           dependiendo de la implementación deseada. En este momento, el pivote ocupa
                           exactamente el lugar que le corresponderá en la lista ordenada.
                           ● La lista queda separada en dos sublistas, una formada por los elementos a la
                           izquierda del pivote, y otra por los elementos a su derecha.
                           ● Repetir este proceso de forma recursiva para cada sublista mientras éstas
                           contengan más de un elemento. Una vez terminado este proceso todos los
                           elementos estarán ordenados.
                           Como se puede suponer, la eficiencia del algoritmo depende de la posición en la
                           que termine el pivote elegido, algunas alternativas son:
                           ● Tomar un elemento cualquiera como pivote, tiene la ventaja de no requerir
                           ningún cálculo adicional, lo cual lo hace bastante rápido.
                           ● Otra opción puede ser recorrer la lista para saber de antemano qué elemento
                           ocupará la posición central de la lista, para elegirlo como pivote. No obstante, el
                           cálculo adicional rebaja bastante la eficiencia del algoritmo en el caso promedio.
                           ● La opción a medio camino es tomar tres elementos de la lista - por ejemplo, el
                           primero, el segundo, y el último - y compararlos, eligiendo el valor del medio como
                           pivote. 
                           Algoritmos de Búsqueda:
                                -Búsqueda Secuencial:Busca el elemento dado, recorriendo secuencialmente la lista desde
                           un elemento al siguiente, comenzando en la primera posición de la lista y se
                           detiene cuando encuentra el elemento buscado o bien se alcanza el final de la lista
                           sin haberlo encontrado.
                           Por consiguiente, el algoritmo debe comprobar primero el elemento almacenado
                           en la primera posición de la lista, a continuación, el segundo elemento y así
                           sucesivamente, hasta que se encuentra el elemento buscado o se termina el
                           recorrido de la lista.
                                -Búsqueda Binaria: Se utiliza en listas ordenadas. Divide repetidamente 
                           la lista a la mitad y compara el valor deseado con el valor en el medio, 
                           eliminando la mitad incorrecta en cada paso hasta encontrar el elemento.
                           Algoritmos de Recorrido
                                -Recorrido de Profundidad: En el recorrido en profundidad, el proceso exige un camino desde el nodo raıź a
                                través de un hijo, al descendiente más lejano del primer hijo antes de proseguir a
                                un segundo hijo. En otras palabras, en el recorrido en profundidad, todos los
                                descendientes de un hijo se procesan antes del siguiente hijo. Para saber cómo
                                regresarnos, vamos guardando los nodos visitados en una estructura de pila. Es por
                                esto que se acostumbra programar esta búsqueda de forma recursiva, con lo que el
                                manejo de la pila lo realiza el lenguaje de programación utilizado
                                -Recorrido de Anchura:  Explora todos los nodos a cierto nivel antes de pasar al siguiente nivel.
                           Utiliza una cola para mantener un seguimiento de los nodos a explorar en el siguiente nivel.
                           Es útil para encontrar la ruta más corta en grafos no ponderados.
                           """);
    }
    
}
